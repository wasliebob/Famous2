package mods.Famous.mobs;


import mods.Famous.Config;
import mods.Famous.Famous;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Sky extends EntityMob
{
public Sky(World par1World) 
{
super(par1World);
this.texture = "/mobs/Famous/textures/mobs/sky.png";
this.moveSpeed = 0.25F;
this.addRandomArmor();
this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIBreakDoor(this));
        this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(5, new EntityAIOpenDoor(this, hasAttacked));
        this.tasks.addTask(6, new EntityAIAttackOnCollide(this, EntitySquid.class, this.moveSpeed, false));
        this.tasks.addTask(6, new EntityAIAttackOnCollide(this, EntitySMan.class, this.moveSpeed, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntitySquid.class, 16.0F, 0, true));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntitySMan.class, 16.0F, 0, true));

}

public int getAttackStrength(Entity par1Entity) { return 4; }

protected boolean isAIEnabled()
    {
        return true;
    }

public int getMaxHealth() 
{
return 50;
}

public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
public String getTexture()
{
return "/mods/Famous/textures/mobs/sky.png";
}

protected void dropFewItems(boolean par1, int par2)
{
this.dropItem(Famous.FamousItem.itemID, 1);
}

public boolean interact(EntityPlayer player)
{
        if (!this.worldObj.isRemote)
        {
        	if(this.rand.nextInt(3) == 0)
        	{
        		player.sendChatToPlayer("Butter FTW");
        	}
        		else if(this.rand.nextInt(3) == 1)
        	{
        		player.sendChatToPlayer("Kill All The Squids");
        	}
        	else if(this.rand.nextInt(50) == 2)
        	{
        		player.inventory.addItemStackToInventory(new ItemStack(Famous.FamousItem));
        	}
        	}
		return true;
}
}