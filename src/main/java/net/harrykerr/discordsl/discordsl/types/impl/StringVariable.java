package net.harrykerr.discordsl.discordsl.types.impl;

import net.harrykerr.discordsl.discordsl.types.Variable;
import org.antlr.v4.runtime.ParserRuleContext;

public class StringVariable extends Variable {

    public String value;

    public String identity;

    public StringVariable(String value, String identity, String parent){
        super(value, identity, parent,"string");
    }


    public StringVariable(String value, String identity){
        super(value, identity, "GLOBAL","string");
    }

}
