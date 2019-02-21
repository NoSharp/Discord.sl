package net.harrykerr.discordsl.discordsl.types;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class Variable {
    /**
     * <p>
     *    Identifier of the variable.
     * </p>
     */
    public String identifier;

    /**
     * <p>
     *    Get's the variables' value.
     * </p>
     * @return Object value.
     */
    public abstract Object getValue();

    /**
     * <p>
     *    Get's the parent in the current context, of the inferred instance of the variable.
     * </p>
     * @return Parent.
     */
    public abstract ParserRuleContext getParent();

    /**
     * <p>
     *    Get's the child in the current context, of the inferred instance of the variable.
     * </p>
     * @return Child.
     */
    public abstract ParserRuleContext getChild();
}
