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
		WS=1, INT_DTYPE=2, FLOAT_DTYPE=3, CHAR_DTYPE=4, STRING_DTYPE=5, BOOLEAN_DTYPE=6, 
		IF_CONDITIONAL=7, ELSE_IF_CONDITIONAL=8, ELSE_CONDITIONAL=9, FOR_LOOP=10, 
		WHILE_LOOP=11, DO_LOOP=12, PRINT=13, PRINT_NL=14, SCAN=15, OPEN_PAR=16, 
		CLOSE_PAR=17, L_CBRACKET=18, R_CBRACKET=19, L_BRACKET=20, R_BRACKET=21, 
		ENUMERATION=22, COMMENT_BLOCK=23, LINE_END=24, ADDITION_OPE=25, SUBTRACTION_OPE=26, 
		MULTIPLICATION_OPE=27, DIVISION_OPE=28, ADDITION_ASSIGNMENT_OPE=29, SUBTRACTION_ASSIGNMENT_OPE=30, 
		MULTIPLICATION_ASSIGNMENT_OPE=31, DIVISION_ASSIGNMENT_OPE=32, MODULO_ASSIGNMENT_OPE=33, 
		MODULO_OPE=34, LESS_THAN_OPE=35, LESS_THAN_EQUAL_TO_OPE=36, GREATER_THAN_OPE=37, 
		GREATER_THAN_EQUAL_TO_OPE=38, EQUAL_OPE=39, NOT_EQUAL_OPE=40, INCREMENT_OPE=41, 
		DECREMENT_OPE=42, ASSIGNMENT_OPE=43, AND_OPE=44, OR_OPE=45, NOT_OPE=46, 
		ARRAY_SIZE_DELIMETER=47, CONSTANT_KEYWORD=48, FUNCTION_CALL=49, MAIN_FUNC=50, 
		RETURN=51, VOID=52, INTEGER_LITERAL=53, FLOAT_LITERAL=54, CHAR_LITERAL=55, 
		STRING_LITERAL=56, BOOLEAN_LITERAL=57, VARIABLE_IDENTIFIER=58, FUNCTION_IDENTIFIER=59, 
		ALPHABET_LITERAL=60, MIXED_LITERAL=61, HT_NL_CR=62, END_OF_FILE=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "INT_DTYPE", "FLOAT_DTYPE", "CHAR_DTYPE", "STRING_DTYPE", "BOOLEAN_DTYPE", 
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
			"VARIABLE_IDENTIFIER", "FUNCTION_IDENTIFIER", "ALPHABET_LITERAL", "MIXED_LITERAL", 
			"HT_NL_CR", "END_OF_FILE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'digeetz'", "'sabaw'", "'bidabida'", "'barkada'", "'weh'", 
			"'ha'", "'etonalang'", "'hatdog'", "'bestloopimo'", "'mehloopimo'", "'worstloopimo'", 
			"'allchat'", "'allchatln'", "'typehere'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "','", null, "';'", "'+'", "'-'", "'*'", "'/'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'%'", "'<'", "'<='", "'>'", "'>='", 
			"'=='", "'!='", "'++'", "'--'", "'='", "'AND'", "'OR'", "'NOT'", "'#'", 
			"'consistent'", "'shoutout'", "'startHere'", "'uwina'", "'walangibabalik'", 
			null, null, null, null, null, null, null, null, null, null, "'EOF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INT_DTYPE", "FLOAT_DTYPE", "CHAR_DTYPE", "STRING_DTYPE", 
			"BOOLEAN_DTYPE", "IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", 
			"FOR_LOOP", "WHILE_LOOP", "DO_LOOP", "PRINT", "PRINT_NL", "SCAN", "OPEN_PAR", 
			"CLOSE_PAR", "L_CBRACKET", "R_CBRACKET", "L_BRACKET", "R_BRACKET", "ENUMERATION", 
			"COMMENT_BLOCK", "LINE_END", "ADDITION_OPE", "SUBTRACTION_OPE", "MULTIPLICATION_OPE", 
			"DIVISION_OPE", "ADDITION_ASSIGNMENT_OPE", "SUBTRACTION_ASSIGNMENT_OPE", 
			"MULTIPLICATION_ASSIGNMENT_OPE", "DIVISION_ASSIGNMENT_OPE", "MODULO_ASSIGNMENT_OPE", 
			"MODULO_OPE", "LESS_THAN_OPE", "LESS_THAN_EQUAL_TO_OPE", "GREATER_THAN_OPE", 
			"GREATER_THAN_EQUAL_TO_OPE", "EQUAL_OPE", "NOT_EQUAL_OPE", "INCREMENT_OPE", 
			"DECREMENT_OPE", "ASSIGNMENT_OPE", "AND_OPE", "OR_OPE", "NOT_OPE", "ARRAY_SIZE_DELIMETER", 
			"CONSTANT_KEYWORD", "FUNCTION_CALL", "MAIN_FUNC", "RETURN", "VOID", "INTEGER_LITERAL", 
			"FLOAT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", 
			"VARIABLE_IDENTIFIER", "FUNCTION_IDENTIFIER", "ALPHABET_LITERAL", "MIXED_LITERAL", 
			"HT_NL_CR", "END_OF_FILE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u01de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\6\2\u0083\n\2\r\2\16\2\u0084\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0111\n\30\f\30\16\30\u0114\13\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\6\66\u018f\n\66\r\66\16\66\u0190\3\67\5"+
		"\67\u0194\n\67\3\67\3\67\6\67\u0198\n\67\r\67\16\67\u0199\3\67\5\67\u019d"+
		"\n\67\38\38\38\38\39\39\79\u01a5\n9\f9\169\u01a8\139\39\39\3:\3:\3:\3"+
		":\3:\3:\3:\5:\u01b3\n:\3;\5;\u01b6\n;\3;\6;\u01b9\n;\r;\16;\u01ba\3;\7"+
		";\u01be\n;\f;\16;\u01c1\13;\3<\5<\u01c4\n<\3<\3<\7<\u01c8\n<\f<\16<\u01cb"+
		"\13<\3=\5=\u01ce\n=\3>\3>\5>\u01d2\n>\3?\6?\u01d5\n?\r?\16?\u01d6\3?\3"+
		"?\3@\3@\3@\3@\4\u0112\u01a6\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\3\2\b\5\2\13\f\17\17\""+
		"\"\3\2\62;\3\2c|\4\2C\\c|\4\2\62;aa\4\2\13\f\17\17\2\u01ec\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\3\u0082\3\2\2\2\5\u0088\3\2\2\2\7\u0090\3\2\2\2"+
		"\t\u0096\3\2\2\2\13\u009f\3\2\2\2\r\u00a7\3\2\2\2\17\u00ab\3\2\2\2\21"+
		"\u00ae\3\2\2\2\23\u00b8\3\2\2\2\25\u00bf\3\2\2\2\27\u00cb\3\2\2\2\31\u00d6"+
		"\3\2\2\2\33\u00e3\3\2\2\2\35\u00eb\3\2\2\2\37\u00f5\3\2\2\2!\u00fe\3\2"+
		"\2\2#\u0100\3\2\2\2%\u0102\3\2\2\2\'\u0104\3\2\2\2)\u0106\3\2\2\2+\u0108"+
		"\3\2\2\2-\u010a\3\2\2\2/\u010c\3\2\2\2\61\u011a\3\2\2\2\63\u011c\3\2\2"+
		"\2\65\u011e\3\2\2\2\67\u0120\3\2\2\29\u0122\3\2\2\2;\u0124\3\2\2\2=\u0127"+
		"\3\2\2\2?\u012a\3\2\2\2A\u012d\3\2\2\2C\u0130\3\2\2\2E\u0133\3\2\2\2G"+
		"\u0135\3\2\2\2I\u0137\3\2\2\2K\u013a\3\2\2\2M\u013c\3\2\2\2O\u013f\3\2"+
		"\2\2Q\u0142\3\2\2\2S\u0145\3\2\2\2U\u0148\3\2\2\2W\u014b\3\2\2\2Y\u014d"+
		"\3\2\2\2[\u0151\3\2\2\2]\u0154\3\2\2\2_\u0158\3\2\2\2a\u015a\3\2\2\2c"+
		"\u0165\3\2\2\2e\u016e\3\2\2\2g\u0178\3\2\2\2i\u017e\3\2\2\2k\u018e\3\2"+
		"\2\2m\u0193\3\2\2\2o\u019e\3\2\2\2q\u01a2\3\2\2\2s\u01b2\3\2\2\2u\u01b5"+
		"\3\2\2\2w\u01c3\3\2\2\2y\u01cd\3\2\2\2{\u01d1\3\2\2\2}\u01d4\3\2\2\2\177"+
		"\u01da\3\2\2\2\u0081\u0083\t\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\b\2\2\2\u0087\4\3\2\2\2\u0088\u0089\7f\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7i\2\2\u008b\u008c\7g\2\2\u008c\u008d\7g\2\2\u008d\u008e\7v\2\2"+
		"\u008e\u008f\7|\2\2\u008f\6\3\2\2\2\u0090\u0091\7u\2\2\u0091\u0092\7c"+
		"\2\2\u0092\u0093\7d\2\2\u0093\u0094\7c\2\2\u0094\u0095\7y\2\2\u0095\b"+
		"\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098\7k\2\2\u0098\u0099\7f\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7d\2\2\u009b\u009c\7k\2\2\u009c\u009d\7f\2\2"+
		"\u009d\u009e\7c\2\2\u009e\n\3\2\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7c"+
		"\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7m\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5"+
		"\7f\2\2\u00a5\u00a6\7c\2\2\u00a6\f\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7j\2\2\u00aa\16\3\2\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad"+
		"\7c\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7n\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7i\2\2\u00b7\22\3\2\2\2\u00b8"+
		"\u00b9\7j\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7f\2\2"+
		"\u00bc\u00bd\7q\2\2\u00bd\u00be\7i\2\2\u00be\24\3\2\2\2\u00bf\u00c0\7"+
		"d\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4"+
		"\7n\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7r\2\2\u00c7"+
		"\u00c8\7k\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca\7q\2\2\u00ca\26\3\2\2\2\u00cb"+
		"\u00cc\7o\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7n\2\2"+
		"\u00cf\u00d0\7q\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5\7q\2\2\u00d5\30\3\2\2\2\u00d6\u00d7"+
		"\7y\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7u\2\2\u00da"+
		"\u00db\7v\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7q\2\2"+
		"\u00de\u00df\7r\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2"+
		"\7q\2\2\u00e2\32\3\2\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6"+
		"\7n\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7v\2\2\u00ea\34\3\2\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7n\2\2\u00ed"+
		"\u00ee\7n\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7j\2\2\u00f0\u00f1\7c\2\2"+
		"\u00f1\u00f2\7v\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7p\2\2\u00f4\36\3\2"+
		"\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7{\2\2\u00f7\u00f8\7r\2\2\u00f8\u00f9"+
		"\7g\2\2\u00f9\u00fa\7j\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7t\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd \3\2\2\2\u00fe\u00ff\7*\2\2\u00ff\"\3\2\2\2\u0100"+
		"\u0101\7+\2\2\u0101$\3\2\2\2\u0102\u0103\7}\2\2\u0103&\3\2\2\2\u0104\u0105"+
		"\7\177\2\2\u0105(\3\2\2\2\u0106\u0107\7]\2\2\u0107*\3\2\2\2\u0108\u0109"+
		"\7_\2\2\u0109,\3\2\2\2\u010a\u010b\7.\2\2\u010b.\3\2\2\2\u010c\u010d\7"+
		"\61\2\2\u010d\u010e\7,\2\2\u010e\u0112\3\2\2\2\u010f\u0111\13\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0113\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7,\2\2\u0116"+
		"\u0117\7\61\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b\30\2\2\u0119\60\3\2"+
		"\2\2\u011a\u011b\7=\2\2\u011b\62\3\2\2\2\u011c\u011d\7-\2\2\u011d\64\3"+
		"\2\2\2\u011e\u011f\7/\2\2\u011f\66\3\2\2\2\u0120\u0121\7,\2\2\u01218\3"+
		"\2\2\2\u0122\u0123\7\61\2\2\u0123:\3\2\2\2\u0124\u0125\7-\2\2\u0125\u0126"+
		"\7?\2\2\u0126<\3\2\2\2\u0127\u0128\7/\2\2\u0128\u0129\7?\2\2\u0129>\3"+
		"\2\2\2\u012a\u012b\7,\2\2\u012b\u012c\7?\2\2\u012c@\3\2\2\2\u012d\u012e"+
		"\7\61\2\2\u012e\u012f\7?\2\2\u012fB\3\2\2\2\u0130\u0131\7\'\2\2\u0131"+
		"\u0132\7?\2\2\u0132D\3\2\2\2\u0133\u0134\7\'\2\2\u0134F\3\2\2\2\u0135"+
		"\u0136\7>\2\2\u0136H\3\2\2\2\u0137\u0138\7>\2\2\u0138\u0139\7?\2\2\u0139"+
		"J\3\2\2\2\u013a\u013b\7@\2\2\u013bL\3\2\2\2\u013c\u013d\7@\2\2\u013d\u013e"+
		"\7?\2\2\u013eN\3\2\2\2\u013f\u0140\7?\2\2\u0140\u0141\7?\2\2\u0141P\3"+
		"\2\2\2\u0142\u0143\7#\2\2\u0143\u0144\7?\2\2\u0144R\3\2\2\2\u0145\u0146"+
		"\7-\2\2\u0146\u0147\7-\2\2\u0147T\3\2\2\2\u0148\u0149\7/\2\2\u0149\u014a"+
		"\7/\2\2\u014aV\3\2\2\2\u014b\u014c\7?\2\2\u014cX\3\2\2\2\u014d\u014e\7"+
		"C\2\2\u014e\u014f\7P\2\2\u014f\u0150\7F\2\2\u0150Z\3\2\2\2\u0151\u0152"+
		"\7Q\2\2\u0152\u0153\7T\2\2\u0153\\\3\2\2\2\u0154\u0155\7P\2\2\u0155\u0156"+
		"\7Q\2\2\u0156\u0157\7V\2\2\u0157^\3\2\2\2\u0158\u0159\7%\2\2\u0159`\3"+
		"\2\2\2\u015a\u015b\7e\2\2\u015b\u015c\7q\2\2\u015c\u015d\7p\2\2\u015d"+
		"\u015e\7u\2\2\u015e\u015f\7k\2\2\u015f\u0160\7u\2\2\u0160\u0161\7v\2\2"+
		"\u0161\u0162\7g\2\2\u0162\u0163\7p\2\2\u0163\u0164\7v\2\2\u0164b\3\2\2"+
		"\2\u0165\u0166\7u\2\2\u0166\u0167\7j\2\2\u0167\u0168\7q\2\2\u0168\u0169"+
		"\7w\2\2\u0169\u016a\7v\2\2\u016a\u016b\7q\2\2\u016b\u016c\7w\2\2\u016c"+
		"\u016d\7v\2\2\u016dd\3\2\2\2\u016e\u016f\7u\2\2\u016f\u0170\7v\2\2\u0170"+
		"\u0171\7c\2\2\u0171\u0172\7t\2\2\u0172\u0173\7v\2\2\u0173\u0174\7J\2\2"+
		"\u0174\u0175\7g\2\2\u0175\u0176\7t\2\2\u0176\u0177\7g\2\2\u0177f\3\2\2"+
		"\2\u0178\u0179\7w\2\2\u0179\u017a\7y\2\2\u017a\u017b\7k\2\2\u017b\u017c"+
		"\7p\2\2\u017c\u017d\7c\2\2\u017dh\3\2\2\2\u017e\u017f\7y\2\2\u017f\u0180"+
		"\7c\2\2\u0180\u0181\7n\2\2\u0181\u0182\7c\2\2\u0182\u0183\7p\2\2\u0183"+
		"\u0184\7i\2\2\u0184\u0185\7k\2\2\u0185\u0186\7d\2\2\u0186\u0187\7c\2\2"+
		"\u0187\u0188\7d\2\2\u0188\u0189\7c\2\2\u0189\u018a\7n\2\2\u018a\u018b"+
		"\7k\2\2\u018b\u018c\7m\2\2\u018cj\3\2\2\2\u018d\u018f\t\3\2\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"l\3\2\2\2\u0192\u0194\5k\66\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2"+
		"\u0194\u0195\3\2\2\2\u0195\u0197\7\60\2\2\u0196\u0198\t\3\2\2\u0197\u0196"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u019d\7h\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019dn\3\2\2\2\u019e\u019f\7)\2\2\u019f\u01a0\13\2\2\2\u01a0\u01a1"+
		"\7)\2\2\u01a1p\3\2\2\2\u01a2\u01a6\7$\2\2\u01a3\u01a5\13\2\2\2\u01a4\u01a3"+
		"\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7$\2\2\u01aar\3\2\2\2\u01ab"+
		"\u01ac\7{\2\2\u01ac\u01ad\7g\2\2\u01ad\u01b3\7r\2\2\u01ae\u01af\7p\2\2"+
		"\u01af\u01b0\7q\2\2\u01b0\u01b1\7r\2\2\u01b1\u01b3\7g\2\2\u01b2\u01ab"+
		"\3\2\2\2\u01b2\u01ae\3\2\2\2\u01b3t\3\2\2\2\u01b4\u01b6\7a\2\2\u01b5\u01b4"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b9\t\4\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bf\3\2\2\2\u01bc\u01be\t\3\2\2\u01bd\u01bc\3\2\2\2\u01be"+
		"\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0v\3\2\2\2"+
		"\u01c1\u01bf\3\2\2\2\u01c2\u01c4\7a\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c9\5y=\2\u01c6\u01c8\5{>\2\u01c7"+
		"\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01cax\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01ce\t\5\2\2\u01cd\u01cc"+
		"\3\2\2\2\u01cez\3\2\2\2\u01cf\u01d2\5y=\2\u01d0\u01d2\t\6\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2|\3\2\2\2\u01d3\u01d5\t\7\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\b?\2\2\u01d9~\3\2\2\2\u01da\u01db"+
		"\7G\2\2\u01db\u01dc\7Q\2\2\u01dc\u01dd\7H\2\2\u01dd\u0080\3\2\2\2\23\2"+
		"\u0084\u0112\u0190\u0193\u0199\u019c\u01a6\u01b2\u01b5\u01ba\u01bf\u01c3"+
		"\u01c9\u01cd\u01d1\u01d6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}