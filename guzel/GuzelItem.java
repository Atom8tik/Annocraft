package guzel;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class GuzelItem extends Item {

	public GuzelItem(int id, String assetName, int stackSize) {
		super(id);
		this.setUnlocalizedName(assetName);
		this.setTextureName(Guzel.TEXTURE_PREFIX + assetName);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(stackSize);
	}

}