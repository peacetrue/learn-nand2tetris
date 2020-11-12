package com.github.peacetrue.learn.nand2tetris.vm;

import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author : xiayx
 * @since : 2020-11-07 16:21
 **/
public class TraceVisitor extends VMCompilerBaseVisitor<String> {

    @Override
    protected String defaultResult() {
        return "";
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if ("".equals(nextResult)) return aggregate;
        if ("".equals(aggregate)) return nextResult;
        return aggregate.concat(" ").concat(nextResult);
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        return node.getText();
    }

    @Override
    public String visitFunction(VMCompilerParser.FunctionContext ctx) {
        return super.visitFunction(ctx) + "\n";
    }

    @Override
    public String visitFunctionDeclare(VMCompilerParser.FunctionDeclareContext ctx) {
        return super.visitFunctionDeclare(ctx) + "\n";
    }

    @Override
    public String visitCommand(VMCompilerParser.CommandContext ctx) {
        return super.visitCommand(ctx) + "\n";
    }
}
