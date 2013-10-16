package annocraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class ACcreateCreativeTab extends CreativeTabs
{
    private final int itemForTab;
    private final int metaForTab;

    public ACcreateCreativeTab(int par1, String par2Str, int itemForTab, int metaForTab)
    {
        super(par1, par2Str);
        this.itemForTab = itemForTab;
        this.metaForTab = metaForTab;
    }

    @Override
    public ItemStack getIconItemStack()
    {
    	
        return new ItemStack(annocraft.guzelItem, 1, 0);
    }
}