public class GrammarArray extends GrammarSymbol{
	
	private GrammarValue[] valueArray;
	private DataType dataType;

	public GrammarArray(int size, String dataType, String name){
		this.valueArray = new GrammarValue[size];
		this.dataType = setDataType(dataType);
	}
	
	public void setValueAt(GrammarValue value, int index) {
		if(index >= valueArray.length){
			System.err.println("[SEMANTIC ERROR]: Array " + getIdentifier() + " out of bounds.");
		}else{
			valueArray[index] = value;
			//System.out.println("valueArray[index]: " + valueArray[index].getValue() + " | value: " + value.getValue());
		}
	}
	
	public GrammarValue getMillValue(int index){
		if(index >= valueArray.length) {
			System.err.println("[SEMANTIC ERROR]: Array " + getIdentifier() + " out of bounds");
			return null;
		}
		else {
			return valueArray[index];
		}		
	}
	
	public Object getValueAt(int index){
		if(index >= valueArray.length) {
			System.err.println("[SEMANTIC ERROR]: Array " + getIdentifier() + " out of bounds");
			return null;
		}
		else {
			/*
			switch(dataType){
				case digitz:
					return new GrammarValue(valueArray[index], dataType);
				case lutang:
					return (Float) valueArray[index];
				case single:
					return (Character) valueArray[index];
				case Msg:
					return (String) valueArray[index];
				case weh:
					return (Boolean) valueArray[index];
				default:
					return null;
			}
			*/
			return valueArray[index].getValue();
		}
	}
	
	public DataType setDataType(String dataTypeStr){
		switch(dataTypeStr){
			case "digieez":
				return DataType.digeetz;
			case "sabaw":
				return DataType.sabaw;
			case "bidabida":
				return DataType.bidabida;
			case "barkada":
				return DataType.barkada;
			case "weh":
				return DataType.weh;
			default:
				return null;
		}
	}
	
	//Getters and Setters
	public GrammarValue[] getValueArray() {
		return valueArray;
	}

	public void setValueArray(GrammarValue[] valueArray) {
		this.valueArray = valueArray;
	}

	public DataType getDataType() {
		return dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}
	
	public int getSize(){
		return valueArray.length;
	}
}

	
	
	
	
	
