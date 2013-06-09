package mods.Famous.tools;

import mods.Famous.Famous;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class BudderAxe extends ItemAxe
{

public BudderAxe(int par1, EnumToolMaterial par2EnumToolMaterial)
{
super(par1, par2EnumToolMaterial);
}

    /**
* Return whether this item is repairable in an anvil.
*/
@Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.itemID == Famous.FamousItem.itemID;
    }

    public void registerIcons(IconRegister par1IconRegister)
{
itemIcon = par1IconRegister.registerIcon("Famous:baxe");
}
}