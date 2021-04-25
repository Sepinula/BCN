package sepinula.bcnation.items;

import net.minecraft.item.Item;
import sepinula.bcnation.lib.Reference;

public class ItemGrimorioAsta extends Item {

    public ItemGrimorioAsta() {
        super();
        this.setFull3D();
        this.setUnlocalizedName("GrimorioAsta");
        this.setTextureName(Reference.MOD_ID + ":Grimorio");
        this.setMaxStackSize(1);
    }
}
