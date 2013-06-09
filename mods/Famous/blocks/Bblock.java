package mods.Famous.blocks;

import java.util.Random;

import mods.Famous.Famous;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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

public class Bblock extends Block {

        public Bblock(int id) {
                super(id, Material.rock);
                
             // Constructor Configuration
                setCreativeTab(Famous.tabCustom);
                setUnlocalizedName("Famous:budderb");
                setResistance(5.0F);
                setHardness(1F);
        }
        
        
        public void registerIcons(IconRegister iconRegister)
        {
                 blockIcon = iconRegister.registerIcon("Famous:budderb");
        }
}