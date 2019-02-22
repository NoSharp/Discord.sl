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
		SET=18, TO=19, EVENT=20, STRING_TYPE=21, INTEGER=22, DECIMAL=23, IF=24, 
		WHILE=25, SETTINGS=26, ENDIF=27, ENDWHILE=28, VAR=29, VAR_ASSIGN=30, ELSE=31, 
		FOR=32, ENDFOR=33, EXIT=34, START_BOT=35, COMMAND=36, RETURN=37, SWITCH=38, 
		CASE=39, THEN=40, RETURNS=41, VOID=42, NULL=43, SAY=44, AS=45, SPEECH=46, 
		WS=47, NL=48, COMMENT=49, LINE_COMMENT=50, Digits=51, LetterOrDigit=52, 
		Letters=53, LABEL=54, EOL=55, NORMALSTRING=56;
	public static final int
		RULE_start = 0, RULE_settings = 1, RULE_game = 2, RULE_enable_help = 3, 
		RULE_status = 4, RULE_command_prefix = 5, RULE_token = 6, RULE_statements = 7, 
		RULE_say = 8, RULE_maths_equations = 9, RULE_variable = 10, RULE_identifier = 11, 
		RULE_var_value = 12, RULE_type = 13, RULE_list_assign = 14, RULE_operators = 15, 
		RULE_comparators = 16;
	public static final String[] ruleNames = {
		"start", "settings", "game", "enable_help", "status", "command_prefix", 
		"token", "statements", "say", "maths_equations", "variable", "identifier", 
		"var_value", "type", "list_assign", "operators", "comparators"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'settings:'", "'token:'", "'command_prefix:'", "'enable_help:'", 
		"'status:'", "'game:'", "'which is list of type'", "'*'", "'/'", "'+'", 
		"'-'", "'**'", "'<'", "'>'", "'>='", "'<='", "'=='", null, null, "'on'", 
		"'string'", "'number'", "'decimal'", "'if'", "'while'", "'settings'", 
		"'endif'", "'endwhile'", null, null, "'else'", "'for'", "'endfor'", "'exit'", 
		"'start'", "'command'", "'out'", "'switch'", "'case'", "'then'", "'returns'", 
		"'nothing'", "'empty'", "'say'", "'as'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "SET", "TO", "EVENT", "STRING_TYPE", 
		"INTEGER", "DECIMAL", "IF", "WHILE", "SETTINGS", "ENDIF", "ENDWHILE", 
		"VAR", "VAR_ASSIGN", "ELSE", "FOR", "ENDFOR", "EXIT", "START_BOT", "COMMAND", 
		"RETURN", "SWITCH", "CASE", "THEN", "RETURNS", "VOID", "NULL", "SAY", 
		"AS", "SPEECH", "WS", "NL", "COMMENT", "LINE_COMMENT", "Digits", "LetterOrDigit", 
		"Letters", "LABEL", "EOL", "NORMALSTRING"
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
			setState(34);
			match(T__0);
			setState(35);
			settings();
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				statements();
				}
				}
				setState(39); 
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
			setState(41);
			match(T__1);
			setState(42);
			token();
			setState(43);
			match(T__2);
			setState(44);
			command_prefix();
			setState(45);
			match(T__3);
			setState(46);
			enable_help();
			setState(47);
			match(T__4);
			setState(48);
			status();
			setState(49);
			match(T__5);
			setState(50);
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
			setState(60);
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
		public List_assignContext list_assign() {
			return getRuleContext(List_assignContext.class,0);
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				say();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				maths_equations(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				list_assign();
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(SAY);
				setState(69);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(SAY);
				setState(71);
				match(NORMALSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(SAY);
				setState(73);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(77);
				match(Digits);
				setState(78);
				operators();
				setState(79);
				match(Digits);
				}
				break;
			case 2:
				{
				setState(81);
				match(Digits);
				setState(82);
				operators();
				setState(83);
				maths_equations(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Maths_equationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_maths_equations);
						setState(87);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(88);
						operators();
						setState(89);
						maths_equations(4);
						}
						break;
					case 2:
						{
						_localctx = new Maths_equationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_maths_equations);
						setState(91);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(92);
						operators();
						setState(93);
						match(Digits);
						}
						break;
					}
					} 
				}
				setState(99);
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
			setState(100);
			match(SET);
			setState(101);
			identifier();
			setState(102);
			match(TO);
			setState(103);
			var_value();
			setState(104);
			match(AS);
			setState(105);
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
			setState(107);
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
			setState(109);
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
			setState(114);
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
				setState(112);
				match(STRING_TYPE);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
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
		enterRule(_localctx, 28, RULE_list_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(SET);
			setState(117);
			identifier();
			setState(118);
			match(TO);
			setState(119);
			match(NORMALSTRING);
			setState(120);
			match(T__6);
			setState(121);
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
		enterRule(_localctx, 30, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_comparators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0082\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\tE\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nM\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13X\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13b\n"+
		"\13\f\13\16\13e\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\5\17u\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\2\3\24\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2"+
		"\5\4\2\65\65::\3\2\n\16\3\2\17\23\2{\2$\3\2\2\2\4+\3\2\2\2\6\66\3\2\2"+
		"\2\b8\3\2\2\2\n:\3\2\2\2\f<\3\2\2\2\16>\3\2\2\2\20D\3\2\2\2\22L\3\2\2"+
		"\2\24W\3\2\2\2\26f\3\2\2\2\30m\3\2\2\2\32o\3\2\2\2\34t\3\2\2\2\36v\3\2"+
		"\2\2 }\3\2\2\2\"\177\3\2\2\2$%\7\3\2\2%\'\5\4\3\2&(\5\20\t\2\'&\3\2\2"+
		"\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+,\7\4\2\2,-\5\16\b\2-.\7"+
		"\5\2\2./\5\f\7\2/\60\7\6\2\2\60\61\5\b\5\2\61\62\7\7\2\2\62\63\5\n\6\2"+
		"\63\64\7\b\2\2\64\65\5\6\4\2\65\5\3\2\2\2\66\67\7:\2\2\67\7\3\2\2\289"+
		"\7:\2\29\t\3\2\2\2:;\7:\2\2;\13\3\2\2\2<=\7:\2\2=\r\3\2\2\2>?\7:\2\2?"+
		"\17\3\2\2\2@E\5\26\f\2AE\5\22\n\2BE\5\24\13\2CE\5\36\20\2D@\3\2\2\2DA"+
		"\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\21\3\2\2\2FG\7.\2\2GM\5\20\t\2HI\7.\2\2"+
		"IM\7:\2\2JK\7.\2\2KM\7\66\2\2LF\3\2\2\2LH\3\2\2\2LJ\3\2\2\2M\23\3\2\2"+
		"\2NO\b\13\1\2OP\7\65\2\2PQ\5 \21\2QR\7\65\2\2RX\3\2\2\2ST\7\65\2\2TU\5"+
		" \21\2UV\5\24\13\4VX\3\2\2\2WN\3\2\2\2WS\3\2\2\2Xc\3\2\2\2YZ\f\5\2\2Z"+
		"[\5 \21\2[\\\5\24\13\6\\b\3\2\2\2]^\f\3\2\2^_\5 \21\2_`\7\65\2\2`b\3\2"+
		"\2\2aY\3\2\2\2a]\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\25\3\2\2\2ec\3"+
		"\2\2\2fg\7\24\2\2gh\5\30\r\2hi\7\25\2\2ij\5\32\16\2jk\7/\2\2kl\5\34\17"+
		"\2l\27\3\2\2\2mn\7\66\2\2n\31\3\2\2\2op\t\2\2\2p\33\3\2\2\2qu\3\2\2\2"+
		"ru\7\27\2\2su\7\30\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\35\3\2\2\2vw\7\24"+
		"\2\2wx\5\30\r\2xy\7\25\2\2yz\7:\2\2z{\7\t\2\2{|\5\34\17\2|\37\3\2\2\2"+
		"}~\t\3\2\2~!\3\2\2\2\177\u0080\t\4\2\2\u0080#\3\2\2\2\t)DLWact";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}