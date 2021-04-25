package sepinula.bcnation.models.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelJavalim extends ModelBase {
    public ModelRenderer Corpo;
    public ModelRenderer LeftLeg1;
    public ModelRenderer RightLeg1;
    public ModelRenderer LeftLeg2;
    public ModelRenderer RightLeg2;
    public ModelRenderer Head;
    public ModelRenderer Nariz;
    public ModelRenderer Dente1;
    public ModelRenderer dente2;
    public ModelRenderer dente3;
    public ModelRenderer dente4;
    public ModelRenderer Dente1_1;
    public ModelRenderer dente2_1;
    public ModelRenderer dente3_1;
    public ModelRenderer dente4_1;

    public ModelJavalim() {
        this.textureWidth = 512;
        this.textureHeight = 256;
        this.Dente1_1 = new ModelRenderer(this, 0, 58);
        this.Dente1_1.setRotationPoint(-2.9F, 5.1F, -14.3F);
        this.Dente1_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotation(Dente1_1, -0.5009094953223726F, 0.0F, 0.0F);
        this.dente2 = new ModelRenderer(this, 0, 52);
        this.dente2.setRotationPoint(2.5F, 4.6F, -15.0F);
        this.dente2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, -0.1F);
        this.setRotation(dente2, -0.6373942428283291F, 0.0F, 0.0F);
        this.Nariz = new ModelRenderer(this, 110, 25);
        this.Nariz.setRotationPoint(-1.7F, 2.8F, -15.0F);
        this.Nariz.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
        this.LeftLeg2 = new ModelRenderer(this, 20, 70);
        this.LeftLeg2.setRotationPoint(1.4F, 10.1F, -6.7F);
        this.LeftLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.2F);
        this.RightLeg2 = new ModelRenderer(this, 30, 70);
        this.RightLeg2.setRotationPoint(-3.9F, 10.1F, -6.7F);
        this.RightLeg2.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.2F);
        this.dente4_1 = new ModelRenderer(this, 0, 64);
        this.dente4_1.setRotationPoint(-2.9F, 4.1F, -16.2F);
        this.dente4_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, -0.3F);
        this.setRotation(dente4_1, 0.22759093446006054F, 0.0F, 0.0F);
        this.RightLeg1 = new ModelRenderer(this, 10, 70);
        this.RightLeg1.setRotationPoint(-3.9F, 10.1F, 6.7F);
        this.RightLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.2F);
        this.dente4 = new ModelRenderer(this, 0, 56);
        this.dente4.setRotationPoint(2.5F, 4.1F, -16.2F);
        this.dente4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, -0.3F);
        this.setRotation(dente4, 0.22759093446006054F, 0.0F, 0.0F);
        this.LeftLeg1 = new ModelRenderer(this, 0, 70);
        this.LeftLeg1.setRotationPoint(1.4F, 10.1F, 6.7F);
        this.LeftLeg1.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.2F);
        this.dente2_1 = new ModelRenderer(this, 0, 60);
        this.dente2_1.setRotationPoint(-2.9F, 4.6F, -15.0F);
        this.dente2_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, -0.1F);
        this.setRotation(dente2_1, -0.6373942428283291F, 0.0F, 0.0F);
        this.Dente1 = new ModelRenderer(this, 0, 50);
        this.Dente1.setRotationPoint(2.5F, 5.1F, -14.3F);
        this.Dente1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotation(Dente1, -0.5009094953223726F, 0.0F, 0.0F);
        this.dente3 = new ModelRenderer(this, 0, 54);
        this.dente3.setRotationPoint(2.5F, 4.8F, -16.1F);
        this.dente3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F);
        this.setRotation(dente3, 0.6373942428283291F, 0.0F, 0.0F);
        this.Corpo = new ModelRenderer(this, 0, 15);
        this.Corpo.setRotationPoint(-4.8F, 1.2F, -10.0F);
        this.Corpo.addBox(0.0F, 0.0F, 0.0F, 10, 9, 19, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-3.8F, -0.9F, -14.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 8, 8, 7, 0.0F);
        this.dente3_1 = new ModelRenderer(this, 0, 62);
        this.dente3_1.setRotationPoint(-2.9F, 4.8F, -16.1F);
        this.dente3_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F);
        this.setRotation(dente3_1, 0.6373942428283291F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Dente1_1.render(f5);
        this.dente2.render(f5);
        this.Nariz.render(f5);
        this.LeftLeg2.render(f5);
        this.RightLeg2.render(f5);
        this.dente4_1.render(f5);
        this.RightLeg1.render(f5);
        this.dente4.render(f5);
        this.LeftLeg1.render(f5);
        this.dente2_1.render(f5);
        this.Dente1.render(f5);
        this.dente3.render(f5);
        this.Corpo.render(f5);
        this.Head.render(f5);
        this.dente3_1.render(f5);
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
        float f6 = (180F / (float)Math.PI);
        this.LeftLeg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.LeftLeg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.RightLeg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.RightLeg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    }
}
