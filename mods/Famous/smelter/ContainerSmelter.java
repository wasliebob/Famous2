package mods.Famous.smelter;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ContainerSmelter extends Container
{
private TileEntitySmelter Smelter;
private int lastSmelterCookTime;
private int lastSmelterBurnTime;
private int lastSmelterItemBurnTime;

public ContainerSmelter(InventoryPlayer par1InventoryPlayer, TileEntitySmelter par2TileEntitySmelter)
{
         lastSmelterCookTime = 0;
         lastSmelterBurnTime = 0;
         lastSmelterItemBurnTime = 0;
         Smelter = par2TileEntitySmelter;

         this.addSlotToContainer(new Slot(par2TileEntitySmelter, 0, 56, 17));
         this.addSlotToContainer(new Slot(par2TileEntitySmelter, 1, 56, 53));
         this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, par2TileEntitySmelter, 2, 116, 35));
         int i;

         for (i = 0; i < 3; ++i)
         {
             for (int j = 0; j < 9; ++j)
             {
                 this.addSlotToContainer(new Slot(par1InventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
             }
         }

         for (i = 0; i < 9; ++i)
         {
             this.addSlotToContainer(new Slot(par1InventoryPlayer, i, 8 + i * 18, 142));
         }
     }

/**
         * Updates crafting matrix; called from onCraftMatrixChanged. Args: none
         */
public void detectAndSendChanges()
{
         super.detectAndSendChanges();
         Iterator var1 = this.crafters.iterator();
         while (var1.hasNext())
         {
                 ICrafting var2 = (ICrafting)var1.next();
                 if (this.lastSmelterCookTime != this.Smelter.furnaceCookTime)
                 {
                         var2.sendProgressBarUpdate(this, 0, this.Smelter.furnaceCookTime);
                 }
                 if (this.lastSmelterBurnTime != this.Smelter.furnaceBurnTime)
                 {
                         var2.sendProgressBarUpdate(this, 1, this.Smelter.furnaceBurnTime);
                 }
                 if (this.lastSmelterItemBurnTime != this.Smelter.furnaceBurnTime)
                 {
                         var2.sendProgressBarUpdate(this, 2, this.Smelter.furnaceBurnTime);
                 }
         }
         this.lastSmelterCookTime = this.Smelter.furnaceCookTime;
         this.lastSmelterBurnTime = this.Smelter.furnaceBurnTime;
         this.lastSmelterItemBurnTime = this.Smelter.furnaceBurnTime;
}

public void updateProgressBar(int par1, int par2)
{
         if (par1 == 0)
         {
                 Smelter.furnaceCookTime = par2;
         }

         if (par1 == 1)
         {
                 Smelter.furnaceBurnTime = par2;
         }

         if (par1 == 2)
         {
                 Smelter.furnaceBurnTime = par2;
         }
}

public boolean canInteractWith(EntityPlayer par1EntityPlayer)
{
         return Smelter.isUseableByPlayer(par1EntityPlayer);
}

/**
         * Called to transfer a stack from one inventory to the other eg. when shift clicking.
         */
@Override
public ItemStack transferStackInSlot(EntityPlayer player, int slotnumber)
{
         ItemStack itemstack = null;
         Slot slot = (Slot)inventorySlots.get(slotnumber);

         if (slot != null && slot.getHasStack())
         {
                 ItemStack itemstack1 = slot.getStack();
                 itemstack = itemstack1.copy();

                 if (slotnumber == 2)
                 {
                         if (!mergeItemStack(itemstack1, 3, 39, true))
                         {
                                 return null;
                         }

                         slot.onSlotChange(itemstack1, itemstack);
                 }
                 else if (slotnumber == 1 || slotnumber == 0)
                 {
                         if (!mergeItemStack(itemstack1, 3, 39, false))
                         {
                                 return null;
                         }
                 }
                 else if (RecipesSmelter.smelting().getSmeltingResult(itemstack1.getItem().itemID) != null)
                 {
                         if (!mergeItemStack(itemstack1, 0, 1, false))
                         {
                                 return null;
                         }
                 }
                 else if (TileEntitySmelter.isItemFuel(itemstack1))
                 {
                         if (!mergeItemStack(itemstack1, 1, 2, false))
                         {
                                 return null;
                         }
                 }
                 else if (slotnumber >= 3 && slotnumber < 30)
                 {
                         if (!mergeItemStack(itemstack1, 30, 39, false))
                         {
                                 return null;
                         }
                 }
                 else if (slotnumber >= 30 && slotnumber < 39 && !mergeItemStack(itemstack1, 3, 30, false))
                 {
                         return null;
                 }

                 if (itemstack1.stackSize == 0)
                 {
                         slot.putStack(null);
                 }
                 else
                 {
                         slot.onSlotChanged();
                 }

                 if (itemstack1.stackSize == itemstack.stackSize)
                 {
                         return null;
                 }
                
                 slot.onPickupFromSlot(player, itemstack);
         }

         return itemstack;
}

}