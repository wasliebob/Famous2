package mods.Famous.items;

import mods.Famous.Famous;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.Event;

public class HealPowder extends Item{

	 	public HealPowder(int par1, int par2, float par3, boolean par4) {
	 		super(par1);
                
             // Constructor Configuration
                setMaxStackSize(64);
                setCreativeTab(Famous.tabCustom);
                setUnlocalizedName("Famous:heal");
                setFull3D();
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon("Famous:heal");
            
        }
        
        public boolean onItemUse(ItemStack is, EntityPlayer player, World w, int x, int y, int z, int l, float f, float f1, float f3){ //Called when an item is right clicked on a block
        	if(player.getHealth() < 20){
        		player.heal(20);
        	}
        	return false;

        	}
}