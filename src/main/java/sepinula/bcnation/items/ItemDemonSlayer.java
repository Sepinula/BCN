package sepinula.bcnation.items;

import net.minecraft.item.Item;

import net.minecraft.item.ItemSword;
import sepinula.bcnation.lib.Reference;

public class ItemDemonSlayer extends ItemSword {

    public ItemDemonSlayer(ToolMaterial DemonSlayerMaterial) {
        super(DemonSlayerMaterial);
        this.setUnlocalizedName("DemonSlayer");
        this.setTextureName(Reference.MOD_ID + ":DemonSlayer");
        this.setMaxStackSize(1);
        this.setFull3D();
    }
}