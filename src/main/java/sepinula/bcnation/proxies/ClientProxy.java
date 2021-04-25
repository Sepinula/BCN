package sepinula.bcnation.proxies;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import sepinula.bcnation.AddedItems;
import sepinula.bcnation.renders.items.*;
import sepinula.bcnation.lib.Reference;

public class ClientProxy extends CommonProxy {

    public static int[] displayDemonSlayer = new int[1];//DemonSlayer
    public static int[] displayDemonSlayerNPC = new int[1];//DemonSlayerNPC

    @Override
    public void registerRenders() {


        //Items Models

        MinecraftForgeClient.registerItemRenderer(AddedItems.DemonSlayerNPC, new RenderDemonSlayerNPC());
        final IModelCustom modelnpc = AdvancedModelLoader.loadModel(new ResourceLocation(Reference.MOD_ID, "models/swords/DemonSlayerNPC.obj"));
        displayDemonSlayerNPC[0] = GLAllocation.generateDisplayLists(1);
        GL11.glNewList(displayDemonSlayerNPC[0], GL11.GL_COMPILE);
        modelnpc.renderAll();
        GL11.glEndList();

        MinecraftForgeClient.registerItemRenderer(AddedItems.DemonSlayer, new RenderDemonSlayer());
        final IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation(Reference.MOD_ID, "models/swords/DemonSlayer.obj"));
        displayDemonSlayer[0] = GLAllocation.generateDisplayLists(1);
        GL11.glNewList(displayDemonSlayer[0], GL11.GL_COMPILE);
        model.renderAll();
        GL11.glEndList();


        MinecraftForgeClient.registerItemRenderer(AddedItems.GrimorioAsta, new RenderGrimorioAsta());
        MinecraftForgeClient.registerItemRenderer(AddedItems.GrimorioYuno, new RenderGrimorioYuno());
    }
}
