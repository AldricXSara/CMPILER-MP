import java.util.Arrays;
import java.util.Hashtable;

public class SymbolTable {
	
    public Hashtable <String, Integer> intSymbolTable;
    public Hashtable <String, Float> floatSymbolTable;
    public Hashtable <String, Character> charSymbolTable;
    public Hashtable <String, Boolean> booleanSymbolTable;
    public Hashtable <String, String> stringSymbolTable;
    
    public Hashtable <String, int[]> intArraySymbolTable;
    public Hashtable <String, float[]> floatArraySymbolTable;
    public Hashtable <String, char[]> charArraySymbolTable;
    public Hashtable <String, boolean[]> booleanArraySymbolTable;
    public Hashtable <String, String[]> stringArraySymbolTable;

    public SymbolTable(){
        intSymbolTable = new Hashtable<String, Integer>();
        floatSymbolTable = new Hashtable<String, Float>();
        charSymbolTable = new Hashtable<String, Character>();
        booleanSymbolTable = new Hashtable<String, Boolean>();
        stringSymbolTable = new Hashtable<String, String>();
        
        intArraySymbolTable = new Hashtable<String, int[]>();
        floatArraySymbolTable = new Hashtable<String, float[]>();
        charArraySymbolTable = new Hashtable<String, char[]>();
        booleanArraySymbolTable = new Hashtable<String, boolean[]>();
        stringArraySymbolTable = new Hashtable<String, String[]>();
    }
    

    public boolean isDuplicate(String name){
        return intSymbolTable.containsKey(name) || floatSymbolTable.containsKey(name) || 
        charSymbolTable.containsKey(name) || booleanSymbolTable.containsKey(name) || 
        stringSymbolTable.containsKey(name) || intArraySymbolTable.containsKey(name) || 
        floatArraySymbolTable.containsKey(name) || charArraySymbolTable.containsKey(name) ||
        booleanArraySymbolTable.containsKey(name) || stringArraySymbolTable.containsKey(name);
    }
    
    
    public boolean addInt (String name, int value){
        if(isDuplicate(name))
            return false;

        intSymbolTable.put(name, new Integer(value));
        return true;
    }
    
    public boolean addFloat (String name, float value){
        if(isDuplicate(name))
            return false;

        floatSymbolTable.put(name, new Float(value));
        return true;
    }
    
    
    public boolean addChar (String name, char value){
        if(isDuplicate(name))
            return false;

        charSymbolTable.put(name, new Character(value));
        return true;
    }
    
    
    public boolean addBoolean (String name, boolean value){
        if(isDuplicate(name))
            return false;

        booleanSymbolTable.put(name, new Boolean(value));
        return true;
    }
    
    
    public boolean addString (String name, String value){
        if(isDuplicate(name))
            return false;

        stringSymbolTable.put(name, value);
        return true;
    }
    
    
    public boolean addIntArray (String name, int[] value){
        if(isDuplicate(name))
            return false;

        intArraySymbolTable.put(name, value);
        return true;
    }
    
    public boolean addFloatArray (String name, float[] value){
        if(isDuplicate(name))
            return false;

        floatArraySymbolTable.put(name, value);
        return true;
    }
    
    public boolean addCharArray (String name, char[] value){
        if(isDuplicate(name))
            return false;

        charArraySymbolTable.put(name, value);
        return true;
    }
    
    
    public boolean addBooleanArray (String name, boolean[] value){
        if(isDuplicate(name))
            return false;

        booleanArraySymbolTable.put(name, value);
        return true;
    }
    
    
    public boolean addStringArray (String name, String[] value){
        if(isDuplicate(name))
            return false;

        stringArraySymbolTable.put(name, value);
        return true;
    }

    
    public int getInt(String name){
        return intSymbolTable.get(name).intValue();
    }
    
    public int getFloat(String name){
        return floatSymbolTable.get(name).intValue();
    }
    
    public char getChar(String name){
        return charSymbolTable.get(name).charValue();
    }
    
    public boolean getBoolean(String name){
        return booleanSymbolTable.get(name).booleanValue();
    }
    
    public String getString(String name){
        return stringSymbolTable.get(name);
    }
    
    public int[] getIntArray(String name){
        return intArraySymbolTable.get(name);
    }
    
    public float[] getFloatArray(String name){
        return floatArraySymbolTable.get(name);
    }

    public char[] getCharArray(String name){
        return charArraySymbolTable.get(name);
    }
    
    public boolean[] getBooleanArray(String name){
        return booleanArraySymbolTable.get(name);
    }
    
    public String[] getStringArray(String name){
        return stringArraySymbolTable.get(name);
    }

    
    public void display(){
        System.out.println("Integer:" + intSymbolTable.toString());
        System.out.println("Float:" + floatSymbolTable.toString());
        System.out.println("Character:" + charSymbolTable.toString());
        System.out.println("Boolean:" + booleanSymbolTable.toString());
        System.out.println("String:" + stringSymbolTable.toString());
        
        System.out.println("int[]: ");
        for(String name : intArraySymbolTable.keySet()){
        	System.out.print(name + "{");
        	int[] ints = intArraySymbolTable.get(name);
        	for(int i : ints){
        		System.out.print(i + " ");
        	}
        	System.out.println("}");
        }
        
        System.out.println("float[]: ");
        for(String name : floatArraySymbolTable.keySet()){
        	System.out.print(name + "{");
        	float[] ints = floatArraySymbolTable.get(name);
        	for(float i : ints){
        		System.out.print(i + " ");
        	}
        	System.out.println("}");
        }
        
        
        System.out.println("char[]: ");
        for(String name : charArraySymbolTable.keySet()){
        	System.out.print(name + "{");
        	char[] ints = charArraySymbolTable.get(name);
        	for(char i : ints){
        		System.out.print(i + " ");
        	}
        	System.out.println("}");

        }
        System.out.println("boolean[]: ");
        for(String name : booleanArraySymbolTable.keySet()){
        	System.out.print(name + "{");
        	boolean[] ints = booleanArraySymbolTable.get(name);
        	for(boolean i : ints){
        		System.out.print(i + " ");
        	}
        	System.out.println("}");

        }
        System.out.println("String[]: ");
        for(String name : stringArraySymbolTable.keySet()){
        	System.out.print(name + "{");
        	String[] ints = stringArraySymbolTable.get(name);
        	for(String i : ints){
        		System.out.print(i + " ");
        	}
        	System.out.println("}");

        }
        System.out.println();
    }
}
