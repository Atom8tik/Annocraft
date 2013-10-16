package annocraft;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class annoItem extends Item {

	public annoItem(int id, String assetName, int stackSize) {
		super(id);
		this.setUnlocalizedName(assetName);
		this.setTextureName(annocraft.TEXTURE_PREFIX + assetName);
		this.setMaxStackSize(stackSize);
	}

	@Override
	public CreativeTabs getCreativeTab() {
		return annocraft.annoCraftTab;
	}

}