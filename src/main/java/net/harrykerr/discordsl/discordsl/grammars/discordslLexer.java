// Generated from C:/Users/Harry/Desktop/Code/Discord.sl/src/main/java/net/harrykerr/discordsl/discordsl/grammars\discordsl.g4 by ANTLR 4.7
package net.harrykerr.discordsl.discordsl.grammars;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class discordslLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "SET", "TO", 
		"EVENT", "STRING_TYPE", "INTEGER", "DECIMAL", "IF", "WHILE", "SETTINGS", 
		"ENDIF", "ENDWHILE", "VAR", "VAR_ASSIGN", "ELSE", "FOR", "ENDFOR", "EXIT", 
		"START_BOT", "COMMAND", "RETURN", "SWITCH", "CASE", "THEN", "RETURNS", 
		"VOID", "NULL", "SAY", "AS", "SPEECH", "WS", "NL", "COMMENT", "LINE_COMMENT", 
		"Digits", "LetterOrDigit", "Letters", "LABEL", "EOL", "NORMALSTRING", 
		"EscapeSequence"
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


	public discordslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "discordsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u01b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3/\6/\u0168"+
		"\n/\r/\16/\u0169\3/\3/\3\60\5\60\u016f\n\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\7\61\u0177\n\61\f\61\16\61\u017a\13\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\7\62\u0185\n\62\f\62\16\62\u0188\13\62\3\62\3\62\3"+
		"\63\6\63\u018d\n\63\r\63\16\63\u018e\3\64\3\64\5\64\u0193\n\64\3\65\6"+
		"\65\u0196\n\65\r\65\16\65\u0197\3\66\6\66\u019b\n\66\r\66\16\66\u019c"+
		"\3\67\6\67\u01a0\n\67\r\67\16\67\u01a1\38\38\38\78\u01a7\n8\f8\168\u01aa"+
		"\138\38\38\39\39\39\39\59\u01b2\n9\39\59\u01b5\n9\3\u0178\2:\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q\2\3\2"+
		"\t\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|"+
		"\4\2$$^^\f\2$$))^^cdhhppttvvxx||\2\u01c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3s\3\2\2\2\5}\3"+
		"\2\2\2\7\u0084\3\2\2\2\t\u0094\3\2\2\2\13\u00a1\3\2\2\2\r\u00a9\3\2\2"+
		"\2\17\u00af\3\2\2\2\21\u00b1\3\2\2\2\23\u00b3\3\2\2\2\25\u00b5\3\2\2\2"+
		"\27\u00b7\3\2\2\2\31\u00ba\3\2\2\2\33\u00bc\3\2\2\2\35\u00be\3\2\2\2\37"+
		"\u00c1\3\2\2\2!\u00c4\3\2\2\2#\u00c7\3\2\2\2%\u00cb\3\2\2\2\'\u00ce\3"+
		"\2\2\2)\u00d1\3\2\2\2+\u00d8\3\2\2\2-\u00df\3\2\2\2/\u00e7\3\2\2\2\61"+
		"\u00ea\3\2\2\2\63\u00f0\3\2\2\2\65\u00f9\3\2\2\2\67\u00ff\3\2\2\29\u0108"+
		"\3\2\2\2;\u010c\3\2\2\2=\u010f\3\2\2\2?\u0114\3\2\2\2A\u0118\3\2\2\2C"+
		"\u011f\3\2\2\2E\u0124\3\2\2\2G\u012a\3\2\2\2I\u0132\3\2\2\2K\u0136\3\2"+
		"\2\2M\u013d\3\2\2\2O\u0142\3\2\2\2Q\u0147\3\2\2\2S\u014f\3\2\2\2U\u0157"+
		"\3\2\2\2W\u015d\3\2\2\2Y\u0161\3\2\2\2[\u0164\3\2\2\2]\u0167\3\2\2\2_"+
		"\u016e\3\2\2\2a\u0172\3\2\2\2c\u0180\3\2\2\2e\u018c\3\2\2\2g\u0192\3\2"+
		"\2\2i\u0195\3\2\2\2k\u019a\3\2\2\2m\u019f\3\2\2\2o\u01a3\3\2\2\2q\u01b4"+
		"\3\2\2\2st\7u\2\2tu\7g\2\2uv\7v\2\2vw\7v\2\2wx\7k\2\2xy\7p\2\2yz\7i\2"+
		"\2z{\7u\2\2{|\7<\2\2|\4\3\2\2\2}~\7v\2\2~\177\7q\2\2\177\u0080\7m\2\2"+
		"\u0080\u0081\7g\2\2\u0081\u0082\7p\2\2\u0082\u0083\7<\2\2\u0083\6\3\2"+
		"\2\2\u0084\u0085\7e\2\2\u0085\u0086\7q\2\2\u0086\u0087\7o\2\2\u0087\u0088"+
		"\7o\2\2\u0088\u0089\7c\2\2\u0089\u008a\7p\2\2\u008a\u008b\7f\2\2\u008b"+
		"\u008c\7a\2\2\u008c\u008d\7r\2\2\u008d\u008e\7t\2\2\u008e\u008f\7g\2\2"+
		"\u008f\u0090\7h\2\2\u0090\u0091\7k\2\2\u0091\u0092\7z\2\2\u0092\u0093"+
		"\7<\2\2\u0093\b\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7p\2\2\u0096\u0097"+
		"\7c\2\2\u0097\u0098\7d\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7a\2\2\u009b\u009c\7j\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2"+
		"\u009e\u009f\7r\2\2\u009f\u00a0\7<\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7u"+
		"\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6"+
		"\7w\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7<\2\2\u00a8\f\3\2\2\2\u00a9\u00aa"+
		"\7i\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7<\2\2\u00ae\16\3\2\2\2\u00af\u00b0\7,\2\2\u00b0\20\3\2\2\2\u00b1"+
		"\u00b2\7\61\2\2\u00b2\22\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4\24\3\2\2\2\u00b5"+
		"\u00b6\7/\2\2\u00b6\26\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8\u00b9\7,\2\2\u00b9"+
		"\30\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\32\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd"+
		"\34\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7?\2\2\u00c0\36\3\2\2\2\u00c1"+
		"\u00c2\7>\2\2\u00c2\u00c3\7?\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7?\2\2\u00c5"+
		"\u00c6\7?\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"&\3\2\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7p\2\2\u00d0(\3\2\2\2\u00d1\u00d2"+
		"\7u\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7p\2\2\u00d6\u00d7\7i\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7p\2\2\u00d9"+
		"\u00da\7w\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7d\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\u00de\7t\2\2\u00de,\3\2\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7g\2"+
		"\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5"+
		"\7c\2\2\u00e5\u00e6\7n\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9"+
		"\7h\2\2\u00e9\60\3\2\2\2\u00ea\u00eb\7y\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed"+
		"\7k\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2\u00ef\62\3\2\2\2\u00f0\u00f1"+
		"\7u\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7v\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7i\2\2\u00f7\u00f8\7u\2\2"+
		"\u00f8\64\3\2\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7"+
		"f\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7h\2\2\u00fe\66\3\2\2\2\u00ff\u0100"+
		"\7g\2\2\u0100\u0101\7p\2\2\u0101\u0102\7f\2\2\u0102\u0103\7y\2\2\u0103"+
		"\u0104\7j\2\2\u0104\u0105\7k\2\2\u0105\u0106\7n\2\2\u0106\u0107\7g\2\2"+
		"\u01078\3\2\2\2\u0108\u0109\7u\2\2\u0109\u010a\7g\2\2\u010a\u010b\7v\2"+
		"\2\u010b:\3\2\2\2\u010c\u010d\7v\2\2\u010d\u010e\7q\2\2\u010e<\3\2\2\2"+
		"\u010f\u0110\7g\2\2\u0110\u0111\7n\2\2\u0111\u0112\7u\2\2\u0112\u0113"+
		"\7g\2\2\u0113>\3\2\2\2\u0114\u0115\7h\2\2\u0115\u0116\7q\2\2\u0116\u0117"+
		"\7t\2\2\u0117@\3\2\2\2\u0118\u0119\7g\2\2\u0119\u011a\7p\2\2\u011a\u011b"+
		"\7f\2\2\u011b\u011c\7h\2\2\u011c\u011d\7q\2\2\u011d\u011e\7t\2\2\u011e"+
		"B\3\2\2\2\u011f\u0120\7g\2\2\u0120\u0121\7z\2\2\u0121\u0122\7k\2\2\u0122"+
		"\u0123\7v\2\2\u0123D\3\2\2\2\u0124\u0125\7u\2\2\u0125\u0126\7v\2\2\u0126"+
		"\u0127\7c\2\2\u0127\u0128\7t\2\2\u0128\u0129\7v\2\2\u0129F\3\2\2\2\u012a"+
		"\u012b\7e\2\2\u012b\u012c\7q\2\2\u012c\u012d\7o\2\2\u012d\u012e\7o\2\2"+
		"\u012e\u012f\7c\2\2\u012f\u0130\7p\2\2\u0130\u0131\7f\2\2\u0131H\3\2\2"+
		"\2\u0132\u0133\7q\2\2\u0133\u0134\7w\2\2\u0134\u0135\7v\2\2\u0135J\3\2"+
		"\2\2\u0136\u0137\7u\2\2\u0137\u0138\7y\2\2\u0138\u0139\7k\2\2\u0139\u013a"+
		"\7v\2\2\u013a\u013b\7e\2\2\u013b\u013c\7j\2\2\u013cL\3\2\2\2\u013d\u013e"+
		"\7e\2\2\u013e\u013f\7c\2\2\u013f\u0140\7u\2\2\u0140\u0141\7g\2\2\u0141"+
		"N\3\2\2\2\u0142\u0143\7v\2\2\u0143\u0144\7j\2\2\u0144\u0145\7g\2\2\u0145"+
		"\u0146\7p\2\2\u0146P\3\2\2\2\u0147\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149"+
		"\u014a\7v\2\2\u014a\u014b\7w\2\2\u014b\u014c\7t\2\2\u014c\u014d\7p\2\2"+
		"\u014d\u014e\7u\2\2\u014eR\3\2\2\2\u014f\u0150\7p\2\2\u0150\u0151\7q\2"+
		"\2\u0151\u0152\7v\2\2\u0152\u0153\7j\2\2\u0153\u0154\7k\2\2\u0154\u0155"+
		"\7p\2\2\u0155\u0156\7i\2\2\u0156T\3\2\2\2\u0157\u0158\7g\2\2\u0158\u0159"+
		"\7o\2\2\u0159\u015a\7r\2\2\u015a\u015b\7v\2\2\u015b\u015c\7{\2\2\u015c"+
		"V\3\2\2\2\u015d\u015e\7u\2\2\u015e\u015f\7c\2\2\u015f\u0160\7{\2\2\u0160"+
		"X\3\2\2\2\u0161\u0162\7c\2\2\u0162\u0163\7u\2\2\u0163Z\3\2\2\2\u0164\u0165"+
		"\7$\2\2\u0165\\\3\2\2\2\u0166\u0168\t\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\b/\2\2\u016c^\3\2\2\2\u016d\u016f\7\17\2\2\u016e\u016d"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\f\2\2\u0171"+
		"`\3\2\2\2\u0172\u0173\7\61\2\2\u0173\u0174\7,\2\2\u0174\u0178\3\2\2\2"+
		"\u0175\u0177\13\2\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017c\7,\2\2\u017c\u017d\7\61\2\2\u017d\u017e\3\2\2\2\u017e\u017f\b\61"+
		"\3\2\u017fb\3\2\2\2\u0180\u0181\7\61\2\2\u0181\u0182\7\61\2\2\u0182\u0186"+
		"\3\2\2\2\u0183\u0185\n\3\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0189\u018a\b\62\3\2\u018ad\3\2\2\2\u018b\u018d\t\4\2\2\u018c\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"f\3\2\2\2\u0190\u0193\5i\65\2\u0191\u0193\t\4\2\2\u0192\u0190\3\2\2\2"+
		"\u0192\u0191\3\2\2\2\u0193h\3\2\2\2\u0194\u0196\t\5\2\2\u0195\u0194\3"+
		"\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"j\3\2\2\2\u0199\u019b\t\6\2\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2"+
		"\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019dl\3\2\2\2\u019e\u01a0\t"+
		"\3\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2n\3\2\2\2\u01a3\u01a8\7$\2\2\u01a4\u01a7\5q9\2\u01a5"+
		"\u01a7\n\7\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ac\7$\2\2\u01acp\3\2\2\2\u01ad\u01ae\7^\2\2\u01ae"+
		"\u01b5\t\b\2\2\u01af\u01b1\7^\2\2\u01b0\u01b2\7\17\2\2\u01b1\u01b0\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\7\f\2\2\u01b4"+
		"\u01ad\3\2\2\2\u01b4\u01af\3\2\2\2\u01b5r\3\2\2\2\20\2\u0169\u016e\u0178"+
		"\u0186\u018e\u0192\u0197\u019c\u01a1\u01a6\u01a8\u01b1\u01b4\4\b\2\2\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}