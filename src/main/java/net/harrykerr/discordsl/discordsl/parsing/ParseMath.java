package net.harrykerr.discordsl.discordsl.parsing;

import net.harrykerr.discordsl.discordsl.grammars.discordslParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ParseMath {

    public static String result(discordslParser.Math_sumContext ctx){
        String mathEquation = "";
        if(ctx.math_sums().math_sum() == null) return ctx.Digits(0).getText() + ctx.Digits(1).getText();
        for(discordslParser.Math_sumContext context :ctx.math_sums().math_sum()){
            parseMathSum(context, mathEquation);

        }
        return mathEquation;
    }

    public static void parseMathSum(discordslParser.Math_sumContext ctx, String vara){
        if(ctx.math_sums().math_sum() == null) return;
        for(discordslParser.Math_sumContext context :ctx.math_sums().math_sum()){
            for(TerminalNode node : context.Digits()){
                vara += node.getSymbol().getText();
            }

            parseMathSum(context, vara);
        }


    }
}
