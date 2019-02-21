package net.harrykerr.discordsl.discordsl;

import net.harrykerr.discordsl.discordsl.grammars.discordslListener;
import net.harrykerr.discordsl.discordsl.grammars.discordslParser;
import net.harrykerr.discordsl.discordsl.types.impl.StringVariable;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class DiscordSLWalker implements discordslListener {

    List<StringVariable> stringVariables = new ArrayList<>();

    @Override
    public void enterStart(discordslParser.StartContext ctx) {
        System.out.println("Started");
    }

    @Override
    public void exitStart(discordslParser.StartContext ctx) {

    }

    @Override
    public void enterStatements(discordslParser.StatementsContext ctx) {

    }

    @Override
    public void exitStatements(discordslParser.StatementsContext ctx) {

    }

    @Override
    public void enterSay(discordslParser.SayContext ctx) {
        //System.out.println("ENTERED SAY.");
        boolean isNormal = ctx.LetterOrDigit() == null;
        String value = "";
        if(!isNormal){
            value = variableByName(ctx.LetterOrDigit().getText()).value;
            System.out.println( value );
        }else{
            System.out.println( ctx.NORMALSTRING().getText().replaceAll("\\\\", ""));
        }

    }

    @Override
    public void exitSay(discordslParser.SayContext ctx) {

    }

    @Override
    public void enterVariable(discordslParser.VariableContext ctx) {
        String text = ctx.identifier().LetterOrDigit().getText();
        String value = ctx.var_value().NORMALSTRING().getText();
        StringVariable vars = new StringVariable(value, text);
        stringVariables.add(vars);
    }

    @Override
    public void exitVariable(discordslParser.VariableContext ctx) {

    }

    @Override
    public void enterIdentifier(discordslParser.IdentifierContext ctx) {

    }

    @Override
    public void exitIdentifier(discordslParser.IdentifierContext ctx) {

    }

    @Override
    public void enterVar_value(discordslParser.Var_valueContext ctx) {

    }

    @Override
    public void exitVar_value(discordslParser.Var_valueContext ctx) {

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

    public StringVariable variableByName(String ident){
        for(StringVariable var : stringVariables){
            if(var.identity.equals(ident)){
                return var;
            }

        }
        return null;
    }

}
