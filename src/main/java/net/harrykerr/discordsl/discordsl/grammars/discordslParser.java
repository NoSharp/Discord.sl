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
		T__17=18, SET=19, TO=20, EVENT=21, STRING_TYPE=22, INTEGER=23, DECIMAL=24, 
		IF=25, WHILE=26, SETTINGS=27, ENDIF=28, ENDWHILE=29, VAR=30, VAR_ASSIGN=31, 
		ELSE=32, FOR=33, ENDFOR=34, EXIT=35, START_BOT=36, COMMAND=37, RETURN=38, 
		SWITCH=39, CASE=40, THEN=41, RETURNS=42, VOID=43, NULL=44, SAY=45, AS=46, 
		SPEECH=47, LB=48, RB=49, WS=50, NL=51, COMMENT=52, LINE_COMMENT=53, Digits=54, 
		LetterOrDigit=55, Letters=56, LABEL=57, EOL=58, NORMALSTRING=59;
	public static final int
		RULE_start = 0, RULE_settings = 1, RULE_game = 2, RULE_enable_help = 3, 
		RULE_status = 4, RULE_command_prefix = 5, RULE_token = 6, RULE_statement = 7, 
		RULE_math_sum = 8, RULE_brackets = 9, RULE_statements = 10, RULE_math_sum_full = 11, 
		RULE_math_sums = 12, RULE_event = 13, RULE_event_param = 14, RULE_say = 15, 
		RULE_variable = 16, RULE_identifier = 17, RULE_event_name = 18, RULE_var_value = 19, 
		RULE_type = 20, RULE_list_assign = 21, RULE_operators = 22, RULE_comparators = 23;
	public static final String[] ruleNames = {
		"start", "settings", "game", "enable_help", "status", "command_prefix", 
		"token", "statement", "math_sum", "brackets", "statements", "math_sum_full", 
		"math_sums", "event", "event_param", "say", "variable", "identifier", 
		"event_name", "var_value", "type", "list_assign", "operators", "comparators"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'settings:'", "'token:'", "'command_prefix:'", "'enable_help:'", 
		"'status:'", "'game:'", "'endevent'", "'which is list of type'", "'^'", 
		"'/'", "'+'", "'-'", "'*'", "'<'", "'>'", "'>='", "'<='", "'=='", null, 
		null, "'on'", "'string'", "'number'", "'decimal'", "'if'", "'while'", 
		"'settings'", "'endif'", "'endwhile'", null, null, "'else'", "'for'", 
		"'endfor'", "'exit'", "'start'", "'command'", "'out'", "'switch'", "'case'", 
		"'then'", "'returns'", "'nothing'", "'empty'", "'say'", "'as'", "'\"'", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "SET", "TO", "EVENT", "STRING_TYPE", 
		"INTEGER", "DECIMAL", "IF", "WHILE", "SETTINGS", "ENDIF", "ENDWHILE", 
		"VAR", "VAR_ASSIGN", "ELSE", "FOR", "ENDFOR", "EXIT", "START_BOT", "COMMAND", 
		"RETURN", "SWITCH", "CASE", "THEN", "RETURNS", "VOID", "NULL", "SAY", 
		"AS", "SPEECH", "LB", "RB", "WS", "NL", "COMMENT", "LINE_COMMENT", "Digits", 
		"LetterOrDigit", "Letters", "LABEL", "EOL", "NORMALSTRING"
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
			setState(48);
			match(T__0);
			setState(49);
			settings();
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				event();
				}
				}
				setState(53); 
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
			setState(55);
			match(T__1);
			setState(56);
			token();
			setState(57);
			match(T__2);
			setState(58);
			command_prefix();
			setState(59);
			match(T__3);
			setState(60);
			enable_help();
			setState(61);
			match(T__4);
			setState(62);
			status();
			setState(63);
			match(T__5);
			setState(64);
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
			setState(66);
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
			setState(68);
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
			setState(70);
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
			setState(72);
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
			setState(74);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				say();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				list_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(83);
				match(Digits);
				setState(85); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(84);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(87); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(89);
				math_sums();
				}
				break;
			case 2:
				{
				setState(91);
				match(Digits);
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					operators();
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << LB) | (1L << RB))) != 0) );
				setState(97);
				match(Digits);
				}
				break;
			case 3:
				{
				setState(99);
				brackets();
				setState(100);
				math_sum(0);
				setState(102); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(101);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(104); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(106);
				math_sums();
				setState(107);
				brackets();
				}
				break;
			case 4:
				{
				setState(109);
				brackets();
				setState(110);
				math_sum(0);
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					operators();
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << LB) | (1L << RB))) != 0) );
				setState(116);
				match(Digits);
				setState(117);
				brackets();
				}
				break;
			case 5:
				{
				setState(119);
				brackets();
				setState(120);
				match(Digits);
				setState(122); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(121);
						operators();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(124); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(126);
				math_sums();
				setState(127);
				brackets();
				}
				break;
			case 6:
				{
				setState(129);
				brackets();
				setState(130);
				match(Digits);
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					operators();
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << LB) | (1L << RB))) != 0) );
				setState(136);
				match(Digits);
				setState(137);
				brackets();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Math_sumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_sum);
						setState(141);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(143); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(142);
								operators();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(145); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(147);
						math_sums();
						}
						break;
					case 2:
						{
						_localctx = new Math_sumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_sum);
						setState(149);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(151); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(150);
							operators();
							}
							}
							setState(153); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << LB) | (1L << RB))) != 0) );
						setState(155);
						match(Digits);
						}
						break;
					}
					} 
				}
				setState(161);
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
			setState(162);
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
			setState(165); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(164);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167); 
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
			setState(169);
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
			setState(172); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					math_sum(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(174); 
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
			setState(176);
			match(EVENT);
			setState(177);
			event_name();
			setState(178);
			statements();
			setState(179);
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
			setState(181);
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(SAY);
				setState(184);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(SAY);
				setState(186);
				match(NORMALSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(SAY);
				setState(188);
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
		enterRule(_localctx, 32, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(SET);
			setState(192);
			identifier();
			setState(193);
			match(TO);
			setState(194);
			var_value();
			setState(195);
			match(AS);
			setState(196);
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
		enterRule(_localctx, 34, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 36, RULE_event_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 38, RULE_var_value);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(Digits);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(NORMALSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
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
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case SET:
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
				setState(208);
				match(STRING_TYPE);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
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
		enterRule(_localctx, 42, RULE_list_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(SET);
			setState(213);
			identifier();
			setState(214);
			match(TO);
			setState(215);
			match(NORMALSTRING);
			setState(216);
			match(T__7);
			setState(217);
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
		enterRule(_localctx, 44, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << LB) | (1L << RB))) != 0)) ) {
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
		enterRule(_localctx, 46, RULE_comparators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u00e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\6\2\66\n\2\r\2\16\2\67\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\t"+
		"S\n\t\3\n\3\n\3\n\6\nX\n\n\r\n\16\nY\3\n\3\n\3\n\3\n\6\n`\n\n\r\n\16\n"+
		"a\3\n\3\n\3\n\3\n\3\n\6\ni\n\n\r\n\16\nj\3\n\3\n\3\n\3\n\3\n\3\n\6\ns"+
		"\n\n\r\n\16\nt\3\n\3\n\3\n\3\n\3\n\3\n\6\n}\n\n\r\n\16\n~\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\6\n\u0087\n\n\r\n\16\n\u0088\3\n\3\n\3\n\5\n\u008e\n\n\3"+
		"\n\3\n\6\n\u0092\n\n\r\n\16\n\u0093\3\n\3\n\3\n\3\n\6\n\u009a\n\n\r\n"+
		"\16\n\u009b\3\n\3\n\7\n\u00a0\n\n\f\n\16\n\u00a3\13\n\3\13\3\13\3\f\6"+
		"\f\u00a8\n\f\r\f\16\f\u00a9\3\r\3\r\3\16\6\16\u00af\n\16\r\16\16\16\u00b0"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00c0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u00d0\n\25\3\26\3\26\3\26\5\26\u00d5\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\3\22\32\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\3\2\62\63\4\2\13\17\62\63"+
		"\3\2\20\24\2\u00e4\2\62\3\2\2\2\49\3\2\2\2\6D\3\2\2\2\bF\3\2\2\2\nH\3"+
		"\2\2\2\fJ\3\2\2\2\16L\3\2\2\2\20R\3\2\2\2\22\u008d\3\2\2\2\24\u00a4\3"+
		"\2\2\2\26\u00a7\3\2\2\2\30\u00ab\3\2\2\2\32\u00ae\3\2\2\2\34\u00b2\3\2"+
		"\2\2\36\u00b7\3\2\2\2 \u00bf\3\2\2\2\"\u00c1\3\2\2\2$\u00c8\3\2\2\2&\u00ca"+
		"\3\2\2\2(\u00cf\3\2\2\2*\u00d4\3\2\2\2,\u00d6\3\2\2\2.\u00dd\3\2\2\2\60"+
		"\u00df\3\2\2\2\62\63\7\3\2\2\63\65\5\4\3\2\64\66\5\34\17\2\65\64\3\2\2"+
		"\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29:\7\4\2\2:;\5\16"+
		"\b\2;<\7\5\2\2<=\5\f\7\2=>\7\6\2\2>?\5\b\5\2?@\7\7\2\2@A\5\n\6\2AB\7\b"+
		"\2\2BC\5\6\4\2C\5\3\2\2\2DE\7=\2\2E\7\3\2\2\2FG\7=\2\2G\t\3\2\2\2HI\7"+
		"=\2\2I\13\3\2\2\2JK\7=\2\2K\r\3\2\2\2LM\7=\2\2M\17\3\2\2\2NS\5\"\22\2"+
		"OS\5 \21\2PS\5,\27\2QS\5\30\r\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2"+
		"\2S\21\3\2\2\2TU\b\n\1\2UW\78\2\2VX\5.\30\2WV\3\2\2\2XY\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\32\16\2\\\u008e\3\2\2\2]_\78\2\2^`\5.\30"+
		"\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\78\2\2d\u008e\3"+
		"\2\2\2ef\5\24\13\2fh\5\22\n\2gi\5.\30\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2"+
		"jk\3\2\2\2kl\3\2\2\2lm\5\32\16\2mn\5\24\13\2n\u008e\3\2\2\2op\5\24\13"+
		"\2pr\5\22\n\2qs\5.\30\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2"+
		"\2\2vw\78\2\2wx\5\24\13\2x\u008e\3\2\2\2yz\5\24\13\2z|\78\2\2{}\5.\30"+
		"\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\5\32\16\2\u0081\u0082\5\24\13\2\u0082\u008e\3\2\2\2\u0083\u0084"+
		"\5\24\13\2\u0084\u0086\78\2\2\u0085\u0087\5.\30\2\u0086\u0085\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\78\2\2\u008b\u008c\5\24\13\2\u008c\u008e\3\2\2\2"+
		"\u008dT\3\2\2\2\u008d]\3\2\2\2\u008de\3\2\2\2\u008do\3\2\2\2\u008dy\3"+
		"\2\2\2\u008d\u0083\3\2\2\2\u008e\u00a1\3\2\2\2\u008f\u0091\f\n\2\2\u0090"+
		"\u0092\5.\30\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5\32\16\2\u0096"+
		"\u00a0\3\2\2\2\u0097\u0099\f\t\2\2\u0098\u009a\5.\30\2\u0099\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\78\2\2\u009e\u00a0\3\2\2\2\u009f\u008f\3\2"+
		"\2\2\u009f\u0097\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\23\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\t\2\2"+
		"\2\u00a5\25\3\2\2\2\u00a6\u00a8\5\20\t\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\27\3\2\2\2\u00ab"+
		"\u00ac\5\32\16\2\u00ac\31\3\2\2\2\u00ad\u00af\5\22\n\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\33\3\2\2\2\u00b2\u00b3\7\27\2\2\u00b3\u00b4\5&\24\2\u00b4\u00b5\5\26"+
		"\f\2\u00b5\u00b6\7\t\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\79\2\2\u00b8\37"+
		"\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba\u00c0\5\26\f\2\u00bb\u00bc\7/\2\2\u00bc"+
		"\u00c0\7=\2\2\u00bd\u00be\7/\2\2\u00be\u00c0\79\2\2\u00bf\u00b9\3\2\2"+
		"\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00c2"+
		"\7\25\2\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5(\25\2"+
		"\u00c5\u00c6\7\60\2\2\u00c6\u00c7\5*\26\2\u00c7#\3\2\2\2\u00c8\u00c9\7"+
		"9\2\2\u00c9%\3\2\2\2\u00ca\u00cb\79\2\2\u00cb\'\3\2\2\2\u00cc\u00d0\7"+
		"8\2\2\u00cd\u00d0\7=\2\2\u00ce\u00d0\5\30\r\2\u00cf\u00cc\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0)\3\2\2\2\u00d1\u00d5\3\2\2\2"+
		"\u00d2\u00d5\7\30\2\2\u00d3\u00d5\7\31\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5+\3\2\2\2\u00d6\u00d7\7\25\2\2\u00d7"+
		"\u00d8\5$\23\2\u00d8\u00d9\7\26\2\2\u00d9\u00da\7=\2\2\u00da\u00db\7\n"+
		"\2\2\u00db\u00dc\5*\26\2\u00dc-\3\2\2\2\u00dd\u00de\t\3\2\2\u00de/\3\2"+
		"\2\2\u00df\u00e0\t\4\2\2\u00e0\61\3\2\2\2\24\67RYajt~\u0088\u008d\u0093"+
		"\u009b\u009f\u00a1\u00a9\u00b0\u00bf\u00cf\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}