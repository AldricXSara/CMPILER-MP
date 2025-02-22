grammar Grammar;

//program					: function_declarations main_function END_OF_FILE;
program						: function_declarations main_function;
function_declarations		: function_declaration*;

WS: [ \t\r\n]+ -> skip;
//COMMENT: ( '(*' *? '*)' ) -> skip;

// Main Statements
statement					
	: vardecl_list 
	| const_statement LINE_END
	| const_statement 			{notifyErrorListeners("Insert ';' to complete statement.");}
	| assignment_statement LINE_END
	| funccall_statement LINE_END
	| if_statement
	| while_statement
	| do_while_statement
	| for_statement
	| return_statement LINE_END
	| scan_statement LINE_END
	| scan_statement 			{notifyErrorListeners("Insert ';' to complete statement.");}
	| print_statement LINE_END
	| print_statement 			{notifyErrorListeners("Insert ';' to complete statement.");}
	| COMMENT_BLOCK
	;


 // Variable Declaration       
vardecl_list 				
	: var_decl LINE_END (vardecl_list)?
	;
var_decl					
	: data_type (var_identifier_list) #VariableDeclaration
	| data_type (array_size) VARIABLE_IDENTIFIER /*var_assignment_statement?*/ #ArrayDeclaration
	 //array not considering  enumeration
	;
	 
var_identifier_list			
	: VARIABLE_IDENTIFIER var_assignment_statement? ENUMERATION (var_identifier_list)? #VarIdentifierInDeclaration1
	| VARIABLE_IDENTIFIER var_assignment_statement? #VarIdentifierInDeclaration2
	;
array_size					
	: ARRAY_SIZE_DELIMETER (INTEGER_LITERAL | VARIABLE_IDENTIFIER) //added
	| ARRAY_SIZE_DELIMETER FLOAT_LITERAL {notifyErrorListeners("Invalid Array Size! Change array size to an integer value.");} 
	;
data_type					
	: INT_DTYPE
	| FLOAT_DTYPE
	| CHAR_DTYPE
	| STRING_DTYPE
	| BOOLEAN_DTYPE
	;


// Function Declaration
function_declaration 		
	: data_type FUNCTION_IDENTIFIER function_block
	| VOID FUNCTION_IDENTIFIER function_block; 
/*
parameters	     			
	: data_type VARIABLE_IDENTIFIER (ENUMERATION parameters)?;

function_block				
	: OPEN_PAR (parameters*)? CLOSE_PAR code_block;
*/
parameters:
	data_type VARIABLE_IDENTIFIER;
	
function_block				
	: OPEN_PAR (parameters (ENUMERATION parameters)*)? CLOSE_PAR code_block;
main_function	     		
	: VOID MAIN_FUNC OPEN_PAR CLOSE_PAR code_block #MainFunction;

expression
	: OPEN_PAR expression CLOSE_PAR #ExpressionOnly
	| expression_factor num_ope expression #ExprFactorNumOpeExpr
	| expression num_ope expression #ExprNumOpeExpr
	| expression_factor #ExprFactor
	; 
	
expression_factor
	: STRING_LITERAL 
	| num_factor 
	| BOOLEAN_LITERAL 
	| funccall_statement 
	| VARIABLE_IDENTIFIER 
	| VARIABLE_IDENTIFIER array_size
	;

bool_expression
	: (NOT_OPE)? OPEN_PAR bool_expression CLOSE_PAR #Bool
	| bool_expression logical_ope bool_expression #LogicalBool
	| expression relational_ope expression #RelationalBool
	//| print_factor relational_ope expression #StringVsString
	;

num_ope						
	: ADDITION_OPE
	| SUBTRACTION_OPE
	| MULTIPLICATION_OPE
	| DIVISION_OPE 
	| MODULO_OPE;
unary_ope					
	: '+' | '-';
num_factor					
	: CHAR_LITERAL  
	| (unary_ope)? INTEGER_LITERAL
	| (unary_ope)? FLOAT_LITERAL 
	;

relational_ope				
	: LESS_THAN_OPE				
	| LESS_THAN_EQUAL_TO_OPE
	| GREATER_THAN_OPE			
	| GREATER_THAN_EQUAL_TO_OPE	
	| EQUAL_OPE					
	| NOT_EQUAL_OPE
	;
logical_ope					
	: AND_OPE
	| OR_OPE
	;
													
// Statements

const_statement				
	: CONSTANT_KEYWORD data_type VARIABLE_IDENTIFIER var_assignment_statement? #ConstantDeclaration;							
var_assignment_statement	
	: ASSIGNMENT_OPE assignment_factor #VarAssignment; 
assignment_statement		
	: VARIABLE_IDENTIFIER (array_size)? ASSIGNMENT_OPE assignment_factor #NewAssignment //added here
	| VARIABLE_IDENTIFIER (INCREMENT_OPE | DECREMENT_OPE)  #DecrementOrIncrement
	| VARIABLE_IDENTIFIER assignment_num_ope (expression | STRING_LITERAL) #AssignmentWithNumOpe
	;
assignment_num_ope
	: ADDITION_ASSIGNMENT_OPE
	| SUBTRACTION_ASSIGNMENT_OPE
	| MULTIPLICATION_ASSIGNMENT_OPE
	| DIVISION_ASSIGNMENT_OPE
	| ADDITION_ASSIGNMENT_OPE
	;
assignment_factor			
	: expression
	//| num_factor deleted talaga
	| STRING_LITERAL
	| BOOLEAN_LITERAL
	| bool_expression //added
	;
funccall_statement       	
	: FUNCTION_CALL FUNCTION_IDENTIFIER OPEN_PAR (actual_params (ENUMERATION actual_params)*)? CLOSE_PAR #FunctionCall
	 
//	| FUNCTION_CALL FUNCTION_IDENTIFIER OPEN_PAR (actual_parameter_list)? CLOSE_PAR (CLOSE_PAR)+
//		{notifyErrorListeners ("Uneven Parenthesis. Remove extra ')'. ");}
//	
//	| FUNCTION_CALL FUNCTION_IDENTIFIER OPEN_PAR (OPEN_PAR)+ (actual_parameter_list)? CLOSE_PAR
//		{notifyErrorListeners ("Uneven Parenthesis. Remove extra '('. ");}			
//	| FUNCTION_CALL FUNCTION_IDENTIFIER (actual_parameter_list)? CLOSE_PAR
//	{notifyErrorListeners ("Missing parenthesis. Try adding '('. ");}
	;
/* 
actual_parameter_list    	
	: actual_params;
*/
actual_params	         	
	: VARIABLE_IDENTIFIER ENUMERATION actual_params
	| VARIABLE_IDENTIFIER
    | expression ENUMERATION actual_params
    | expression 
    ;

conditional_factor			
	: bool_expression
	| BOOLEAN_LITERAL
	;
if_statement				
	: IF_CONDITIONAL conditional_block
	| IF_CONDITIONAL conditional_block (ELSE_IF_CONDITIONAL conditional_block)*
	| IF_CONDITIONAL conditional_block (ELSE_IF_CONDITIONAL conditional_block)* ELSE_CONDITIONAL conditional_block
	| IF_CONDITIONAL conditional_block ELSE_CONDITIONAL conditional_block;

conditional_block			
	: OPEN_PAR conditional_factor CLOSE_PAR code_block
	;
	
code_block					
	: L_CBRACKET (statement)* R_CBRACKET;
	
while_statement				
	: WHILE_LOOP conditional_block;
	
do_while_statement			
	: DO_LOOP code_block WHILE_LOOP OPEN_PAR conditional_factor CLOSE_PAR LINE_END
	| DO_LOOP code_block WHILE_LOOP OPEN_PAR conditional_factor CLOSE_PAR {notifyErrorListeners("Insert ';' to complete statement'");} 
	;

for_statement
	: FOR_LOOP OPEN_PAR 
	(for_assignment_statement) LINE_END 
	bool_expression LINE_END assignment_statement CLOSE_PAR code_block
	;
	
for_assignment_statement		
	: data_type? VARIABLE_IDENTIFIER ASSIGNMENT_OPE assignment_factor
	| VARIABLE_IDENTIFIER (INCREMENT_OPE | DECREMENT_OPE)
	| VARIABLE_IDENTIFIER {notifyErrorListeners("Variable must be initialized!");} 
	;

return_statement			
	: RETURN (expression| STRING_LITERAL | BOOLEAN_LITERAL | num_factor)
	| RETURN data_type {notifyErrorListeners("Invalid return type! Replace with a data type value or expression.");} 
	;
scan_statement				
	: SCAN OPEN_PAR VARIABLE_IDENTIFIER CLOSE_PAR #Scan
	| SCAN OPEN_PAR VARIABLE_IDENTIFIER array_size CLOSE_PAR #ScanThruArr
	; 

print_statement				
	: PRINT OPEN_PAR (print_factor| expression | print_factor_boolean) CLOSE_PAR #Print
	| PRINT_NL OPEN_PAR (print_factor| expression | print_factor_boolean) CLOSE_PAR #PrintNewLine
	| PRINT OPEN_PAR (STRING_LITERAL ',' (expression | print_factor | print_factor_boolean)) CLOSE_PAR #PrintStringWithVariable
	| PRINT_NL OPEN_PAR (STRING_LITERAL ',' (expression | print_factor | print_factor_boolean)) CLOSE_PAR #PrintNewLineStringWithVariable
	;
 
print_factor
	: STRING_LITERAL #PrintString
	| print_factor ADDITION_OPE expression #PrintFactorPlusExpr
	| print_factor ADDITION_OPE print_factor #PrintFactorPlusPrintFactor;
	
print_factor_boolean
	: print_factor_boolean ADDITION_OPE bool_expression
	| bool_expression
	;

INT_DTYPE:						'digeetz';
FLOAT_DTYPE:					'sabaw';
CHAR_DTYPE:						'bidabida';
STRING_DTYPE: 					'barkada';
BOOLEAN_DTYPE: 					'weh';

IF_CONDITIONAL: 				'ha';
ELSE_IF_CONDITIONAL: 			'etonalang';
ELSE_CONDITIONAL: 				'hatdog';

FOR_LOOP: 						'bestloopimo';
WHILE_LOOP: 					'mehloopimo';
DO_LOOP: 						'worstloopimo';

PRINT: 							'allchat';
PRINT_NL: 						'allchatln';
SCAN: 							'typehere';

OPEN_PAR: 						'(';
CLOSE_PAR: 						')';
L_CBRACKET: 					'{';
R_CBRACKET: 					'}';
L_BRACKET: 						'[';
R_BRACKET: 						']';
ENUMERATION:					',';
COMMENT_BLOCK:					'/*'.*?'*/' ->skip;
LINE_END: 						';';

ADDITION_OPE					: '+';
SUBTRACTION_OPE					: '-';
MULTIPLICATION_OPE				: '*';
DIVISION_OPE					: '/';
ADDITION_ASSIGNMENT_OPE			: '+=';
SUBTRACTION_ASSIGNMENT_OPE		: '-=';
MULTIPLICATION_ASSIGNMENT_OPE 	: '*=';
DIVISION_ASSIGNMENT_OPE			: '/=';
MODULO_ASSIGNMENT_OPE			: '%=';
MODULO_OPE						: '%';
LESS_THAN_OPE					: '<';
LESS_THAN_EQUAL_TO_OPE			: '<=';
GREATER_THAN_OPE				: '>';
GREATER_THAN_EQUAL_TO_OPE		: '>=';
EQUAL_OPE						: '==';
NOT_EQUAL_OPE					: '!=';
INCREMENT_OPE					: '++';
DECREMENT_OPE   				: '--';
ASSIGNMENT_OPE					: '='; 
AND_OPE							: 'AND';
OR_OPE							: 'OR';
NOT_OPE							: 'NOT';

ARRAY_SIZE_DELIMETER			: '#';
CONSTANT_KEYWORD				: 'consistent';
FUNCTION_CALL					: 'shoutout';
MAIN_FUNC						: 'startHere';
RETURN							: 'uwina';
VOID							: 'walangibabalik';

INTEGER_LITERAL					: [0-9]+;
FLOAT_LITERAL					: INTEGER_LITERAL? '.'? [0-9]+? 'f'?;
CHAR_LITERAL					: '\'' . '\'';
STRING_LITERAL					: '"' .*? '"';
BOOLEAN_LITERAL					: 'yep' | 'nope' ; 
VARIABLE_IDENTIFIER				: '_'? ALPHABET_LITERAL MIXED_LITERAL*;
FUNCTION_IDENTIFIER				: '_'? ALPHABET_LITERAL MIXED_LITERAL*;

ALPHABET_LITERAL				: [a-z]|[A-Z];
MIXED_LITERAL					: ALPHABET_LITERAL|[0-9]|'_';

HT_NL_CR						: [\t\n\r]+ -> skip ; // skip spaces, tabs, newlines
END_OF_FILE 					: 'EOF';
