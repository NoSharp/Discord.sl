package net.harrykerr.discordsl.discordsl.parsing.evalutation;

import com.sun.deploy.util.StringUtils;
import net.harrykerr.discordsl.discordsl.DiscordSLListener;
import net.harrykerr.discordsl.discordsl.grammars.discordslParser;
import net.harrykerr.discordsl.discordsl.types.Variable;

import java.util.List;

public class StatementEvaluation {

    public static void doSay(discordslParser.SayContext ctx, DiscordSLListener ls){
        if(ctx.getParent().getParent().getParent() != null){
            if(discordslParser.ruleNames[ctx.getParent().getParent().getParent().getParent().getRuleIndex()] == "if_statement"){
                return;
            }

        }
        boolean isNormal = ctx.LetterOrDigit() == null;
        String value = "";

        if(!isNormal){
            //System.out.println(ctx.LetterOrDigit());
            if(ls.doesVariableExist(ctx.LetterOrDigit().toString())) {
                Variable type = ls.variableByName(ctx.LetterOrDigit().getText());
                if(type.type.equals("string")){
                    value = String.valueOf(type.value).substring(1,String.valueOf(type.value).length()-1);

                }else if(type.type.equals("number")){
                    value = String.valueOf(type.value);

                }else if(type.type.equals("FloatList")){
                    StringUtils.join((List<String>) type.value, value);

                }else if(type.type.equals("StringList")){
                    StringUtils.join((List<String>) type.value, value);
                }

            }
            System.out.println(value);
        }else{
            System.out.println( ctx.NORMALSTRING().getText().replaceAll("\\\\", "")
                    .substring(1,String.valueOf(ctx.NORMALSTRING().getText()).length()-1));
        }

    }

}
