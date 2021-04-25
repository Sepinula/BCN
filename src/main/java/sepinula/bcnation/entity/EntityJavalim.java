package sepinula.bcnation.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityJavalim extends EntityAnimal
{

    public EntityJavalim(World world)
    {
        super(world);
        setSize(0.9F,0.9F);
        preventEntitySpawning = true;
        this.setSize(0.9F, 0.9F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.carrot_on_a_stick, false));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.carrot, false));
        this.tasks.addTask(5, new EntityAIFollowParent(this, 1.1D));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
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



    //Retorna o som que este mob faz enquanto está vivo.

    protected String getLivingSound()
    {
        return "mob.pig.say";
    }

    //Retorna o som que este mob faz quando está ferido.

    protected String getHurtSound()
    {
        return "mob.pig.say";
    }

    //Retorna o som que este mob faz ao morrer.

    protected String getDeathSound()
    {
        return "mob.pig.death";
    }


    public EntityJavalim(World world, double x, double y, double z) {
        this(world);
        setPosition(x,y,z);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entity) {
        return new EntityJavalim(worldObj);
    }
}
