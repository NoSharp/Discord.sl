package net.harrykerr.discordsl.discordsl;

import com.sun.deploy.util.StringUtils;
import net.harrykerr.discordsl.discordsl.errors.TypeNotFound;
import net.harrykerr.discordsl.discordsl.grammars.discordslListener;
import net.harrykerr.discordsl.discordsl.grammars.discordslParser;
import net.harrykerr.discordsl.discordsl.parsing.ParseMath;
import net.harrykerr.discordsl.discordsl.parsing.evalutation.IfStatementEval;
import net.harrykerr.discordsl.discordsl.types.Variable;
import net.harrykerr.discordsl.discordsl.types.impl.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiscordSLListener implements discordslListener {

    List<Variable> variables = new ArrayList<>();
    Settings settings;
    List<RuleContext> completedTasks = new ArrayList<>();

    @Override
    public void enterStart(discordslParser.StartContext ctx) {
        //System.out.println("Started");
    }

    @Override
    public void exitStart(discordslParser.StartContext ctx) {

    }

    @Override
    public void enterSettings(discordslParser.SettingsContext ctx) {
        String token = ctx.token().NORMALSTRING().getText();
        String comamndPrefix = ctx.command_prefix().NORMALSTRING().getText();
        String enableHelp = ctx.enable_help().NORMALSTRING().getText();
        String status = ctx.status().NORMALSTRING().getText();
        String game = ctx.game().NORMALSTRING().getText();

        Settings Settings = new Settings(token, comamndPrefix, enableHelp, status, game);
    }

    @Override
    public void exitSettings(discordslParser.SettingsContext ctx) {

    }

    @Override
    public void enterGame(discordslParser.GameContext ctx) {

    }

    @Override
    public void exitGame(discordslParser.GameContext ctx) {

    }

    @Override
    public void enterEnable_help(discordslParser.Enable_helpContext ctx) {

    }

    @Override
    public void exitEnable_help(discordslParser.Enable_helpContext ctx) {

    }

    @Override
    public void enterStatus(discordslParser.StatusContext ctx) {

    }

    @Override
    public void exitStatus(discordslParser.StatusContext ctx) {

    }

    @Override
    public void enterToken(discordslParser.TokenContext ctx) {

    }

    @Override
    public void exitToken(discordslParser.TokenContext ctx) {

    }

    @Override
    public void enterStatement(discordslParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(discordslParser.StatementContext ctx) {

    }

    @Override
    public void enterMath_sum(discordslParser.Math_sumContext ctx) {

    }

    @Override
    public void exitMath_sum(discordslParser.Math_sumContext ctx) {

    }

    @Override
    public void enterBrackets(discordslParser.BracketsContext ctx) {

    }

    @Override
    public void exitBrackets(discordslParser.BracketsContext ctx) {

    }

    @Override
    public void enterCommand_prefix(discordslParser.Command_prefixContext ctx) {

    }

    @Override
    public void exitCommand_prefix(discordslParser.Command_prefixContext ctx) {

    }

    @Override
    public void enterStatements(discordslParser.StatementsContext ctx) {
        if (ctx.getChild(1).getText().startsWith("say")){


        }
    }

    @Override
    public void exitStatements(discordslParser.StatementsContext ctx) {

    }

    @Override
    public void enterMath_sum_full(discordslParser.Math_sum_fullContext ctx) {

    }

    @Override
    public void exitMath_sum_full(discordslParser.Math_sum_fullContext ctx) {
        //System.out.println(ParseMath.interpretEquation(ctx));
    }

    @Override
    public void enterMath_sums(discordslParser.Math_sumsContext ctx) {

    }

    @Override
    public void exitMath_sums(discordslParser.Math_sumsContext ctx) {

    }

    @Override
    public void enterEvent(discordslParser.EventContext ctx) {

    }

    @Override
    public void exitEvent(discordslParser.EventContext ctx) {

    }

    @Override
    public void enterEvent_param(discordslParser.Event_paramContext ctx) {

    }

    @Override
    public void exitEvent_param(discordslParser.Event_paramContext ctx) {

    }

    @Override
    public void enterSay(discordslParser.SayContext ctx) {
        if(discordslParser.ruleNames[ctx.getParent().getParent().getParent().getParent().getRuleIndex()].equals("if_statement")){
            System.out.println("Inside If Statement");
            return;
        }



    }

    @Override
    public void exitSay(discordslParser.SayContext ctx) {

    }

    @Override
    public void enterIf_operand(discordslParser.If_operandContext ctx) {

    }

    @Override
    public void exitIf_operand(discordslParser.If_operandContext ctx) {

    }

    @Override
    public void enterCondition(discordslParser.ConditionContext ctx) {



    }

    @Override
    public void exitCondition(discordslParser.ConditionContext ctx) {

    }

    @Override
    public void enterIf_statement(discordslParser.If_statementContext ctx) {
        doIf(ctx);
    }

    @Override
    public void exitIf_statement(discordslParser.If_statementContext ctx) {

    }

    @Override
    public void enterSend_message(discordslParser.Send_messageContext ctx) {

    }

    @Override
    public void exitSend_message(discordslParser.Send_messageContext ctx) {

    }

    @Override
    public void enterConditional_statement(discordslParser.Conditional_statementContext ctx) {

    }

    @Override
    public void exitConditional_statement(discordslParser.Conditional_statementContext ctx) {

    }

    @Override
    public void enterVariable(discordslParser.VariableContext ctx) {
        String type = ctx.type().getText();
        if(ctx.var_value().math_sum_full() != null){
            String text = ctx.identifier().LetterOrDigit().getText();
            float value = ParseMath.interpretEquation(ctx.var_value().math_sum_full());

            NumberVariable vars = new NumberVariable(value, text);
            variables.add(vars);

        }

        else if(type.equals("number")){
            //System.out.println("Got Here");
            String text = ctx.identifier().LetterOrDigit().getText();
            float value = Float.parseFloat(ctx.var_value().Digits().getText());
            NumberVariable vars = new NumberVariable(value, text);
            variables.add(vars);
            //System.out.println(text);
        }
        else if(type.equals("string")) {
            String text = ctx.identifier().LetterOrDigit().getText();
            String value = ctx.var_value().NORMALSTRING().getText();
            StringVariable vars = new StringVariable(value, text);
            variables.add(vars);
        }
        else{
            try {
                throw new TypeNotFound();
            } catch (TypeNotFound ex){
                ex.printStackTrace();
            }

        }
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
    public void enterEvent_name(discordslParser.Event_nameContext ctx) {

    }

    @Override
    public void exitEvent_name(discordslParser.Event_nameContext ctx) {

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
    public void enterList_assign(discordslParser.List_assignContext ctx) {
        String type = ctx.type().getText();
        if(type.equals("number")){
            //System.out.println("Got Here");
            String text = ctx.identifier().LetterOrDigit().getText();
            List<Float> value = parseFloats(ctx.NORMALSTRING().getText());
            FloatListVariable vars = new FloatListVariable(value, text);
            variables.add(vars);
            //System.out.println(text);
        }
        else if(type.equals("string")) {
            String text = ctx.identifier().LetterOrDigit().getText();
            List<String> value = Arrays.asList(ctx.NORMALSTRING().getText().split(","));
            StringListVariable vars = new StringListVariable(value, text);
            variables.add(vars);
        }
        else{
            try {
                throw new TypeNotFound();
            } catch (TypeNotFound ex){
                ex.printStackTrace();
            }

        }
    }

    @Override
    public void exitList_assign(discordslParser.List_assignContext ctx) {

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

    public Variable variableByName(String ident){
        for(Variable var : variables){
            if(var.identity.equals(ident)){
                return var;
            }

        }
        return null;
    }

    public boolean doesVariableExist(String ident){
        for(Variable var : variables){
            if(var.identity.equals(ident)){
                return true;
            }

        }
        return false;

    }

    public List<Float> parseFloats(String input){
        List<Float> floatArrayList = new ArrayList<>();
        for(String s : input.split(",")){
            float res = Float.parseFloat(s);
            floatArrayList.add(res);
            //do whatever you want with the float
        }
        return floatArrayList;

    }

    public void doIf(discordslParser.If_statementContext ctx){

        discordslParser.If_operandContext left = ctx.condition().if_operand(0);
        discordslParser.If_operandContext right = ctx.condition().if_operand(1);
        discordslParser.ComparatorsContext comp = ctx.condition().comparators();
        System.out.println(ctx.getChild(3).getText());
        if(left.NORMALSTRING() != null){
            if(IfStatementEval.evalutateConditionString(left.getText(), right.getText(), comp.getText())){
                enterStatements(ctx.conditional_statement(0).statements());
                System.out.println("Success");
            }
            else{
                if(ctx.ELSE() != null){
                    enterStatements(ctx.conditional_statement(1).statements());
                }

            }

        }
        if(left.Digits() != null){
            if(IfStatementEval.evalutateNumberCondition(Integer.parseInt(left.getText()), Integer.parseInt(right.getText()), comp.getText())){
                enterStatements(ctx.conditional_statement(0).statements());
                System.out.println("Success");
            }
            else{
                if(ctx.ELSE() != null){
                    enterStatements(ctx.conditional_statement(1).statements());
                }

            }

        }
    }

}
