package mods.Famous.mobs;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.world.World;


public class Isp extends EntityMob
{
public Isp(World par1World) 
{
super(par1World);
this.texture = "/mobs/Famous/textures/mobs/isp.png";
this.moveSpeed = 0.50F;
this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIBreakDoor(this));
this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
this.tasks.addTask(5, new EntityAIOpenDoor(this, hasAttacked));
this.tasks.addTask(6, new EntityAIAttackOnCollide(this, Honeydew.class, this.moveSpeed, false));
this.tasks.addTask(7, new EntityAIAttackOnCollide(this, Xephos.class, this.moveSpeed, false));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, Honeydew.class, 16.0F, 0, true));
this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, Xephos.class, 16.0F, 0, true));
}

public int getAttackStrength(Entity par1Entity) { return 6; }

protected boolean isAIEnabled()
    {
        return true;
    }

public int getMaxHealth() 
{
return 80;
}

public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
public String getTexture()
{
return "/mods/Famous/textures/mobs/isp.png";
}

protected int getDropItemId()
{
    return Item.ingotGold.itemID;

}

protected void dropRareDrop(int par1)
{
    switch (this.rand.nextInt(2))
    {
        case 0:
            this.dropItem(ItemPickaxe.pickaxeIron.itemID, 1);
            break;
        case 1:
            this.dropItem(ItemPickaxe.pickaxeDiamond.itemID, 1);
            break;
    }
}

protected void dropFewItems(boolean par1, int par2)
{
if(this.rand.nextInt(3) == 0)
{
this.dropItem(Item.appleRed.itemID, 1);
}
}
}