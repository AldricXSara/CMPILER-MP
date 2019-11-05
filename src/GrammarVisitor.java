// Generated from Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declarations(GrammarParser.Function_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#vardecl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl_list(GrammarParser.Vardecl_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GrammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclaration}
	 * labeled alternative in {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(GrammarParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarIdentifierInDeclaration1}
	 * labeled alternative in {@link GrammarParser#var_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdentifierInDeclaration1(GrammarParser.VarIdentifierInDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code VarIdentifierInDeclaration2}
	 * labeled alternative in {@link GrammarParser#var_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdentifierInDeclaration2(GrammarParser.VarIdentifierInDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#array_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_size(GrammarParser.Array_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(GrammarParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(GrammarParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(GrammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(GrammarParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainFunction}
	 * labeled alternative in {@link GrammarParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(GrammarParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFactor}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFactor(GrammarParser.ExprFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionOnly}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOnly(GrammarParser.ExpressionOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFactorNumOpeExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFactorNumOpeExpr(GrammarParser.ExprFactorNumOpeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumOpeExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumOpeExpr(GrammarParser.ExprNumOpeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_factor(GrammarParser.Expression_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalBool}
	 * labeled alternative in {@link GrammarParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBool(GrammarParser.LogicalBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link GrammarParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalBool}
	 * labeled alternative in {@link GrammarParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalBool(GrammarParser.RelationalBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#num_ope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_ope(GrammarParser.Num_opeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unary_ope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_ope(GrammarParser.Unary_opeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#num_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_factor(GrammarParser.Num_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#relational_ope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_ope(GrammarParser.Relational_opeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#logical_ope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_ope(GrammarParser.Logical_opeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantDeclaration}
	 * labeled alternative in {@link GrammarParser#const_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(GrammarParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link GrammarParser#var_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(GrammarParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewAssignment}
	 * labeled alternative in {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewAssignment(GrammarParser.NewAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementOrIncrement}
	 * labeled alternative in {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementOrIncrement(GrammarParser.DecrementOrIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentWithNumOpe}
	 * labeled alternative in {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentWithNumOpe(GrammarParser.AssignmentWithNumOpeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignment_num_ope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_num_ope(GrammarParser.Assignment_num_opeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignment_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_factor(GrammarParser.Assignment_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link GrammarParser#funccall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#actual_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_params(GrammarParser.Actual_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditional_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_factor(GrammarParser.Conditional_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(GrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditional_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_block(GrammarParser.Conditional_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(GrammarParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(GrammarParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(GrammarParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(GrammarParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#for_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_assignment_statement(GrammarParser.For_assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(GrammarParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Scan}
	 * labeled alternative in {@link GrammarParser#scan_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(GrammarParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScanThruArr}
	 * labeled alternative in {@link GrammarParser#scan_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanThruArr(GrammarParser.ScanThruArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link GrammarParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintNewLine}
	 * labeled alternative in {@link GrammarParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintNewLine(GrammarParser.PrintNewLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintString}
	 * labeled alternative in {@link GrammarParser#print_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(GrammarParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintFactorPlusPrintFactor}
	 * labeled alternative in {@link GrammarParser#print_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFactorPlusPrintFactor(GrammarParser.PrintFactorPlusPrintFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintFactorPlusExpr}
	 * labeled alternative in {@link GrammarParser#print_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFactorPlusExpr(GrammarParser.PrintFactorPlusExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print_factor_boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_factor_boolean(GrammarParser.Print_factor_booleanContext ctx);
}