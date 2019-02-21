package net.harrykerr.discordsl.discordsl.types;

public abstract class Variable {
    public Object value;

    public String identity;

    public String type;

    public Variable(Object value, String identity, String type){
        this.value = value;
        this.identity = identity;
        this.type = type;
    }
}
