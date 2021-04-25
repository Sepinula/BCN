package sepinula.bcnation.models.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelNero extends ModelBase {
    public ModelRenderer CabecaNero;
    public ModelRenderer Bico1;
    public ModelRenderer Bico2;
    public ModelRenderer Bico3;
    public ModelRenderer Tronco;
    public ModelRenderer Asa1;
    public ModelRenderer Asa2;
    public ModelRenderer Pata1;
    public ModelRenderer Pata2;
    public ModelRenderer Chifre1;
    public ModelRenderer Chifre2;
    public ModelRenderer Chifre22;
    public ModelRenderer Chifre12;

    public ModelNero() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Asa1 = new ModelRenderer(this, 25, 0);
        this.Asa1.setRotationPoint(-1.8F, 7.0F, 1.5F);
        this.Asa1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 4, 0.0F);
        this.setRotation(Asa1, 0.7853981633974483F, 0.0F, 0.0F);
        this.Pata2 = new ModelRenderer(this, 40, 0);
        this.Pata2.setRotationPoint(4.0F, 10.0F, 2.0F);
        this.Pata2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Bico1 = new ModelRenderer(this, 56, 0);
        this.Bico1.setRotationPoint(1.0F, 3.5F, -1.0F);
        this.Bico1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.Bico2 = new ModelRenderer(this, 60, 2);
        this.Bico2.setRotationPoint(2.0F, 3.0F, -1.0F);
        this.Bico2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Tronco = new ModelRenderer(this, 0, 10);
        this.Tronco.setRotationPoint(-1.0F, 5.0F, 1.0F);
        this.Tronco.addBox(0.0F, 0.0F, 0.0F, 7, 5, 7, 0.0F);
        this.Chifre2 = new ModelRenderer(this, 0, 30);
        this.Chifre2.setRotationPoint(5.5F, 0.5F, 1.0F);
        this.Chifre2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Asa2 = new ModelRenderer(this, 25, 0);
        this.Asa2.setRotationPoint(5.8F, 7.0F, 1.5F);
        this.Asa2.addBox(0.0F, 0.0F, 0.0F, 1, 8, 4, 0.0F);
        this.setRotation(Asa2, 0.7853981633974483F, 0.0F, 0.0F);
        this.Bico3 = new ModelRenderer(this, 60, 4);
        this.Bico3.setRotationPoint(2.0F, 3.5F, -2.0F);
        this.Bico3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Chifre12 = new ModelRenderer(this, 0, 30);
        this.Chifre12.setRotationPoint(-2.5F, -0.5F, 1.0F);
        this.Chifre12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Chifre22 = new ModelRenderer(this, 0, 30);
        this.Chifre22.setRotationPoint(6.5F, -0.5F, 1.0F);
        this.Chifre22.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Pata1 = new ModelRenderer(this, 40, 0);
        this.Pata1.setRotationPoint(0.0F, 10.0F, 2.0F);
        this.Pata1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Chifre1 = new ModelRenderer(this, 0, 30);
        this.Chifre1.setRotationPoint(-2.5F, 0.5F, 1.0F);
        this.Chifre1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.CabecaNero = new ModelRenderer(this, 0, 0);
        this.CabecaNero.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.CabecaNero.addBox(0.0F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Asa1.offsetX, this.Asa1.offsetY, this.Asa1.offsetZ);
        GL11.glTranslatef(this.Asa1.rotationPointX * f5, this.Asa1.rotationPointY * f5, this.Asa1.rotationPointZ * f5);
        GL11.glScaled(0.8D, 0.5D, 1.0D);
        GL11.glTranslatef(-this.Asa1.offsetX, -this.Asa1.offsetY, -this.Asa1.offsetZ);
        GL11.glTranslatef(-this.Asa1.rotationPointX * f5, -this.Asa1.rotationPointY * f5, -this.Asa1.rotationPointZ * f5);
        this.Asa1.render(f5);
        GL11.glPopMatrix();
        this.Pata2.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Bico1.offsetX, this.Bico1.offsetY, this.Bico1.offsetZ);
        GL11.glTranslatef(this.Bico1.rotationPointX * f5, this.Bico1.rotationPointY * f5, this.Bico1.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.5D, 1.0D);
        GL11.glTranslatef(-this.Bico1.offsetX, -this.Bico1.offsetY, -this.Bico1.offsetZ);
        GL11.glTranslatef(-this.Bico1.rotationPointX * f5, -this.Bico1.rotationPointY * f5, -this.Bico1.rotationPointZ * f5);
        this.Bico1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Bico2.offsetX, this.Bico2.offsetY, this.Bico2.offsetZ);
        GL11.glTranslatef(this.Bico2.rotationPointX * f5, this.Bico2.rotationPointY * f5, this.Bico2.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.5D, 1.0D);
        GL11.glTranslatef(-this.Bico2.offsetX, -this.Bico2.offsetY, -this.Bico2.offsetZ);
        GL11.glTranslatef(-this.Bico2.rotationPointX * f5, -this.Bico2.rotationPointY * f5, -this.Bico2.rotationPointZ * f5);
        this.Bico2.render(f5);
        GL11.glPopMatrix();
        this.Tronco.render(f5);
        this.Chifre2.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Asa2.offsetX, this.Asa2.offsetY, this.Asa2.offsetZ);
        GL11.glTranslatef(this.Asa2.rotationPointX * f5, this.Asa2.rotationPointY * f5, this.Asa2.rotationPointZ * f5);
        GL11.glScaled(0.8D, 0.5D, 1.0D);
        GL11.glTranslatef(-this.Asa2.offsetX, -this.Asa2.offsetY, -this.Asa2.offsetZ);
        GL11.glTranslatef(-this.Asa2.rotationPointX * f5, -this.Asa2.rotationPointY * f5, -this.Asa2.rotationPointZ * f5);
        this.Asa2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Bico3.offsetX, this.Bico3.offsetY, this.Bico3.offsetZ);
        GL11.glTranslatef(this.Bico3.rotationPointX * f5, this.Bico3.rotationPointY * f5, this.Bico3.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.5D, 1.0D);
        GL11.glTranslatef(-this.Bico3.offsetX, -this.Bico3.offsetY, -this.Bico3.offsetZ);
        GL11.glTranslatef(-this.Bico3.rotationPointX * f5, -this.Bico3.rotationPointY * f5, -this.Bico3.rotationPointZ * f5);
        this.Bico3.render(f5);
        GL11.glPopMatrix();
        this.Chifre12.render(f5);
        this.Chifre22.render(f5);
        this.Pata1.render(f5);
        this.Chifre1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.CabecaNero.offsetX, this.CabecaNero.offsetY, this.CabecaNero.offsetZ);
        GL11.glTranslatef(this.CabecaNero.rotationPointX * f5, this.CabecaNero.rotationPointY * f5, this.CabecaNero.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.0D, 1.2D);
        GL11.glTranslatef(-this.CabecaNero.offsetX, -this.CabecaNero.offsetY, -this.CabecaNero.offsetZ);
        GL11.glTranslatef(-this.CabecaNero.rotationPointX * f5, -this.CabecaNero.rotationPointY * f5, -this.CabecaNero.rotationPointZ * f5);
        this.CabecaNero.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles( f, f1, f2, f3, f4, f5, entity);
    }
}
