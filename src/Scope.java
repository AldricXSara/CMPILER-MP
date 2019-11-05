import java.util.HashMap;

import org.antlr.v4.runtime.RuleContext;

public class Scope {
	
	private String name;
	private HashMap<String, GrammarSymbol> symbolTable;
	private String parent; //Parent Scope
	private RuleContext caller;
	
	public Scope(String name, String parent){
		this.name = name;
		symbolTable = new HashMap<String, GrammarSymbol>();
		this.parent = parent;
	}
	
	/*
	public Scope(String name, RuleContext caller){
		this.name = name;
		symbolTable = new HashMap<String, GrammarSymbol>();
		this.caller = caller;
	}
	*/
	
	public void addToSymbolTable(GrammarFunction func){
		symbolTable.put(func.getIdentifier(), func);
	}
	
	public void addToSymbolTable(GrammarArray arr){
		symbolTable.put(arr.getIdentifier(), arr);
	}
		
	public void addToSymbolTable(GrammarValue var){
		symbolTable.put(var.getIdentifier(), var);
	}

	public GrammarValue getAVar(String identifier){
		try{
			return (GrammarValue)symbolTable.get(identifier);
		}catch (Exception e){
			return new GrammarValue(null);
		}

	}
	
	public GrammarArray getAnArr(String identifier){
		return (GrammarArray)symbolTable.get(identifier);
	}
	
	public GrammarFunction getAFunc(String identifier){
		return (GrammarFunction)symbolTable.get(identifier);
	}
	
	
	
	//Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, GrammarSymbol> getSymbolTable() {
		return symbolTable;
	}

	public void setSymbolTable(HashMap<String, GrammarSymbol> symbolTable) {
		this.symbolTable = symbolTable;
	}

	public RuleContext getCaller() {
		return caller;
	}

	public void setCaller(RuleContext caller) {
		this.caller = caller;
	}
	
	

}