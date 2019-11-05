import java.util.ArrayList;
import java.util.HashMap;

public class GrammarFunction extends GrammarSymbol{
	 
	private ArrayList<GrammarValue> parameters;
	private GrammarValue returnValue; 
	private FunctionType returnType;
	private GrammarParser.Function_declarationContext ctx;
	private GrammarSemanticErrors semanticErrors;
	
	public GrammarFunction(String returnType, ArrayList<GrammarValue> parameters, GrammarSemanticErrors semanticErrors){
		this.parameters = parameters;
		this.returnType = setReturnType(returnType);
		this.semanticErrors = semanticErrors;
		setReturnValue(this.returnType);
	}
	

	public GrammarValue getAParameter(String identifier){
		for(GrammarValue parameter : parameters){
			if(parameter.getIdentifier().equals(identifier)){
				return parameter;
			}
				
		}
		
		return null;
	}
	
	public GrammarValue getAParameter(int index){
		return parameters.get(index);
		
	}

	public void setReturnValue(FunctionType functionType) {

		//create an empty Grammar value as a return value
		switch(this.returnType) {
			case weh_type: 
				returnValue = new GrammarValue("", "weh", semanticErrors);
				break;
			case bidabida_type: 
				returnValue = new GrammarValue(String.valueOf(' '), "single", semanticErrors);
				break;
			case digeetz_type: 
				returnValue = new GrammarValue(String.valueOf(0), "digitz", semanticErrors); 
				break;
			case savaw_type:
				this.returnValue = new GrammarValue(String.valueOf(0), "lutang", semanticErrors); 
				break;
			case barkada_type: 
				returnValue = new GrammarValue("", "Msg", semanticErrors); 
				break;
			default:
				break;	
		}
	}
	
	public String getFuncDataTypes(){
		String dataTypes = getIdentifier() + "( ";
		
		for(int i = 0; i < parameters.size(); i++){
			dataTypes += parameters.get(i).getDataType();
			
			if((i+1) != parameters.size()){
				dataTypes += ", ";
			}	
		}
		
		dataTypes += " )";
		return dataTypes;
	}
	

	//Getters & Setters
	public ArrayList<GrammarValue> getParameters() {
		return parameters;
	}

	public void setParameters(ArrayList<GrammarValue> parameters) {
		this.parameters = parameters;
	}

	public GrammarValue getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(GrammarValue returnValue) {
		this.returnValue = returnValue;
	}
	
	public FunctionType setReturnType(String returnType){
		switch(returnType){
			case "digitz":
				return FunctionType.digeetz_type;
			case "lutang":
				return FunctionType.savaw_type;
			case "single":
				return FunctionType.bidabida_type;
			case "Msg":
				return FunctionType.barkada_type;
			case "weh":
				return FunctionType.weh_type;
			case "walangibabalik":
				return FunctionType.VOID_type;
			default:
				return null;		
		}

	}

	public FunctionType getReturnType() {
		return returnType;
	}

	public GrammarParser.Function_declarationContext getCtx() {
		return ctx;
	}

	public void setCtx(GrammarParser.Function_declarationContext ctx) {
		this.ctx = ctx;
	}
	
	
	
}