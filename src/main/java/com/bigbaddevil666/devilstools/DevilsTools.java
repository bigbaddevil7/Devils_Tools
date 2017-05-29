package com.bigbaddevil666.devilstools;

import com.bigbaddevil666.devilstools.command.CommandInvis;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.bigbaddevil666.devilstools.proxy.CommonProxy;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME ,version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class DevilsTools
{
    public static final String MODID = "devilstools";
    public static final String VERSION = "1.0";



    @Mod.Instance
    public static DevilsTools instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }

    @EventHandler
    public void onServerLoad(FMLServerStartingEvent event){
        event.registerServerCommand(new CommandInvis());
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}



