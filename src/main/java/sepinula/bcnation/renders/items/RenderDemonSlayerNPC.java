package sepinula.bcnation.renders.items;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import sepinula.bcnation.lib.Reference;
import sepinula.bcnation.proxies.ClientProxy;

public class RenderDemonSlayerNPC implements IItemRenderer {

    public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/items/models/DemonSlayer.png");

    @Override
    public boolean handleRenderType(ItemStack is, ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
                return true;
            case EQUIPPED_FIRST_PERSON:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack is, ItemRendererHelper helper) {
        if (type == ItemRenderType.INVENTORY) return false;
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack is, Object... data) {

        switch (type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
            {
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                GL11.glScalef(0.5F, 0.5F, 0.5F);
                GL11.glCallList(ClientProxy.displayDemonSlayerNPC[0]);
                GL11.glPopMatrix();
            }
        }
    }
}

