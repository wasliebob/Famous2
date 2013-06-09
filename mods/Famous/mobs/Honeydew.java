package mods.Famous.mobs;


import mods.Famous.Famous;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Honeydew extends EntityMob
{
public Honeydew(World par1World) 
{
super(par1World);
this.texture = "/mobs/Famous/textures/mobs/honeydew.png";
this.moveSpeed = 0.15F;
this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIBreakDoor(this));
this.tasks.addTask(3, new EntityAIWander(this, this.moveSpeed));
this.tasks.addTask(4, new EntityAIOpenDoor(this, hasAttacked));
this.tasks.addTask(5, new EntityAIAttackOnCollide(this, Isp.class, this.moveSpeed, false));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, Isp.class, 16.0F, 0, true));
}

public int getAttackStrength(Entity par1Entity) { return 5; }

protected boolean isAIEnabled()
    {
        return true;
    }

public int getMaxHealth() 
{
return 55;
}

public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
public String getTexture()
{
return "/mods/Famous/textures/mobs/Honeydew.png";
}


protected void dropFewItems(boolean par1, int par2)
{
this.dropItem(Famous.jaffa.itemID, 2);
}

public boolean interact(EntityPlayer player)
{
        if (!this.worldObj.isRemote)
        {
        	if(this.rand.nextInt(3) == 0)
        	{
        		player.sendChatToPlayer("Diggy Diggy Hole Diggy Hole");
        	}
        	else if(this.rand.nextInt(3) == 1)
        	{
        		player.sendChatToPlayer("I Want a World Full Of Jaffa Cake");
        	}
        	else if(this.rand.nextInt(50) == 2)
        	{
        		player.inventory.addItemStackToInventory(new ItemStack(Famous.jaffa));
        	}
        	}
		return true;
}

}