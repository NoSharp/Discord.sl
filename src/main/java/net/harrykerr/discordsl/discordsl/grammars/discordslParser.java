// Generated from C:/Users/Harry/Desktop/Code/Discord.sl/src/main/java/net/harrykerr/discordsl/discordsl/grammars\discordsl.g4 by ANTLR 4.7
package net.harrykerr.discordsl.discordsl.grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class discordslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, SET=21, TO=22, EVENT=23, STRING_TYPE=24, 
		INTEGER=25, DECIMAL=26, IF=27, WHILE=28, SETTINGS=29, ENDIF=30, ENDWHILE=31, 
		VAR=32, VAR_ASSIGN=33, ELSE=34, FOR=35, ENDFOR=36, EXIT=37, START_BOT=38, 
		COMMAND=39, RETURN=40, SWITCH=41, CASE=42, THEN=43, RETURNS=44, VOID=45, 
		NULL=46, SAY=47, AS=48, SPEECH=49, LB=50, RB=51, WS=52, NL=53, COMMENT=54, 
		LINE_COMMENT=55, Digits=56, LetterOrDigit=57, Letters=58, LABEL=59, EOL=60, 
		NORMALSTRING=61;
	public static final int
		RULE_start = 0, RULE_settings = 1, RULE_game = 2, RULE_enable_help = 3, 
		RULE_status = 4, RULE_command_prefix = 5, RULE_token = 6, RULE_statement = 7, 
		RULE_math_sum = 8, RULE_brackets = 9, RULE_statements = 10, RULE_math_sum_full = 11, 
		RULE_math_sums = 12, RULE_event = 13, RULE_event_param = 14, RULE_say = 15, 
		RULE_if_operand = 16, RULE_condition = 17, RULE_if_statement = 18, RULE_send_message = 19, 
		RULE_conditional_statement = 20, RULE_variable = 21, RULE_identifier = 22, 
		RULE_event_name = 23, RULE_var_value = 24, RULE_type = 25, RULE_list_assign = 26, 
		RULE_operators = 27, RULE_comparators = 28;
	public static final String[] ruleNames = {
		"start", "settings", "game", "enable_help", "status", "command_prefix", 
		"token", "statement", "math_sum", "brackets", "statements", "math_sum_full", 
		"math_sums", "event", "event_param", "say", "if_operand", "condition", 
		"if_statement", "send_message", "conditional_statement", "variable", "identifier", 
		"event_name", "var_value", "type", "list_assign", "operators", "comparators"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'settings:'", "'token:'", "'command_prefix:'", "'enable_help:'", 
		"'status:'", "'game:'", "'endevent'", "'send'", "'channel'", "'which is list of type'", 
		"'^'", "'/'", "'+'", "'-'", "'*'", "'<'", "'>'", "'>='", "'<='", "'=='", 
		null, null, "'on'", "'string'", "'number'", "'decimal'", "'if'", "'while'", 
		"'settings'", "'endif'", "'endwhile'", null, null, "'else'", "'for'", 
		"'endfor'", "'exit'", "'start'", "'command'", "'out'", "'switch'", "'case'", 
		"'then'", "'returns'", "'nothing'", "'empty'", "'say'", "'as'", "'\"'", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "SET", "TO", "EVENT", 
		"STRING_TYPE", "INTEGER", "DECIMAL", "IF", "WHILE", "SETTINGS", "ENDIF", 
		"ENDWHILE", "VAR", "VAR_ASSIGN", "ELSE", "FOR", "ENDFOR", "EXIT", "START_BOT", 
		"COMMAND", "RETURN", "SWITCH", "CASE", "THEN", "RETURNS", "VOID", "NULL", 
		"SAY", "AS", "SPEECH", "LB", "RB", "WS", "NL", "COMMENT", "LINE_COMMENT", 
		"Digits", "LetterOrDigit", "Letters", "LABEL", "EOL", "NORMALSTRING"
	};
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
	public String getGrammarFileName() { return "discordsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public discordslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public SettingsContext settings() {
			return getRuleContext(SettingsContext.class,0);
		}
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			settings();
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				event();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EVENT );
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

	public static class SettingsContext extends ParserRuleContext {
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public Command_prefixContext command_prefix() {
			return getRuleContext(Command_prefixContext.class,0);
		}
		public Enable_helpContext enable_help() {
			return getRuleContext(Enable_helpContext.class,0);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public GameContext game() {
			return getRuleContext(GameContext.class,0);
		}
		public SettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterSettings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitSettings(this);
		}
	}

	public final SettingsContext settings() throws RecognitionException {
		SettingsContext _localctx = new SettingsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_settings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__1);
			setState(66);
			token();
			setState(67);
			match(T__2);
			setState(68);
			command_prefix();
			setState(69);
			match(T__3);
			setState(70);
			enable_help();
			setState(71);
			match(T__4);
			setState(72);
			status();
			setState(73);
			match(T__5);
			setState(74);
			game();
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

	public static class GameContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(discordslParser.NORMALSTRING, 0); }
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitGame(this);
		}
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_game);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(NORMALSTRING);
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

	public static class Enable_helpContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(discordslParser.NORMALSTRING, 0); }
		public Enable_helpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enable_help; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterEnable_help(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitEnable_help(this);
		}
	}

	public final Enable_helpContext enable_help() throws RecognitionException {
		Enable_helpContext _localctx = new Enable_helpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_enable_help);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(NORMALSTRING);
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

	public static class StatusContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(discordslParser.NORMALSTRING, 0); }
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitStatus(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NORMALSTRING);
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

	public static class Command_prefixContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(discordslParser.NORMALSTRING, 0); }
		public Command_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterCommand_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitCommand_prefix(this);
		}
	}

	public final Command_prefixContext command_prefix() throws RecognitionException {
		Command_prefixContext _localctx = new Command_prefixContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(NORMALSTRING);
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

	public static class TokenContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(discordslParser.NORMALSTRING, 0); }
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(NORMALSTRING);
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

	public static class StatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SayContext say() {
			return getRuleContext(SayContext.class,0);
		}
		public List_assignContext list_assign() {
			return getRuleContext(List_assignContext.class,0);
		}
		public Math_sum_fullContext math_sum_full() {
			return getRuleContext(Math_sum_fullContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				say();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				list_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				math_sum_full();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				if_statement();
				}
				break;
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

	public static class Math_sumContext extends ParserRuleContext {
		public List<TerminalNode> Digits() { return getTokens(discordslParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(discordslParser.Digits, i);
		}
		public Math_sumsContext math_sums() {
			return getRuleContext(Math_sumsContext.class,0);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public List<BracketsContext> brackets() {
			return getRuleContexts(BracketsContext.class);
		}
		public BracketsContext brackets(int i) {
			return getRuleContext(BracketsContext.class,i);
		}
		public Math_sumContext math_sum() {
			return getRuleContext(Math_sumContext.class,0);
		}
		public Math_sumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterMath_sum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitMath_sum(this);
		}
	}

	public final Math_sumContext math_sum() throws RecognitionException {
		return math_sum(0);
	}

	private Math_sumContext math_sum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_sumContext _localctx = new Math_sumContext(_ctx, _parentState);
		Math_sumContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_math_sum, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(94);
				match(Digits);
				setState(96); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(95);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(98); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(100);
				math_sums();
				}
				break;
			case 2:
				{
				setState(102);
				match(Digits);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					operators();
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << LB) | (1L << RB))) != 0) );
				setState(108);
				match(Digits);
				}
				break;
			case 3:
				{
				setState(110);
				brackets();
				setState(111);
				math_sum(0);
				setState(113); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(112);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(115); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(117);
				math_sums();
				setState(118);
				brackets();
				}
				break;
			case 4:
				{
				setState(120);
				brackets();
				setState(121);
				math_sum(0);
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					operators();
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << LB) | (1L << RB))) != 0) );
				setState(127);
				match(Digits);
				setState(128);
				brackets();
				}
				break;
			case 5:
				{
				setState(130);
				brackets();
				setState(131);
				match(Digits);
				setState(133); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(132);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(135); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(137);
				math_sums();
				setState(138);
				brackets();
				}
				break;
			case 6:
				{
				setState(140);
				brackets();
				setState(141);
				match(Digits);
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					operators();
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << LB) | (1L << RB))) != 0) );
				setState(147);
				match(Digits);
				setState(148);
				brackets();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Math_sumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_sum);
						setState(152);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(154); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(153);
								operators();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(156); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(158);
						math_sums();
						}
						break;
					case 2:
						{
						_localctx = new Math_sumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_sum);
						setState(160);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(162); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(161);
							operators();
							}
							}
							setState(164); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << LB) | (1L << RB))) != 0) );
						setState(166);
						match(Digits);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BracketsContext extends ParserRuleContext {
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitBrackets(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==LB || _la==RB) ) {
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Math_sum_fullContext extends ParserRuleContext {
		public Math_sumsContext math_sums() {
			return getRuleContext(Math_sumsContext.class,0);
		}
		public Math_sum_fullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_sum_full; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterMath_sum_full(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitMath_sum_full(this);
		}
	}

	public final Math_sum_fullContext math_sum_full() throws RecognitionException {
		Math_sum_fullContext _localctx = new Math_sum_fullContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_math_sum_full);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			math_sums();
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

	public static class Math_sumsContext extends ParserRuleContext {
		public List<Math_sumContext> math_sum() {
			return getRuleContexts(Math_sumContext.class);
		}
		public Math_sumContext math_sum(int i) {
			return getRuleContext(Math_sumContext.class,i);
		}
		public Math_sumsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_sums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterMath_sums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitMath_sums(this);
		}
	}

	public final Math_sumsContext math_sums() throws RecognitionException {
		Math_sumsContext _localctx = new Math_sumsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_math_sums);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(182);
					math_sum(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class EventContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(discordslParser.EVENT, 0); }
		public Event_nameContext event_name() {
			return getRuleContext(Event_nameContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitEvent(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(EVENT);
			setState(188);
			event_name();
			setState(189);
			statements();
			setState(190);
			match(T__6);
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

	public static class Event_paramContext extends ParserRuleContext {
		public TerminalNode LetterOrDigit() { return getToken(discordslParser.LetterOrDigit, 0); }
		public Event_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterEvent_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitEvent_param(this);
		}
	}

	public final Event_paramContext event_param() throws RecognitionException {
		Event_paramContext _localctx = new Event_paramContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_event_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(LetterOrDigit);
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

	public static class SayContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode NORMALSTRING() { return getToken(discordslParser.NORMALSTRING, 0); }
		public TerminalNode LetterOrDigit() { return getToken(discordslParser.LetterOrDigit, 0); }
		public SayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_say; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterSay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitSay(this);
		}
	}

	public final SayContext say() throws RecognitionException {
		SayContext _localctx = new SayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_say);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(SAY);
				setState(195);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(SAY);
				setState(197);
				match(NORMALSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(SAY);
				setState(199);
				match(LetterOrDigit);
				}
				break;
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

	public static class If_operandContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(discordslParser.NORMALSTRING, 0); }
		public TerminalNode Digits() { return getToken(discordslParser.Digits, 0); }
		public Math_sum_fullContext math_sum_full() {
			return getRuleContext(Math_sum_fullContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterIf_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitIf_operand(this);
		}
	}

	public final If_operandContext if_operand() throws RecognitionException {
		If_operandContext _localctx = new If_operandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_operand);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(NORMALSTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(Digits);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				math_sum_full();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				statement();
				}
				break;
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

	public static class ConditionContext extends ParserRuleContext {
		public List<If_operandContext> if_operand() {
			return getRuleContexts(If_operandContext.class);
		}
		public If_operandContext if_operand(int i) {
			return getRuleContext(If_operandContext.class,i);
		}
		public ComparatorsContext comparators() {
			return getRuleContext(ComparatorsContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			if_operand();
			setState(209);
			comparators();
			setState(210);
			if_operand();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(discordslParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(discordslParser.THEN, 0); }
		public List<Conditional_statementContext> conditional_statement() {
			return getRuleContexts(Conditional_statementContext.class);
		}
		public Conditional_statementContext conditional_statement(int i) {
			return getRuleContext(Conditional_statementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(discordslParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(discordslParser.ENDIF, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_statement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(IF);
				setState(213);
				condition();
				setState(214);
				match(THEN);
				setState(215);
				conditional_statement();
				setState(216);
				match(ELSE);
				setState(217);
				conditional_statement();
				setState(218);
				match(ENDIF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(IF);
				setState(221);
				condition();
				setState(222);
				match(THEN);
				setState(223);
				conditional_statement();
				setState(224);
				match(ENDIF);
				}
				break;
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

	public static class Send_messageContext extends ParserRuleContext {
		public List<TerminalNode> Letters() { return getTokens(discordslParser.Letters); }
		public TerminalNode Letters(int i) {
			return getToken(discordslParser.Letters, i);
		}
		public TerminalNode TO() { return getToken(discordslParser.TO, 0); }
		public Send_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterSend_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitSend_message(this);
		}
	}

	public final Send_messageContext send_message() throws RecognitionException {
		Send_messageContext _localctx = new Send_messageContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_send_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__7);
			setState(229);
			match(Letters);
			setState(230);
			match(TO);
			setState(231);
			match(T__8);
			setState(232);
			match(Letters);
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitConditional_statement(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			statements();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(discordslParser.SET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TO() { return getToken(discordslParser.TO, 0); }
		public Var_valueContext var_value() {
			return getRuleContext(Var_valueContext.class,0);
		}
		public TerminalNode AS() { return getToken(discordslParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(SET);
			setState(237);
			identifier();
			setState(238);
			match(TO);
			setState(239);
			var_value();
			setState(240);
			match(AS);
			setState(241);
			type();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode LetterOrDigit() { return getToken(discordslParser.LetterOrDigit, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(LetterOrDigit);
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

	public static class Event_nameContext extends ParserRuleContext {
		public TerminalNode LetterOrDigit() { return getToken(discordslParser.LetterOrDigit, 0); }
		public Event_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterEvent_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitEvent_name(this);
		}
	}

	public final Event_nameContext event_name() throws RecognitionException {
		Event_nameContext _localctx = new Event_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_event_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LetterOrDigit);
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

	public static class Var_valueContext extends ParserRuleContext {
		public TerminalNode Digits() { return getToken(discordslParser.Digits, 0); }
		public TerminalNode NORMALSTRING() { return getToken(discordslParser.NORMALSTRING, 0); }
		public Math_sum_fullContext math_sum_full() {
			return getRuleContext(Math_sum_fullContext.class,0);
		}
		public Var_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterVar_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitVar_value(this);
		}
	}

	public final Var_valueContext var_value() throws RecognitionException {
		Var_valueContext _localctx = new Var_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_var_value);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(Digits);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(NORMALSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				math_sum_full();
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case SET:
			case IF:
			case ENDIF:
			case ELSE:
			case THEN:
			case SAY:
			case LB:
			case RB:
			case Digits:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(STRING_TYPE);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(INTEGER);
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

	public static class List_assignContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(discordslParser.SET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TO() { return getToken(discordslParser.TO, 0); }
		public TerminalNode NORMALSTRING() { return getToken(discordslParser.NORMALSTRING, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterList_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitList_assign(this);
		}
	}

	public final List_assignContext list_assign() throws RecognitionException {
		List_assignContext _localctx = new List_assignContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_list_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(SET);
			setState(258);
			identifier();
			setState(259);
			match(TO);
			setState(260);
			match(NORMALSTRING);
			setState(261);
			match(T__9);
			setState(262);
			type();
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

	public static class OperatorsContext extends ParserRuleContext {
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitOperators(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << LB) | (1L << RB))) != 0)) ) {
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

	public static class ComparatorsContext extends ParserRuleContext {
		public ComparatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterComparators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitComparators(this);
		}
	}

	public final ComparatorsContext comparators() throws RecognitionException {
		ComparatorsContext _localctx = new ComparatorsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return math_sum_sempred((Math_sumContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_sum_sempred(Math_sumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\6\2@\n"+
		"\2\r\2\16\2A\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\6"+
		"\nc\n\n\r\n\16\nd\3\n\3\n\3\n\3\n\6\nk\n\n\r\n\16\nl\3\n\3\n\3\n\3\n\3"+
		"\n\6\nt\n\n\r\n\16\nu\3\n\3\n\3\n\3\n\3\n\3\n\6\n~\n\n\r\n\16\n\177\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\6\n\u0088\n\n\r\n\16\n\u0089\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\6\n\u0092\n\n\r\n\16\n\u0093\3\n\3\n\3\n\5\n\u0099\n\n\3\n\3\n"+
		"\6\n\u009d\n\n\r\n\16\n\u009e\3\n\3\n\3\n\3\n\6\n\u00a5\n\n\r\n\16\n\u00a6"+
		"\3\n\3\n\7\n\u00ab\n\n\f\n\16\n\u00ae\13\n\3\13\3\13\3\f\6\f\u00b3\n\f"+
		"\r\f\16\f\u00b4\3\r\3\r\3\16\6\16\u00ba\n\16\r\16\16\16\u00bb\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cb\n\21"+
		"\3\22\3\22\3\22\3\22\5\22\u00d1\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e5\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u00fd\n\32\3\33\3\33\3\33"+
		"\5\33\u0102\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\2\3\22\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\5\3\2\64\65\4\2\r\21\64\65\3\2\22\26\2\u0111\2<\3\2\2\2\4C"+
		"\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16V\3\2\2\2\20]\3"+
		"\2\2\2\22\u0098\3\2\2\2\24\u00af\3\2\2\2\26\u00b2\3\2\2\2\30\u00b6\3\2"+
		"\2\2\32\u00b9\3\2\2\2\34\u00bd\3\2\2\2\36\u00c2\3\2\2\2 \u00ca\3\2\2\2"+
		"\"\u00d0\3\2\2\2$\u00d2\3\2\2\2&\u00e4\3\2\2\2(\u00e6\3\2\2\2*\u00ec\3"+
		"\2\2\2,\u00ee\3\2\2\2.\u00f5\3\2\2\2\60\u00f7\3\2\2\2\62\u00fc\3\2\2\2"+
		"\64\u0101\3\2\2\2\66\u0103\3\2\2\28\u010a\3\2\2\2:\u010c\3\2\2\2<=\7\3"+
		"\2\2=?\5\4\3\2>@\5\34\17\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3"+
		"\3\2\2\2CD\7\4\2\2DE\5\16\b\2EF\7\5\2\2FG\5\f\7\2GH\7\6\2\2HI\5\b\5\2"+
		"IJ\7\7\2\2JK\5\n\6\2KL\7\b\2\2LM\5\6\4\2M\5\3\2\2\2NO\7?\2\2O\7\3\2\2"+
		"\2PQ\7?\2\2Q\t\3\2\2\2RS\7?\2\2S\13\3\2\2\2TU\7?\2\2U\r\3\2\2\2VW\7?\2"+
		"\2W\17\3\2\2\2X^\5,\27\2Y^\5 \21\2Z^\5\66\34\2[^\5\30\r\2\\^\5&\24\2]"+
		"X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\21\3\2\2\2_`\b\n\1"+
		"\2`b\7:\2\2ac\58\35\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2"+
		"\2fg\5\32\16\2g\u0099\3\2\2\2hj\7:\2\2ik\58\35\2ji\3\2\2\2kl\3\2\2\2l"+
		"j\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7:\2\2o\u0099\3\2\2\2pq\5\24\13\2qs\5"+
		"\22\n\2rt\58\35\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx"+
		"\5\32\16\2xy\5\24\13\2y\u0099\3\2\2\2z{\5\24\13\2{}\5\22\n\2|~\58\35\2"+
		"}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0082\7:\2\2\u0082\u0083\5\24\13\2\u0083\u0099\3\2\2\2\u0084"+
		"\u0085\5\24\13\2\u0085\u0087\7:\2\2\u0086\u0088\58\35\2\u0087\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\5\32\16\2\u008c\u008d\5\24\13\2\u008d\u0099"+
		"\3\2\2\2\u008e\u008f\5\24\13\2\u008f\u0091\7:\2\2\u0090\u0092\58\35\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7:\2\2\u0096\u0097\5\24\13\2"+
		"\u0097\u0099\3\2\2\2\u0098_\3\2\2\2\u0098h\3\2\2\2\u0098p\3\2\2\2\u0098"+
		"z\3\2\2\2\u0098\u0084\3\2\2\2\u0098\u008e\3\2\2\2\u0099\u00ac\3\2\2\2"+
		"\u009a\u009c\f\n\2\2\u009b\u009d\58\35\2\u009c\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\5\32\16\2\u00a1\u00ab\3\2\2\2\u00a2\u00a4\f\t\2\2\u00a3\u00a5\5"+
		"8\35\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7:\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u009a\3\2\2\2\u00aa\u00a2\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b0\t\2\2\2\u00b0\25\3\2\2\2\u00b1\u00b3\5\20\t\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\27\3\2\2\2\u00b6\u00b7\5\32\16\2\u00b7\31\3\2\2\2\u00b8\u00ba\5\22\n"+
		"\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\33\3\2\2\2\u00bd\u00be\7\31\2\2\u00be\u00bf\5\60\31\2\u00bf"+
		"\u00c0\5\26\f\2\u00c0\u00c1\7\t\2\2\u00c1\35\3\2\2\2\u00c2\u00c3\7;\2"+
		"\2\u00c3\37\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00cb\5\26\f\2\u00c6\u00c7"+
		"\7\61\2\2\u00c7\u00cb\7?\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00cb\7;\2\2\u00ca"+
		"\u00c4\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb!\3\2\2\2"+
		"\u00cc\u00d1\7?\2\2\u00cd\u00d1\7:\2\2\u00ce\u00d1\5\30\r\2\u00cf\u00d1"+
		"\5\20\t\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1#\3\2\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00d4\5"+
		":\36\2\u00d4\u00d5\5\"\22\2\u00d5%\3\2\2\2\u00d6\u00d7\7\35\2\2\u00d7"+
		"\u00d8\5$\23\2\u00d8\u00d9\7-\2\2\u00d9\u00da\5*\26\2\u00da\u00db\7$\2"+
		"\2\u00db\u00dc\5*\26\2\u00dc\u00dd\7 \2\2\u00dd\u00e5\3\2\2\2\u00de\u00df"+
		"\7\35\2\2\u00df\u00e0\5$\23\2\u00e0\u00e1\7-\2\2\u00e1\u00e2\5*\26\2\u00e2"+
		"\u00e3\7 \2\2\u00e3\u00e5\3\2\2\2\u00e4\u00d6\3\2\2\2\u00e4\u00de\3\2"+
		"\2\2\u00e5\'\3\2\2\2\u00e6\u00e7\7\n\2\2\u00e7\u00e8\7<\2\2\u00e8\u00e9"+
		"\7\30\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb\7<\2\2\u00eb)\3\2\2\2\u00ec"+
		"\u00ed\5\26\f\2\u00ed+\3\2\2\2\u00ee\u00ef\7\27\2\2\u00ef\u00f0\5.\30"+
		"\2\u00f0\u00f1\7\30\2\2\u00f1\u00f2\5\62\32\2\u00f2\u00f3\7\62\2\2\u00f3"+
		"\u00f4\5\64\33\2\u00f4-\3\2\2\2\u00f5\u00f6\7;\2\2\u00f6/\3\2\2\2\u00f7"+
		"\u00f8\7;\2\2\u00f8\61\3\2\2\2\u00f9\u00fd\7:\2\2\u00fa\u00fd\7?\2\2\u00fb"+
		"\u00fd\5\30\r\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3"+
		"\2\2\2\u00fd\63\3\2\2\2\u00fe\u0102\3\2\2\2\u00ff\u0102\7\32\2\2\u0100"+
		"\u0102\7\33\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3"+
		"\2\2\2\u0102\65\3\2\2\2\u0103\u0104\7\27\2\2\u0104\u0105\5.\30\2\u0105"+
		"\u0106\7\30\2\2\u0106\u0107\7?\2\2\u0107\u0108\7\f\2\2\u0108\u0109\5\64"+
		"\33\2\u0109\67\3\2\2\2\u010a\u010b\t\3\2\2\u010b9\3\2\2\2\u010c\u010d"+
		"\t\4\2\2\u010d;\3\2\2\2\26A]dlu\177\u0089\u0093\u0098\u009e\u00a6\u00aa"+
		"\u00ac\u00b4\u00bb\u00ca\u00d0\u00e4\u00fc\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}