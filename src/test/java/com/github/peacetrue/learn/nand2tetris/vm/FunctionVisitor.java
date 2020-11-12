package com.github.peacetrue.learn.nand2tetris.vm;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : xiayx
 * @since : 2020-11-07 15:27
 **/
@Getter
public class FunctionVisitor extends VMCompilerBaseVisitor<Void> {

    private final List<Function> functions = new LinkedList<>();

    @Override
    public Void visitFunctionDeclare(VMCompilerParser.FunctionDeclareContext ctx) {
        functions.add(new Function(ctx.functionName().getText(),
                Integer.parseInt(ctx.localCount().getText()),
                ctx.start.getLine()
        ));
        return null;
    }

}
