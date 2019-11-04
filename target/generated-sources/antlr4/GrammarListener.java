// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code RelationalBool}
	 * labeled alternative in {@link GrammarParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalBool(@NotNull GrammarParser.RelationalBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalBool}
	 * labeled alternative in {@link GrammarParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalBool(@NotNull GrammarParser.RelationalBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantDeclaration}
	 * labeled alternative in {@link GrammarParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(@NotNull GrammarParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantDeclaration}
	 * labeled alternative in {@link GrammarParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(@NotNull GrammarParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#logical_ope}.
	 * @param ctx the parse tree
	 */
	void enterLogical_ope(@NotNull GrammarParser.Logical_opeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#logical_ope}.
	 * @param ctx the parse tree
	 */
	void exitLogical_ope(@NotNull GrammarParser.Logical_opeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintFactorPlusExpr}
	 * labeled alternative in {@link GrammarParser#print_factor}.
	 * @param ctx the parse tree
	 */
	void enterPrintFactorPlusExpr(@NotNull GrammarParser.PrintFactorPlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintFactorPlusExpr}
	 * labeled alternative in {@link GrammarParser#print_factor}.
	 * @param ctx the parse tree
	 */
	void exitPrintFactorPlusExpr(@NotNull GrammarParser.PrintFactorPlusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#relational_ope}.
	 * @param ctx the parse tree
	 */
	void enterRelational_ope(@NotNull GrammarParser.Relational_opeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#relational_ope}.
	 * @param ctx the parse tree
	 */
	void exitRelational_ope(@NotNull GrammarParser.Relational_opeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void enterNum_factor(@NotNull GrammarParser.Num_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void exitNum_factor(@NotNull GrammarParser.Num_factorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link GrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link GrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(@NotNull GrammarParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(@NotNull GrammarParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print_factor_boolean}.
	 * @param ctx the parse tree
	 */
	void enterPrint_factor_boolean(@NotNull GrammarParser.Print_factor_booleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print_factor_boolean}.
	 * @param ctx the parse tree
	 */
	void exitPrint_factor_boolean(@NotNull GrammarParser.Print_factor_booleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link GrammarParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull GrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link GrammarParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull GrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MainFunction}
	 * labeled alternative in {@link GrammarParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(@NotNull GrammarParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MainFunction}
	 * labeled alternative in {@link GrammarParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(@NotNull GrammarParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment_num_ope}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_num_ope(@NotNull GrammarParser.Assignment_num_opeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment_num_ope}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_num_ope(@NotNull GrammarParser.Assignment_num_opeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull GrammarParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull GrammarParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link GrammarParser#var_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(@NotNull GrammarParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link GrammarParser#var_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(@NotNull GrammarParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#array_size}.
	 * @param ctx the parse tree
	 */
	void enterArray_size(@NotNull GrammarParser.Array_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#array_size}.
	 * @param ctx the parse tree
	 */
	void exitArray_size(@NotNull GrammarParser.Array_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull GrammarParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull GrammarParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclaration}
	 * labeled alternative in {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(@NotNull GrammarParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclaration}
	 * labeled alternative in {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(@NotNull GrammarParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewAssignment}
	 * labeled alternative in {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterNewAssignment(@NotNull GrammarParser.NewAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewAssignment}
	 * labeled alternative in {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitNewAssignment(@NotNull GrammarParser.NewAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression_factor}.
	 * @param ctx the parse tree
	 */
	void enterExpression_factor(@NotNull GrammarParser.Expression_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression_factor}.
	 * @param ctx the parse tree
	 */
	void exitExpression_factor(@NotNull GrammarParser.Expression_factorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFactor}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFactor(@NotNull GrammarParser.ExprFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFactor}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFactor(@NotNull GrammarParser.ExprFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionOnly}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOnly(@NotNull GrammarParser.ExpressionOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionOnly}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOnly(@NotNull GrammarParser.ExpressionOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#num_ope}.
	 * @param ctx the parse tree
	 */
	void enterNum_ope(@NotNull GrammarParser.Num_opeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#num_ope}.
	 * @param ctx the parse tree
	 */
	void exitNum_ope(@NotNull GrammarParser.Num_opeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(@NotNull GrammarParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(@NotNull GrammarParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalBool}
	 * labeled alternative in {@link GrammarParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBool(@NotNull GrammarParser.LogicalBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalBool}
	 * labeled alternative in {@link GrammarParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBool(@NotNull GrammarParser.LogicalBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecrementOrIncrement}
	 * labeled alternative in {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterDecrementOrIncrement(@NotNull GrammarParser.DecrementOrIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecrementOrIncrement}
	 * labeled alternative in {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitDecrementOrIncrement(@NotNull GrammarParser.DecrementOrIncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#for_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_assignment_statement(@NotNull GrammarParser.For_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#for_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_assignment_statement(@NotNull GrammarParser.For_assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unary_ope}.
	 * @param ctx the parse tree
	 */
	void enterUnary_ope(@NotNull GrammarParser.Unary_opeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unary_ope}.
	 * @param ctx the parse tree
	 */
	void exitUnary_ope(@NotNull GrammarParser.Unary_opeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull GrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull GrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarIdentifierInDeclaration2}
	 * labeled alternative in {@link GrammarParser#var_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVarIdentifierInDeclaration2(@NotNull GrammarParser.VarIdentifierInDeclaration2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code VarIdentifierInDeclaration2}
	 * labeled alternative in {@link GrammarParser#var_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVarIdentifierInDeclaration2(@NotNull GrammarParser.VarIdentifierInDeclaration2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Scan}
	 * labeled alternative in {@link GrammarParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void enterScan(@NotNull GrammarParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Scan}
	 * labeled alternative in {@link GrammarParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void exitScan(@NotNull GrammarParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarIdentifierInDeclaration1}
	 * labeled alternative in {@link GrammarParser#var_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVarIdentifierInDeclaration1(@NotNull GrammarParser.VarIdentifierInDeclaration1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code VarIdentifierInDeclaration1}
	 * labeled alternative in {@link GrammarParser#var_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVarIdentifierInDeclaration1(@NotNull GrammarParser.VarIdentifierInDeclaration1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull GrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull GrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(@NotNull GrammarParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(@NotNull GrammarParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void enterActual_params(@NotNull GrammarParser.Actual_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void exitActual_params(@NotNull GrammarParser.Actual_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment_factor}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_factor(@NotNull GrammarParser.Assignment_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment_factor}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_factor(@NotNull GrammarParser.Assignment_factorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentWithNumOpe}
	 * labeled alternative in {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentWithNumOpe(@NotNull GrammarParser.AssignmentWithNumOpeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentWithNumOpe}
	 * labeled alternative in {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentWithNumOpe(@NotNull GrammarParser.AssignmentWithNumOpeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintFactorPlusPrintFactor}
	 * labeled alternative in {@link GrammarParser#print_factor}.
	 * @param ctx the parse tree
	 */
	void enterPrintFactorPlusPrintFactor(@NotNull GrammarParser.PrintFactorPlusPrintFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintFactorPlusPrintFactor}
	 * labeled alternative in {@link GrammarParser#print_factor}.
	 * @param ctx the parse tree
	 */
	void exitPrintFactorPlusPrintFactor(@NotNull GrammarParser.PrintFactorPlusPrintFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull GrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull GrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link GrammarParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull GrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link GrammarParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull GrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void enterVardecl_list(@NotNull GrammarParser.Vardecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void exitVardecl_list(@NotNull GrammarParser.Vardecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(@NotNull GrammarParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(@NotNull GrammarParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditional_block}.
	 * @param ctx the parse tree
	 */
	void enterConditional_block(@NotNull GrammarParser.Conditional_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditional_block}.
	 * @param ctx the parse tree
	 */
	void exitConditional_block(@NotNull GrammarParser.Conditional_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFactorNumOpeExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFactorNumOpeExpr(@NotNull GrammarParser.ExprFactorNumOpeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFactorNumOpeExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFactorNumOpeExpr(@NotNull GrammarParser.ExprFactorNumOpeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumOpeExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNumOpeExpr(@NotNull GrammarParser.ExprNumOpeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumOpeExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNumOpeExpr(@NotNull GrammarParser.ExprNumOpeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScanThruArr}
	 * labeled alternative in {@link GrammarParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void enterScanThruArr(@NotNull GrammarParser.ScanThruArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScanThruArr}
	 * labeled alternative in {@link GrammarParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void exitScanThruArr(@NotNull GrammarParser.ScanThruArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull GrammarParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull GrammarParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintString}
	 * labeled alternative in {@link GrammarParser#print_factor}.
	 * @param ctx the parse tree
	 */
	void enterPrintString(@NotNull GrammarParser.PrintStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintString}
	 * labeled alternative in {@link GrammarParser#print_factor}.
	 * @param ctx the parse tree
	 */
	void exitPrintString(@NotNull GrammarParser.PrintStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(@NotNull GrammarParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(@NotNull GrammarParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditional_factor}.
	 * @param ctx the parse tree
	 */
	void enterConditional_factor(@NotNull GrammarParser.Conditional_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditional_factor}.
	 * @param ctx the parse tree
	 */
	void exitConditional_factor(@NotNull GrammarParser.Conditional_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declarations(@NotNull GrammarParser.Function_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declarations(@NotNull GrammarParser.Function_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintNewLine}
	 * labeled alternative in {@link GrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintNewLine(@NotNull GrammarParser.PrintNewLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintNewLine}
	 * labeled alternative in {@link GrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintNewLine(@NotNull GrammarParser.PrintNewLineContext ctx);
}