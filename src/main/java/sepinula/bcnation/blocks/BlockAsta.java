package sepinula.bcnation.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import sepinula.bcnation.BCNation;
import sepinula.bcnation.lib.Reference;

public class BlockAsta extends Block{
    public BlockAsta(Material material) {
        super(material);
        this.setBlockName("BlockAsta");
        this.setBlockTextureName(Reference.MOD_ID+":randomBlock");
        this.setCreativeTab(BCNation.bcnTab);
        this.setHardness(7.5F);
        this.setResistance(2000F);
        this.setStepSound(soundTypeWood);
    }
}
