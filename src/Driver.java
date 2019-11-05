import java.util.ArrayList;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Driver {
	
    public static void main(String[] args) throws Exception {
    	
        String fileName = "src/input.txt";
        CharStream cs = CharStreams.fromFileName(fileName);
        GrammarLanguage gl = new GrammarLanguage();
        
        ArrayList<String> tokens = gl.tokenize(cs);
        gl.parse();
        
        gl.showTokens();
        
        
        
        gl.showErrors();
        
        //ParseTree tree = parser.program(); // begin parsing at rule 'r'
        //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        /*
        //Scanner print
        System.out.println("Amount of tokens " + tokens.getNumberOfOnChannelTokens());
        for(int i=0; i< tokens.size(); i++) {
        	System.out.println(tokens.get(i));
        }
        System.out.println();
        
        //Scanner print v2
        CharStream cs2 = CharStreams.fromFileName(fileName);
        GrammarLexer lexer2 = new GrammarLexer(cs2);
        for (Token token2 = lexer2.nextToken(); token2.getType() != Token.EOF; token2 = lexer2.nextToken()) {
        	System.out.println("Token: " + token2.getText());
        	System.out.println("Type: " + token2.getType());
        	System.out.println("Position: " + token2.toString());
        }
       */
        
        //Parser
//        GrammarParser parser = new GrammarParser(tokens);
//       ParseTree tree = parser.program();

        //Interpreter (Not functional yet)
        //GrammarMainListener listener = new GrammarMainListener();
        //ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk(listener,tree);
        
        
        
    }
}
