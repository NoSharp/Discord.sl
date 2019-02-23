package net.harrykerr.discordsl.discordsl.types.impl;

import net.harrykerr.discordsl.discordsl.types.Variable;

public class NumberVariable extends Variable {

    public float value;

    public String identity;

    public NumberVariable(float value, String identity, String parent){
        super(value, identity,parent,"number");
    }
    public NumberVariable(float value, String identity){
        super(value, identity,"GLOBAL","number");
    }
}
