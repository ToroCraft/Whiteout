package net.torocraft.whiteout;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.torocraft.whiteout.blocks.BlockWhite;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {

	}

	public void init(FMLInitializationEvent e) {
		BlockWhite.init();
	}

	public void postInit(FMLPostInitializationEvent e) {

	}

}
