package sepinula.bcnation.creativetabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sepinula.bcnation.AddedItems;

public class TabBCNation extends CreativeTabs {
    public TabBCNation(int id, String name) {
        super(id, name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem(){
        return AddedItems.DemonSlayer;
    }
}
