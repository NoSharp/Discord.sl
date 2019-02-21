package net.harrykerr.discordsl.discordsl;

import net.harrykerr.discordsl.discordsl.grammars.discordslLexer;
import net.harrykerr.discordsl.discordsl.grammars.discordslParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static final String EXAMPLES_PATH = "C:\\Users\\Harry\\Desktop\\Code\\Discord.sl\\src\\main\\java\\net\\harrykerr\\discordsl\\discordsl\\examples";

    public static void main(String[] args){
        //System.out.println("WORKS");
        try {
            discordslLexer lexer = new discordslLexer(
                    new ANTLRFileStream(EXAMPLES_PATH + "\\numbervar.dsl"));

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            discordslParser parser = new discordslParser(tokens);
            ParseTree tree = parser.start();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk((ParseTreeListener) new DiscordSLWalker(), tree);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
