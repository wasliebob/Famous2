package mods.Famous.items;

import mods.Famous.Famous;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class FoodJaffa extends ItemFood{

 public FoodJaffa(int par1, int par2, float par3, boolean par4) {
  super(par1, par2, par3, par4);
  this.setCreativeTab(Famous.tabCustom);
  this.setFull3D();
  this.setUnlocalizedName("Famous:jaffa");

 }
 
 public void updateIcons(IconRegister iconRegister) {
    itemIcon = iconRegister.registerIcon("Famous:jaffa");
 }
}