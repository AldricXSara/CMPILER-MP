// Generated from Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(GrammarParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(GrammarParser.Data_typeContext ctx);
}