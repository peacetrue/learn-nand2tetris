// Generated from /Users/xiayx/Documents/Projects/learn-nand2tetris/src/main/java/com/github/peacetrue/learn/nand2tetris/vm/VMCompiler.g4 by ANTLR 4.8

    package com.github.peacetrue.learn.nand2tetris.vm;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VMCompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VMCompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(VMCompilerParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(VMCompilerParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#functionDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclare(VMCompilerParser.FunctionDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(VMCompilerParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#localCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalCount(VMCompilerParser.LocalCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#return0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn0(VMCompilerParser.Return0Context ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(VMCompilerParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(VMCompilerParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#memoryAccessCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryAccessCommand(VMCompilerParser.MemoryAccessCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(VMCompilerParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#pushSegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushSegment(VMCompilerParser.PushSegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop(VMCompilerParser.PopContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#popSegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopSegment(VMCompilerParser.PopSegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(VMCompilerParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#arithmeticAndLogicalCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticAndLogicalCommand(VMCompilerParser.ArithmeticAndLogicalCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#programFlowCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramFlowCommand(VMCompilerParser.ProgramFlowCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(VMCompilerParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#gotos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotos(VMCompilerParser.GotosContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#ifGoto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfGoto(VMCompilerParser.IfGotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(VMCompilerParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#functionCallingCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallingCommand(VMCompilerParser.FunctionCallingCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link VMCompilerParser#argsCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsCount(VMCompilerParser.ArgsCountContext ctx);
}