// Generated from /Users/xiayx/Documents/Projects/learn-nand2tetris/src/main/java/com/github/peacetrue/learn/nand2tetris/vm/VMCompiler.g4 by ANTLR 4.8

    package com.github.peacetrue.learn.nand2tetris.vm;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VMCompilerParser}.
 */
public interface VMCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(VMCompilerParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(VMCompilerParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(VMCompilerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(VMCompilerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#functionDeclare}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclare(VMCompilerParser.FunctionDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#functionDeclare}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclare(VMCompilerParser.FunctionDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(VMCompilerParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(VMCompilerParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#localCount}.
	 * @param ctx the parse tree
	 */
	void enterLocalCount(VMCompilerParser.LocalCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#localCount}.
	 * @param ctx the parse tree
	 */
	void exitLocalCount(VMCompilerParser.LocalCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#return0}.
	 * @param ctx the parse tree
	 */
	void enterReturn0(VMCompilerParser.Return0Context ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#return0}.
	 * @param ctx the parse tree
	 */
	void exitReturn0(VMCompilerParser.Return0Context ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(VMCompilerParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(VMCompilerParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(VMCompilerParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(VMCompilerParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#memoryAccessCommand}.
	 * @param ctx the parse tree
	 */
	void enterMemoryAccessCommand(VMCompilerParser.MemoryAccessCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#memoryAccessCommand}.
	 * @param ctx the parse tree
	 */
	void exitMemoryAccessCommand(VMCompilerParser.MemoryAccessCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(VMCompilerParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(VMCompilerParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#pushSegment}.
	 * @param ctx the parse tree
	 */
	void enterPushSegment(VMCompilerParser.PushSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#pushSegment}.
	 * @param ctx the parse tree
	 */
	void exitPushSegment(VMCompilerParser.PushSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(VMCompilerParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(VMCompilerParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#popSegment}.
	 * @param ctx the parse tree
	 */
	void enterPopSegment(VMCompilerParser.PopSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#popSegment}.
	 * @param ctx the parse tree
	 */
	void exitPopSegment(VMCompilerParser.PopSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(VMCompilerParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(VMCompilerParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#arithmeticAndLogicalCommand}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticAndLogicalCommand(VMCompilerParser.ArithmeticAndLogicalCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#arithmeticAndLogicalCommand}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticAndLogicalCommand(VMCompilerParser.ArithmeticAndLogicalCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#programFlowCommand}.
	 * @param ctx the parse tree
	 */
	void enterProgramFlowCommand(VMCompilerParser.ProgramFlowCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#programFlowCommand}.
	 * @param ctx the parse tree
	 */
	void exitProgramFlowCommand(VMCompilerParser.ProgramFlowCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(VMCompilerParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(VMCompilerParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#gotos}.
	 * @param ctx the parse tree
	 */
	void enterGotos(VMCompilerParser.GotosContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#gotos}.
	 * @param ctx the parse tree
	 */
	void exitGotos(VMCompilerParser.GotosContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#ifGoto}.
	 * @param ctx the parse tree
	 */
	void enterIfGoto(VMCompilerParser.IfGotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#ifGoto}.
	 * @param ctx the parse tree
	 */
	void exitIfGoto(VMCompilerParser.IfGotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(VMCompilerParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(VMCompilerParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#functionCallingCommand}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallingCommand(VMCompilerParser.FunctionCallingCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#functionCallingCommand}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallingCommand(VMCompilerParser.FunctionCallingCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link VMCompilerParser#argsCount}.
	 * @param ctx the parse tree
	 */
	void enterArgsCount(VMCompilerParser.ArgsCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link VMCompilerParser#argsCount}.
	 * @param ctx the parse tree
	 */
	void exitArgsCount(VMCompilerParser.ArgsCountContext ctx);
}