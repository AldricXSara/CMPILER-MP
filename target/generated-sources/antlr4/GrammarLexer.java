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
		DECREMENT_OPE=41, ASSIGNMENT_OPE=42, AND_OPE=43, OR_OPE=44, NOT_OPE=45, 
		ARRAY_SIZE_DELIMETER=46, CONSTANT_KEYWORD=47, FUNCTION_CALL=48, MAIN_FUNC=49, 
		RETURN=50, VOID=51, INTEGER_LITERAL=52, FLOAT_LITERAL=53, CHAR_LITERAL=54, 
		STRING_LITERAL=55, BOOLEAN_LITERAL=56, VARIABLE_IDENTIFIER=57, FUNCTION_IDENTIFIER=58, 
		HT_NL_CR=59;
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
			"DECREMENT_OPE", "ASSIGNMENT_OPE", "AND_OPE", "OR_OPE", "NOT_OPE", "ARRAY_SIZE_DELIMETER", 
			"CONSTANT_KEYWORD", "FUNCTION_CALL", "MAIN_FUNC", "RETURN", "VOID", "INTEGER_LITERAL", 
			"FLOAT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", 
			"VARIABLE_IDENTIFIER", "FUNCTION_IDENTIFIER", "HT_NL_CR"
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
			"'=='", "'!='", "'++'", "'--'", "'='", "'AND'", "'OR'", "'NOT'", "'#'", 
			"'consistent'", "'shoutout'", "'startHere'", "'uwina'", "'walangibabalik'"
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
			"DECREMENT_OPE", "ASSIGNMENT_OPE", "AND_OPE", "OR_OPE", "NOT_OPE", "ARRAY_SIZE_DELIMETER", 
			"CONSTANT_KEYWORD", "FUNCTION_CALL", "MAIN_FUNC", "RETURN", "VOID", "INTEGER_LITERAL", 
			"FLOAT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", 
			"VARIABLE_IDENTIFIER", "FUNCTION_IDENTIFIER", "HT_NL_CR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01b9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)"+
		"\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\6\65\u0177\n\65\r\65\16\65\u0178"+
		"\3\66\5\66\u017c\n\66\3\66\3\66\6\66\u0180\n\66\r\66\16\66\u0181\3\66"+
		"\5\66\u0185\n\66\3\67\3\67\3\67\3\67\38\38\78\u018d\n8\f8\168\u0190\13"+
		"8\38\38\39\39\39\39\39\39\39\59\u019b\n9\3:\6:\u019e\n:\r:\16:\u019f\3"+
		":\7:\u01a3\n:\f:\16:\u01a6\13:\3;\6;\u01a9\n;\r;\16;\u01aa\3;\7;\u01ae"+
		"\n;\f;\16;\u01b1\13;\3<\6<\u01b4\n<\r<\16<\u01b5\3<\3<\3\u018e\2=\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=\3\2\6\3\2\62;\3\2c|\3\2C\\\4\2\13\f\17\17\2\u01c3\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5\u0081\3\2\2\2"+
		"\7\u0087\3\2\2\2\t\u0090\3\2\2\2\13\u0098\3\2\2\2\r\u009c\3\2\2\2\17\u009f"+
		"\3\2\2\2\21\u00a9\3\2\2\2\23\u00b0\3\2\2\2\25\u00bc\3\2\2\2\27\u00c7\3"+
		"\2\2\2\31\u00d4\3\2\2\2\33\u00dc\3\2\2\2\35\u00e6\3\2\2\2\37\u00ef\3\2"+
		"\2\2!\u00f1\3\2\2\2#\u00f3\3\2\2\2%\u00f5\3\2\2\2\'\u00f7\3\2\2\2)\u00f9"+
		"\3\2\2\2+\u00fb\3\2\2\2-\u00fd\3\2\2\2/\u0102\3\2\2\2\61\u0104\3\2\2\2"+
		"\63\u0106\3\2\2\2\65\u0108\3\2\2\2\67\u010a\3\2\2\29\u010c\3\2\2\2;\u010f"+
		"\3\2\2\2=\u0112\3\2\2\2?\u0115\3\2\2\2A\u0118\3\2\2\2C\u011b\3\2\2\2E"+
		"\u011d\3\2\2\2G\u011f\3\2\2\2I\u0122\3\2\2\2K\u0124\3\2\2\2M\u0127\3\2"+
		"\2\2O\u012a\3\2\2\2Q\u012d\3\2\2\2S\u0130\3\2\2\2U\u0133\3\2\2\2W\u0135"+
		"\3\2\2\2Y\u0139\3\2\2\2[\u013c\3\2\2\2]\u0140\3\2\2\2_\u0142\3\2\2\2a"+
		"\u014d\3\2\2\2c\u0156\3\2\2\2e\u0160\3\2\2\2g\u0166\3\2\2\2i\u0176\3\2"+
		"\2\2k\u017b\3\2\2\2m\u0186\3\2\2\2o\u018a\3\2\2\2q\u019a\3\2\2\2s\u019d"+
		"\3\2\2\2u\u01a8\3\2\2\2w\u01b3\3\2\2\2yz\7f\2\2z{\7k\2\2{|\7i\2\2|}\7"+
		"g\2\2}~\7g\2\2~\177\7v\2\2\177\u0080\7|\2\2\u0080\4\3\2\2\2\u0081\u0082"+
		"\7u\2\2\u0082\u0083\7c\2\2\u0083\u0084\7d\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7y\2\2\u0086\6\3\2\2\2\u0087\u0088\7d\2\2\u0088\u0089\7k\2\2\u0089"+
		"\u008a\7f\2\2\u008a\u008b\7c\2\2\u008b\u008c\7d\2\2\u008c\u008d\7k\2\2"+
		"\u008d\u008e\7f\2\2\u008e\u008f\7c\2\2\u008f\b\3\2\2\2\u0090\u0091\7d"+
		"\2\2\u0091\u0092\7c\2\2\u0092\u0093\7t\2\2\u0093\u0094\7m\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7f\2\2\u0096\u0097\7c\2\2\u0097\n\3\2\2\2\u0098\u0099"+
		"\7y\2\2\u0099\u009a\7g\2\2\u009a\u009b\7j\2\2\u009b\f\3\2\2\2\u009c\u009d"+
		"\7j\2\2\u009d\u009e\7c\2\2\u009e\16\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7v\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7i\2\2"+
		"\u00a8\20\3\2\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7"+
		"v\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7i\2\2\u00af\22"+
		"\3\2\2\2\u00b0\u00b1\7d\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u00b4\7v\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7q\2\2"+
		"\u00b7\u00b8\7r\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7o\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\24\3\2\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7g\2\2\u00be\u00bf"+
		"\7j\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7r\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\7q\2\2"+
		"\u00c6\26\3\2\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7"+
		"t\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7k\2\2\u00d1"+
		"\u00d2\7o\2\2\u00d2\u00d3\7q\2\2\u00d3\30\3\2\2\2\u00d4\u00d5\7c\2\2\u00d5"+
		"\u00d6\7n\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7j\2\2"+
		"\u00d9\u00da\7c\2\2\u00da\u00db\7v\2\2\u00db\32\3\2\2\2\u00dc\u00dd\7"+
		"c\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1"+
		"\7j\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7n\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\34\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7{\2\2\u00e8"+
		"\u00e9\7r\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7j\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ec\u00ed\7t\2\2\u00ed\u00ee\7g\2\2\u00ee\36\3\2\2\2\u00ef\u00f0\7"+
		"*\2\2\u00f0 \3\2\2\2\u00f1\u00f2\7+\2\2\u00f2\"\3\2\2\2\u00f3\u00f4\7"+
		"}\2\2\u00f4$\3\2\2\2\u00f5\u00f6\7\177\2\2\u00f6&\3\2\2\2\u00f7\u00f8"+
		"\7]\2\2\u00f8(\3\2\2\2\u00f9\u00fa\7_\2\2\u00fa*\3\2\2\2\u00fb\u00fc\7"+
		".\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7\61\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\b\27\2\2\u0101.\3\2\2\2\u0102\u0103\7=\2\2\u0103"+
		"\60\3\2\2\2\u0104\u0105\7-\2\2\u0105\62\3\2\2\2\u0106\u0107\7/\2\2\u0107"+
		"\64\3\2\2\2\u0108\u0109\7,\2\2\u0109\66\3\2\2\2\u010a\u010b\7\61\2\2\u010b"+
		"8\3\2\2\2\u010c\u010d\7-\2\2\u010d\u010e\7?\2\2\u010e:\3\2\2\2\u010f\u0110"+
		"\7/\2\2\u0110\u0111\7?\2\2\u0111<\3\2\2\2\u0112\u0113\7,\2\2\u0113\u0114"+
		"\7?\2\2\u0114>\3\2\2\2\u0115\u0116\7\61\2\2\u0116\u0117\7?\2\2\u0117@"+
		"\3\2\2\2\u0118\u0119\7\'\2\2\u0119\u011a\7?\2\2\u011aB\3\2\2\2\u011b\u011c"+
		"\7\'\2\2\u011cD\3\2\2\2\u011d\u011e\7>\2\2\u011eF\3\2\2\2\u011f\u0120"+
		"\7>\2\2\u0120\u0121\7?\2\2\u0121H\3\2\2\2\u0122\u0123\7@\2\2\u0123J\3"+
		"\2\2\2\u0124\u0125\7@\2\2\u0125\u0126\7?\2\2\u0126L\3\2\2\2\u0127\u0128"+
		"\7?\2\2\u0128\u0129\7?\2\2\u0129N\3\2\2\2\u012a\u012b\7#\2\2\u012b\u012c"+
		"\7?\2\2\u012cP\3\2\2\2\u012d\u012e\7-\2\2\u012e\u012f\7-\2\2\u012fR\3"+
		"\2\2\2\u0130\u0131\7/\2\2\u0131\u0132\7/\2\2\u0132T\3\2\2\2\u0133\u0134"+
		"\7?\2\2\u0134V\3\2\2\2\u0135\u0136\7C\2\2\u0136\u0137\7P\2\2\u0137\u0138"+
		"\7F\2\2\u0138X\3\2\2\2\u0139\u013a\7Q\2\2\u013a\u013b\7T\2\2\u013bZ\3"+
		"\2\2\2\u013c\u013d\7P\2\2\u013d\u013e\7Q\2\2\u013e\u013f\7V\2\2\u013f"+
		"\\\3\2\2\2\u0140\u0141\7%\2\2\u0141^\3\2\2\2\u0142\u0143\7e\2\2\u0143"+
		"\u0144\7q\2\2\u0144\u0145\7p\2\2\u0145\u0146\7u\2\2\u0146\u0147\7k\2\2"+
		"\u0147\u0148\7u\2\2\u0148\u0149\7v\2\2\u0149\u014a\7g\2\2\u014a\u014b"+
		"\7p\2\2\u014b\u014c\7v\2\2\u014c`\3\2\2\2\u014d\u014e\7u\2\2\u014e\u014f"+
		"\7j\2\2\u014f\u0150\7q\2\2\u0150\u0151\7w\2\2\u0151\u0152\7v\2\2\u0152"+
		"\u0153\7q\2\2\u0153\u0154\7w\2\2\u0154\u0155\7v\2\2\u0155b\3\2\2\2\u0156"+
		"\u0157\7u\2\2\u0157\u0158\7v\2\2\u0158\u0159\7c\2\2\u0159\u015a\7t\2\2"+
		"\u015a\u015b\7v\2\2\u015b\u015c\7J\2\2\u015c\u015d\7g\2\2\u015d\u015e"+
		"\7t\2\2\u015e\u015f\7g\2\2\u015fd\3\2\2\2\u0160\u0161\7w\2\2\u0161\u0162"+
		"\7y\2\2\u0162\u0163\7k\2\2\u0163\u0164\7p\2\2\u0164\u0165\7c\2\2\u0165"+
		"f\3\2\2\2\u0166\u0167\7y\2\2\u0167\u0168\7c\2\2\u0168\u0169\7n\2\2\u0169"+
		"\u016a\7c\2\2\u016a\u016b\7p\2\2\u016b\u016c\7i\2\2\u016c\u016d\7k\2\2"+
		"\u016d\u016e\7d\2\2\u016e\u016f\7c\2\2\u016f\u0170\7d\2\2\u0170\u0171"+
		"\7c\2\2\u0171\u0172\7n\2\2\u0172\u0173\7k\2\2\u0173\u0174\7m\2\2\u0174"+
		"h\3\2\2\2\u0175\u0177\t\2\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2"+
		"\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179j\3\2\2\2\u017a\u017c\5"+
		"i\65\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\7\60\2\2\u017e\u0180\t\2\2\2\u017f\u017e\3\2\2\2\u0180\u0181\3"+
		"\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0185\7h\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185l\3\2\2\2\u0186"+
		"\u0187\7)\2\2\u0187\u0188\13\2\2\2\u0188\u0189\7)\2\2\u0189n\3\2\2\2\u018a"+
		"\u018e\7$\2\2\u018b\u018d\13\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0192\7$\2\2\u0192p\3\2\2\2\u0193\u0194\7{\2\2\u0194"+
		"\u0195\7g\2\2\u0195\u019b\7r\2\2\u0196\u0197\7p\2\2\u0197\u0198\7q\2\2"+
		"\u0198\u0199\7r\2\2\u0199\u019b\7g\2\2\u019a\u0193\3\2\2\2\u019a\u0196"+
		"\3\2\2\2\u019br\3\2\2\2\u019c\u019e\t\3\2\2\u019d\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a4\3\2"+
		"\2\2\u01a1\u01a3\t\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5t\3\2\2\2\u01a6\u01a4\3\2\2\2"+
		"\u01a7\u01a9\t\4\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01af\3\2\2\2\u01ac\u01ae\t\2\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0v\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\t\5\2\2\u01b3\u01b2"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b8\b<\2\2\u01b8x\3\2\2\2\16\2\u0178\u017b\u0181"+
		"\u0184\u018e\u019a\u019f\u01a4\u01aa\u01af\u01b5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}