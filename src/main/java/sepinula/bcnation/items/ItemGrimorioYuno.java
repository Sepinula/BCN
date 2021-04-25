package sepinula.bcnation.items;

import net.minecraft.item.Item;
import sepinula.bcnation.lib.Reference;

public class ItemGrimorioYuno extends Item {

    public ItemGrimorioYuno() {
        super();
        this.setFull3D();
        this.setUnlocalizedName("GrimorioYuno");
        this.setTextureName(Reference.MOD_ID + ":Grimorio");
        this.setMaxStackSize(1);
    }
}
