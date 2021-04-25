package sepinula.bcnation.renders.npcs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import sepinula.bcnation.entity.EntityNero;
import sepinula.bcnation.lib.Reference;

public class RenderNero extends RenderLiving
{
    private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MOD_ID + ":textures/entity/Nero.png");
    private static final String __OBFID = "CL_00000984";

    public RenderNero(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }



    //Retorna a localização da textura de uma entidade. Não parece ser chamado, a menos que você chame Render.bindEntityTexture.

    protected ResourceLocation getEntityTexture(EntityNero par1EntityPig)
    {
        return mobTextures;
    }


    //Retorna a localização da textura de uma entidade. Não parece ser chamado, a menos que você chame Render.bindEntityTexture.

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityNero)par1Entity);
    }
}


