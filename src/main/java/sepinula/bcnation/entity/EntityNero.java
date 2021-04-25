package sepinula.bcnation.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import sepinula.bcnation.AddedItems;

public class EntityNero extends EntityAnimal
{
    public EntityNero(World world)
    {
        super(world);
        setSize(0.5F,0.5F);
        preventEntitySpawning = true;
        this.setSize(0.5F, 0.5F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(2, new EntityAITempt(this, 1.2D, AddedItems.GrimorioAsta, false));
        this.tasks.addTask(3, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(5, new EntityAILookIdle(this));
    }

    public boolean isAIEnabled()
    {
        return true;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    }

    protected void updateAITasks()
    {
        super.updateAITasks();
    }

    public EntityNero(World world, double x, double y, double z) {
        this(world);
        setPosition(x,y,z);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entity) {
        return new EntityNero(worldObj);
    }
}
