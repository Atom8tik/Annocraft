package annocraft;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Annocraft", name = "Annocraft", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class annocraft {

	static Item guzelItem;

	// The instance of your mod that Forge uses.
	@Instance(value = "Annocraft")
	public static annocraft instance;

	public static String CHANNEL = "Annocraft";
	public static String TEXTURE_DOMAIN = "annocraft";
	public static String TEXTURE_PREFIX = annocraft.TEXTURE_DOMAIN + ":";

	public static CreativeTabs annoCraftTab;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		guzelItem = new annoItem(9001, "guzelItem", 1);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		annoCraftTab = new ACcreateCreativeTab(CreativeTabs.getNextID(),
				CHANNEL, 9001, 0);
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		LanguageRegistry.addName(guzelItem, "Anno taler");
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup." + CHANNEL, "en_US", CHANNEL);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}