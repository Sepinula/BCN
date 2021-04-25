package sepinula.bcnation.renders.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import sepinula.bcnation.lib.Reference;
import sepinula.bcnation.proxies.ClientProxy;

public class RenderDemonSlayer implements IItemRenderer {

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
            {
                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                GL11.glScalef(1.0F, 1.0F, 1.0F);
                GL11.glCallList(ClientProxy.displayDemonSlayer[0]);
                GL11.glPopMatrix();


            }
            case EQUIPPED_FIRST_PERSON:
            {

                GL11.glPushMatrix();

                Minecraft.getMinecraft().renderEngine.bindTexture(texture);

                boolean isFirstPerson = false;

                if(data[1] != null && data[1] instanceof EntityPlayer)
                {
                    if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F)))
                    {
                        GL11.glTranslatef(0.0F, 0F, 1.0F);
                    }
                    else
                    {
                        isFirstPerson = true;

                        GL11.glRotatef(50.0F, 0.0F, 0.0F, 1.0F);
                        GL11.glRotatef(75.0F, 1.0F, 0.0F, 0.0F);
                        GL11.glRotatef(195.0F, 0.0F, 0.0F, 1.0F);


                        GL11.glTranslatef(-1.0F, -1.0F, 1.0F);


                        GL11.glScalef(1.0F, 1.0F, 1.0F);
                        GL11.glCallList(ClientProxy.displayDemonSlayer[0]);

                    }
                }
                else
                {
                    GL11.glTranslatef(0.0F, 0.0F, 1.0F);
                }

                GL11.glPopMatrix();
            }
        }
    }
}

