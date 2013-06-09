package mods.Famous.items;

import java.util.Random;

import mods.Famous.Famous;
import mods.Famous.mobs.BossFox;
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

public class SpawnFilitor extends Item {

        public SpawnFilitor(int id) {
                super(id);
                
             // Constructor Configuration
                setMaxStackSize(64);
                setCreativeTab(Famous.tabCustom);
                setUnlocalizedName("Famous:sfy");
                setFull3D();
                shouldRotateAroundWhenRendering();
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon("Famous:sfy");
            
        }
        
        public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
        {
                 if(!par3World.isRemote)
                 {
                		Random rand = new Random();
                		BossFox ewp = new BossFox(par3World);
                		ewp.setLocationAndAngles(par4+0.5, par5+1, par6+ 0.5,(float)(rand.nextInt(15)* 360) / 16f,0f);
                		par3World.spawnEntityInWorld(ewp); 
                 }
				return bFull3D;
                 }
}