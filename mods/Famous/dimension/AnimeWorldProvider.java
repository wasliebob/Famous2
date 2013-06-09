package mods.Famous.dimension;

import mods.Famous.Famous;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class AnimeWorldProvider extends WorldProvider
{
public void registerWorldChunkManager()
{
this.worldChunkMgr = new WorldChunkManagerHell(Famous.BudderBiome, 0.8F, 0.1F);
this.dimensionId = Famous.dimension;
}

public String getDimensionName() 
{
return "Butter";
}

public boolean canRespawnHere()
{
return true;
}

@Override
public IChunkProvider createChunkGenerator()
{
return new ChunkProviderAnime(worldObj, worldObj.getSeed(), true);
}

public String getWelcomeMessage()
{
    if (this.getDimensionName().equalsIgnoreCase("Budder"))
    {
        return "Entering the Butter World";
    }
    return null;
}
}