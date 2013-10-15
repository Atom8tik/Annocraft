package guzel;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Guzelcore", name = "Guzel", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Guzel {

	private static Item guzelItem;

	// The instance of your mod that Forge uses.
	@Instance(value = "Guzelcore")
	public static Guzel instance;
	
	public static String TEXTURE_DOMAIN = "Guzel";
    public static String TEXTURE_PREFIX = Guzel.TEXTURE_DOMAIN + ":";
	

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
		guzelItem = new GuzelItem(5000,"guzelItem",64);

	}


	@EventHandler
	public void load(FMLInitializationEvent event) {
		LanguageRegistry.addName(guzelItem, "Kevin´s Minecraft ITEM RTL = BEST");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}