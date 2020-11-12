package com.github.peacetrue.learn.nand2tetris.assembly;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : xiayx
 * @since : 2020-11-07 16:47
 **/
@Slf4j
public class BinaryCodeVisitor extends AssemblyCompilerBaseVisitor<String> {

    private int baseVarAddress = 16;
    private int lineDecrease = 0;
    private final Map<String, Integer> varAddresses = new HashMap<>();

    @Override
    protected String defaultResult() {
        return "";
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        return aggregate.concat(nextResult);
    }

    @Override
    public String visitCommands(AssemblyCompilerParser.CommandsContext ctx) {
        ctx.command().stream()
                .filter(commandContext -> commandContext.commandL() != null)
                .forEach(this::visit);
        return super.visitCommands(ctx);
    }

    @Override
    public String visitCommandA(AssemblyCompilerParser.CommandAContext ctx) {
        return "0" + super.visitCommandA(ctx) + "\n";
    }

    @Override
    public String visitAddress(AssemblyCompilerParser.AddressContext ctx) {
        return AssemblyCompilerUtils.format(ctx.getText());
    }

    @Override
    public String visitLabels(AssemblyCompilerParser.LabelsContext ctx) {
        return AssemblyCompilerUtils.format(AssemblyCompilerUtils.SYMBOLS.get(ctx.getText()));
    }

    @Override
    public String visitVar(AssemblyCompilerParser.VarContext ctx) {
        Integer address = varAddresses.computeIfAbsent(ctx.getText(), key -> baseVarAddress++);
        log.info("var: {} -> {}", ctx.getText(), address);
        return AssemblyCompilerUtils.format(address);
    }

    @Override
    public String visitCommandL(AssemblyCompilerParser.CommandLContext ctx) {
        String text = ctx.var().getText();
        if (varAddresses.containsKey(text)) return "";
        ParserRuleContext command = ctx.getParent();
        ParserRuleContext commands = command.getParent();
        int index = commands.children.indexOf(command) - lineDecrease++;
        log.info("line: {} -> {}", text, index);
        varAddresses.put(text, index);
        return "";
    }

    @Override
    public String visitCommandC(AssemblyCompilerParser.CommandCContext ctx) {
        return "111"
                + ctx.comp().accept(this)
                + (ctx.dests() == null ? "000" : ctx.dests().accept(this))
                + (ctx.jump() == null ? "000" : ctx.jump().accept(this))
                + "\n"
                ;
    }

    @Override
    public String visitComp(AssemblyCompilerParser.CompContext ctx) {
        return AssemblyCompilerUtils.COMPS.get(ctx.getText());
    }

    @Override
    public String visitDests(AssemblyCompilerParser.DestsContext ctx) {
        String text = ctx.getText();
        String binaryCode = "ADM".chars().mapToObj(i -> text.indexOf(i) > -1 ? "1" : "0").collect(Collectors.joining());
        log.info("text: {} -> {}", text, binaryCode);
        return binaryCode;
    }

    @Override
    public String visitJump(AssemblyCompilerParser.JumpContext ctx) {
        return AssemblyCompilerUtils.JUMPS.get(ctx.getText());
    }

}
