package net.harrykerr.discordsl.discordsl.types.impl;

import net.harrykerr.discordsl.discordsl.types.Variable;

import java.util.List;

public class FloatListVariable extends Variable {

    public FloatListVariable(List<Float> value, String identity, String parent) {
        super(value, identity,parent ,"FloatList");
    }
    public FloatListVariable(List<Float> value, String identity) {
        super(value, identity,"GLOBAL" ,"FloatList");
    }
}
