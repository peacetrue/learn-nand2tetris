package com.github.peacetrue.learn.nand2tetris.vm;

import lombok.Getter;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author : xiayx
 * @since : 2020-11-07 15:27
 **/
@Getter
public class FunctionCallingVisitor extends VMCompilerBaseVisitor<Void> {

    private final Set<String> callings = new LinkedHashSet<>();

    @Override
    public Void visitFunctionCallingCommand(VMCompilerParser.FunctionCallingCommandContext ctx) {
        callings.add(ctx.functionName().getText().split("\\.", 2)[0]);
        return null;
    }

}
