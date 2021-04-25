package sepinula.bcnation;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import sepinula.bcnation.blocks.BlockAsta;

import java.util.ArrayList;
import java.util.List;

public class AddedBlocks {
    public static Block AstaBlock;
    public static List<Block>blockList=new ArrayList<Block>();

    public static void registerBlocks(){
        blockList.add(AstaBlock=new BlockAsta(Material.wood).setCreativeTab(BCNation.bcnTab));

        for(Block block:blockList){
            GameRegistry.registerBlock(block, block.getUnlocalizedName());
        }
    }
}
