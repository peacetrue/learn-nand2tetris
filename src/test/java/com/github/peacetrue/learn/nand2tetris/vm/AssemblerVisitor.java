package com.github.peacetrue.learn.nand2tetris.vm;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

/**
 * @author : xiayx
 * @since : 2020-11-07 15:25
 **/
@Setter
@Getter
public class AssemblerVisitor extends VMCompilerBaseVisitor<Void> {

    public static final Integer SP = 0;
    /** 指针地址 */
    public static final Integer LCL = 1;
    public static final Integer ARG = 2;
    public static final Integer THIS = 3;
    public static final Integer THAT = 4;
    public static final Integer RESERVE = 13;
    /** 基础地址 */
    public static final Integer BASIC_ADDRESS_POINTER = 3;
    public static final Integer BASIC_ADDRESS_TEMP = 5;
    public static final Integer BASIC_ADDRESS_STATIC = 16;
    public static final Integer BASIC_ADDRESS_STACK = 256;
    public static final Integer BASIC_ADDRESS_HEAP = 2048;
    public static final Integer BASIC_ADDRESS_MEMORY_MIRRORING = 24576;
    private static final Map<String, Integer> POINTER_ADDRESSES = new HashMap<>();

    static {
        POINTER_ADDRESSES.put("argument", ARG);
        POINTER_ADDRESSES.put("local", LCL);
        POINTER_ADDRESSES.put("this", THIS);
        POINTER_ADDRESSES.put("that", THAT);
    }

    private static final Map<String, Integer> BASIC_ADDRESSES = new HashMap<>();

    static {
        BASIC_ADDRESSES.put("pointer", BASIC_ADDRESS_POINTER);
        BASIC_ADDRESSES.put("temp", BASIC_ADDRESS_TEMP);
        BASIC_ADDRESSES.put("static", BASIC_ADDRESS_STATIC);
    }

    /** 全局命令 */
    private List<String> commands = new LinkedList<>();
    /** 全局功能 */
    private List<Function> functions;
    private StaticManager staticManager;
    /** 当前源文件 */
    private String sourceName;
    /** 当前方法 */
    private Function function;

    public Void visitFunctionDeclare(VMCompilerParser.FunctionDeclareContext ctx) {
        function = new Function(ctx.functionName().getText(),
                Integer.parseInt(ctx.localCount().getText()),
                ctx.start.getLine()
        );
        commands.add("(" + function.getName() + ")");
        return null;
    }

    @Override
    public Void visitPush(VMCompilerParser.PushContext ctx) {
        String segment = ctx.pushSegment().getText(),
                index = ctx.index().getText();
        //other mem -> stack mem
        switch (segment) {
            case "constant":
                commands.add("@" + index);
                commands.add("D=A");
                break;
            case "argument":
            case "local":
            case "this":
            case "that":
                commands.add("@" + POINTER_ADDRESSES.get(segment));
                commands.add("D=M");//从内存中取出基础地址
                commands.add("@" + index);
                commands.add("A=D+A");//+index，算出实际地址
                commands.add("D=M");//取出实际值
                break;
            case "pointer":
            case "temp":
            case "static":
                int intIndex = Integer.parseInt(index);
                int relativeIndex = "static".equals(segment)
                        ? staticManager.index(sourceName, intIndex)
                        : BASIC_ADDRESSES.get(segment) + intIndex;
                commands.add("@" + relativeIndex);
                commands.add("D=M");//取出实际值
                break;
            default:
                throw new IllegalStateException("无法识别的段:" + segment);
        }
        commands.add("@SP");
        commands.add("A=M");
        commands.add("M=D");
        commands.add("@SP");
        commands.add("M=M+1");

        return null;
    }

    @Override
    public Void visitPop(VMCompilerParser.PopContext ctx) {
        String segment = ctx.popSegment().getText(),
                index = ctx.index().getText();
        //stack mem -> other mem
        commands.add("@SP");
        commands.add("M=M-1");
        switch (segment) {
            case "argument":
            case "local":
            case "this":
            case "that":
                commands.add("@" + POINTER_ADDRESSES.get(segment));
                commands.add("D=M");//从内存中取出基础地址
                commands.add("@" + index);
                commands.add("D=D+A");//+index，算出实际地址
                commands.add("@" + RESERVE);
                commands.add("M=D");//实际地址存储在mem中
                commands.add("@SP");
                commands.add("A=M");
                commands.add("D=M");
                commands.add("@" + RESERVE);
                commands.add("A=M");
                commands.add("M=D");
                break;
            case "pointer":
            case "temp":
            case "static":
                commands.add("@SP");
                commands.add("A=M");
                commands.add("D=M");
                int i = Integer.parseInt(index);
                int i1 = "static".equals(segment)
                        ? staticManager.index(sourceName, i)
                        : BASIC_ADDRESSES.get(segment) + i;
                commands.add("@" + i1);
                commands.add("M=D");
                break;
            default:
                throw new IllegalStateException("无法识别的段:" + segment);
        }
        return null;
    }

    public static final Map<String, String> twoCommands = new HashMap<>();

    static {
        twoCommands.put("add", "D+M");
        twoCommands.put("sub", "M-D");
        twoCommands.put("and", "D&M");
        twoCommands.put("or", "D|M");
    }

    public static Integer ID = 0;

    @Override
    public Void visitArithmeticAndLogicalCommand(VMCompilerParser.ArithmeticAndLogicalCommandContext ctx) {
        String command = ctx.getText();
        switch (command) {
            case "add":
            case "sub":
            case "and":
            case "or":
                commands.add("@SP");
                commands.add("M=M-1");
                commands.add("A=M");
                commands.add("D=M");
                commands.add("@SP");
                commands.add("M=M-1");
                commands.add("A=M");
                commands.add("D=" + twoCommands.get(command));
                commands.add("M=D");
                commands.add("@SP");
                commands.add("M=M+1");
                break;
            case "neg":
            case "not":
                commands.add("@SP");
                commands.add("M=M-1");
                commands.add("A=M");
                commands.add(command.equals("neg") ? "M=-M" : "M=!M");
                commands.add("@SP");
                commands.add("M=M+1");
                break;
            case "eq":
            case "gt":
            case "lt":
                ID++;
                String match = "MATCH" + ID, end = "END" + ID;
                commands.add("@SP");
                commands.add("M=M-1");
                commands.add("A=M");
                commands.add("D=M");

                commands.add("@SP");
                commands.add("M=M-1");
                commands.add("A=M");
                commands.add("D=M-D");

                commands.add("@" + match);
                commands.add("D;J" + command.toUpperCase());

                commands.add("@SP");
                commands.add("A=M");
                commands.add("M=0");
                commands.add("@" + end);
                commands.add("0;JMP");

                commands.add("(" + match + ")");
                commands.add("@SP");
                commands.add("A=M");
                commands.add("M=-1");

                commands.add("(" + end + ")");
                commands.add("@SP");
                commands.add("M=M+1");
                break;
            default:
                throw new IllegalStateException("尚不支持的指令:" + command);
        }

        return null;
    }

    public Void visitLabel(VMCompilerParser.LabelContext ctx) {
        commands.add("(" + function.getName() + "$" + ctx.symbol().getText() + ")");
        return null;
    }

    public Void visitGotos(VMCompilerParser.GotosContext ctx) {
        commands.add("@" + function.getName() + "$" + ctx.symbol().getText());
        commands.add("0;JMP");
        return null;
    }

    public Void visitIfGoto(VMCompilerParser.IfGotoContext ctx) {
        commands.add("@SP");
        commands.add("M=M-1");
        commands.add("A=M");
        commands.add("D=M");
        commands.add("@" + function.getName() + "$" + ctx.symbol().getText());
        commands.add("D;JLT");
        return null;
    }

    private List<String> POINTS = Arrays.asList("LCL", "ARG", "THIS", "THAT");

    public Void visitFunctionCallingCommand(VMCompilerParser.FunctionCallingCommandContext ctx) {
        String functionName = ctx.functionName().getText();
        int argsCount = Integer.parseInt(ctx.argsCount().getText());

        //设置返回地址
        int index = commands.size();
        commands.add("@returnAddress");
        commands.add("D=A");
        commands.add("@SP");
        commands.add("A=M");
        commands.add("M=D");
        commands.add("@SP");
        commands.add("M=M+1");

        //缓存调用函数上下文
        POINTS.forEach(key -> cache(commands, key));

        //设置被调用函数上下文
        //LCL
        commands.add("@SP");
        commands.add("D=M");
        commands.add("@LCL");
        commands.add("M=D");

        //ARG
        commands.add("@" + (5 + argsCount));
        commands.add("D=D-A");
        commands.add("@ARG");
        commands.add("M=D");

        //LOCAL 变量初始值
        Function function = functions.stream()
                .filter(item -> item.getName().equals(functionName))
                .findAny().orElseThrow(() -> new IllegalStateException(String.format("%s 尚未解析", functionName)));
        int localCount = function.getLocalCount();
        for (int i = 0; i < localCount; i++) {
            commands.add("@SP");
            commands.add("A=M");
            commands.add("M=0");
            commands.add("@SP");
            commands.add("M=M+1");
        }

        commands.add("@" + functionName);
        commands.add("0;JMP");
        long labelCount = commands.stream().filter(item -> item.startsWith("(")).count();
        commands.set(index, "@" + (commands.size() - labelCount));
        return null;
    }

    private void cache(List<String> commands, String pointer) {
        commands.add("@" + pointer);
        commands.add("D=M");
        commands.add("@SP");
        commands.add("A=M");
        commands.add("M=D");
        commands.add("@SP");
        commands.add("M=M+1");
    }

    @Override
    public Void visitReturn0(VMCompilerParser.Return0Context ctx) {
        //在R13存储返回值
        commands.add("@SP");
        commands.add("M=M-1");
        commands.add("A=M");
        commands.add("D=M");
        commands.add("@" + RESERVE);
        commands.add("M=D");

        //直接回退到LCL
        commands.add("@LCL");
        commands.add("D=M");
        commands.add("@SP");
        commands.add("M=D");

        //在R14存储ARG
        commands.add("@ARG");
        commands.add("D=M");
        commands.add("@" + (RESERVE + 1));
        commands.add("M=D");

        //恢复调用函数的相关信息
        for (int i = POINTS.size() - 1; i >= 0; i--) {
            restore(commands, POINTS.get(i));
        }

        //在R15存储返回地址
        commands.add("@SP");
        commands.add("M=M-1");
        commands.add("A=M");
        commands.add("D=M");
        commands.add("@" + (RESERVE + 2));
        commands.add("M=D");

        //直接回退到ARG
        commands.add("@" + (RESERVE + 1));
        commands.add("D=M");
        commands.add("@SP");
        commands.add("M=D");

        //从R13取出返回值
        commands.add("@" + RESERVE);
        commands.add("D=M");
        commands.add("@SP");
        commands.add("A=M");
        commands.add("M=D");
        commands.add("@SP");
        commands.add("M=M+1");

        //从R15取回返回地址，并跳转
        commands.add("@" + (RESERVE + 2));
        commands.add("A=M");
        commands.add("0;JMP");
        return null;
    }

    private void restore(List<String> commands, String pointer) {
        commands.add("@SP");
        commands.add("M=M-1");
        commands.add("A=M");
        commands.add("D=M");
        commands.add("@" + pointer);
        commands.add("M=D");
    }
}
