package net.harrykerr.discordsl.discordsl.types;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class Block {

    /**
     * <p>
     *     Get's the child of the block instance, which is inferred from it's implementation.
     * </p>
     *
     * @return Child
     */
    public abstract ParserRuleContext getChild();

    /**
     * <p>
     *     Get's the parent of the block instance, which is inferred from it's implementation.
     * </p>
     * @return Parent
     */
    public abstract ParserRuleContext getParent();


}
