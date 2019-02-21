// Generated from C:/Users/Harry/Desktop/Code/Discord.sl/src/main/java/net/harrykerr/discordsl/discordsl/grammars\discordsl.g4 by ANTLR 4.7
package net.harrykerr.discordsl.discordsl.grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link discordslParser}.
 */
public interface discordslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link discordslParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(discordslParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(discordslParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(discordslParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(discordslParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#say}.
	 * @param ctx the parse tree
	 */
	void enterSay(discordslParser.SayContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#say}.
	 * @param ctx the parse tree
	 */
	void exitSay(discordslParser.SayContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(discordslParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(discordslParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(discordslParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(discordslParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#var_value}.
	 * @param ctx the parse tree
	 */
	void enterVar_value(discordslParser.Var_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#var_value}.
	 * @param ctx the parse tree
	 */
	void exitVar_value(discordslParser.Var_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(discordslParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(discordslParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(discordslParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(discordslParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#comparators}.
	 * @param ctx the parse tree
	 */
	void enterComparators(discordslParser.ComparatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#comparators}.
	 * @param ctx the parse tree
	 */
	void exitComparators(discordslParser.ComparatorsContext ctx);
}