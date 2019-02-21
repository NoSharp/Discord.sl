package net.harrykerr.discordsl.discordsl.types.impl;

import com.sun.org.apache.xpath.internal.operations.Variable;
import org.antlr.v4.runtime.ParserRuleContext;

public class StringVariable{

    public String value;

    public String identity;

    public StringVariable(String value, String identity){
        this.value = value;
        this.identity = identity;
    }

}
