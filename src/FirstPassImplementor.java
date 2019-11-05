import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/***
 * 
 * Adds the functions (params, return value)
 * Adds variables to symbol table
 *
 */

public class FirstPassImplementor extends GrammarBaseVisitor<GrammarValue>{
	//Function Declaration
	
	private GrammarInterpreter interpreter;
	private Stack<Scope> scopes;
	private GrammarSemanticErrors semanticErrors;
	private ArrayList<GrammarFunction> definedFuncs;
	
	private String currFuncIdentifier;
	private String currFuncReturnType;
	private String currScope;
	private String currVarIdentifier;
	private String currVarDataType;
	private boolean isCurrVarConstant;
	
	
	public FirstPassImplementor(GrammarInterpreter interpreter){
		this.interpreter = interpreter;
		this.scopes = interpreter.getScopes();
		this.semanticErrors = interpreter.getSemanticErrors();
		definedFuncs = interpreter.getDefinedFuncs();
		
		currScope = null;
	}
	
	//Add Variable to ST
	public void addVarToSymbolTable(String value){
		GrammarValue val = null;
		val = new GrammarValue(value, currVarDataType, 
				semanticErrors);
		val.setIdentifier(currVarIdentifier);
		
		if(isCurrVarConstant){
			val.setConstantFlag(true);
			System.out.println("Val marked as constant!");
		}

		if(val.getDataType() != null){
			scopes.peek().addToSymbolTable(val);
			System.out.println("Added Var " + val.getIdentifier() + " to Symbol Table Successfully!");
		}
	}
	
	//Add Parameter Var to ST
	public void addParamAsVarToSymbolTable(GrammarValue val){		
		if(isCurrVarConstant){
			val.setConstantFlag(true);
			System.out.println("Val marked as constant!");
		}

		if(val.getDataType() != null){
			scopes.peek().addToSymbolTable(val);
			System.out.println("Added Var " + val.getIdentifier() + " to Symbol Table Successfully!");
		}
	}
	
	//Add Array to ST
	public void addArrToSymbolTable(GrammarArray arr){
		scopes.peek().addToSymbolTable(arr);
		System.out.println("Added Arr to Symbol Table Successfully!");
	}
	
	//Function Declaration
	@Override
	public GrammarValue visitFunction_declaration(GrammarParser.Function_declarationContext ctx){
		if(interpreter.findScope(ctx.FUNCTION_IDENTIFIER().getText()) != null){
			semanticErrors.setSpecificIdentifier(ctx.FUNCTION_IDENTIFIER().getText());
			semanticErrors.addError(ctx.getStart().getLine() + "", ctx.getStart().getCharPositionInLine() + "",
					SemanticErrors.MULTIPLE_FUNC_DECLARATION
					);	
			
			
		}
		//Push to scope even if it's already defined.
			currFuncIdentifier = ctx.FUNCTION_IDENTIFIER().getText();
			
			//Check if there's a return statement
			List<GrammarParser.StatementContext> statements = ctx.function_block().code_block().statement();
			boolean isReturn = false;
			int line = 0;
			String charPositionInLine = "";
			
			for(int i = 0; i < statements.size(); i++){
				if(statements.get(i).return_statement() != null)
					isReturn = true;
				
				line = statements.get(i).getStop().getLine();
				charPositionInLine = statements.get(i).getStop().getCharPositionInLine() + "";
			}

			if(ctx.VOID() != null){
				currFuncReturnType = ctx.VOID().getText();
				//Check if there's a return statement
				if(isReturn){
					semanticErrors.setSpecificIdentifier(currFuncIdentifier);
					semanticErrors.addError(line + "", charPositionInLine, SemanticErrors.UNEXPECTING_RETURN);				
				}					
			}
			else{
				currFuncReturnType = ctx.data_type().getText();
				//Check if there's a return statement
				if(!isReturn){
					semanticErrors.setSpecificIdentifier(currFuncIdentifier);
					semanticErrors.addError(line+1 + "", charPositionInLine, SemanticErrors.EXPECTING_RETURN);				
				}

			}

			List<GrammarParser.ParametersContext> parameters = ctx.function_block().parameters();
			ArrayList<GrammarValue> arrayParameters = new ArrayList<GrammarValue>();
			GrammarValue val = null;
			
			if(parameters != null){
				for(GrammarParser.ParametersContext parameter : parameters){
					
					val = new GrammarValue(null, parameter.data_type().getText(),
							semanticErrors);
					val.setIdentifier(parameter.VARIABLE_IDENTIFIER().getText());
					arrayParameters.add(val);
					
				}	
			}
			
			System.out.println("Function Name: " + currFuncIdentifier);
			System.out.println("Return Type: " + currFuncReturnType);
			System.out.println("Parent: " + currScope);
			GrammarFunction func = new GrammarFunction(currFuncReturnType, arrayParameters, semanticErrors);
			func.setIdentifier(currFuncIdentifier);
			
			//Add function in arraylist and scopes
			definedFuncs.add(func);
			scopes.push(new Scope(ctx.FUNCTION_IDENTIFIER().getText(), null));
			
			//Add params to ST
			for(int i = 0; i < arrayParameters.size(); i++){
				addParamAsVarToSymbolTable(arrayParameters.get(i));				
			}
			
			currScope = currFuncIdentifier;
		

		return visitChildren(ctx); 
	}
	
	//Variable Declaration (Data Type)
	@Override 
	public GrammarValue visitVariableDeclaration(GrammarParser.VariableDeclarationContext ctx) 
	{ 
		isCurrVarConstant = false; 
		//System.out.println("Data Type: " + ctx.data_type().getText());
		currVarDataType = ctx.data_type().getText(); //get data type of variable

		return visitChildren(ctx); 
	}
	
	//Array Declaration
	@Override 
	public GrammarValue visitArrayDeclaration(GrammarParser.ArrayDeclarationContext ctx) 
	{ 
		if((scopes.peek().getAnArr(ctx.VARIABLE_IDENTIFIER().getText())) == null){
			if(ctx.array_size().INTEGER_LITERAL() != null){
				int size = Integer.parseInt(ctx.array_size().INTEGER_LITERAL().getText());
				GrammarArray arr = new GrammarArray (size, ctx.data_type().getText(), ctx.VARIABLE_IDENTIFIER().getText());
				arr.setIdentifier(ctx.VARIABLE_IDENTIFIER().getText());
				addArrToSymbolTable(arr);
			}else{
				//TODO
				//temp yung 1 pls change
				GrammarArray arr = new GrammarArray (1, ctx.data_type().getText(), ctx.VARIABLE_IDENTIFIER().getText());
				arr.setIdentifier(ctx.VARIABLE_IDENTIFIER().getText());
				addArrToSymbolTable(arr);
			}
		}else{
			//Array is already defined
			//System.out.println("Declared Array: " + ctx.VARIABLE_IDENTIFIER().getText());
			semanticErrors.setSpecificIdentifier(ctx.VARIABLE_IDENTIFIER().getText());
			semanticErrors.addError(ctx.getStart().getLine() + "", 
					ctx.getStart().getCharPositionInLine() + "", 
					SemanticErrors.MULTIPLE_VAR_DECLARATION);
		}

		return visitChildren(ctx); 
	}
	
	//Variable Declaration (Identifier)
	@Override 
	public GrammarValue visitVarIdentifierInDeclaration1(GrammarParser.VarIdentifierInDeclaration1Context ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		//System.out.println("Value Identifier1: " + currVarIdentifier);
		if(scopes.peek().getAVar(currVarIdentifier) != null){
			semanticErrors.setSpecificIdentifier(currVarIdentifier);
			semanticErrors.addError(ctx.getStart().getLine() + "", 
					ctx.getStart().getCharPositionInLine() + "", 
					SemanticErrors.MULTIPLE_VAR_DECLARATION);
		}
		
		return visitChildren(ctx); 
	}
	
	//Variable Declaration w/ No Assignment
	@Override 
	public GrammarValue visitVarIdentifierInDeclaration2(GrammarParser.VarIdentifierInDeclaration2Context ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		//System.out.println("Value Identifier2: " + currVarIdentifier);
		if((scopes.peek().getAVar(currVarIdentifier)) != null){
			semanticErrors.setSpecificIdentifier(currVarIdentifier);
			semanticErrors.addError(ctx.getStart().getLine() + "", 
					ctx.getStart().getCharPositionInLine() + "", 
					SemanticErrors.MULTIPLE_VAR_DECLARATION);
		}else if (ctx.var_assignment_statement() == null){ //no assignment
			addVarToSymbolTable(null);
		}

		return visitChildren(ctx); 
	}
	
	//Variable Assignment
	@Override 
	public GrammarValue visitVarAssignment(GrammarParser.VarAssignmentContext ctx) 
	{ 
		GrammarValue val = null;

		if(ctx.assignment_factor() != null){
			//attach line numbers & char position in line
			semanticErrors.setLine(ctx.getStart().getLine() + "");
			semanticErrors.setCharPositionInLine(ctx.getStart().getCharPositionInLine() + "");
			val = new GrammarValue(null, currVarDataType, 
					semanticErrors);
			//System.out.println("VAR ASSIGNENT: " + currVarIdentifier);
			addVarToSymbolTable(ctx.assignment_factor().getText());
			//System.out.println("Value: " + ctx.assignment_factor().getText());
		}

		return visitChildren(ctx); 
	}
	
	//Constant Declaration
	@Override public GrammarValue visitConstantDeclaration(GrammarParser.ConstantDeclarationContext ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		currVarDataType = ctx.data_type().getText(); //get data type of constant variable
		isCurrVarConstant = true;
		//System.out.println("Value Identifier of Constant: " + currVarIdentifier);
		

		return visitChildren(ctx); 
	}
	
	//New Assignment
	@Override public GrammarValue visitNewAssignment(GrammarParser.NewAssignmentContext ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		GrammarValue variable = scopes.peek().getAVar(currVarIdentifier);
		
			
		//Check for constant re-assignment
		if((variable != null) && (variable.isConstantFlag() == true))
		{
			semanticErrors.addError(ctx.getStart().getLine() + "", ctx.getStart().getCharPositionInLine() + "", SemanticErrors.CONSTANT_REASSIGNMENT);
		}else{
			//Assign new value
			GrammarValue newVal = null;
			
			if(ctx.assignment_factor().expression() != null){
				newVal = this.visit(ctx.assignment_factor().expression());
				//System.out.println("NEW VAL:" + newVal);
				//System.out.println("VALUE:" + variable.getValue().toString());
			}
			//TODO dagdag pa
			
			//System.out.println(ctx.assignment_factor().expression().getText());
			
			//Check if array
			if(ctx.array_size() != null){
				int index;
				if(ctx.array_size().VARIABLE_IDENTIFIER() != null){
					//access index thru a var
					index  =(Integer)scopes.peek().getAVar(ctx.array_size().VARIABLE_IDENTIFIER().getText()).getValue();
				}else{
					index = Integer.parseInt(ctx.array_size().INTEGER_LITERAL().getText());
				}
				
				DataType dataType = scopes.peek().getAnArr(currVarIdentifier).getDataType();
			
				if(newVal != null){
					GrammarValue newArrVal = new GrammarValue(newVal.getValue(), dataType);
					scopes.peek().getAnArr(ctx.VARIABLE_IDENTIFIER().getText()).setValueAt(new GrammarValue(newArrVal.getValue(), dataType), index);
				}
				
			}
			//not an array
			else{
				if(newVal.getValue() != null)
					variable.setValue(newVal.getValue());
			}
		}
		
		return null; 
	}
}