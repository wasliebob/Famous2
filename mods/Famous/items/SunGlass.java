package mods.Famous.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class SunGlass extends ItemArmor implements IArmorTextureProvider
{

public SunGlass(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
{
super(par1, par2EnumArmorMaterial, par3, par4);
this.setUnlocalizedName("Famous:sun");

}


@Override
public String getArmorTextureFile(ItemStack itemstack)
{
return "/mods/Famous/textures/armor/sun.png";
}

public void registerIcons(IconRegister par1IconRegister) {
    this.itemIcon = par1IconRegister.registerIcon("Famous:sun");
    
}
}