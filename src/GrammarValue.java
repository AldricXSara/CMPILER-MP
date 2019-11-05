public class GrammarValue extends GrammarSymbol{
	
	private Object value;
	private DataType dataType;
	private boolean constantFlag = false;
	private GrammarSemanticErrors semanticErrors;
	
	public GrammarValue(){
		
	}
	
	public GrammarValue(Object value){
		this.value = value;
	}
	
	public GrammarValue(Object value, DataType dataType){
		this.dataType = dataType;
		this.value = value;
		
	}
	
	public GrammarValue(String value, String dataType, GrammarSemanticErrors semanticErrors){
		this.dataType = setDataType(dataType);
		this.semanticErrors = semanticErrors;
		
		try{
			if(value != null){
				this.value = dataTypeCast(value);
				/*
				if(this.value == null){
					this.dataType = null;
					this.value = null;
					semanticErrors.addError(semanticErrors.getLine(), semanticErrors.getCharPositionInLine(), SemanticErrors.DTYPE_MISMATCH);
				}	
				*/
			}
		}catch (Exception e){
			this.dataType = null;
			this.value = null;

			semanticErrors.addError(semanticErrors.getLine(), semanticErrors.getCharPositionInLine(), SemanticErrors.DTYPE_MISMATCH);
		}
	}
	
	public DataType setDataType(String dataTypeStr){
		switch(dataTypeStr){
			case "digitz":
				return DataType.digeetz;
			case "lutang":
				return DataType.sabaw;
			case "single":
				return DataType.bidabida;
			case "Msg":
				return DataType.barkada;
			case "weh":
				return DataType.weh;
			default:
				return null;
		}
	}
	
	public Object dataTypeCast(Object value){
		switch(dataType){
			case digeetz:
				return Integer.valueOf(value.toString());
			case sabaw:
				return Float.valueOf(value.toString());
			case bidabida:
				if((value.toString().charAt(0) == '\'') && (value.toString().charAt(2) == '\''))
					return Character.valueOf(value.toString().charAt(1));
				else
					return null;
			case barkada:
				if((value.toString().charAt(0) == '\"') && (value.toString().charAt(value.toString().length()-1) == '\"'))
					return value.toString();
				else
					return null;
			case weh:
					if(value.toString().equals("yas"))
						return Boolean.valueOf("true");
					else if(value.toString().equals("deins"))
						return Boolean.valueOf("false");
					else
						return null;
			default:
				return null;
		}
	}
	
	public boolean verifyValueDataType(Object value, DataType dataType){
		switch(dataType){
			case digeetz:
				return value instanceof Integer;
			case sabaw:
				return value instanceof Float;
			case bidabida:
				return value instanceof Character;
			case barkada:
				return value instanceof String;
			case weh:
				return value instanceof Boolean;
			default:
				return false;
		}
	}
	
	public void markAsConstant(){
		constantFlag = true;
	}

	//Getters and Setters
	public Object getValue() {
		return value;
	}


	public void setValue(Object value) {
		
		//for evaluating int and floats
		if(value != null){
			if(value.toString().contains(".") && dataType.equals(DataType.digeetz)){
				this.value = (int) Math.round((double) value);
			}else{
				this.value = value;	
			}
		}
		else{
			this.value = value;
		}

	}


	public DataType getDataType() {
		return dataType;
	}


	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}


	public boolean isConstantFlag() {
		return constantFlag;
	}


	public void setConstantFlag(boolean constantFlag) {
		this.constantFlag = constantFlag;
	}
	

	public GrammarSemanticErrors getErrors() {
		return semanticErrors;
	}


	public void setErrors(GrammarSemanticErrors semanticErrors) {
		this.semanticErrors = semanticErrors;
	}
	
	
	
	
	
}