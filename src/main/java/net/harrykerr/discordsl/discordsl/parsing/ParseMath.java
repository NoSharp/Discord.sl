package net.harrykerr.discordsl.discordsl.parsing;

import net.harrykerr.discordsl.discordsl.grammars.discordslParser;

public class ParseMath {

    public static float result(discordslParser.Maths_equationsContext ctx){
        float result = 0;

        if(ctx.maths_equations() != null){
            for(discordslParser.Maths_equationsContext equation : ctx.maths_equations()){
                equation.Digits().forEach(x-> System.out.println(x.getText()));
                result(equation);

            }
        }

        return result;
    }
}
