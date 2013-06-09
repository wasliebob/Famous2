package mods.Famous.mobs;


import mods.Famous.Famous;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;


public class Dire extends EntityMob
{
public Dire(World par1World) 
{
super(par1World);
this.texture = "/mobs/Famous/textures/mobs/dire.png";
this.moveSpeed = 0.20F;
this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIBreakDoor(this));
        this.tasks.addTask(3, new EntityAIWander(this, this.moveSpeed));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
}

public int getAttackStrength(Entity par1Entity) { return 4; }

protected boolean isAIEnabled()
    {
        return true;
    }

public int getMaxHealth() 
{
return 1000;
}

public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
public String getTexture()
{
return "/mods/Famous/textures/mobs/dire.png";
}


protected void dropFewItems(boolean par1, int par2)
{
this.dropItem(Block.blockRedstone.blockID, 2);
}

public boolean interact(EntityPlayer player)
{
        if (!this.worldObj.isRemote)
        {
        		player.sendChatToPlayer("Hello" + " " + player.getEntityName() + " " + "I am Direwolf20");
}
		return true;
}
}