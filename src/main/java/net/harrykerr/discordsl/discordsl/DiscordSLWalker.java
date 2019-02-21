package net.harrykerr.discordsl.discordsl;

import net.harrykerr.discordsl.discordsl.grammars.discordslListener;
import net.harrykerr.discordsl.discordsl.grammars.discordslParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DiscordSLWalker implements discordslListener {

    @Override
    public void enterProgram(discordslParser.ProgramContext ctx) {

    }

    @Override
    public void exitProgram(discordslParser.ProgramContext ctx) {

    }

    @Override
    public void enterStatement(discordslParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(discordslParser.StatementContext ctx) {

    }

    @Override
    public void enterComparator(discordslParser.ComparatorContext ctx) {

    }

    @Override
    public void exitComparator(discordslParser.ComparatorContext ctx) {

    }

    @Override
    public void enterIf_statements(discordslParser.If_statementsContext ctx) {

    }

    @Override
    public void exitIf_statements(discordslParser.If_statementsContext ctx) {

    }

    @Override
    public void enterMath_expr(discordslParser.Math_exprContext ctx) {

    }

    @Override
    public void exitMath_expr(discordslParser.Math_exprContext ctx) {

    }

    @Override
    public void enterFunction(discordslParser.FunctionContext ctx) {

    }

    @Override
    public void exitFunction(discordslParser.FunctionContext ctx) {

    }

    @Override
    public void enterVariable(discordslParser.VariableContext ctx) {

    }

    @Override
    public void exitVariable(discordslParser.VariableContext ctx) {
        ParserRuleContext context = ctx.getParent();
    }

    @Override
    public void enterType(discordslParser.TypeContext ctx) {

    }

    @Override
    public void exitType(discordslParser.TypeContext ctx) {

    }

    @Override
    public void enterOperators(discordslParser.OperatorsContext ctx) {

    }

    @Override
    public void exitOperators(discordslParser.OperatorsContext ctx) {

    }

    @Override
    public void enterComparators(discordslParser.ComparatorsContext ctx) {

    }

    @Override
    public void exitComparators(discordslParser.ComparatorsContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
