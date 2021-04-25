package sepinula.bcnation.models.items;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;


public class ModelGrimorio extends ModelBase {
    public ModelRenderer Capa1;
    public ModelRenderer Capa2;
    public ModelRenderer Apoiador;
    public ModelRenderer Folhas;

    public ModelGrimorio() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.Folhas = new ModelRenderer(this, 1, 1);
        this.Folhas.setRotationPoint(-7.0F, 13.0F, -3.0F);
        this.Folhas.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
        this.Apoiador = new ModelRenderer(this, 17, 1);
        this.Apoiador.setRotationPoint(-7.25F, 12.5F, -3.0F);
        this.Apoiador.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.Capa1 = new ModelRenderer(this, 1, 21);
        this.Capa1.setRotationPoint(-7.5F, 13.0F, -3.0F);
        this.Capa1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
        this.Capa2 = new ModelRenderer(this, 16, 21);
        this.Capa2.setRotationPoint(-6.0F, 13.0F, -3.0F);
        this.Capa2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Folhas.offsetX, this.Folhas.offsetY, this.Folhas.offsetZ);
        GL11.glTranslatef(this.Folhas.rotationPointX * f5, this.Folhas.rotationPointY * f5, this.Folhas.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.9D, 1.0D);
        GL11.glTranslatef(-this.Folhas.offsetX, -this.Folhas.offsetY, -this.Folhas.offsetZ);
        GL11.glTranslatef(-this.Folhas.rotationPointX * f5, -this.Folhas.rotationPointY * f5, -this.Folhas.rotationPointZ * f5);
        this.Folhas.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Apoiador.offsetX, this.Apoiador.offsetY, this.Apoiador.offsetZ);
        GL11.glTranslatef(this.Apoiador.rotationPointX * f5, this.Apoiador.rotationPointY * f5, this.Apoiador.rotationPointZ * f5);
        GL11.glScaled(1.5D, 0.5D, 1.0D);
        GL11.glTranslatef(-this.Apoiador.offsetX, -this.Apoiador.offsetY, -this.Apoiador.offsetZ);
        GL11.glTranslatef(-this.Apoiador.rotationPointX * f5, -this.Apoiador.rotationPointY * f5, -this.Apoiador.rotationPointZ * f5);
        this.Apoiador.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Capa1.offsetX, this.Capa1.offsetY, this.Capa1.offsetZ);
        GL11.glTranslatef(this.Capa1.rotationPointX * f5, this.Capa1.rotationPointY * f5, this.Capa1.rotationPointZ * f5);
        GL11.glScaled(0.5D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Capa1.offsetX, -this.Capa1.offsetY, -this.Capa1.offsetZ);
        GL11.glTranslatef(-this.Capa1.rotationPointX * f5, -this.Capa1.rotationPointY * f5, -this.Capa1.rotationPointZ * f5);
        this.Capa1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Capa2.offsetX, this.Capa2.offsetY, this.Capa2.offsetZ);
        GL11.glTranslatef(this.Capa2.rotationPointX * f5, this.Capa2.rotationPointY * f5, this.Capa2.rotationPointZ * f5);
        GL11.glScaled(0.5D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Capa2.offsetX, -this.Capa2.offsetY, -this.Capa2.offsetZ);
        GL11.glTranslatef(-this.Capa2.rotationPointX * f5, -this.Capa2.rotationPointY * f5, -this.Capa2.rotationPointZ * f5);
        this.Capa2.render(f5);
        GL11.glPopMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
