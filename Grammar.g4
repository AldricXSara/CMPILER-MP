grammar Grammar;

data_type					
	: INT_DTYPE
	| FLOAT_DTYPE
	| CHAR_DTYPE
	| STRING_DTYPE
	| BOOLEAN_DTYPE
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
COMMENT_BLOCK:					'//' ->skip;
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
ASSINGMENT_OPE					: '='; 
AND_OPE							: 'AND';
OR_OPE							: 'OR';
NOT_OPE							: 'NOT';

HT_NL_CR:						[\t\n\r]+ -> skip ; // skip spaces, tabs, newlines
