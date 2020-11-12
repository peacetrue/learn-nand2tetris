// Generated from /Users/xiayx/Documents/Projects/learn-nand2tetris/src/main/java/com/github/peacetrue/learn/nand2tetris/assembly/AssemblyCompiler.g4 by ANTLR 4.8

package com.github.peacetrue.learn.nand2tetris.assembly;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssemblyCompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssemblyCompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(AssemblyCompilerParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(AssemblyCompilerParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#commandA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandA(AssemblyCompilerParser.CommandAContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(AssemblyCompilerParser.AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabels(AssemblyCompilerParser.LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(AssemblyCompilerParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#commandC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandC(AssemblyCompilerParser.CommandCContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#dests}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDests(AssemblyCompilerParser.DestsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(AssemblyCompilerParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump(AssemblyCompilerParser.JumpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyCompilerParser#commandL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandL(AssemblyCompilerParser.CommandLContext ctx);
}