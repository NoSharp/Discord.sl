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
		T__9=10, SET=11, TO=12, EVENT=13, STRING_TYPE=14, INTEGER=15, DECIMAL=16, 
		IF=17, WHILE=18, SETTINGS=19, ENDIF=20, ENDWHILE=21, VAR=22, VAR_ASSIGN=23, 
		ELSE=24, FOR=25, ENDFOR=26, EXIT=27, START_BOT=28, COMMAND=29, RETURN=30, 
		SWITCH=31, CASE=32, THEN=33, RETURNS=34, VOID=35, NULL=36, SAY=37, AS=38, 
		SPEECH=39, WS=40, NL=41, COMMENT=42, LINE_COMMENT=43, Digits=44, LetterOrDigit=45, 
		Letters=46, LABEL=47, EOL=48, NORMALSTRING=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "SET", "TO", "EVENT", "STRING_TYPE", "INTEGER", "DECIMAL", "IF", 
		"WHILE", "SETTINGS", "ENDIF", "ENDWHILE", "VAR", "VAR_ASSIGN", "ELSE", 
		"FOR", "ENDFOR", "EXIT", "START_BOT", "COMMAND", "RETURN", "SWITCH", "CASE", 
		"THEN", "RETURNS", "VOID", "NULL", "SAY", "AS", "SPEECH", "WS", "NL", 
		"COMMENT", "LINE_COMMENT", "Digits", "LetterOrDigit", "Letters", "LABEL", 
		"EOL", "NORMALSTRING", "EscapeSequence"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "'+'", "'-'", "'**'", "'<'", "'>'", "'>='", "'<='", 
		"'=='", null, null, "'on'", "'string'", "'number'", "'decimal'", "'if'", 
		"'while'", "'settings'", "'endif'", "'endwhile'", null, null, "'else'", 
		"'for'", "'endfor'", "'exit'", "'start'", "'command'", "'out'", "'switch'", 
		"'case'", "'then'", "'returns'", "'nothing'", "'empty'", "'say'", "'as'", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "SET", 
		"TO", "EVENT", "STRING_TYPE", "INTEGER", "DECIMAL", "IF", "WHILE", "SETTINGS", 
		"ENDIF", "ENDWHILE", "VAR", "VAR_ASSIGN", "ELSE", "FOR", "ENDFOR", "EXIT", 
		"START_BOT", "COMMAND", "RETURN", "SWITCH", "CASE", "THEN", "RETURNS", 
		"VOID", "NULL", "SAY", "AS", "SPEECH", "WS", "NL", "COMMENT", "LINE_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u016e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\6)\u0120\n)\r)\16)\u0121\3)\3)\3*\5*\u0127"+
		"\n*\3*\3*\3+\3+\3+\3+\7+\u012f\n+\f+\16+\u0132\13+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\7,\u013d\n,\f,\16,\u0140\13,\3,\3,\3-\6-\u0145\n-\r-\16-\u0146"+
		"\3.\3.\5.\u014b\n.\3/\6/\u014e\n/\r/\16/\u014f\3\60\6\60\u0153\n\60\r"+
		"\60\16\60\u0154\3\61\6\61\u0158\n\61\r\61\16\61\u0159\3\62\3\62\3\62\7"+
		"\62\u015f\n\62\f\62\16\62\u0162\13\62\3\62\3\62\3\63\3\63\3\63\3\63\5"+
		"\63\u016a\n\63\3\63\5\63\u016d\n\63\3\u0130\2\64\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\2\3\2\t\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2$$^^\f\2$$))^^cdhhppttvvxx||\2\u0179"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2"+
		"\2\2\rr\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23y\3\2\2\2\25|\3\2\2\2\27\177"+
		"\3\2\2\2\31\u0083\3\2\2\2\33\u0086\3\2\2\2\35\u0089\3\2\2\2\37\u0090\3"+
		"\2\2\2!\u0097\3\2\2\2#\u009f\3\2\2\2%\u00a2\3\2\2\2\'\u00a8\3\2\2\2)\u00b1"+
		"\3\2\2\2+\u00b7\3\2\2\2-\u00c0\3\2\2\2/\u00c4\3\2\2\2\61\u00c7\3\2\2\2"+
		"\63\u00cc\3\2\2\2\65\u00d0\3\2\2\2\67\u00d7\3\2\2\29\u00dc\3\2\2\2;\u00e2"+
		"\3\2\2\2=\u00ea\3\2\2\2?\u00ee\3\2\2\2A\u00f5\3\2\2\2C\u00fa\3\2\2\2E"+
		"\u00ff\3\2\2\2G\u0107\3\2\2\2I\u010f\3\2\2\2K\u0115\3\2\2\2M\u0119\3\2"+
		"\2\2O\u011c\3\2\2\2Q\u011f\3\2\2\2S\u0126\3\2\2\2U\u012a\3\2\2\2W\u0138"+
		"\3\2\2\2Y\u0144\3\2\2\2[\u014a\3\2\2\2]\u014d\3\2\2\2_\u0152\3\2\2\2a"+
		"\u0157\3\2\2\2c\u015b\3\2\2\2e\u016c\3\2\2\2gh\7,\2\2h\4\3\2\2\2ij\7\61"+
		"\2\2j\6\3\2\2\2kl\7-\2\2l\b\3\2\2\2mn\7/\2\2n\n\3\2\2\2op\7,\2\2pq\7,"+
		"\2\2q\f\3\2\2\2rs\7>\2\2s\16\3\2\2\2tu\7@\2\2u\20\3\2\2\2vw\7@\2\2wx\7"+
		"?\2\2x\22\3\2\2\2yz\7>\2\2z{\7?\2\2{\24\3\2\2\2|}\7?\2\2}~\7?\2\2~\26"+
		"\3\2\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082"+
		"\30\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085\7q\2\2\u0085\32\3\2\2\2\u0086"+
		"\u0087\7q\2\2\u0087\u0088\7p\2\2\u0088\34\3\2\2\2\u0089\u008a\7u\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2"+
		"\u008e\u008f\7i\2\2\u008f\36\3\2\2\2\u0090\u0091\7p\2\2\u0091\u0092\7"+
		"w\2\2\u0092\u0093\7o\2\2\u0093\u0094\7d\2\2\u0094\u0095\7g\2\2\u0095\u0096"+
		"\7t\2\2\u0096 \3\2\2\2\u0097\u0098\7f\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7e\2\2\u009a\u009b\7k\2\2\u009b\u009c\7o\2\2\u009c\u009d\7c\2\2\u009d"+
		"\u009e\7n\2\2\u009e\"\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a1"+
		"$\3\2\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7k\2\2"+
		"\u00ad\u00ae\7p\2\2\u00ae\u00af\7i\2\2\u00af\u00b0\7u\2\2\u00b0(\3\2\2"+
		"\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5"+
		"\7k\2\2\u00b5\u00b6\7h\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7j\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf,\3\2\2\2\u00c0"+
		"\u00c1\7u\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7v\2\2\u00c3.\3\2\2\2\u00c4"+
		"\u00c5\7v\2\2\u00c5\u00c6\7q\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\u00c9\7n\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7g\2\2\u00cb\62\3\2\2\2\u00cc"+
		"\u00cd\7h\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7t\2\2\u00cf\64\3\2\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7h\2\2"+
		"\u00d4\u00d5\7q\2\2\u00d5\u00d6\7t\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7"+
		"g\2\2\u00d8\u00d9\7z\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7v\2\2\u00db8"+
		"\3\2\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7t\2\2\u00e0\u00e1\7v\2\2\u00e1:\3\2\2\2\u00e2\u00e3\7e\2\2\u00e3"+
		"\u00e4\7q\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7o\2\2\u00e6\u00e7\7c\2\2"+
		"\u00e7\u00e8\7p\2\2\u00e8\u00e9\7f\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7q\2"+
		"\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7v\2\2\u00ed>\3\2\2\2\u00ee\u00ef\7"+
		"u\2\2\u00ef\u00f0\7y\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3"+
		"\7e\2\2\u00f3\u00f4\7j\2\2\u00f4@\3\2\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7"+
		"\7c\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7g\2\2\u00f9B\3\2\2\2\u00fa\u00fb"+
		"\7v\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7p\2\2\u00fe"+
		"D\3\2\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7g\2\2\u0101\u0102\7v\2\2\u0102"+
		"\u0103\7w\2\2\u0103\u0104\7t\2\2\u0104\u0105\7p\2\2\u0105\u0106\7u\2\2"+
		"\u0106F\3\2\2\2\u0107\u0108\7p\2\2\u0108\u0109\7q\2\2\u0109\u010a\7v\2"+
		"\2\u010a\u010b\7j\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2\2\u010d\u010e"+
		"\7i\2\2\u010eH\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111\7o\2\2\u0111\u0112"+
		"\7r\2\2\u0112\u0113\7v\2\2\u0113\u0114\7{\2\2\u0114J\3\2\2\2\u0115\u0116"+
		"\7u\2\2\u0116\u0117\7c\2\2\u0117\u0118\7{\2\2\u0118L\3\2\2\2\u0119\u011a"+
		"\7c\2\2\u011a\u011b\7u\2\2\u011bN\3\2\2\2\u011c\u011d\7$\2\2\u011dP\3"+
		"\2\2\2\u011e\u0120\t\2\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b)"+
		"\2\2\u0124R\3\2\2\2\u0125\u0127\7\17\2\2\u0126\u0125\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\f\2\2\u0129T\3\2\2\2\u012a"+
		"\u012b\7\61\2\2\u012b\u012c\7,\2\2\u012c\u0130\3\2\2\2\u012d\u012f\13"+
		"\2\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7,"+
		"\2\2\u0134\u0135\7\61\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b+\3\2\u0137"+
		"V\3\2\2\2\u0138\u0139\7\61\2\2\u0139\u013a\7\61\2\2\u013a\u013e\3\2\2"+
		"\2\u013b\u013d\n\3\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0142\b,\3\2\u0142X\3\2\2\2\u0143\u0145\t\4\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147Z\3\2\2\2"+
		"\u0148\u014b\5]/\2\u0149\u014b\t\4\2\2\u014a\u0148\3\2\2\2\u014a\u0149"+
		"\3\2\2\2\u014b\\\3\2\2\2\u014c\u014e\t\5\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150^\3\2\2\2"+
		"\u0151\u0153\t\6\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155`\3\2\2\2\u0156\u0158\t\3\2\2\u0157"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015ab\3\2\2\2\u015b\u0160\7$\2\2\u015c\u015f\5e\63\2\u015d\u015f"+
		"\n\7\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0163\u0164\7$\2\2\u0164d\3\2\2\2\u0165\u0166\7^\2\2\u0166\u016d"+
		"\t\b\2\2\u0167\u0169\7^\2\2\u0168\u016a\7\17\2\2\u0169\u0168\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\7\f\2\2\u016c\u0165\3\2"+
		"\2\2\u016c\u0167\3\2\2\2\u016df\3\2\2\2\20\2\u0121\u0126\u0130\u013e\u0146"+
		"\u014a\u014f\u0154\u0159\u015e\u0160\u0169\u016c\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}