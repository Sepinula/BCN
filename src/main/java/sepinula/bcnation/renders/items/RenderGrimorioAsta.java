package sepinula.bcnation.renders.items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import sepinula.bcnation.lib.Reference;
import sepinula.bcnation.models.items.ModelGrimorio;

public class RenderGrimorioAsta implements IItemRenderer {

    protected ModelGrimorio model;

    public RenderGrimorioAsta() {
        model = new ModelGrimorio();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
                return true;
            default: return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

        switch(type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
                    GL11.glPushMatrix();

                    Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/items/models/GrimorioAsta.png"));

                    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(180.0F, 1.0F, 1.0F, 0.0F);
                    GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);

                    GL11.glTranslatef(1.3F, -1.8F, -0.2F);


                    GL11.glScalef(2.0F, 2.0F, 2.0F);
                    model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                    GL11.glPopMatrix();
                default:
                    break;
            }
        }
    }
