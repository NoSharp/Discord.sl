package net.harrykerr.discordsl.discordsl.parsing.evalutation;

import net.harrykerr.discordsl.discordsl.grammars.discordslParser;

public class IfStatementEval {

    public static boolean evalutateNumberCondition(float left, float right, String comparator){

        switch(comparator){

            case ">":
                return left > right;

            case "<":
                return left < right;

            case ">=":
                return left >= right;

            case "<=":
                return left <= right;

            case "==":
                return left == right;

            case "!=":
                return left != right;

            default:
                return false;

        }

    }

    public static boolean evalutateConditionString(String left, String right, String operator){
        switch(operator){
            case "==":
                return left.equals(right);

            case "!=":
                return !(left.equals(right));

            default:
                return false;

        }


    }


}
