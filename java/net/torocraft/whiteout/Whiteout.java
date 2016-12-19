package net.torocraft.whiteout;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Whiteout.MODID, name = Whiteout.MODNAME, version = Whiteout.VERSION)
public class Whiteout {

	public static final String MODID = "whiteout";
	public static final String VERSION = "1.11.2-1";
	public static final String MODNAME = "Whiteout";

	@SidedProxy(clientSide = "net.torocraft.whiteout.ClientProxy", serverSide = "net.torocraft.whiteout.ServerProxy")
	public static CommonProxy proxy;

	@Instance(value = Whiteout.MODID)
	public static Whiteout instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

}
