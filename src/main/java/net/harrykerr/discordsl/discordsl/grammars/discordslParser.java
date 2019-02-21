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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, SET=17, 
		TO=18, EVENT=19, STRING_TYPE=20, INTEGER=21, DECIMAL=22, IF=23, WHILE=24, 
		SETTINGS=25, ENDIF=26, ENDWHILE=27, VAR=28, VAR_ASSIGN=29, ELSE=30, FOR=31, 
		ENDFOR=32, EXIT=33, START_BOT=34, COMMAND=35, RETURN=36, SWITCH=37, CASE=38, 
		THEN=39, RETURNS=40, VOID=41, NULL=42, SAY=43, AS=44, SPEECH=45, WS=46, 
		NL=47, COMMENT=48, LINE_COMMENT=49, Digits=50, LetterOrDigit=51, Letters=52, 
		LABEL=53, EOL=54, NORMALSTRING=55;
	public static final int
		RULE_start = 0, RULE_settings = 1, RULE_game = 2, RULE_enable_help = 3, 
		RULE_status = 4, RULE_command_prefix = 5, RULE_token = 6, RULE_statements = 7, 
		RULE_say = 8, RULE_maths_equations = 9, RULE_variable = 10, RULE_identifier = 11, 
		RULE_var_value = 12, RULE_type = 13, RULE_operators = 14, RULE_comparators = 15;
	public static final String[] ruleNames = {
		"start", "settings", "game", "enable_help", "status", "command_prefix", 
		"token", "statements", "say", "maths_equations", "variable", "identifier", 
		"var_value", "type", "operators", "comparators"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'settings:'", "'token:'", "'command_prefix:'", "'enable_help:'", 
		"'status:'", "'game:'", "'*'", "'/'", "'+'", "'-'", "'**'", "'<'", "'>'", 
		"'>='", "'<='", "'=='", null, null, "'on'", "'string'", "'number'", "'decimal'", 
		"'if'", "'while'", "'settings'", "'endif'", "'endwhile'", null, null, 
		"'else'", "'for'", "'endfor'", "'exit'", "'start'", "'command'", "'out'", 
		"'switch'", "'case'", "'then'", "'returns'", "'nothing'", "'empty'", "'say'", 
		"'as'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "SET", "TO", "EVENT", "STRING_TYPE", "INTEGER", 
		"DECIMAL", "IF", "WHILE", "SETTINGS", "ENDIF", "ENDWHILE", "VAR", "VAR_ASSIGN", 
		"ELSE", "FOR", "ENDFOR", "EXIT", "START_BOT", "COMMAND", "RETURN", "SWITCH", 
		"CASE", "THEN", "RETURNS", "VOID", "NULL", "SAY", "AS", "SPEECH", "WS", 
		"NL", "COMMENT", "LINE_COMMENT", "Digits", "LetterOrDigit", "Letters", 
		"LABEL", "EOL", "NORMALSTRING"
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
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
			setState(32);
			match(T__0);
			setState(33);
			settings();
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				statements();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << SAY) | (1L << Digits))) != 0) );
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
			setState(39);
			match(T__1);
			setState(40);
			token();
			setState(41);
			match(T__2);
			setState(42);
			command_prefix();
			setState(43);
			match(T__3);
			setState(44);
			enable_help();
			setState(45);
			match(T__4);
			setState(46);
			status();
			setState(47);
			match(T__5);
			setState(48);
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
			setState(50);
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
			setState(52);
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
			setState(54);
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
			setState(56);
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
			setState(58);
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

	public static class StatementsContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SayContext say() {
			return getRuleContext(SayContext.class,0);
		}
		public Maths_equationsContext maths_equations() {
			return getRuleContext(Maths_equationsContext.class,0);
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
		enterRule(_localctx, 14, RULE_statements);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				variable();
				}
				break;
			case SAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				say();
				}
				break;
			case Digits:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				maths_equations(0);
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
		enterRule(_localctx, 16, RULE_say);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(SAY);
				setState(66);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(SAY);
				setState(68);
				match(NORMALSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(SAY);
				setState(70);
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

	public static class Maths_equationsContext extends ParserRuleContext {
		public List<TerminalNode> Digits() { return getTokens(discordslParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(discordslParser.Digits, i);
		}
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public List<Maths_equationsContext> maths_equations() {
			return getRuleContexts(Maths_equationsContext.class);
		}
		public Maths_equationsContext maths_equations(int i) {
			return getRuleContext(Maths_equationsContext.class,i);
		}
		public Maths_equationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maths_equations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).enterMaths_equations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof discordslListener ) ((discordslListener)listener).exitMaths_equations(this);
		}
	}

	public final Maths_equationsContext maths_equations() throws RecognitionException {
		return maths_equations(0);
	}

	private Maths_equationsContext maths_equations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Maths_equationsContext _localctx = new Maths_equationsContext(_ctx, _parentState);
		Maths_equationsContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_maths_equations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(74);
				match(Digits);
				setState(75);
				operators();
				setState(76);
				match(Digits);
				}
				break;
			case 2:
				{
				setState(78);
				match(Digits);
				setState(79);
				operators();
				setState(80);
				maths_equations(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Maths_equationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_maths_equations);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						operators();
						setState(86);
						maths_equations(4);
						}
						break;
					case 2:
						{
						_localctx = new Maths_equationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_maths_equations);
						setState(88);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(89);
						operators();
						setState(90);
						match(Digits);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SET);
			setState(98);
			identifier();
			setState(99);
			match(TO);
			setState(100);
			var_value();
			setState(101);
			match(AS);
			setState(102);
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
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		enterRule(_localctx, 24, RULE_var_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==Digits || _la==NORMALSTRING) ) {
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
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case SET:
			case SAY:
			case Digits:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(STRING_TYPE);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
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
		enterRule(_localctx, 28, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_comparators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		case 9:
			return maths_equations_sempred((Maths_equationsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean maths_equations_sempred(Maths_equationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39x\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\6\2&"+
		"\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\tB\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\nJ\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13U\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13_\n\13\f\13\16\13b\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17r\n"+
		"\17\3\20\3\20\3\21\3\21\3\21\2\3\24\22\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \2\5\4\2\64\6499\3\2\t\r\3\2\16\22\2q\2\"\3\2\2\2\4)\3\2\2\2\6"+
		"\64\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f:\3\2\2\2\16<\3\2\2\2\20A\3\2\2\2"+
		"\22I\3\2\2\2\24T\3\2\2\2\26c\3\2\2\2\30j\3\2\2\2\32l\3\2\2\2\34q\3\2\2"+
		"\2\36s\3\2\2\2 u\3\2\2\2\"#\7\3\2\2#%\5\4\3\2$&\5\20\t\2%$\3\2\2\2&\'"+
		"\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)*\7\4\2\2*+\5\16\b\2+,\7\5\2"+
		"\2,-\5\f\7\2-.\7\6\2\2./\5\b\5\2/\60\7\7\2\2\60\61\5\n\6\2\61\62\7\b\2"+
		"\2\62\63\5\6\4\2\63\5\3\2\2\2\64\65\79\2\2\65\7\3\2\2\2\66\67\79\2\2\67"+
		"\t\3\2\2\289\79\2\29\13\3\2\2\2:;\79\2\2;\r\3\2\2\2<=\79\2\2=\17\3\2\2"+
		"\2>B\5\26\f\2?B\5\22\n\2@B\5\24\13\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\21"+
		"\3\2\2\2CD\7-\2\2DJ\5\20\t\2EF\7-\2\2FJ\79\2\2GH\7-\2\2HJ\7\65\2\2IC\3"+
		"\2\2\2IE\3\2\2\2IG\3\2\2\2J\23\3\2\2\2KL\b\13\1\2LM\7\64\2\2MN\5\36\20"+
		"\2NO\7\64\2\2OU\3\2\2\2PQ\7\64\2\2QR\5\36\20\2RS\5\24\13\4SU\3\2\2\2T"+
		"K\3\2\2\2TP\3\2\2\2U`\3\2\2\2VW\f\5\2\2WX\5\36\20\2XY\5\24\13\6Y_\3\2"+
		"\2\2Z[\f\3\2\2[\\\5\36\20\2\\]\7\64\2\2]_\3\2\2\2^V\3\2\2\2^Z\3\2\2\2"+
		"_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\25\3\2\2\2b`\3\2\2\2cd\7\23\2\2de\5\30"+
		"\r\2ef\7\24\2\2fg\5\32\16\2gh\7.\2\2hi\5\34\17\2i\27\3\2\2\2jk\7\65\2"+
		"\2k\31\3\2\2\2lm\t\2\2\2m\33\3\2\2\2nr\3\2\2\2or\7\26\2\2pr\7\27\2\2q"+
		"n\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\35\3\2\2\2st\t\3\2\2t\37\3\2\2\2uv\t\4"+
		"\2\2v!\3\2\2\2\t\'AIT^`q";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}