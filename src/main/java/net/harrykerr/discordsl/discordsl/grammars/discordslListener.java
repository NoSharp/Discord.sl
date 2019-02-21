// Generated from C:/Users/Harry/Desktop/Code/Discord.sl/src/main/java/net/harrykerr/discordsl/discordsl/grammars\discordsl.g4 by ANTLR 4.7
package net.harrykerr.discordsl.discordsl.grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link discordslParser}.
 */
public interface discordslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link discordslParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(discordslParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(discordslParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(discordslParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(discordslParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(discordslParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(discordslParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#if_statements}.
	 * @param ctx the parse tree
	 */
	void enterIf_statements(discordslParser.If_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#if_statements}.
	 * @param ctx the parse tree
	 */
	void exitIf_statements(discordslParser.If_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr(discordslParser.Math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr(discordslParser.Math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link discordslParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(discordslParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link discordslParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(discordslParser.FunctionContext ctx);
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