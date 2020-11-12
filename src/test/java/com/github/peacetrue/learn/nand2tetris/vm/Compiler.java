package com.github.peacetrue.learn.nand2tetris.vm;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import static com.github.peacetrue.learn.nand2tetris.vm.AssemblerVisitor.BASIC_ADDRESS_STATIC;

/**
 * @author : xiayx
 * @since : 2020-11-08 07:53
 **/
@Slf4j
@Getter
public class Compiler {

    public String sourcePostfix = "vm";
    public String targetPostfix = "asm";
    public Set<String> references = new LinkedHashSet<>();
    public List<Function> functions = new LinkedList<>();
    private final List<String> commands = new LinkedList<>();
    private final Map<String, VMCompilerParser.FunctionsContext> contexts = new LinkedHashMap<>();
    private final StaticManager staticManager = new StaticManager(BASIC_ADDRESS_STATIC);

    public void preCompile(Path path) throws IOException {
        log.info("编译源文件: {}", path);

        VMCompilerParser parser = VMCompilerUtils.getVmCompilerParser(path);
        VMCompilerParser.FunctionsContext context = parser.functions();
        contexts.put(path.getFileName().toString(), context);

        Set<String> references = lookReferences(context);
        log.info("收集引用源文件: {}", references);
        references.removeAll(this.references);
        this.references.addAll(references);
        for (String reference : references) {
            Path sibling = path.resolveSibling(reference + "." + sourcePostfix);
            this.preCompile(sibling);
        }

        List<Function> functions = lookFunctions(context);
        log.info("收集方法: {}", functions);
        this.functions.addAll(functions);
    }

    public void compile(Path path) throws IOException {
        preCompile(path);
        compile();
    }

    public void compile() {
        for (Map.Entry<String, VMCompilerParser.FunctionsContext> entry : contexts.entrySet()) {
            AssemblerVisitor assemblerVisitor = new AssemblerVisitor();
            assemblerVisitor.setStaticManager(staticManager);
            assemblerVisitor.setFunctions(functions);
            assemblerVisitor.setCommands(commands);
            assemblerVisitor.setSourceName(entry.getKey().split("\\.", 2)[0]);
            entry.getValue().accept(assemblerVisitor);
        }
    }

    public String getTargetCode() {
        return String.join("\n", commands);
    }

    public Set<String> lookReferences(ParserRuleContext ctx) {
        FunctionCallingVisitor functionCallingVisitor = new FunctionCallingVisitor();
        ctx.accept(functionCallingVisitor);
        return functionCallingVisitor.getCallings();
    }

    public List<Function> lookFunctions(ParserRuleContext ctx) {
        FunctionVisitor functionVisitor = new FunctionVisitor();
        ctx.accept(functionVisitor);
        return functionVisitor.getFunctions();
    }
}
