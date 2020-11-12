package com.github.peacetrue.learn.nand2tetris.vm;

import com.github.peacetrue.learn.nand2tetris.Nand2tetrisUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

/**
 * @author : xiayx
 * @since : 2020-11-04 20:55
 **/
@Slf4j
class VMCompilerTest {

    /*-----MemoryAccess-----*/

    @Test
    void BasicTest() throws Exception {
        compileCommands(Paths.get(VMCompilerUtils.basePath07 + "/MemoryAccess/BasicTest/BasicTest.vm"));
    }

    @Test
    void PointerTest() throws Exception {
        compileCommands(Paths.get(VMCompilerUtils.basePath07 + "/MemoryAccess/PointerTest/PointerTest.vm"));
    }

    @Test
    void StaticTest() throws Exception {
        compileCommands(Paths.get(VMCompilerUtils.basePath07 + "/MemoryAccess/StaticTest/StaticTest.vm"));
    }

    /*-----StackArithmetic-----*/
    @Test
    void SimpleAdd() throws Exception {
        compileCommands(Paths.get(VMCompilerUtils.basePath07 + "/StackArithmetic/SimpleAdd/SimpleAdd.vm"));
    }

    @Test
    void StackTest() throws Exception {
        compileCommands(Paths.get(VMCompilerUtils.basePath07 + "/StackArithmetic/StackTest/StackTest.vm"));
    }

    /*-----ProgramFlow-----*/
    @Test
    void BasicLoop() throws Exception {
        compileCommands(Paths.get(VMCompilerUtils.basePath08 + "/ProgramFlow/BasicLoop/BasicLoop.vm"));
    }

    @Test
    void FibonacciSeries() throws Exception {
        compileCommands(Paths.get(VMCompilerUtils.basePath08 + "/ProgramFlow/FibonacciSeries/FibonacciSeries.vm"));
    }

    private void compileCommands(Path path) throws IOException {
        VMCompilerParser parser = VMCompilerUtils.getVmCompilerParser(path);
        VMCompilerParser.CommandsContext commands = parser.commands();
        AssemblerVisitor assemblerVisitor = new AssemblerVisitor();
        commands.accept(assemblerVisitor);
        String binaryCodes = String.join("\n", assemblerVisitor.getCommands());
        log.info("{}:\n{}", path, binaryCodes);
        String hack = path.getFileName().toString().replaceFirst("vm", "asm");
        Path hackPath = path.resolveSibling(hack);
        Files.write(hackPath, binaryCodes.getBytes(), WRITE, CREATE);
    }

    /*----- FunctionCalls -----*/
    private void compileFunction(Path path) throws IOException {
        String binaryCodes = compileFunction2(path);
        log.info("{}:\n{}", path, binaryCodes);
        Files.write(Nand2tetrisUtils.resolve(path, "asm"), binaryCodes.getBytes(), WRITE, CREATE);
    }


    private String compileFunction2(Path path) throws IOException {
        VMCompilerParser parser = VMCompilerUtils.getVmCompilerParser(path);
        VMCompilerParser.FunctionsContext functions = parser.functions();

        FunctionVisitor functionVisitor = new FunctionVisitor();
        functions.accept(functionVisitor);
        log.info("functions: {}", functionVisitor.getFunctions());

        AssemblerVisitor assemblerVisitor = new AssemblerVisitor();
        assemblerVisitor.setFunctions(functionVisitor.getFunctions());
        functions.accept(assemblerVisitor);

        FunctionCallingVisitor functionCallingVisitor = new FunctionCallingVisitor();
        functions.accept(functionCallingVisitor);
        log.info("calling: {}", functionCallingVisitor.getCallings());


        return String.join("\n", assemblerVisitor.getCommands());
    }

    @Test
    void FibonacciElement() throws Exception {
        Path path = Paths.get(VMCompilerUtils.basePath08 + "/FunctionCalls/FibonacciElement/Sys.vm");
        Compiler compiler = new Compiler();
        compiler.getCommands().add("@261");//和 FibonacciElementVME.tst 文件的初始栈指针相同
        compiler.getCommands().add("D=A");
        compiler.getCommands().add("@SP");
        compiler.getCommands().add("M=D");
        compiler.compile(path);
        String targetCode = compiler.getTargetCode();
        Files.write(path.resolveSibling("FibonacciElement.asm"), targetCode.getBytes(), WRITE, CREATE);
    }

    @Test
    void NestedCall() throws Exception {
        Path path = Paths.get(VMCompilerUtils.basePath08 + "/FunctionCalls/NestedCall/Sys.vm");
        String binaryCodes = compileFunction2(path);
        Files.write(path.resolveSibling("NestedCall.asm"), binaryCodes.getBytes(), WRITE, CREATE);
    }

    @Test
    void SimpleFunction() throws Exception {
        Path path = Paths.get(VMCompilerUtils.basePath08 + "/FunctionCalls/SimpleFunction/SimpleFunction.vm");
        Compiler compiler = new Compiler();
        //SimpleFunction 没有被调用，直接运行，差 2 个 local 变量，手动初始化
        compiler.getCommands().add("@1\n" +
                "D=M\n" +
                "@0\n" +
                "A=D+A\n" +
                "D=M\n" +
                "@SP\n" +
                "A=M\n" +
                "M=D\n" +
                "@SP\n" +
                "M=M+1\n" +
                "@1\n" +
                "D=M\n" +
                "@1\n" +
                "A=D+A\n" +
                "D=M\n" +
                "@SP\n" +
                "A=M\n" +
                "M=D\n" +
                "@SP\n" +
                "M=M+1");
        compiler.compile(path);
        String targetCode = compiler.getTargetCode();
        Files.write(Nand2tetrisUtils.resolve(path, "asm"), targetCode.getBytes(), WRITE, CREATE);
    }

    @Test
    void StaticsTest() throws Exception {
        Path path = Paths.get(VMCompilerUtils.basePath08 + "/FunctionCalls/StaticsTest/Sys.vm");
        Compiler compiler = new Compiler();
        compiler.getCommands().add("@261");//和 StaticsTestVME.tst 文件的初始栈指针相同
        compiler.getCommands().add("D=A");
        compiler.getCommands().add("@SP");
        compiler.getCommands().add("M=D");
        compiler.compile(path);
        String targetCode = compiler.getTargetCode();
        Files.write(path.resolveSibling("StaticsTest.asm"), targetCode.getBytes(), WRITE, CREATE);

    }

    @Test
    void trace() throws Exception {
        String path0 = VMCompilerUtils.basePath08 + "/FunctionCalls/StaticsTest/Sys.vm";
        Path path = Paths.get(path0);
        VMCompilerParser parser = VMCompilerUtils.getVmCompilerParser(path);
        VMCompilerParser.FunctionsContext functions = parser.functions();
        String binaryCodes = functions.accept(new TraceVisitor());
        log.info("{}:\n{}", path, binaryCodes);
    }
}
