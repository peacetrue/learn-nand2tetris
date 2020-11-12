// Generated from /Users/xiayx/Documents/Projects/learn-nand2tetris/src/main/java/com/github/peacetrue/learn/nand2tetris/vm/VMCompiler.g4 by ANTLR 4.8

    package com.github.peacetrue.learn.nand2tetris.vm;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VMCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, COMMON_SEGMENT=19, NUMBERS=20, ID=21, WS=22, COMNT=23;
	public static final int
		RULE_functions = 0, RULE_function = 1, RULE_functionDeclare = 2, RULE_functionName = 3, 
		RULE_localCount = 4, RULE_return0 = 5, RULE_commands = 6, RULE_command = 7, 
		RULE_memoryAccessCommand = 8, RULE_push = 9, RULE_pushSegment = 10, RULE_pop = 11, 
		RULE_popSegment = 12, RULE_index = 13, RULE_arithmeticAndLogicalCommand = 14, 
		RULE_programFlowCommand = 15, RULE_label = 16, RULE_gotos = 17, RULE_ifGoto = 18, 
		RULE_symbol = 19, RULE_functionCallingCommand = 20, RULE_argsCount = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"functions", "function", "functionDeclare", "functionName", "localCount", 
			"return0", "commands", "command", "memoryAccessCommand", "push", "pushSegment", 
			"pop", "popSegment", "index", "arithmeticAndLogicalCommand", "programFlowCommand", 
			"label", "gotos", "ifGoto", "symbol", "functionCallingCommand", "argsCount"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'return'", "'push'", "'constant'", "'pop'", "'add'", 
			"'sub'", "'neg'", "'eq'", "'gt'", "'lt'", "'and'", "'or'", "'not'", "'label'", 
			"'goto'", "'if-goto'", "'call'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "COMMON_SEGMENT", "NUMBERS", 
			"ID", "WS", "COMNT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VMCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VMCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FunctionsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VMCompilerParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(44);
				function();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclareContext functionDeclare() {
			return getRuleContext(FunctionDeclareContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			functionDeclare();
			setState(53);
			commands();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclareContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public LocalCountContext localCount() {
			return getRuleContext(LocalCountContext.class,0);
		}
		public FunctionDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterFunctionDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitFunctionDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitFunctionDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclareContext functionDeclare() throws RecognitionException {
		FunctionDeclareContext _localctx = new FunctionDeclareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
			functionName();
			setState(57);
			localCount();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VMCompilerParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalCountContext extends ParserRuleContext {
		public TerminalNode NUMBERS() { return getToken(VMCompilerParser.NUMBERS, 0); }
		public LocalCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterLocalCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitLocalCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitLocalCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalCountContext localCount() throws RecognitionException {
		LocalCountContext _localctx = new LocalCountContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_localCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(NUMBERS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return0Context extends ParserRuleContext {
		public Return0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterReturn0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitReturn0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitReturn0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return0Context return0() throws RecognitionException {
		Return0Context _localctx = new Return0Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_return0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(65);
				command();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public MemoryAccessCommandContext memoryAccessCommand() {
			return getRuleContext(MemoryAccessCommandContext.class,0);
		}
		public ArithmeticAndLogicalCommandContext arithmeticAndLogicalCommand() {
			return getRuleContext(ArithmeticAndLogicalCommandContext.class,0);
		}
		public ProgramFlowCommandContext programFlowCommand() {
			return getRuleContext(ProgramFlowCommandContext.class,0);
		}
		public FunctionCallingCommandContext functionCallingCommand() {
			return getRuleContext(FunctionCallingCommandContext.class,0);
		}
		public Return0Context return0() {
			return getRuleContext(Return0Context.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_command);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				memoryAccessCommand();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				arithmeticAndLogicalCommand();
				}
				break;
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				programFlowCommand();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				functionCallingCommand();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				return0();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemoryAccessCommandContext extends ParserRuleContext {
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public PopContext pop() {
			return getRuleContext(PopContext.class,0);
		}
		public MemoryAccessCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryAccessCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterMemoryAccessCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitMemoryAccessCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitMemoryAccessCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoryAccessCommandContext memoryAccessCommand() throws RecognitionException {
		MemoryAccessCommandContext _localctx = new MemoryAccessCommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_memoryAccessCommand);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				push();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				pop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PushContext extends ParserRuleContext {
		public PushSegmentContext pushSegment() {
			return getRuleContext(PushSegmentContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__2);
			setState(83);
			pushSegment();
			setState(84);
			index();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PushSegmentContext extends ParserRuleContext {
		public TerminalNode COMMON_SEGMENT() { return getToken(VMCompilerParser.COMMON_SEGMENT, 0); }
		public PushSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterPushSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitPushSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitPushSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushSegmentContext pushSegment() throws RecognitionException {
		PushSegmentContext _localctx = new PushSegmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pushSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==COMMON_SEGMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PopContext extends ParserRuleContext {
		public PopSegmentContext popSegment() {
			return getRuleContext(PopSegmentContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitPop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitPop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__4);
			setState(89);
			popSegment();
			setState(90);
			index();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PopSegmentContext extends ParserRuleContext {
		public TerminalNode COMMON_SEGMENT() { return getToken(VMCompilerParser.COMMON_SEGMENT, 0); }
		public PopSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_popSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterPopSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitPopSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitPopSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopSegmentContext popSegment() throws RecognitionException {
		PopSegmentContext _localctx = new PopSegmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_popSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(COMMON_SEGMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode NUMBERS() { return getToken(VMCompilerParser.NUMBERS, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(NUMBERS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticAndLogicalCommandContext extends ParserRuleContext {
		public ArithmeticAndLogicalCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticAndLogicalCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterArithmeticAndLogicalCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitArithmeticAndLogicalCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitArithmeticAndLogicalCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticAndLogicalCommandContext arithmeticAndLogicalCommand() throws RecognitionException {
		ArithmeticAndLogicalCommandContext _localctx = new ArithmeticAndLogicalCommandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arithmeticAndLogicalCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramFlowCommandContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GotosContext gotos() {
			return getRuleContext(GotosContext.class,0);
		}
		public IfGotoContext ifGoto() {
			return getRuleContext(IfGotoContext.class,0);
		}
		public ProgramFlowCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programFlowCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterProgramFlowCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitProgramFlowCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitProgramFlowCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramFlowCommandContext programFlowCommand() throws RecognitionException {
		ProgramFlowCommandContext _localctx = new ProgramFlowCommandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_programFlowCommand);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				label();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				gotos();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				ifGoto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__14);
			setState(104);
			symbol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotosContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public GotosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterGotos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitGotos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitGotos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotosContext gotos() throws RecognitionException {
		GotosContext _localctx = new GotosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_gotos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__15);
			setState(107);
			symbol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfGotoContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public IfGotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifGoto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterIfGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitIfGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitIfGoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfGotoContext ifGoto() throws RecognitionException {
		IfGotoContext _localctx = new IfGotoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifGoto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__16);
			setState(110);
			symbol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VMCompilerParser.ID, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallingCommandContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ArgsCountContext argsCount() {
			return getRuleContext(ArgsCountContext.class,0);
		}
		public FunctionCallingCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallingCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterFunctionCallingCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitFunctionCallingCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitFunctionCallingCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallingCommandContext functionCallingCommand() throws RecognitionException {
		FunctionCallingCommandContext _localctx = new FunctionCallingCommandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionCallingCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__17);
			setState(115);
			functionName();
			setState(116);
			argsCount();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsCountContext extends ParserRuleContext {
		public TerminalNode NUMBERS() { return getToken(VMCompilerParser.NUMBERS, 0); }
		public ArgsCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).enterArgsCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VMCompilerListener ) ((VMCompilerListener)listener).exitArgsCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VMCompilerVisitor ) return ((VMCompilerVisitor<? extends T>)visitor).visitArgsCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsCountContext argsCount() throws RecognitionException {
		ArgsCountContext _localctx = new ArgsCountContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argsCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(NUMBERS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31{\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\7\bE\n\b\f\b\16\bH\13\b\3\t\3\t\3\t\3\t\3\t\5\tO\n\t\3\n\3\n\5\nS\n"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\5\21h\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\4\2\6\6\25\25\3\2\b\20\2m\2\61"+
		"\3\2\2\2\4\66\3\2\2\2\69\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16F"+
		"\3\2\2\2\20N\3\2\2\2\22R\3\2\2\2\24T\3\2\2\2\26X\3\2\2\2\30Z\3\2\2\2\32"+
		"^\3\2\2\2\34`\3\2\2\2\36b\3\2\2\2 g\3\2\2\2\"i\3\2\2\2$l\3\2\2\2&o\3\2"+
		"\2\2(r\3\2\2\2*t\3\2\2\2,x\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2\3\65"+
		"\3\3\2\2\2\66\67\5\6\4\2\678\5\16\b\28\5\3\2\2\29:\7\3\2\2:;\5\b\5\2;"+
		"<\5\n\6\2<\7\3\2\2\2=>\7\27\2\2>\t\3\2\2\2?@\7\26\2\2@\13\3\2\2\2AB\7"+
		"\4\2\2B\r\3\2\2\2CE\5\20\t\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G"+
		"\17\3\2\2\2HF\3\2\2\2IO\5\22\n\2JO\5\36\20\2KO\5 \21\2LO\5*\26\2MO\5\f"+
		"\7\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\21\3\2\2\2PS\5"+
		"\24\13\2QS\5\30\r\2RP\3\2\2\2RQ\3\2\2\2S\23\3\2\2\2TU\7\5\2\2UV\5\26\f"+
		"\2VW\5\34\17\2W\25\3\2\2\2XY\t\2\2\2Y\27\3\2\2\2Z[\7\7\2\2[\\\5\32\16"+
		"\2\\]\5\34\17\2]\31\3\2\2\2^_\7\25\2\2_\33\3\2\2\2`a\7\26\2\2a\35\3\2"+
		"\2\2bc\t\3\2\2c\37\3\2\2\2dh\5\"\22\2eh\5$\23\2fh\5&\24\2gd\3\2\2\2ge"+
		"\3\2\2\2gf\3\2\2\2h!\3\2\2\2ij\7\21\2\2jk\5(\25\2k#\3\2\2\2lm\7\22\2\2"+
		"mn\5(\25\2n%\3\2\2\2op\7\23\2\2pq\5(\25\2q\'\3\2\2\2rs\7\27\2\2s)\3\2"+
		"\2\2tu\7\24\2\2uv\5\b\5\2vw\5,\27\2w+\3\2\2\2xy\7\26\2\2y-\3\2\2\2\7\61"+
		"FNRg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}