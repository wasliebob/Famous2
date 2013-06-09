package mods.Famous.items;

import mods.Famous.Famous;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SpawnWaterPlace extends Item
{
       public SpawnWaterPlace(int id)
       {
             super(id);
             this.setCreativeTab(Famous.tabCustom);
             setUnlocalizedName("Famous:waterp");
       }
       
       public void updateIcons(IconRegister par1IconRegister) {
           this.itemIcon = par1IconRegister.registerIcon("Famous:waterp");
           
       }
      
       //What to place and where to
       public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
       {
                if(!par3World.isRemote)
                {
                	if(par3World.getBlockId(par4, par5, par6) == Block.bedrock.blockID)
                	{
                		return false;
                	}else{
                		
                	//Stone 1
                	par3World.setBlock(par4 +1, par5, par6, Block.stone.blockID);
                	par3World.setBlock(par4 +1, par5 + 1, par6, Block.stone.blockID);
                	par3World.setBlock(par4 +1, par5 + 2, par6, Block.stone.blockID);
                	par3World.setBlock(par4 +1, par5 + 3, par6, Block.stone.blockID);
                	par3World.setBlock(par4 +1, par5 + 4, par6, Block.stone.blockID);
                	par3World.setBlock(par4 +1, par5 + 5, par6, Block.stone.blockID);
                	
                	//Stone -1
                	par3World.setBlock(par4 -1, par5, par6, Block.stone.blockID);
                	par3World.setBlock(par4 -1, par5 + 1, par6, Block.stone.blockID);
                	par3World.setBlock(par4 -1, par5 + 2, par6, Block.stone.blockID);
                	par3World.setBlock(par4 -1, par5 + 3, par6, Block.stone.blockID);
                	par3World.setBlock(par4 -1, par5 + 4, par6, Block.stone.blockID);
                	par3World.setBlock(par4 -1, par5 + 5, par6, Block.stone.blockID);
                	
                	
                	//Stone 2
                	par3World.setBlock(par4, par5, par6 +1, Block.stone.blockID);
                	par3World.setBlock(par4, par5 + 1, par6 +1, Block.stone.blockID);
                	par3World.setBlock(par4, par5 + 2, par6 +1, Block.stone.blockID);
                	par3World.setBlock(par4, par5 + 3, par6 +1, Block.stone.blockID);
                	par3World.setBlock(par4, par5 + 4, par6 +1, Block.stone.blockID);
                	par3World.setBlock(par4, par5 + 5, par6 +1, Block.stone.blockID);
                	
                	//Stone -2
                	par3World.setBlock(par4, par5, par6 -1, Block.stone.blockID);
                	par3World.setBlock(par4, par5 + 1, par6 -1, Block.stone.blockID);
                	par3World.setBlock(par4, par5 + 2, par6 -1, Block.stone.blockID);
                	par3World.setBlock(par4, par5 + 3, par6 -1, Block.stone.blockID);
                	par3World.setBlock(par4, par5 + 4, par6 -1, Block.stone.blockID);
                	par3World.setBlock(par4, par5 + 5, par6 -1, Block.stone.blockID);
                	
                	//Air 1
                	par3World.setBlock(par4, par5, par6, 0);
                	par3World.setBlock(par4, par5 + 1, par6, 0);
                	par3World.setBlock(par4, par5 + 2, par6, 0);
                	par3World.setBlock(par4, par5 + 3, par6, 0);
                	par3World.setBlock(par4, par5 + 4, par6, 0);
                	par3World.setBlock(par4, par5 + 5, par6, 0);
                	
                	//Click here Block
                	par3World.setBlock(par4, par5 + 6, par6, Famous.Click.blockID);

                       return true;
                }
                }
				return true;
       }
}