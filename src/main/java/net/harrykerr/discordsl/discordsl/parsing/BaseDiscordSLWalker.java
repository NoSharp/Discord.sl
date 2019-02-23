package net.harrykerr.discordsl.discordsl.parsing;

import net.harrykerr.discordsl.discordsl.grammars.discordslParser;

public interface BaseDiscordSLWalker {

    void onEvent(discordslParser.StartContext ctx);

}
