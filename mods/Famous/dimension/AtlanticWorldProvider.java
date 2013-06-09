package mods.Famous.dimension;

import mods.Famous.Famous;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class AtlanticWorldProvider extends WorldProvider
{
public void registerWorldChunkManager()
{
this.worldChunkMgr = new WorldChunkManagerHell(Famous.AtlanticBiome, 0.8F, 0.1F);
this.dimensionId = Famous.dimension2;
}

public String getDimensionName() 
{
return "Atlantic";
}

public boolean canRespawnHere()
{
return true;
}

@Override
public IChunkProvider createChunkGenerator()
{
return new ChunkProviderAtlantic(worldObj, worldObj.getSeed(), true);
}

public String getWelcomeMessage()
{
    if (this.getDimensionName().equalsIgnoreCase("Atlantic"))
    {
        return "Entering the Atlantic";
    }
    return null;
}
}