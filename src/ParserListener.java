import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class ParserListener extends GrammarBaseListener {
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(GrammarParser.ProgramContext ctx) {
		System.out.println("enterProgram");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(GrammarParser.ProgramContext ctx) { 
		System.out.println("exitProgram");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(GrammarParser.StatementContext ctx) {
		System.out.println("enterStatement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(GrammarParser.StatementContext ctx) {
		System.out.println("exitStatement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVardecl_list(GrammarParser.Vardecl_listContext ctx) {
		System.out.println("enterVardecl_list");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVardecl_list(GrammarParser.Vardecl_listContext ctx) { 
		System.out.println("exitVardecl_list");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArray_size(GrammarParser.Array_sizeContext ctx) {
		System.out.println("enterArray_size");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArray_size(GrammarParser.Array_sizeContext ctx) {
		System.out.println("exitArray_size");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterData_type(GrammarParser.Data_typeContext ctx) {
		System.out.println("enterData_type");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitData_type(GrammarParser.Data_typeContext ctx) {
		System.out.println("exitData_type");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunction_declaration(GrammarParser.Function_declarationContext ctx) {
		System.out.println("enterFunction_declaration");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction_declaration(GrammarParser.Function_declarationContext ctx) {
		System.out.println("exitFunction_declaration");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParameters(GrammarParser.ParametersContext ctx) { 
		System.out.println("enterParameters");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameters(GrammarParser.ParametersContext ctx) {
		System.out.println("exitParameters");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunction_block(GrammarParser.Function_blockContext ctx) {
		System.out.println("enterFunction_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction_block(GrammarParser.Function_blockContext ctx) {
		System.out.println("exitFunction_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNum_ope(GrammarParser.Num_opeContext ctx) {
		System.out.println("enterNum_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNum_ope(GrammarParser.Num_opeContext ctx) {
		System.out.println("exitNum_ope");
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnary_ope(GrammarParser.Unary_opeContext ctx) { 
		System.out.println("enterUnary_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnary_ope(GrammarParser.Unary_opeContext ctx) {
		System.out.println("exitUnary_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNum_factor(GrammarParser.Num_factorContext ctx) { System.out.println("enterNum_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRelational_ope(GrammarParser.Relational_opeContext ctx) { 
		System.out.println("enterRelational_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelational_ope(GrammarParser.Relational_opeContext ctx) {
		System.out.println("exitRelational_ope");
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLogical_ope(GrammarParser.Logical_opeContext ctx) {
		System.out.println("enterLogical_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLogical_ope(GrammarParser.Logical_opeContext ctx) { 
		System.out.println("exitLogical_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment_factor(GrammarParser.Assignment_factorContext ctx) {
		System.out.println("enterAssignment_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment_factor(GrammarParser.Assignment_factorContext ctx) {
		System.out.println("exitAssignment_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActual_params(GrammarParser.Actual_paramsContext ctx) { 
		System.out.println("enterActual_params");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActual_params(GrammarParser.Actual_paramsContext ctx) {
		System.out.println("exitActual_params");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditional_factor(GrammarParser.Conditional_factorContext ctx) {
		System.out.println("enterConditional_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditional_factor(GrammarParser.Conditional_factorContext ctx) {
		System.out.println("exitConditional_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIf_statement(GrammarParser.If_statementContext ctx) {
		System.out.println("enterIf_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIf_statement(GrammarParser.If_statementContext ctx) {
		System.out.println("exitIf_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditional_block(GrammarParser.Conditional_blockContext ctx) {
		System.out.println("enterConditional_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditional_block(GrammarParser.Conditional_blockContext ctx) {
		System.out.println("exitConditional_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCode_block(GrammarParser.Code_blockContext ctx) { 
		System.out.println("enterCode_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCode_block(GrammarParser.Code_blockContext ctx) { 
		System.out.println("exitCode_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhile_statement(GrammarParser.While_statementContext ctx) {
		System.out.println("enterWhile_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhile_statement(GrammarParser.While_statementContext ctx) {
		System.out.println("exitWhile_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDo_while_statement(GrammarParser.Do_while_statementContext ctx) { 
		System.out.println("enterDo_while_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDo_while_statement(GrammarParser.Do_while_statementContext ctx) {
		System.out.println("exitDo_while_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFor_statement(GrammarParser.For_statementContext ctx) {
		System.out.println("enterFor_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFor_statement(GrammarParser.For_statementContext ctx) {
		System.out.println("exitFor_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturn_statement(GrammarParser.Return_statementContext ctx) {
		System.out.println("enterReturn_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturn_statement(GrammarParser.Return_statementContext ctx) {
		System.out.println("exitReturn_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { 
		System.out.println("enterEveryRule");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) {
		System.out.println("exitEveryRule");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { 
		System.out.println("visitTerminal");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { 
		System.out.println("visitErrorNode");
	}

}