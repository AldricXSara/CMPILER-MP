// Generated from Grammar.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

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
	public static final String[] tokenNames = {
		"<INVALID>", "'digeetz'", "'sabaw'", "'bidabida'", "'barkada'", "'weh'", 
		"'ha'", "'etonalang'", "'hatdog'", "'bestloopimo'", "'mehloopimo'", "'worstloopimo'", 
		"'allchat'", "'allchatln'", "'typehere'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "','", "'//'", "';'", "'+'", "'-'", "'*'", "'/'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'%'", "'<'", "'<='", "'>'", "'>='", "'=='", 
		"'!='", "'++'", "'--'", "'='", "'AND'", "'OR'", "'NOT'", "'#'", "'consistent'", 
		"'shoutout'", "'startHere'", "'uwina'", "'walangibabalik'", "INTEGER_LITERAL", 
		"FLOAT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", 
		"VARIABLE_IDENTIFIER", "FUNCTION_IDENTIFIER", "HT_NL_CR"
	};
	public static final int
		RULE_program = 0, RULE_function_declarations = 1, RULE_statement = 2, 
		RULE_vardecl_list = 3, RULE_var_decl = 4, RULE_var_identifier_list = 5, 
		RULE_array_size = 6, RULE_data_type = 7, RULE_function_declaration = 8, 
		RULE_parameters = 9, RULE_function_block = 10, RULE_main_function = 11, 
		RULE_expression = 12, RULE_expression_factor = 13, RULE_bool_expression = 14, 
		RULE_num_ope = 15, RULE_unary_ope = 16, RULE_num_factor = 17, RULE_relational_ope = 18, 
		RULE_logical_ope = 19, RULE_const_statement = 20, RULE_var_assignment_statement = 21, 
		RULE_assignment_statement = 22, RULE_assignment_num_ope = 23, RULE_assignment_factor = 24, 
		RULE_funccall_statement = 25, RULE_actual_params = 26, RULE_conditional_factor = 27, 
		RULE_if_statement = 28, RULE_conditional_block = 29, RULE_code_block = 30, 
		RULE_while_statement = 31, RULE_do_while_statement = 32, RULE_for_statement = 33, 
		RULE_for_assignment_statement = 34, RULE_return_statement = 35, RULE_scan_statement = 36, 
		RULE_print_statement = 37, RULE_print_factor = 38, RULE_print_factor_boolean = 39;
	public static final String[] ruleNames = {
		"program", "function_declarations", "statement", "vardecl_list", "var_decl", 
		"var_identifier_list", "array_size", "data_type", "function_declaration", 
		"parameters", "function_block", "main_function", "expression", "expression_factor", 
		"bool_expression", "num_ope", "unary_ope", "num_factor", "relational_ope", 
		"logical_ope", "const_statement", "var_assignment_statement", "assignment_statement", 
		"assignment_num_ope", "assignment_factor", "funccall_statement", "actual_params", 
		"conditional_factor", "if_statement", "conditional_block", "code_block", 
		"while_statement", "do_while_statement", "for_statement", "for_assignment_statement", 
		"return_statement", "scan_statement", "print_statement", "print_factor", 
		"print_factor_boolean"
	};

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public Function_declarationsContext function_declarations() {
			return getRuleContext(Function_declarationsContext.class,0);
		}
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); function_declarations();
			setState(81); main_function();
			setState(82); match(EOF);
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

	public static class Function_declarationsContext extends ParserRuleContext {
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public Function_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction_declarations(this);
		}
	}

	public final Function_declarationsContext function_declarations() throws RecognitionException {
		Function_declarationsContext _localctx = new Function_declarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84); function_declaration();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public Const_statementContext const_statement() {
			return getRuleContext(Const_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode COMMENT_BLOCK() { return getToken(GrammarParser.COMMENT_BLOCK, 0); }
		public TerminalNode LINE_END() { return getToken(GrammarParser.LINE_END, 0); }
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Scan_statementContext scan_statement() {
			return getRuleContext(Scan_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); vardecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); const_statement();
				setState(92); match(LINE_END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); const_statement();
				notifyErrorListeners("Insert ';' to complete statement.");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97); assignment_statement();
				setState(98); match(LINE_END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100); funccall_statement();
				setState(101); match(LINE_END);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103); if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104); while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(105); do_while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(106); for_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(107); return_statement();
				setState(108); match(LINE_END);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(110); scan_statement();
				setState(111); match(LINE_END);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(113); scan_statement();
				notifyErrorListeners("Insert ';' to complete statement.");
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(116); print_statement();
				setState(117); match(LINE_END);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(119); print_statement();
				notifyErrorListeners("Insert ';' to complete statement.");
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(122); match(COMMENT_BLOCK);
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

	public static class Vardecl_listContext extends ParserRuleContext {
		public TerminalNode LINE_END() { return getToken(GrammarParser.LINE_END, 0); }
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Vardecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVardecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVardecl_list(this);
		}
	}

	public final Vardecl_listContext vardecl_list() throws RecognitionException {
		Vardecl_listContext _localctx = new Vardecl_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardecl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); var_decl();
			setState(126); match(LINE_END);
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(127); vardecl_list();
				}
				break;
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

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclarationContext extends Var_declContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public ArrayDeclarationContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArrayDeclaration(this);
		}
	}
	public static class VariableDeclarationContext extends Var_declContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Var_identifier_listContext var_identifier_list() {
			return getRuleContext(Var_identifier_listContext.class,0);
		}
		public VariableDeclarationContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariableDeclaration(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130); data_type();
				{
				setState(131); var_identifier_list();
				}
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133); data_type();
				{
				setState(134); array_size();
				}
				setState(135); match(VARIABLE_IDENTIFIER);
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

	public static class Var_identifier_listContext extends ParserRuleContext {
		public Var_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_identifier_list; }
	 
		public Var_identifier_listContext() { }
		public void copyFrom(Var_identifier_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarIdentifierInDeclaration2Context extends Var_identifier_listContext {
		public Var_assignment_statementContext var_assignment_statement() {
			return getRuleContext(Var_assignment_statementContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public VarIdentifierInDeclaration2Context(Var_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarIdentifierInDeclaration2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarIdentifierInDeclaration2(this);
		}
	}
	public static class VarIdentifierInDeclaration1Context extends Var_identifier_listContext {
		public TerminalNode ENUMERATION() { return getToken(GrammarParser.ENUMERATION, 0); }
		public Var_assignment_statementContext var_assignment_statement() {
			return getRuleContext(Var_assignment_statementContext.class,0);
		}
		public Var_identifier_listContext var_identifier_list() {
			return getRuleContext(Var_identifier_listContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public VarIdentifierInDeclaration1Context(Var_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarIdentifierInDeclaration1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarIdentifierInDeclaration1(this);
		}
	}

	public final Var_identifier_listContext var_identifier_list() throws RecognitionException {
		Var_identifier_listContext _localctx = new Var_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_identifier_list);
		int _la;
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new VarIdentifierInDeclaration1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139); match(VARIABLE_IDENTIFIER);
				setState(141);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT_OPE) {
					{
					setState(140); var_assignment_statement();
					}
				}

				setState(143); match(ENUMERATION);
				setState(145);
				_la = _input.LA(1);
				if (_la==VARIABLE_IDENTIFIER) {
					{
					setState(144); var_identifier_list();
					}
				}

				}
				break;
			case 2:
				_localctx = new VarIdentifierInDeclaration2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147); match(VARIABLE_IDENTIFIER);
				setState(149);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT_OPE) {
					{
					setState(148); var_assignment_statement();
					}
				}

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

	public static class Array_sizeContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(GrammarParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(GrammarParser.FLOAT_LITERAL, 0); }
		public TerminalNode ARRAY_SIZE_DELIMETER() { return getToken(GrammarParser.ARRAY_SIZE_DELIMETER, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public Array_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray_size(this);
		}
	}

	public final Array_sizeContext array_size() throws RecognitionException {
		Array_sizeContext _localctx = new Array_sizeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_size);
		int _la;
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(ARRAY_SIZE_DELIMETER);
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_LITERAL || _la==VARIABLE_IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(ARRAY_SIZE_DELIMETER);
				setState(156); match(FLOAT_LITERAL);
				notifyErrorListeners("Invalid Array Size! Change array size to an integer value.");
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT_DTYPE() { return getToken(GrammarParser.INT_DTYPE, 0); }
		public TerminalNode FLOAT_DTYPE() { return getToken(GrammarParser.FLOAT_DTYPE, 0); }
		public TerminalNode BOOLEAN_DTYPE() { return getToken(GrammarParser.BOOLEAN_DTYPE, 0); }
		public TerminalNode STRING_DTYPE() { return getToken(GrammarParser.STRING_DTYPE, 0); }
		public TerminalNode CHAR_DTYPE() { return getToken(GrammarParser.CHAR_DTYPE, 0); }
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
		enterRule(_localctx, 14, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(GrammarParser.VOID, 0); }
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(GrammarParser.FUNCTION_IDENTIFIER, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_declaration);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case INT_DTYPE:
			case FLOAT_DTYPE:
			case CHAR_DTYPE:
			case STRING_DTYPE:
			case BOOLEAN_DTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); data_type();
				setState(163); match(FUNCTION_IDENTIFIER);
				setState(164); function_block();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); match(VOID);
				setState(167); match(FUNCTION_IDENTIFIER);
				setState(168); function_block();
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

	public static class ParametersContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); data_type();
			setState(172); match(VARIABLE_IDENTIFIER);
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

	public static class Function_blockContext extends ParserRuleContext {
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public List<TerminalNode> ENUMERATION() { return getTokens(GrammarParser.ENUMERATION); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public TerminalNode ENUMERATION(int i) {
			return getToken(GrammarParser.ENUMERATION, i);
		}
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction_block(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(OPEN_PAR);
			setState(183);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE))) != 0)) {
				{
				setState(175); parameters();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENUMERATION) {
					{
					{
					setState(176); match(ENUMERATION);
					setState(177); parameters();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(185); match(CLOSE_PAR);
			setState(186); code_block();
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

	public static class Main_functionContext extends ParserRuleContext {
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
	 
		public Main_functionContext() { }
		public void copyFrom(Main_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainFunctionContext extends Main_functionContext {
		public TerminalNode MAIN_FUNC() { return getToken(GrammarParser.MAIN_FUNC, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(GrammarParser.VOID, 0); }
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public MainFunctionContext(Main_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMainFunction(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_main_function);
		try {
			_localctx = new MainFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(VOID);
			setState(189); match(MAIN_FUNC);
			setState(190); match(OPEN_PAR);
			setState(191); match(CLOSE_PAR);
			setState(192); code_block();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprFactorContext extends ExpressionContext {
		public Expression_factorContext expression_factor() {
			return getRuleContext(Expression_factorContext.class,0);
		}
		public ExprFactorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprFactor(this);
		}
	}
	public static class ExprFactorNumOpeExprContext extends ExpressionContext {
		public Num_opeContext num_ope() {
			return getRuleContext(Num_opeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_factorContext expression_factor() {
			return getRuleContext(Expression_factorContext.class,0);
		}
		public ExprFactorNumOpeExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprFactorNumOpeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprFactorNumOpeExpr(this);
		}
	}
	public static class ExpressionOnlyContext extends ExpressionContext {
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public ExpressionOnlyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionOnly(this);
		}
	}
	public static class ExprNumOpeExprContext extends ExpressionContext {
		public Num_opeContext num_ope() {
			return getRuleContext(Num_opeContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExprNumOpeExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprNumOpeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprNumOpeExpr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ExprFactorNumOpeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195); expression_factor();
				setState(196); num_ope();
				setState(197); expression(3);
				}
				break;
			case 2:
				{
				_localctx = new ExpressionOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199); match(OPEN_PAR);
				setState(200); expression(0);
				setState(201); match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				_localctx = new ExprFactorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203); expression_factor();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprNumOpeExprContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(206);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(207); num_ope();
					setState(208); expression(3);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Expression_factorContext extends ParserRuleContext {
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(GrammarParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(GrammarParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public Expression_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression_factor(this);
		}
	}

	public final Expression_factorContext expression_factor() throws RecognitionException {
		Expression_factorContext _localctx = new Expression_factorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression_factor);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); num_factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217); match(BOOLEAN_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218); funccall_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219); match(VARIABLE_IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220); match(VARIABLE_IDENTIFIER);
				setState(221); array_size();
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
	 
		public Bool_expressionContext() { }
		public void copyFrom(Bool_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalBoolContext extends Bool_expressionContext {
		public Logical_opeContext logical_ope() {
			return getRuleContext(Logical_opeContext.class,0);
		}
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public LogicalBoolContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLogicalBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLogicalBool(this);
		}
	}
	public static class BoolContext extends Bool_expressionContext {
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode NOT_OPE() { return getToken(GrammarParser.NOT_OPE, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public BoolContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBool(this);
		}
	}
	public static class RelationalBoolContext extends Bool_expressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Relational_opeContext relational_ope() {
			return getRuleContext(Relational_opeContext.class,0);
		}
		public RelationalBoolContext(Bool_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRelationalBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRelationalBool(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		return bool_expression(0);
	}

	private Bool_expressionContext bool_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, _parentState);
		Bool_expressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_bool_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(226);
				_la = _input.LA(1);
				if (_la==NOT_OPE) {
					{
					setState(225); match(NOT_OPE);
					}
				}

				setState(228); match(OPEN_PAR);
				setState(229); bool_expression(0);
				setState(230); match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				_localctx = new RelationalBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232); expression(0);
				setState(233); relational_ope();
				setState(234); expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalBoolContext(new Bool_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
					setState(238);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(239); logical_ope();
					setState(240); bool_expression(3);
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Num_opeContext extends ParserRuleContext {
		public TerminalNode SUBTRACTION_OPE() { return getToken(GrammarParser.SUBTRACTION_OPE, 0); }
		public TerminalNode DIVISION_OPE() { return getToken(GrammarParser.DIVISION_OPE, 0); }
		public TerminalNode MODULO_OPE() { return getToken(GrammarParser.MODULO_OPE, 0); }
		public TerminalNode MULTIPLICATION_OPE() { return getToken(GrammarParser.MULTIPLICATION_OPE, 0); }
		public TerminalNode ADDITION_OPE() { return getToken(GrammarParser.ADDITION_OPE, 0); }
		public Num_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNum_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNum_ope(this);
		}
	}

	public final Num_opeContext num_ope() throws RecognitionException {
		Num_opeContext _localctx = new Num_opeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_num_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITION_OPE) | (1L << SUBTRACTION_OPE) | (1L << MULTIPLICATION_OPE) | (1L << DIVISION_OPE) | (1L << MODULO_OPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Unary_opeContext extends ParserRuleContext {
		public Unary_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnary_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnary_ope(this);
		}
	}

	public final Unary_opeContext unary_ope() throws RecognitionException {
		Unary_opeContext _localctx = new Unary_opeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unary_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==ADDITION_OPE || _la==SUBTRACTION_OPE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Num_factorContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(GrammarParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(GrammarParser.FLOAT_LITERAL, 0); }
		public Unary_opeContext unary_ope() {
			return getRuleContext(Unary_opeContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(GrammarParser.CHAR_LITERAL, 0); }
		public Num_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNum_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNum_factor(this);
		}
	}

	public final Num_factorContext num_factor() throws RecognitionException {
		Num_factorContext _localctx = new Num_factorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_num_factor);
		int _la;
		try {
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); match(CHAR_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				_la = _input.LA(1);
				if (_la==ADDITION_OPE || _la==SUBTRACTION_OPE) {
					{
					setState(252); unary_ope();
					}
				}

				setState(255); match(INTEGER_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				_la = _input.LA(1);
				if (_la==ADDITION_OPE || _la==SUBTRACTION_OPE) {
					{
					setState(256); unary_ope();
					}
				}

				setState(259); match(FLOAT_LITERAL);
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

	public static class Relational_opeContext extends ParserRuleContext {
		public TerminalNode NOT_EQUAL_OPE() { return getToken(GrammarParser.NOT_EQUAL_OPE, 0); }
		public TerminalNode GREATER_THAN_OPE() { return getToken(GrammarParser.GREATER_THAN_OPE, 0); }
		public TerminalNode GREATER_THAN_EQUAL_TO_OPE() { return getToken(GrammarParser.GREATER_THAN_EQUAL_TO_OPE, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO_OPE() { return getToken(GrammarParser.LESS_THAN_EQUAL_TO_OPE, 0); }
		public TerminalNode LESS_THAN_OPE() { return getToken(GrammarParser.LESS_THAN_OPE, 0); }
		public TerminalNode EQUAL_OPE() { return getToken(GrammarParser.EQUAL_OPE, 0); }
		public Relational_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRelational_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRelational_ope(this);
		}
	}

	public final Relational_opeContext relational_ope() throws RecognitionException {
		Relational_opeContext _localctx = new Relational_opeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relational_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN_OPE) | (1L << LESS_THAN_EQUAL_TO_OPE) | (1L << GREATER_THAN_OPE) | (1L << GREATER_THAN_EQUAL_TO_OPE) | (1L << EQUAL_OPE) | (1L << NOT_EQUAL_OPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Logical_opeContext extends ParserRuleContext {
		public TerminalNode AND_OPE() { return getToken(GrammarParser.AND_OPE, 0); }
		public TerminalNode OR_OPE() { return getToken(GrammarParser.OR_OPE, 0); }
		public Logical_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLogical_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLogical_ope(this);
		}
	}

	public final Logical_opeContext logical_ope() throws RecognitionException {
		Logical_opeContext _localctx = new Logical_opeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logical_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==AND_OPE || _la==OR_OPE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Const_statementContext extends ParserRuleContext {
		public Const_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_statement; }
	 
		public Const_statementContext() { }
		public void copyFrom(Const_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantDeclarationContext extends Const_statementContext {
		public Var_assignment_statementContext var_assignment_statement() {
			return getRuleContext(Var_assignment_statementContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode CONSTANT_KEYWORD() { return getToken(GrammarParser.CONSTANT_KEYWORD, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public ConstantDeclarationContext(Const_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConstantDeclaration(this);
		}
	}

	public final Const_statementContext const_statement() throws RecognitionException {
		Const_statementContext _localctx = new Const_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_const_statement);
		int _la;
		try {
			_localctx = new ConstantDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(CONSTANT_KEYWORD);
			setState(267); data_type();
			setState(268); match(VARIABLE_IDENTIFIER);
			setState(270);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OPE) {
				{
				setState(269); var_assignment_statement();
				}
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

	public static class Var_assignment_statementContext extends ParserRuleContext {
		public Var_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assignment_statement; }
	 
		public Var_assignment_statementContext() { }
		public void copyFrom(Var_assignment_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAssignmentContext extends Var_assignment_statementContext {
		public Assignment_factorContext assignment_factor() {
			return getRuleContext(Assignment_factorContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPE() { return getToken(GrammarParser.ASSIGNMENT_OPE, 0); }
		public VarAssignmentContext(Var_assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarAssignment(this);
		}
	}

	public final Var_assignment_statementContext var_assignment_statement() throws RecognitionException {
		Var_assignment_statementContext _localctx = new Var_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_assignment_statement);
		try {
			_localctx = new VarAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(ASSIGNMENT_OPE);
			setState(273); assignment_factor();
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	 
		public Assignment_statementContext() { }
		public void copyFrom(Assignment_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewAssignmentContext extends Assignment_statementContext {
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public Assignment_factorContext assignment_factor() {
			return getRuleContext(Assignment_factorContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPE() { return getToken(GrammarParser.ASSIGNMENT_OPE, 0); }
		public NewAssignmentContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNewAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNewAssignment(this);
		}
	}
	public static class DecrementOrIncrementContext extends Assignment_statementContext {
		public TerminalNode INCREMENT_OPE() { return getToken(GrammarParser.INCREMENT_OPE, 0); }
		public TerminalNode DECREMENT_OPE() { return getToken(GrammarParser.DECREMENT_OPE, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public DecrementOrIncrementContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDecrementOrIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDecrementOrIncrement(this);
		}
	}
	public static class AssignmentWithNumOpeContext extends Assignment_statementContext {
		public Assignment_num_opeContext assignment_num_ope() {
			return getRuleContext(Assignment_num_opeContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(GrammarParser.STRING_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public AssignmentWithNumOpeContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignmentWithNumOpe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignmentWithNumOpe(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment_statement);
		int _la;
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new NewAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275); match(VARIABLE_IDENTIFIER);
				setState(277);
				_la = _input.LA(1);
				if (_la==ARRAY_SIZE_DELIMETER) {
					{
					setState(276); array_size();
					}
				}

				setState(279); match(ASSIGNMENT_OPE);
				setState(280); assignment_factor();
				}
				break;
			case 2:
				_localctx = new DecrementOrIncrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281); match(VARIABLE_IDENTIFIER);
				setState(282);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT_OPE || _la==DECREMENT_OPE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 3:
				_localctx = new AssignmentWithNumOpeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(283); match(VARIABLE_IDENTIFIER);
				setState(284); assignment_num_ope();
				setState(287);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(285); expression(0);
					}
					break;
				case 2:
					{
					setState(286); match(STRING_LITERAL);
					}
					break;
				}
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

	public static class Assignment_num_opeContext extends ParserRuleContext {
		public List<TerminalNode> ADDITION_ASSIGNMENT_OPE() { return getTokens(GrammarParser.ADDITION_ASSIGNMENT_OPE); }
		public TerminalNode ADDITION_ASSIGNMENT_OPE(int i) {
			return getToken(GrammarParser.ADDITION_ASSIGNMENT_OPE, i);
		}
		public TerminalNode DIVISION_ASSIGNMENT_OPE() { return getToken(GrammarParser.DIVISION_ASSIGNMENT_OPE, 0); }
		public TerminalNode SUBTRACTION_ASSIGNMENT_OPE() { return getToken(GrammarParser.SUBTRACTION_ASSIGNMENT_OPE, 0); }
		public TerminalNode MULTIPLICATION_ASSIGNMENT_OPE() { return getToken(GrammarParser.MULTIPLICATION_ASSIGNMENT_OPE, 0); }
		public Assignment_num_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_num_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignment_num_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignment_num_ope(this);
		}
	}

	public final Assignment_num_opeContext assignment_num_ope() throws RecognitionException {
		Assignment_num_opeContext _localctx = new Assignment_num_opeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignment_num_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITION_ASSIGNMENT_OPE) | (1L << SUBTRACTION_ASSIGNMENT_OPE) | (1L << MULTIPLICATION_ASSIGNMENT_OPE) | (1L << DIVISION_ASSIGNMENT_OPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Assignment_factorContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(GrammarParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(GrammarParser.BOOLEAN_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Assignment_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignment_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignment_factor(this);
		}
	}

	public final Assignment_factorContext assignment_factor() throws RecognitionException {
		Assignment_factorContext _localctx = new Assignment_factorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment_factor);
		try {
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294); match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295); match(BOOLEAN_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296); bool_expression(0);
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

	public static class Funccall_statementContext extends ParserRuleContext {
		public Funccall_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall_statement; }
	 
		public Funccall_statementContext() { }
		public void copyFrom(Funccall_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallContext extends Funccall_statementContext {
		public List<Actual_paramsContext> actual_params() {
			return getRuleContexts(Actual_paramsContext.class);
		}
		public Actual_paramsContext actual_params(int i) {
			return getRuleContext(Actual_paramsContext.class,i);
		}
		public List<TerminalNode> ENUMERATION() { return getTokens(GrammarParser.ENUMERATION); }
		public TerminalNode FUNCTION_CALL() { return getToken(GrammarParser.FUNCTION_CALL, 0); }
		public TerminalNode ENUMERATION(int i) {
			return getToken(GrammarParser.ENUMERATION, i);
		}
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(GrammarParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public FunctionCallContext(Funccall_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionCall(this);
		}
	}

	public final Funccall_statementContext funccall_statement() throws RecognitionException {
		Funccall_statementContext _localctx = new Funccall_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funccall_statement);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(FUNCTION_CALL);
			setState(300); match(FUNCTION_IDENTIFIER);
			setState(301); match(OPEN_PAR);
			setState(310);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << ADDITION_OPE) | (1L << SUBTRACTION_OPE) | (1L << FUNCTION_CALL) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << VARIABLE_IDENTIFIER))) != 0)) {
				{
				setState(302); actual_params();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENUMERATION) {
					{
					{
					setState(303); match(ENUMERATION);
					setState(304); actual_params();
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(312); match(CLOSE_PAR);
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

	public static class Actual_paramsContext extends ParserRuleContext {
		public TerminalNode ENUMERATION() { return getToken(GrammarParser.ENUMERATION, 0); }
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public Actual_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterActual_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitActual_params(this);
		}
	}

	public final Actual_paramsContext actual_params() throws RecognitionException {
		Actual_paramsContext _localctx = new Actual_paramsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_actual_params);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); match(VARIABLE_IDENTIFIER);
				setState(315); match(ENUMERATION);
				setState(316); actual_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317); match(VARIABLE_IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318); expression(0);
				setState(319); match(ENUMERATION);
				setState(320); actual_params();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322); expression(0);
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

	public static class Conditional_factorContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(GrammarParser.BOOLEAN_LITERAL, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Conditional_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditional_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditional_factor(this);
		}
	}

	public final Conditional_factorContext conditional_factor() throws RecognitionException {
		Conditional_factorContext _localctx = new Conditional_factorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conditional_factor);
		try {
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325); bool_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326); match(BOOLEAN_LITERAL);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode ELSE_CONDITIONAL() { return getToken(GrammarParser.ELSE_CONDITIONAL, 0); }
		public Conditional_blockContext conditional_block(int i) {
			return getRuleContext(Conditional_blockContext.class,i);
		}
		public TerminalNode ELSE_IF_CONDITIONAL(int i) {
			return getToken(GrammarParser.ELSE_IF_CONDITIONAL, i);
		}
		public List<Conditional_blockContext> conditional_block() {
			return getRuleContexts(Conditional_blockContext.class);
		}
		public TerminalNode IF_CONDITIONAL() { return getToken(GrammarParser.IF_CONDITIONAL, 0); }
		public List<TerminalNode> ELSE_IF_CONDITIONAL() { return getTokens(GrammarParser.ELSE_IF_CONDITIONAL); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_statement);
		int _la;
		try {
			setState(357);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329); match(IF_CONDITIONAL);
				setState(330); conditional_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331); match(IF_CONDITIONAL);
				setState(332); conditional_block();
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE_IF_CONDITIONAL) {
					{
					{
					setState(333); match(ELSE_IF_CONDITIONAL);
					setState(334); conditional_block();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340); match(IF_CONDITIONAL);
				setState(341); conditional_block();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE_IF_CONDITIONAL) {
					{
					{
					setState(342); match(ELSE_IF_CONDITIONAL);
					setState(343); conditional_block();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349); match(ELSE_CONDITIONAL);
				setState(350); conditional_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352); match(IF_CONDITIONAL);
				setState(353); conditional_block();
				setState(354); match(ELSE_CONDITIONAL);
				setState(355); conditional_block();
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

	public static class Conditional_blockContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public Conditional_factorContext conditional_factor() {
			return getRuleContext(Conditional_factorContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public Conditional_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditional_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditional_block(this);
		}
	}

	public final Conditional_blockContext conditional_block() throws RecognitionException {
		Conditional_blockContext _localctx = new Conditional_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditional_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(OPEN_PAR);
			setState(360); conditional_factor();
			setState(361); match(CLOSE_PAR);
			setState(362); code_block();
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

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode R_CBRACKET() { return getToken(GrammarParser.R_CBRACKET, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode L_CBRACKET() { return getToken(GrammarParser.L_CBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCode_block(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(L_CBRACKET);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE) | (1L << IF_CONDITIONAL) | (1L << FOR_LOOP) | (1L << WHILE_LOOP) | (1L << DO_LOOP) | (1L << PRINT) | (1L << PRINT_NL) | (1L << SCAN) | (1L << COMMENT_BLOCK) | (1L << CONSTANT_KEYWORD) | (1L << FUNCTION_CALL) | (1L << RETURN) | (1L << VARIABLE_IDENTIFIER))) != 0)) {
				{
				{
				setState(365); statement();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371); match(R_CBRACKET);
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

	public static class While_statementContext extends ParserRuleContext {
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public TerminalNode WHILE_LOOP() { return getToken(GrammarParser.WHILE_LOOP, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); match(WHILE_LOOP);
			setState(374); conditional_block();
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode LINE_END() { return getToken(GrammarParser.LINE_END, 0); }
		public TerminalNode DO_LOOP() { return getToken(GrammarParser.DO_LOOP, 0); }
		public TerminalNode WHILE_LOOP() { return getToken(GrammarParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public Conditional_factorContext conditional_factor() {
			return getRuleContext(Conditional_factorContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_do_while_statement);
		try {
			setState(392);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376); match(DO_LOOP);
				setState(377); code_block();
				setState(378); match(WHILE_LOOP);
				setState(379); match(OPEN_PAR);
				setState(380); conditional_factor();
				setState(381); match(CLOSE_PAR);
				setState(382); match(LINE_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384); match(DO_LOOP);
				setState(385); code_block();
				setState(386); match(WHILE_LOOP);
				setState(387); match(OPEN_PAR);
				setState(388); conditional_factor();
				setState(389); match(CLOSE_PAR);
				notifyErrorListeners("Insert ';' to complete statement'");
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

	public static class For_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_assignment_statementContext for_assignment_statement() {
			return getRuleContext(For_assignment_statementContext.class,0);
		}
		public List<TerminalNode> LINE_END() { return getTokens(GrammarParser.LINE_END); }
		public TerminalNode FOR_LOOP() { return getToken(GrammarParser.FOR_LOOP, 0); }
		public TerminalNode LINE_END(int i) {
			return getToken(GrammarParser.LINE_END, i);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); match(FOR_LOOP);
			setState(395); match(OPEN_PAR);
			{
			setState(396); for_assignment_statement();
			}
			setState(397); match(LINE_END);
			setState(398); bool_expression(0);
			setState(399); match(LINE_END);
			setState(400); assignment_statement();
			setState(401); match(CLOSE_PAR);
			setState(402); code_block();
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

	public static class For_assignment_statementContext extends ParserRuleContext {
		public TerminalNode INCREMENT_OPE() { return getToken(GrammarParser.INCREMENT_OPE, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Assignment_factorContext assignment_factor() {
			return getRuleContext(Assignment_factorContext.class,0);
		}
		public TerminalNode DECREMENT_OPE() { return getToken(GrammarParser.DECREMENT_OPE, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPE() { return getToken(GrammarParser.ASSIGNMENT_OPE, 0); }
		public For_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor_assignment_statement(this);
		}
	}

	public final For_assignment_statementContext for_assignment_statement() throws RecognitionException {
		For_assignment_statementContext _localctx = new For_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_for_assignment_statement);
		int _la;
		try {
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE))) != 0)) {
					{
					setState(404); data_type();
					}
				}

				setState(407); match(VARIABLE_IDENTIFIER);
				setState(408); match(ASSIGNMENT_OPE);
				setState(409); assignment_factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410); match(VARIABLE_IDENTIFIER);
				setState(411);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT_OPE || _la==DECREMENT_OPE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412); match(VARIABLE_IDENTIFIER);
				notifyErrorListeners("Variable must be initialized!");
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(GrammarParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(GrammarParser.BOOLEAN_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_return_statement);
		try {
			setState(427);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416); match(RETURN);
				setState(421);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(417); expression(0);
					}
					break;
				case 2:
					{
					setState(418); match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(419); match(BOOLEAN_LITERAL);
					}
					break;
				case 4:
					{
					setState(420); num_factor();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423); match(RETURN);
				setState(424); data_type();
				notifyErrorListeners("Invalid return type! Replace with a data type value or expression.");
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

	public static class Scan_statementContext extends ParserRuleContext {
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
	 
		public Scan_statementContext() { }
		public void copyFrom(Scan_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScanThruArrContext extends Scan_statementContext {
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public TerminalNode SCAN() { return getToken(GrammarParser.SCAN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public ScanThruArrContext(Scan_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterScanThruArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitScanThruArr(this);
		}
	}
	public static class ScanContext extends Scan_statementContext {
		public TerminalNode SCAN() { return getToken(GrammarParser.SCAN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(GrammarParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public ScanContext(Scan_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitScan(this);
		}
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_scan_statement);
		try {
			setState(439);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new ScanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(429); match(SCAN);
				setState(430); match(OPEN_PAR);
				setState(431); match(VARIABLE_IDENTIFIER);
				setState(432); match(CLOSE_PAR);
				}
				break;
			case 2:
				_localctx = new ScanThruArrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(433); match(SCAN);
				setState(434); match(OPEN_PAR);
				setState(435); match(VARIABLE_IDENTIFIER);
				setState(436); array_size();
				setState(437); match(CLOSE_PAR);
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

	public static class Print_statementContext extends ParserRuleContext {
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	 
		public Print_statementContext() { }
		public void copyFrom(Print_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends Print_statementContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public Print_factor_booleanContext print_factor_boolean() {
			return getRuleContext(Print_factor_booleanContext.class,0);
		}
		public Print_factorContext print_factor() {
			return getRuleContext(Print_factorContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public PrintContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint(this);
		}
	}
	public static class PrintNewLineContext extends Print_statementContext {
		public Print_factor_booleanContext print_factor_boolean() {
			return getRuleContext(Print_factor_booleanContext.class,0);
		}
		public Print_factorContext print_factor() {
			return getRuleContext(Print_factorContext.class,0);
		}
		public TerminalNode PRINT_NL() { return getToken(GrammarParser.PRINT_NL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(GrammarParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(GrammarParser.CLOSE_PAR, 0); }
		public PrintNewLineContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrintNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrintNewLine(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_print_statement);
		try {
			setState(459);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(441); match(PRINT);
				setState(442); match(OPEN_PAR);
				setState(446);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(443); print_factor(0);
					}
					break;
				case 2:
					{
					setState(444); expression(0);
					}
					break;
				case 3:
					{
					setState(445); print_factor_boolean(0);
					}
					break;
				}
				setState(448); match(CLOSE_PAR);
				}
				break;
			case PRINT_NL:
				_localctx = new PrintNewLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(450); match(PRINT_NL);
				setState(451); match(OPEN_PAR);
				setState(455);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(452); print_factor(0);
					}
					break;
				case 2:
					{
					setState(453); expression(0);
					}
					break;
				case 3:
					{
					setState(454); print_factor_boolean(0);
					}
					break;
				}
				setState(457); match(CLOSE_PAR);
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

	public static class Print_factorContext extends ParserRuleContext {
		public Print_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_factor; }
	 
		public Print_factorContext() { }
		public void copyFrom(Print_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStringContext extends Print_factorContext {
		public TerminalNode STRING_LITERAL() { return getToken(GrammarParser.STRING_LITERAL, 0); }
		public PrintStringContext(Print_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrintString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrintString(this);
		}
	}
	public static class PrintFactorPlusPrintFactorContext extends Print_factorContext {
		public List<Print_factorContext> print_factor() {
			return getRuleContexts(Print_factorContext.class);
		}
		public Print_factorContext print_factor(int i) {
			return getRuleContext(Print_factorContext.class,i);
		}
		public TerminalNode ADDITION_OPE() { return getToken(GrammarParser.ADDITION_OPE, 0); }
		public PrintFactorPlusPrintFactorContext(Print_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrintFactorPlusPrintFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrintFactorPlusPrintFactor(this);
		}
	}
	public static class PrintFactorPlusExprContext extends Print_factorContext {
		public Print_factorContext print_factor() {
			return getRuleContext(Print_factorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADDITION_OPE() { return getToken(GrammarParser.ADDITION_OPE, 0); }
		public PrintFactorPlusExprContext(Print_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrintFactorPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrintFactorPlusExpr(this);
		}
	}

	public final Print_factorContext print_factor() throws RecognitionException {
		return print_factor(0);
	}

	private Print_factorContext print_factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Print_factorContext _localctx = new Print_factorContext(_ctx, _parentState);
		Print_factorContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_print_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrintStringContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(462); match(STRING_LITERAL);
			}
			_ctx.stop = _input.LT(-1);
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(470);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new PrintFactorPlusPrintFactorContext(new Print_factorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_print_factor);
						setState(464);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(465); match(ADDITION_OPE);
						setState(466); print_factor(2);
						}
						break;
					case 2:
						{
						_localctx = new PrintFactorPlusExprContext(new Print_factorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_print_factor);
						setState(467);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(468); match(ADDITION_OPE);
						setState(469); expression(0);
						}
						break;
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class Print_factor_booleanContext extends ParserRuleContext {
		public Print_factor_booleanContext print_factor_boolean() {
			return getRuleContext(Print_factor_booleanContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode ADDITION_OPE() { return getToken(GrammarParser.ADDITION_OPE, 0); }
		public Print_factor_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_factor_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint_factor_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint_factor_boolean(this);
		}
	}

	public final Print_factor_booleanContext print_factor_boolean() throws RecognitionException {
		return print_factor_boolean(0);
	}

	private Print_factor_booleanContext print_factor_boolean(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Print_factor_booleanContext _localctx = new Print_factor_booleanContext(_ctx, _parentState);
		Print_factor_booleanContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_print_factor_boolean, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(476); bool_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Print_factor_booleanContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_print_factor_boolean);
					setState(478);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(479); match(ADDITION_OPE);
					setState(480); bool_expression(0);
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12: return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 14: return bool_expression_sempred((Bool_expressionContext)_localctx, predIndex);
		case 38: return print_factor_sempred((Print_factorContext)_localctx, predIndex);
		case 39: return print_factor_boolean_sempred((Print_factor_booleanContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean print_factor_sempred(Print_factorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean print_factor_boolean_sempred(Print_factor_booleanContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_expression_sempred(Bool_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u01e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\3\7\3X\n\3\f\3\16\3[\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4~\n\4\3\5\3\5\3\5\5\5\u0083\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u008c\n\6\3\7\3\7\5\7\u0090\n\7\3\7\3\7\5\7\u0094"+
		"\n\7\3\7\3\7\5\7\u0098\n\7\5\7\u009a\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a1"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\7\f\u00b5\n\f\f\f\16\f\u00b8\13\f\5\f\u00ba\n\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00cf\n\16\3\16\3\16\3\16\3\16\7\16\u00d5\n\16\f\16\16"+
		"\16\u00d8\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e1\n\17\3\20"+
		"\3\20\5\20\u00e5\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ef"+
		"\n\20\3\20\3\20\3\20\3\20\7\20\u00f5\n\20\f\20\16\20\u00f8\13\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\5\23\u0100\n\23\3\23\3\23\5\23\u0104\n\23\3"+
		"\23\5\23\u0107\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0111"+
		"\n\26\3\27\3\27\3\27\3\30\3\30\5\30\u0118\n\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0122\n\30\5\30\u0124\n\30\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\5\32\u012c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0134\n\33"+
		"\f\33\16\33\u0137\13\33\5\33\u0139\n\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0146\n\34\3\35\3\35\5\35\u014a\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\7\36\u0152\n\36\f\36\16\36\u0155\13\36\3"+
		"\36\3\36\3\36\3\36\7\36\u015b\n\36\f\36\16\36\u015e\13\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u0168\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \7 \u0171\n \f \16 \u0174\13 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u018b\n\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\5$\u0198\n$\3$\3$\3$\3$\3$\3$\3$\5$\u01a1\n$\3"+
		"%\3%\3%\3%\3%\5%\u01a8\n%\3%\3%\3%\3%\5%\u01ae\n%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\5&\u01ba\n&\3\'\3\'\3\'\3\'\3\'\5\'\u01c1\n\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u01ca\n\'\3\'\3\'\5\'\u01ce\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\7(\u01d9\n(\f(\16(\u01dc\13(\3)\3)\3)\3)\3)\3)\7)\u01e4\n)\f)"+
		"\16)\u01e7\13)\3)\2\6\32\36NP*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\n\4\2\66\66;;\3\2\3\7\4\2\32\35#"+
		"#\3\2\32\33\3\2$)\3\2-.\3\2*+\3\2\36!\u020d\2R\3\2\2\2\4Y\3\2\2\2\6}\3"+
		"\2\2\2\b\177\3\2\2\2\n\u008b\3\2\2\2\f\u0099\3\2\2\2\16\u00a0\3\2\2\2"+
		"\20\u00a2\3\2\2\2\22\u00ab\3\2\2\2\24\u00ad\3\2\2\2\26\u00b0\3\2\2\2\30"+
		"\u00be\3\2\2\2\32\u00ce\3\2\2\2\34\u00e0\3\2\2\2\36\u00ee\3\2\2\2 \u00f9"+
		"\3\2\2\2\"\u00fb\3\2\2\2$\u0106\3\2\2\2&\u0108\3\2\2\2(\u010a\3\2\2\2"+
		"*\u010c\3\2\2\2,\u0112\3\2\2\2.\u0123\3\2\2\2\60\u0125\3\2\2\2\62\u012b"+
		"\3\2\2\2\64\u012d\3\2\2\2\66\u0145\3\2\2\28\u0149\3\2\2\2:\u0167\3\2\2"+
		"\2<\u0169\3\2\2\2>\u016e\3\2\2\2@\u0177\3\2\2\2B\u018a\3\2\2\2D\u018c"+
		"\3\2\2\2F\u01a0\3\2\2\2H\u01ad\3\2\2\2J\u01b9\3\2\2\2L\u01cd\3\2\2\2N"+
		"\u01cf\3\2\2\2P\u01dd\3\2\2\2RS\5\4\3\2ST\5\30\r\2TU\7\2\2\3U\3\3\2\2"+
		"\2VX\5\22\n\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\5\3\2\2\2[Y\3\2"+
		"\2\2\\~\5\b\5\2]^\5*\26\2^_\7\31\2\2_~\3\2\2\2`a\5*\26\2ab\b\4\1\2b~\3"+
		"\2\2\2cd\5.\30\2de\7\31\2\2e~\3\2\2\2fg\5\64\33\2gh\7\31\2\2h~\3\2\2\2"+
		"i~\5:\36\2j~\5@!\2k~\5B\"\2l~\5D#\2mn\5H%\2no\7\31\2\2o~\3\2\2\2pq\5J"+
		"&\2qr\7\31\2\2r~\3\2\2\2st\5J&\2tu\b\4\1\2u~\3\2\2\2vw\5L\'\2wx\7\31\2"+
		"\2x~\3\2\2\2yz\5L\'\2z{\b\4\1\2{~\3\2\2\2|~\7\30\2\2}\\\3\2\2\2}]\3\2"+
		"\2\2}`\3\2\2\2}c\3\2\2\2}f\3\2\2\2}i\3\2\2\2}j\3\2\2\2}k\3\2\2\2}l\3\2"+
		"\2\2}m\3\2\2\2}p\3\2\2\2}s\3\2\2\2}v\3\2\2\2}y\3\2\2\2}|\3\2\2\2~\7\3"+
		"\2\2\2\177\u0080\5\n\6\2\u0080\u0082\7\31\2\2\u0081\u0083\5\b\5\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\t\3\2\2\2\u0084\u0085\5\20\t"+
		"\2\u0085\u0086\5\f\7\2\u0086\u008c\3\2\2\2\u0087\u0088\5\20\t\2\u0088"+
		"\u0089\5\16\b\2\u0089\u008a\7;\2\2\u008a\u008c\3\2\2\2\u008b\u0084\3\2"+
		"\2\2\u008b\u0087\3\2\2\2\u008c\13\3\2\2\2\u008d\u008f\7;\2\2\u008e\u0090"+
		"\5,\27\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\7\27\2\2\u0092\u0094\5\f\7\2\u0093\u0092\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u009a\3\2\2\2\u0095\u0097\7;\2\2\u0096\u0098\5,\27\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u008d\3\2"+
		"\2\2\u0099\u0095\3\2\2\2\u009a\r\3\2\2\2\u009b\u009c\7\60\2\2\u009c\u00a1"+
		"\t\2\2\2\u009d\u009e\7\60\2\2\u009e\u009f\7\67\2\2\u009f\u00a1\b\b\1\2"+
		"\u00a0\u009b\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\17\3\2\2\2\u00a2\u00a3"+
		"\t\3\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\7<\2\2\u00a6"+
		"\u00a7\5\26\f\2\u00a7\u00ac\3\2\2\2\u00a8\u00a9\7\65\2\2\u00a9\u00aa\7"+
		"<\2\2\u00aa\u00ac\5\26\f\2\u00ab\u00a4\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac"+
		"\23\3\2\2\2\u00ad\u00ae\5\20\t\2\u00ae\u00af\7;\2\2\u00af\25\3\2\2\2\u00b0"+
		"\u00b9\7\21\2\2\u00b1\u00b6\5\24\13\2\u00b2\u00b3\7\27\2\2\u00b3\u00b5"+
		"\5\24\13\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00b1"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\22\2\2"+
		"\u00bc\u00bd\5> \2\u00bd\27\3\2\2\2\u00be\u00bf\7\65\2\2\u00bf\u00c0\7"+
		"\63\2\2\u00c0\u00c1\7\21\2\2\u00c1\u00c2\7\22\2\2\u00c2\u00c3\5> \2\u00c3"+
		"\31\3\2\2\2\u00c4\u00c5\b\16\1\2\u00c5\u00c6\5\34\17\2\u00c6\u00c7\5 "+
		"\21\2\u00c7\u00c8\5\32\16\5\u00c8\u00cf\3\2\2\2\u00c9\u00ca\7\21\2\2\u00ca"+
		"\u00cb\5\32\16\2\u00cb\u00cc\7\22\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf"+
		"\5\34\17\2\u00ce\u00c4\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\u00d6\3\2\2\2\u00d0\u00d1\f\4\2\2\u00d1\u00d2\5 \21\2\u00d2\u00d3"+
		"\5\32\16\5\u00d3\u00d5\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\u00d8\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\33\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00e1\79\2\2\u00da\u00e1\5$\23\2\u00db\u00e1\7:\2\2\u00dc"+
		"\u00e1\5\64\33\2\u00dd\u00e1\7;\2\2\u00de\u00df\7;\2\2\u00df\u00e1\5\16"+
		"\b\2\u00e0\u00d9\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0"+
		"\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\35\3\2\2"+
		"\2\u00e2\u00e4\b\20\1\2\u00e3\u00e5\7/\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\21\2\2\u00e7\u00e8\5\36\20"+
		"\2\u00e8\u00e9\7\22\2\2\u00e9\u00ef\3\2\2\2\u00ea\u00eb\5\32\16\2\u00eb"+
		"\u00ec\5&\24\2\u00ec\u00ed\5\32\16\2\u00ed\u00ef\3\2\2\2\u00ee\u00e2\3"+
		"\2\2\2\u00ee\u00ea\3\2\2\2\u00ef\u00f6\3\2\2\2\u00f0\u00f1\f\4\2\2\u00f1"+
		"\u00f2\5(\25\2\u00f2\u00f3\5\36\20\5\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3"+
		"\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\37\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\t\4\2\2\u00fa!\3\2\2\2\u00fb"+
		"\u00fc\t\5\2\2\u00fc#\3\2\2\2\u00fd\u0107\78\2\2\u00fe\u0100\5\"\22\2"+
		"\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0107"+
		"\7\66\2\2\u0102\u0104\5\"\22\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2"+
		"\u0104\u0105\3\2\2\2\u0105\u0107\7\67\2\2\u0106\u00fd\3\2\2\2\u0106\u00ff"+
		"\3\2\2\2\u0106\u0103\3\2\2\2\u0107%\3\2\2\2\u0108\u0109\t\6\2\2\u0109"+
		"\'\3\2\2\2\u010a\u010b\t\7\2\2\u010b)\3\2\2\2\u010c\u010d\7\61\2\2\u010d"+
		"\u010e\5\20\t\2\u010e\u0110\7;\2\2\u010f\u0111\5,\27\2\u0110\u010f\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111+\3\2\2\2\u0112\u0113\7,\2\2\u0113\u0114"+
		"\5\62\32\2\u0114-\3\2\2\2\u0115\u0117\7;\2\2\u0116\u0118\5\16\b\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7,"+
		"\2\2\u011a\u0124\5\62\32\2\u011b\u011c\7;\2\2\u011c\u0124\t\b\2\2\u011d"+
		"\u011e\7;\2\2\u011e\u0121\5\60\31\2\u011f\u0122\5\32\16\2\u0120\u0122"+
		"\79\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0115\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u011d\3\2\2\2\u0124/\3\2\2\2"+
		"\u0125\u0126\t\t\2\2\u0126\61\3\2\2\2\u0127\u012c\5\32\16\2\u0128\u012c"+
		"\79\2\2\u0129\u012c\7:\2\2\u012a\u012c\5\36\20\2\u012b\u0127\3\2\2\2\u012b"+
		"\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\63\3\2\2"+
		"\2\u012d\u012e\7\62\2\2\u012e\u012f\7<\2\2\u012f\u0138\7\21\2\2\u0130"+
		"\u0135\5\66\34\2\u0131\u0132\7\27\2\2\u0132\u0134\5\66\34\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0130\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\22\2\2\u013b\65\3\2\2\2\u013c\u013d"+
		"\7;\2\2\u013d\u013e\7\27\2\2\u013e\u0146\5\66\34\2\u013f\u0146\7;\2\2"+
		"\u0140\u0141\5\32\16\2\u0141\u0142\7\27\2\2\u0142\u0143\5\66\34\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0146\5\32\16\2\u0145\u013c\3\2\2\2\u0145\u013f\3"+
		"\2\2\2\u0145\u0140\3\2\2\2\u0145\u0144\3\2\2\2\u0146\67\3\2\2\2\u0147"+
		"\u014a\5\36\20\2\u0148\u014a\7:\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3"+
		"\2\2\2\u014a9\3\2\2\2\u014b\u014c\7\b\2\2\u014c\u0168\5<\37\2\u014d\u014e"+
		"\7\b\2\2\u014e\u0153\5<\37\2\u014f\u0150\7\t\2\2\u0150\u0152\5<\37\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0168\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\b\2\2\u0157"+
		"\u015c\5<\37\2\u0158\u0159\7\t\2\2\u0159\u015b\5<\37\2\u015a\u0158\3\2"+
		"\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7\n\2\2\u0160\u0161\5<"+
		"\37\2\u0161\u0168\3\2\2\2\u0162\u0163\7\b\2\2\u0163\u0164\5<\37\2\u0164"+
		"\u0165\7\n\2\2\u0165\u0166\5<\37\2\u0166\u0168\3\2\2\2\u0167\u014b\3\2"+
		"\2\2\u0167\u014d\3\2\2\2\u0167\u0156\3\2\2\2\u0167\u0162\3\2\2\2\u0168"+
		";\3\2\2\2\u0169\u016a\7\21\2\2\u016a\u016b\58\35\2\u016b\u016c\7\22\2"+
		"\2\u016c\u016d\5> \2\u016d=\3\2\2\2\u016e\u0172\7\23\2\2\u016f\u0171\5"+
		"\6\4\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7\24"+
		"\2\2\u0176?\3\2\2\2\u0177\u0178\7\f\2\2\u0178\u0179\5<\37\2\u0179A\3\2"+
		"\2\2\u017a\u017b\7\r\2\2\u017b\u017c\5> \2\u017c\u017d\7\f\2\2\u017d\u017e"+
		"\7\21\2\2\u017e\u017f\58\35\2\u017f\u0180\7\22\2\2\u0180\u0181\7\31\2"+
		"\2\u0181\u018b\3\2\2\2\u0182\u0183\7\r\2\2\u0183\u0184\5> \2\u0184\u0185"+
		"\7\f\2\2\u0185\u0186\7\21\2\2\u0186\u0187\58\35\2\u0187\u0188\7\22\2\2"+
		"\u0188\u0189\b\"\1\2\u0189\u018b\3\2\2\2\u018a\u017a\3\2\2\2\u018a\u0182"+
		"\3\2\2\2\u018bC\3\2\2\2\u018c\u018d\7\13\2\2\u018d\u018e\7\21\2\2\u018e"+
		"\u018f\5F$\2\u018f\u0190\7\31\2\2\u0190\u0191\5\36\20\2\u0191\u0192\7"+
		"\31\2\2\u0192\u0193\5.\30\2\u0193\u0194\7\22\2\2\u0194\u0195\5> \2\u0195"+
		"E\3\2\2\2\u0196\u0198\5\20\t\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2"+
		"\u0198\u0199\3\2\2\2\u0199\u019a\7;\2\2\u019a\u019b\7,\2\2\u019b\u01a1"+
		"\5\62\32\2\u019c\u019d\7;\2\2\u019d\u01a1\t\b\2\2\u019e\u019f\7;\2\2\u019f"+
		"\u01a1\b$\1\2\u01a0\u0197\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u019e\3\2"+
		"\2\2\u01a1G\3\2\2\2\u01a2\u01a7\7\64\2\2\u01a3\u01a8\5\32\16\2\u01a4\u01a8"+
		"\79\2\2\u01a5\u01a8\7:\2\2\u01a6\u01a8\5$\23\2\u01a7\u01a3\3\2\2\2\u01a7"+
		"\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ae\3\2"+
		"\2\2\u01a9\u01aa\7\64\2\2\u01aa\u01ab\5\20\t\2\u01ab\u01ac\b%\1\2\u01ac"+
		"\u01ae\3\2\2\2\u01ad\u01a2\3\2\2\2\u01ad\u01a9\3\2\2\2\u01aeI\3\2\2\2"+
		"\u01af\u01b0\7\20\2\2\u01b0\u01b1\7\21\2\2\u01b1\u01b2\7;\2\2\u01b2\u01ba"+
		"\7\22\2\2\u01b3\u01b4\7\20\2\2\u01b4\u01b5\7\21\2\2\u01b5\u01b6\7;\2\2"+
		"\u01b6\u01b7\5\16\b\2\u01b7\u01b8\7\22\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01af"+
		"\3\2\2\2\u01b9\u01b3\3\2\2\2\u01baK\3\2\2\2\u01bb\u01bc\7\16\2\2\u01bc"+
		"\u01c0\7\21\2\2\u01bd\u01c1\5N(\2\u01be\u01c1\5\32\16\2\u01bf\u01c1\5"+
		"P)\2\u01c0\u01bd\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c3\7\22\2\2\u01c3\u01ce\3\2\2\2\u01c4\u01c5\7"+
		"\17\2\2\u01c5\u01c9\7\21\2\2\u01c6\u01ca\5N(\2\u01c7\u01ca\5\32\16\2\u01c8"+
		"\u01ca\5P)\2\u01c9\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2"+
		"\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7\22\2\2\u01cc\u01ce\3\2\2\2\u01cd"+
		"\u01bb\3\2\2\2\u01cd\u01c4\3\2\2\2\u01ceM\3\2\2\2\u01cf\u01d0\b(\1\2\u01d0"+
		"\u01d1\79\2\2\u01d1\u01da\3\2\2\2\u01d2\u01d3\f\3\2\2\u01d3\u01d4\7\32"+
		"\2\2\u01d4\u01d9\5N(\4\u01d5\u01d6\f\4\2\2\u01d6\u01d7\7\32\2\2\u01d7"+
		"\u01d9\5\32\16\2\u01d8\u01d2\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d9\u01dc\3"+
		"\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01dbO\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01dd\u01de\b)\1\2\u01de\u01df\5\36\20\2\u01df\u01e5\3\2\2\2"+
		"\u01e0\u01e1\f\4\2\2\u01e1\u01e2\7\32\2\2\u01e2\u01e4\5\36\20\2\u01e3"+
		"\u01e0\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6Q\3\2\2\2\u01e7\u01e5\3\2\2\2\60Y}\u0082\u008b\u008f\u0093\u0097"+
		"\u0099\u00a0\u00ab\u00b6\u00b9\u00ce\u00d6\u00e0\u00e4\u00ee\u00f6\u00ff"+
		"\u0103\u0106\u0110\u0117\u0121\u0123\u012b\u0135\u0138\u0145\u0149\u0153"+
		"\u015c\u0167\u0172\u018a\u0197\u01a0\u01a7\u01ad\u01b9\u01c0\u01c9\u01cd"+
		"\u01d8\u01da\u01e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}