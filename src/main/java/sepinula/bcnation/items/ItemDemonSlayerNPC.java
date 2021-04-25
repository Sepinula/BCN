package sepinula.bcnation.items;

import net.minecraft.item.ItemSword;
import sepinula.bcnation.lib.Reference;

public class ItemDemonSlayerNPC extends ItemSword {

        public ItemDemonSlayerNPC(ToolMaterial DemonSlayerMaterial) {
        super(DemonSlayerMaterial);
        this.setUnlocalizedName("DemonSlayerNPC");
        this.setTextureName(Reference.MOD_ID + ":DemonSlayer");
        this.setMaxStackSize(1);
        this.setFull3D();
    }
}
