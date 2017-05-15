package drew.buckler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = buckler.MODID, name = buckler.MODNAME, version = buckler.VERSION)
public class buckler {

	public static final String MODID = "buckler";
	public static final String MODNAME = "Buckle's Skills Mod";
	public static final String VERSION = "1.0.0-3";
	
	@Instance
	public static buckler instance = new buckler();
	
	@SidedProxy(serverSide = "drew.buckler.ServerProxy", clientSide = "drew.buckler.ClientProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	
}
