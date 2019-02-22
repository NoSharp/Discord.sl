package net.harrykerr.discordsl.discordsl;

import com.sun.deploy.util.StringUtils;
import net.harrykerr.discordsl.discordsl.errors.TypeNotFound;
import net.harrykerr.discordsl.discordsl.grammars.discordslListener;
import net.harrykerr.discordsl.discordsl.grammars.discordslParser;
import net.harrykerr.discordsl.discordsl.parsing.ParseMath;
import net.harrykerr.discordsl.discordsl.types.Variable;
import net.harrykerr.discordsl.discordsl.types.impl.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiscordSLWalker implements discordslListener {

    List<Variable> variables = new ArrayList<>();
    Settings settings;

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
    public void enterCommand_prefix(discordslParser.Command_prefixContext ctx) {

    }

    @Override
    public void exitCommand_prefix(discordslParser.Command_prefixContext ctx) {

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
            //System.out.println(ctx.LetterOrDigit());
            if(doesVariableExist(ctx.LetterOrDigit().toString())) {
                Variable type = variableByName(ctx.LetterOrDigit().getText());
                if(type.type.equals("string")){
                    value = String.valueOf(type.value).substring(1,String.valueOf(type.value).length()-1);

                }else if(type.type.equals("number")){
                    value = String.valueOf(type.value);

                }else if(type.type.equals("FloatList")){
                    value = StringUtils.join(((List<String>) type.value));
                }else if(type.type.equals("StringList")){

                }

            }
            System.out.println(value);
        }else{
            System.out.println( ctx.NORMALSTRING().getText().replaceAll("\\\\", "")
                    .substring(1,String.valueOf(ctx.NORMALSTRING().getText()).length()-1));
        }

    }

    @Override
    public void exitSay(discordslParser.SayContext ctx) {

    }

    @Override
    public void enterMaths_equations(discordslParser.Maths_equationsContext ctx) {

        //ParseMath.result(ctx);

    }

    @Override
    public void exitMaths_equations(discordslParser.Maths_equationsContext ctx) {

    }

    @Override
    public void enterVariable(discordslParser.VariableContext ctx) {
        String type = ctx.type().getText();
        if(type.equals("number")){
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
}
