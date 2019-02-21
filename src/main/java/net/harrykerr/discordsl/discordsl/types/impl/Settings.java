package net.harrykerr.discordsl.discordsl.types.impl;

public class Settings {
    public String token;
    public String commandPrefix;
    public boolean enableHelp;
    public String status;
    public String game;

    public Settings(String token, String commandPrefix, String enableHelp, String status, String game){
        this.token = token;
        this.commandPrefix = commandPrefix;
        this.enableHelp = enableHelp.toLowerCase().equals("yes") || enableHelp.toLowerCase().equals("true");
        this.status = status;
        this.game = game;

    }
}
