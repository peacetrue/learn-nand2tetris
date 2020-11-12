// Generated from /Users/xiayx/Documents/Projects/learn-nand2tetris/src/main/java/com/github/peacetrue/learn/nand2tetris/assembly/AssemblyCompiler.g4 by ANTLR 4.8

package com.github.peacetrue.learn.nand2tetris.assembly;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblyCompilerParser}.
 */
public interface AssemblyCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(AssemblyCompilerParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(AssemblyCompilerParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(AssemblyCompilerParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(AssemblyCompilerParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#commandA}.
	 * @param ctx the parse tree
	 */
	void enterCommandA(AssemblyCompilerParser.CommandAContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#commandA}.
	 * @param ctx the parse tree
	 */
	void exitCommandA(AssemblyCompilerParser.CommandAContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(AssemblyCompilerParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(AssemblyCompilerParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#labels}.
	 * @param ctx the parse tree
	 */
	void enterLabels(AssemblyCompilerParser.LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#labels}.
	 * @param ctx the parse tree
	 */
	void exitLabels(AssemblyCompilerParser.LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(AssemblyCompilerParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(AssemblyCompilerParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#commandC}.
	 * @param ctx the parse tree
	 */
	void enterCommandC(AssemblyCompilerParser.CommandCContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#commandC}.
	 * @param ctx the parse tree
	 */
	void exitCommandC(AssemblyCompilerParser.CommandCContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#dests}.
	 * @param ctx the parse tree
	 */
	void enterDests(AssemblyCompilerParser.DestsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#dests}.
	 * @param ctx the parse tree
	 */
	void exitDests(AssemblyCompilerParser.DestsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(AssemblyCompilerParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(AssemblyCompilerParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterJump(AssemblyCompilerParser.JumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitJump(AssemblyCompilerParser.JumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyCompilerParser#commandL}.
	 * @param ctx the parse tree
	 */
	void enterCommandL(AssemblyCompilerParser.CommandLContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyCompilerParser#commandL}.
	 * @param ctx the parse tree
	 */
	void exitCommandL(AssemblyCompilerParser.CommandLContext ctx);
}