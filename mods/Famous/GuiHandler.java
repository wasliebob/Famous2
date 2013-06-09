package mods.Famous;

import mods.Famous.Famator.ContainerFamator;
import mods.Famous.Famator.GuiFamator;
import mods.Famous.Famator.TileEntityFamator;
import mods.Famous.indexer.ContainerButton;
import mods.Famous.indexer.GuiIndexer;
import mods.Famous.indexer.TileEntityIndexer;
import mods.Famous.riser.ContainerRiser;
import mods.Famous.riser.GuiRiser;
import mods.Famous.riser.TileEntityRiser;
import mods.Famous.smelter.ContainerSmelter;
import mods.Famous.smelter.GuiSmelter;
import mods.Famous.smelter.TileEntitySmelter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
        //returns an instance of the Container you made earlier
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFamator){
                        return new ContainerFamator(player.inventory, (TileEntityFamator) tileEntity);
                }
                else if(tileEntity instanceof TileEntityIndexer){
                    return new ContainerButton(player.inventory, (TileEntityIndexer) tileEntity);
                }else if(tileEntity instanceof TileEntitySmelter){
                    return new ContainerSmelter(player.inventory, (TileEntitySmelter) tileEntity);
                }else if(tileEntity instanceof TileEntityRiser){
                    return new ContainerRiser(player.inventory, (TileEntityRiser) tileEntity);
                }
				return null;
        }


        //returns an instance of the Gui you made earlier
        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFamator){
                        return new GuiFamator(player.inventory, (TileEntityFamator) tileEntity);
                }
                else if(tileEntity instanceof TileEntityIndexer){
                    return new GuiIndexer(player.inventory, (TileEntityIndexer) tileEntity);
            }               
                else if(tileEntity instanceof TileEntitySmelter){
                    return new GuiSmelter(player.inventory, (TileEntitySmelter) tileEntity);
            }
                else if(tileEntity instanceof TileEntityRiser){
                    return new GuiRiser(player.inventory, (TileEntityRiser) tileEntity);
                }
                return null;

        }
}