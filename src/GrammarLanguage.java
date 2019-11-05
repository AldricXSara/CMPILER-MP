import java.util.ArrayList;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class GrammarLanguage {
	
    private GrammarLexer lexer;
    private GrammarInterpreter interpreter;
    private GrammarParser parser;
    private ArrayList<String> valuesAndTokens;
    private ArrayList<String> errors;
    private ArrayList<GrammarFunction> funcs;

	public GrammarLanguage() throws ClassNotFoundException{
		valuesAndTokens = new ArrayList<String>();
		errors = new ArrayList<String>();
	}
	
	//Tokenize
	public ArrayList<String> tokenize(CharStream cs) {
//		String valuesAndTokens = "";
		lexer = new GrammarLexer(cs);
		
		//printing
		lexer.removeErrorListeners();
		lexer.addErrorListener(new GrammarLexerErrorListener(errors));
		while(true) {
		      Token token = lexer.nextToken();
		      if(token.getType() == GrammarLexer.EOF) {
		        break;
		      }
		     
		      valuesAndTokens.add(GrammarLexer.VOCABULARY.getSymbolicName(token.getType()) + ": " + token.getText() + "\n"); 
		    }
		    lexer.reset();
		    return valuesAndTokens;
	}
	
	//Parsing
	public void parse(){
			
		    CommonTokenStream tokens = new CommonTokenStream(lexer);
		    
		    parser = new GrammarParser(tokens);    
		    parser.removeErrorListeners();
		    parser.addErrorListener(new GrammarParserErrorListener(errors));
		    parser.setBuildParseTree(true);
		    ParseTree tree = parser.program(); // begin parsing at rule 'start'
		    
		    interpreter = new GrammarInterpreter(errors);
		    FirstPassImplementor firstPass = new FirstPassImplementor(interpreter);
		    firstPass.visit(tree);
		    System.out.println("ERROR UPDATE: " + interpreter.isHasError());
		    

		    GrammarParserListener mill = new GrammarParserListener();
		    ParseTreeWalker walker = new ParseTreeWalker();
		    walker.walk(mill, tree);

		    
		    // implementor = new MilleniumBaseImplementor(milleniumView);
		    //implementor.visit(tree);
		    //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
	
	public void interprete() {
		
	}
	
	public void showTokens() {
		System.out.println("TOKENS:");
		for(int i=0; i<valuesAndTokens.size();i++) {
			System.out.println(valuesAndTokens.get(i));
		}
		System.out.println("-end of tokens-");
	}
	
	public void showErrors() {
		System.out.println("ERRORS:");
		for(int i=0; i<errors.size();i++) {
			System.out.println(errors.get(i));
		}
		System.out.println("-end of errors-");
	}
	 
}
