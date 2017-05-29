package com.bigbaddevil666.devilstools.command;

import ibxm.Player;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

/**
 * Created by st8pl on 5/27/2017.
 */
public class CommandInvis extends CommandBase {

    @Override
    public String getCommandName() {

        return "invis";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "invis <player>";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        World world = sender.getEntityWorld();
        if(!world.isRemote){
            if (args.length == 0){
                sender.addChatMessage(new TextComponentString("Invalid Argument"));

            }else {
                sender.addChatMessage(new TextComponentString("you are now invisible!"));
                EntityPlayer player = getCommandSenderAsPlayer(sender);
            }

            }
        }

}


