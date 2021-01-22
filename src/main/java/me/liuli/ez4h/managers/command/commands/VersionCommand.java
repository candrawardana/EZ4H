package me.liuli.ez4h.managers.command.commands;

import me.liuli.ez4h.EZ4H;
import me.liuli.ez4h.Initialization;
import me.liuli.ez4h.managers.command.CommandBase;
import me.liuli.ez4h.minecraft.Client;

public class VersionCommand implements CommandBase {
    @Override
    public String getHelpMessage(){
        return "Show Version of EZ4H";
    }
    @Override
    public void exec(String[] args, Client client) {
        client.sendAlert("CURRENT RUNNING EZ4H v"+ Initialization.VERSION +" for Minecraft:BE v"+EZ4H.getCommonManager().getBedrockCodec().getMinecraftVersion()+".");
    }
}
