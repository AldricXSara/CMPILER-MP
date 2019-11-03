// Generated from Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
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
	public static final int
		RULE_data_type = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"data_type"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT_DTYPE() { return getToken(GrammarParser.INT_DTYPE, 0); }
		public TerminalNode FLOAT_DTYPE() { return getToken(GrammarParser.FLOAT_DTYPE, 0); }
		public TerminalNode CHAR_DTYPE() { return getToken(GrammarParser.CHAR_DTYPE, 0); }
		public TerminalNode STRING_DTYPE() { return getToken(GrammarParser.STRING_DTYPE, 0); }
		public TerminalNode BOOLEAN_DTYPE() { return getToken(GrammarParser.BOOLEAN_DTYPE, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\7\4\2\t\2\3\2"+
		"\3\2\3\2\2\2\3\2\2\3\3\2\3\7\2\5\2\4\3\2\2\2\4\5\t\2\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}