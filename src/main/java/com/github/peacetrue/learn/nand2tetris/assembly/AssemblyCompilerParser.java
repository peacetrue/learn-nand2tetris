// Generated from /Users/xiayx/Documents/Projects/learn-nand2tetris/src/main/java/com/github/peacetrue/learn/nand2tetris/assembly/AssemblyCompiler.g4 by ANTLR 4.8

package com.github.peacetrue.learn.nand2tetris.assembly;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblyCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, ZO=59, NUMBER=60, 
		NUMBERS=61, ADM=62, ADMS=63, LETTER=64, LETTERS=65, SEP=66, ID=67, WS=68, 
		COMNT=69;
	public static final int
		RULE_commands = 0, RULE_command = 1, RULE_commandA = 2, RULE_address = 3, 
		RULE_labels = 4, RULE_var = 5, RULE_commandC = 6, RULE_dests = 7, RULE_comp = 8, 
		RULE_jump = 9, RULE_commandL = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"commands", "command", "commandA", "address", "labels", "var", "commandC", 
			"dests", "comp", "jump", "commandL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'SP'", "'LCL'", "'ARG'", "'THIS'", "'THAT'", "'R0'", "'R1'", 
			"'R2'", "'R3'", "'R4'", "'R5'", "'R6'", "'R7'", "'R8'", "'R9'", "'R10'", 
			"'R11'", "'R12'", "'R13'", "'R14'", "'R15'", "'SCREEN'", "'KBD'", "'='", 
			"';'", "'-1'", "'!D'", "'!A'", "'-D'", "'-A'", "'D+1'", "'A+1'", "'D-1'", 
			"'A-1'", "'D+A'", "'D-A'", "'A-D'", "'D&A'", "'D|A'", "'!M'", "'-M'", 
			"'M+1'", "'M-1'", "'D+M'", "'D-M'", "'M-D'", "'D&M'", "'D|M'", "'JGT'", 
			"'JEQ'", "'JGE'", "'JLT'", "'JNE'", "'JLE'", "'JMP'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ZO", 
			"NUMBER", "NUMBERS", "ADM", "ADMS", "LETTER", "LETTERS", "SEP", "ID", 
			"WS", "COMNT"
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
	public String getGrammarFileName() { return "AssemblyCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblyCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CommandsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AssemblyCompilerParser.EOF, 0); }
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
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				command();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__56) | (1L << ZO) | (1L << ADM) | (1L << ADMS))) != 0) );
			setState(27);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandAContext commandA() {
			return getRuleContext(CommandAContext.class,0);
		}
		public CommandCContext commandC() {
			return getRuleContext(CommandCContext.class,0);
		}
		public CommandLContext commandL() {
			return getRuleContext(CommandLContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				commandA();
				}
				break;
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case ZO:
			case ADM:
			case ADMS:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				commandC();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				commandL();
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

	public static class CommandAContext extends ParserRuleContext {
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public LabelsContext labels() {
			return getRuleContext(LabelsContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CommandAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterCommandA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitCommandA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitCommandA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandAContext commandA() throws RecognitionException {
		CommandAContext _localctx = new CommandAContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commandA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZO:
			case NUMBER:
			case NUMBERS:
				{
				setState(35);
				address();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				{
				setState(36);
				labels();
				}
				break;
			case LETTERS:
			case ID:
				{
				setState(37);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AddressContext extends ParserRuleContext {
		public TerminalNode ZO() { return getToken(AssemblyCompilerParser.ZO, 0); }
		public TerminalNode NUMBER() { return getToken(AssemblyCompilerParser.NUMBER, 0); }
		public TerminalNode NUMBERS() { return getToken(AssemblyCompilerParser.NUMBERS, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_address);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZO) | (1L << NUMBER) | (1L << NUMBERS))) != 0)) ) {
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

	public static class LabelsContext extends ParserRuleContext {
		public LabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelsContext labels() throws RecognitionException {
		LabelsContext _localctx = new LabelsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode LETTERS() { return getToken(AssemblyCompilerParser.LETTERS, 0); }
		public TerminalNode ID() { return getToken(AssemblyCompilerParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==LETTERS || _la==ID) ) {
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

	public static class CommandCContext extends ParserRuleContext {
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public DestsContext dests() {
			return getRuleContext(DestsContext.class,0);
		}
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public CommandCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterCommandC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitCommandC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitCommandC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandCContext commandC() throws RecognitionException {
		CommandCContext _localctx = new CommandCContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commandC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(46);
				dests();
				setState(47);
				match(T__24);
				}
				break;
			}
			setState(51);
			comp();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(52);
				match(T__25);
				setState(53);
				jump();
				}
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

	public static class DestsContext extends ParserRuleContext {
		public TerminalNode ADM() { return getToken(AssemblyCompilerParser.ADM, 0); }
		public TerminalNode ADMS() { return getToken(AssemblyCompilerParser.ADMS, 0); }
		public DestsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dests; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterDests(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitDests(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitDests(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestsContext dests() throws RecognitionException {
		DestsContext _localctx = new DestsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dests);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==ADM || _la==ADMS) ) {
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

	public static class CompContext extends ParserRuleContext {
		public TerminalNode ZO() { return getToken(AssemblyCompilerParser.ZO, 0); }
		public TerminalNode ADM() { return getToken(AssemblyCompilerParser.ADM, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << ZO) | (1L << ADM))) != 0)) ) {
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

	public static class JumpContext extends ParserRuleContext {
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jump);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) ) {
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

	public static class CommandLContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CommandLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).enterCommandL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyCompilerListener ) ((AssemblyCompilerListener)listener).exitCommandL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyCompilerVisitor ) return ((AssemblyCompilerVisitor<? extends T>)visitor).visitCommandL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandLContext commandL() throws RecognitionException {
		CommandLContext _localctx = new CommandLContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_commandL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__56);
			setState(63);
			var();
			setState(64);
			match(T__57);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3GE\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\5\3#\n\3\3\4\3\4\3"+
		"\4\3\4\5\4)\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b\64\n\b\3\b\3\b"+
		"\3\b\5\b9\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\2\2\r\2\4"+
		"\6\b\n\f\16\20\22\24\26\2\b\3\2=?\3\2\4\32\4\2CCEE\3\2@A\5\2\35\63==@"+
		"@\3\2\64:\2@\2\31\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b*\3\2\2\2\n,\3\2\2\2"+
		"\f.\3\2\2\2\16\63\3\2\2\2\20:\3\2\2\2\22<\3\2\2\2\24>\3\2\2\2\26@\3\2"+
		"\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2"+
		"\2\2\34\35\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37#\5\6\4\2 #\5\16\b\2!"+
		"#\5\26\f\2\"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$(\7\3\2\2%)\5"+
		"\b\5\2&)\5\n\6\2\')\5\f\7\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2"+
		"*+\t\2\2\2+\t\3\2\2\2,-\t\3\2\2-\13\3\2\2\2./\t\4\2\2/\r\3\2\2\2\60\61"+
		"\5\20\t\2\61\62\7\33\2\2\62\64\3\2\2\2\63\60\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\658\5\22\n\2\66\67\7\34\2\2\679\5\24\13\28\66\3\2\2\289\3"+
		"\2\2\29\17\3\2\2\2:;\t\5\2\2;\21\3\2\2\2<=\t\6\2\2=\23\3\2\2\2>?\t\7\2"+
		"\2?\25\3\2\2\2@A\7;\2\2AB\5\f\7\2BC\7<\2\2C\27\3\2\2\2\7\33\"(\638";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}