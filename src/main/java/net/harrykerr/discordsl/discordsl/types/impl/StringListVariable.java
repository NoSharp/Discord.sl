package net.harrykerr.discordsl.discordsl.types.impl;

import net.harrykerr.discordsl.discordsl.types.Variable;

import java.util.List;

public class StringListVariable extends Variable {
    public StringListVariable(List<String> value, String identity, String parent) {
        super(value, identity, parent, "StringList");
    }
    public StringListVariable(List<String> value, String identity) {
        super(value, identity, "GLOBAL", "StringList");
    }
}
