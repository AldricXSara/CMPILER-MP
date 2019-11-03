// Generated from Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_DTYPE=1, FLOAT_DTYPE=2, CHAR_DTYPE=3, STRING_DTYPE=4, BOOLEAN_DTYPE=5, 
		IF_CONDITIONAL=6, ELSE_IF_CONDITIONAL=7, ELSE_CONDITIONAL=8, FOR_LOOP=9, 
		WHILE_LOOP=10, DO_LOOP=11, PRINT=12, PRINT_NL=13, SCAN=14, OPEN_PAR=15, 
		CLOSE_PAR=16, L_CBRACKET=17, R_CBRACKET=18, L_BRACKET=19, R_BRACKET=20, 
		ENUMERATION=21, COMMENT_BLOCK=22, LINE_END=23, ADDITION_OPE=24, SUBTRACTION_OPE=25, 
		MULTIPLICATION_OPE=26, DIVISION_OPE=27, ADDITION_ASSIGNMENT_OPE=28, SUBTRACTION_ASSIGNMENT_OPE=29, 
		MULTIPLICATION_ASSIGNMENT_OPE=30, DIVISION_ASSIGNMENT_OPE=31, MODULO_ASSIGNMENT_OPE=32, 
		MODULO_OPE=33, LESS_THAN_OPE=34, LESS_THAN_EQUAL_TO_OPE=35, GREATER_THAN_OPE=36, 
		GREATER_THAN_EQUAL_TO_OPE=37, EQUAL_OPE=38, NOT_EQUAL_OPE=39, INCREMENT_OPE=40, 
		DECREMENT_OPE=41, ASSINGMENT_OPE=42, AND_OPE=43, OR_OPE=44, NOT_OPE=45, 
		HT_NL_CR=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_DTYPE", "FLOAT_DTYPE", "CHAR_DTYPE", "STRING_DTYPE", "BOOLEAN_DTYPE", 
			"IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", "FOR_LOOP", 
			"WHILE_LOOP", "DO_LOOP", "PRINT", "PRINT_NL", "SCAN", "OPEN_PAR", "CLOSE_PAR", 
			"L_CBRACKET", "R_CBRACKET", "L_BRACKET", "R_BRACKET", "ENUMERATION", 
			"COMMENT_BLOCK", "LINE_END", "ADDITION_OPE", "SUBTRACTION_OPE", "MULTIPLICATION_OPE", 
			"DIVISION_OPE", "ADDITION_ASSIGNMENT_OPE", "SUBTRACTION_ASSIGNMENT_OPE", 
			"MULTIPLICATION_ASSIGNMENT_OPE", "DIVISION_ASSIGNMENT_OPE", "MODULO_ASSIGNMENT_OPE", 
			"MODULO_OPE", "LESS_THAN_OPE", "LESS_THAN_EQUAL_TO_OPE", "GREATER_THAN_OPE", 
			"GREATER_THAN_EQUAL_TO_OPE", "EQUAL_OPE", "NOT_EQUAL_OPE", "INCREMENT_OPE", 
			"DECREMENT_OPE", "ASSINGMENT_OPE", "AND_OPE", "OR_OPE", "NOT_OPE", "HT_NL_CR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'digeetz'", "'sabaw'", "'bidabida'", "'barkada'", "'weh'", "'ha'", 
			"'etonalang'", "'hatdog'", "'bestloopimo'", "'mehloopimo'", "'worstloopimo'", 
			"'allchat'", "'allchatln'", "'typehere'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "','", "'//'", "';'", "'+'", "'-'", "'*'", "'/'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'%'", "'<'", "'<='", "'>'", "'>='", 
			"'=='", "'!='", "'++'", "'--'", "'='", "'AND'", "'OR'", "'NOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_DTYPE", "FLOAT_DTYPE", "CHAR_DTYPE", "STRING_DTYPE", "BOOLEAN_DTYPE", 
			"IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", "FOR_LOOP", 
			"WHILE_LOOP", "DO_LOOP", "PRINT", "PRINT_NL", "SCAN", "OPEN_PAR", "CLOSE_PAR", 
			"L_CBRACKET", "R_CBRACKET", "L_BRACKET", "R_BRACKET", "ENUMERATION", 
			"COMMENT_BLOCK", "LINE_END", "ADDITION_OPE", "SUBTRACTION_OPE", "MULTIPLICATION_OPE", 
			"DIVISION_OPE", "ADDITION_ASSIGNMENT_OPE", "SUBTRACTION_ASSIGNMENT_OPE", 
			"MULTIPLICATION_ASSIGNMENT_OPE", "DIVISION_ASSIGNMENT_OPE", "MODULO_ASSIGNMENT_OPE", 
			"MODULO_OPE", "LESS_THAN_OPE", "LESS_THAN_EQUAL_TO_OPE", "GREATER_THAN_OPE", 
			"GREATER_THAN_EQUAL_TO_OPE", "EQUAL_OPE", "NOT_EQUAL_OPE", "INCREMENT_OPE", 
			"DECREMENT_OPE", "ASSINGMENT_OPE", "AND_OPE", "OR_OPE", "NOT_OPE", "HT_NL_CR"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u012d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3.\3.\3/\6/\u0128\n/\r/\16/\u0129\3/\3/\2\2\60\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\3\4\2\13\f\17\17\2\u012d\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5g\3\2\2\2\7m\3\2\2"+
		"\2\tv\3\2\2\2\13~\3\2\2\2\r\u0082\3\2\2\2\17\u0085\3\2\2\2\21\u008f\3"+
		"\2\2\2\23\u0096\3\2\2\2\25\u00a2\3\2\2\2\27\u00ad\3\2\2\2\31\u00ba\3\2"+
		"\2\2\33\u00c2\3\2\2\2\35\u00cc\3\2\2\2\37\u00d5\3\2\2\2!\u00d7\3\2\2\2"+
		"#\u00d9\3\2\2\2%\u00db\3\2\2\2\'\u00dd\3\2\2\2)\u00df\3\2\2\2+\u00e1\3"+
		"\2\2\2-\u00e3\3\2\2\2/\u00e8\3\2\2\2\61\u00ea\3\2\2\2\63\u00ec\3\2\2\2"+
		"\65\u00ee\3\2\2\2\67\u00f0\3\2\2\29\u00f2\3\2\2\2;\u00f5\3\2\2\2=\u00f8"+
		"\3\2\2\2?\u00fb\3\2\2\2A\u00fe\3\2\2\2C\u0101\3\2\2\2E\u0103\3\2\2\2G"+
		"\u0105\3\2\2\2I\u0108\3\2\2\2K\u010a\3\2\2\2M\u010d\3\2\2\2O\u0110\3\2"+
		"\2\2Q\u0113\3\2\2\2S\u0116\3\2\2\2U\u0119\3\2\2\2W\u011b\3\2\2\2Y\u011f"+
		"\3\2\2\2[\u0122\3\2\2\2]\u0127\3\2\2\2_`\7f\2\2`a\7k\2\2ab\7i\2\2bc\7"+
		"g\2\2cd\7g\2\2de\7v\2\2ef\7|\2\2f\4\3\2\2\2gh\7u\2\2hi\7c\2\2ij\7d\2\2"+
		"jk\7c\2\2kl\7y\2\2l\6\3\2\2\2mn\7d\2\2no\7k\2\2op\7f\2\2pq\7c\2\2qr\7"+
		"d\2\2rs\7k\2\2st\7f\2\2tu\7c\2\2u\b\3\2\2\2vw\7d\2\2wx\7c\2\2xy\7t\2\2"+
		"yz\7m\2\2z{\7c\2\2{|\7f\2\2|}\7c\2\2}\n\3\2\2\2~\177\7y\2\2\177\u0080"+
		"\7g\2\2\u0080\u0081\7j\2\2\u0081\f\3\2\2\2\u0082\u0083\7j\2\2\u0083\u0084"+
		"\7c\2\2\u0084\16\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087\7v\2\2\u0087\u0088"+
		"\7q\2\2\u0088\u0089\7p\2\2\u0089\u008a\7c\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7p\2\2\u008d\u008e\7i\2\2\u008e\20\3\2\2\2\u008f"+
		"\u0090\7j\2\2\u0090\u0091\7c\2\2\u0091\u0092\7v\2\2\u0092\u0093\7f\2\2"+
		"\u0093\u0094\7q\2\2\u0094\u0095\7i\2\2\u0095\22\3\2\2\2\u0096\u0097\7"+
		"d\2\2\u0097\u0098\7g\2\2\u0098\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b"+
		"\7n\2\2\u009b\u009c\7q\2\2\u009c\u009d\7q\2\2\u009d\u009e\7r\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7q\2\2\u00a1\24\3\2\2\2\u00a2"+
		"\u00a3\7o\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7n\2\2"+
		"\u00a6\u00a7\7q\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa"+
		"\7k\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7q\2\2\u00ac\26\3\2\2\2\u00ad\u00ae"+
		"\7y\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7u\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7q\2\2"+
		"\u00b5\u00b6\7r\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9"+
		"\7q\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd"+
		"\7n\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\32\3\2\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7n\2\2\u00c4"+
		"\u00c5\7n\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7j\2\2\u00c7\u00c8\7c\2\2"+
		"\u00c8\u00c9\7v\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7p\2\2\u00cb\34\3\2"+
		"\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7{\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\36\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6 \3\2\2\2\u00d7"+
		"\u00d8\7+\2\2\u00d8\"\3\2\2\2\u00d9\u00da\7}\2\2\u00da$\3\2\2\2\u00db"+
		"\u00dc\7\177\2\2\u00dc&\3\2\2\2\u00dd\u00de\7]\2\2\u00de(\3\2\2\2\u00df"+
		"\u00e0\7_\2\2\u00e0*\3\2\2\2\u00e1\u00e2\7.\2\2\u00e2,\3\2\2\2\u00e3\u00e4"+
		"\7\61\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\27\2"+
		"\2\u00e7.\3\2\2\2\u00e8\u00e9\7=\2\2\u00e9\60\3\2\2\2\u00ea\u00eb\7-\2"+
		"\2\u00eb\62\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed\64\3\2\2\2\u00ee\u00ef\7"+
		",\2\2\u00ef\66\3\2\2\2\u00f0\u00f1\7\61\2\2\u00f18\3\2\2\2\u00f2\u00f3"+
		"\7-\2\2\u00f3\u00f4\7?\2\2\u00f4:\3\2\2\2\u00f5\u00f6\7/\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7<\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fa\7?\2\2\u00fa>\3"+
		"\2\2\2\u00fb\u00fc\7\61\2\2\u00fc\u00fd\7?\2\2\u00fd@\3\2\2\2\u00fe\u00ff"+
		"\7\'\2\2\u00ff\u0100\7?\2\2\u0100B\3\2\2\2\u0101\u0102\7\'\2\2\u0102D"+
		"\3\2\2\2\u0103\u0104\7>\2\2\u0104F\3\2\2\2\u0105\u0106\7>\2\2\u0106\u0107"+
		"\7?\2\2\u0107H\3\2\2\2\u0108\u0109\7@\2\2\u0109J\3\2\2\2\u010a\u010b\7"+
		"@\2\2\u010b\u010c\7?\2\2\u010cL\3\2\2\2\u010d\u010e\7?\2\2\u010e\u010f"+
		"\7?\2\2\u010fN\3\2\2\2\u0110\u0111\7#\2\2\u0111\u0112\7?\2\2\u0112P\3"+
		"\2\2\2\u0113\u0114\7-\2\2\u0114\u0115\7-\2\2\u0115R\3\2\2\2\u0116\u0117"+
		"\7/\2\2\u0117\u0118\7/\2\2\u0118T\3\2\2\2\u0119\u011a\7?\2\2\u011aV\3"+
		"\2\2\2\u011b\u011c\7C\2\2\u011c\u011d\7P\2\2\u011d\u011e\7F\2\2\u011e"+
		"X\3\2\2\2\u011f\u0120\7Q\2\2\u0120\u0121\7T\2\2\u0121Z\3\2\2\2\u0122\u0123"+
		"\7P\2\2\u0123\u0124\7Q\2\2\u0124\u0125\7V\2\2\u0125\\\3\2\2\2\u0126\u0128"+
		"\t\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b/\2\2\u012c^\3\2\2\2\4"+
		"\2\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}