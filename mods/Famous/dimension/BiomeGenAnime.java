 package mods.Famous.dimension;

import java.util.ArrayList;
import java.util.List;

import mods.Famous.Famous;
import mods.Famous.mobs.BudderCow;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenSwamp;
import net.minecraft.world.gen.feature.WorldGenTrees;

public class BiomeGenAnime extends BiomeGenBase
{
       public BiomeGenAnime(int par1)
       {
             super(par1);
       }

       /** The block expected to be on the top of this biome */
       public byte topBlocke;

       /** The block to fill spots in when not on the top */
       public byte fillerBlocke;
       public int field_76754_C;

       /** The minimum height of this biome. Default 0.1. */
       public float minHeighte;

       /** The maximum height of this biome. Default 0.3. */
       public float maxHeighte;

       /** The temperature of this biome. */
       public float temperature;

       /** The rainfall in this biome. */
       public float rainfalle;

       /** Color tint applied to water depending on biome */
       public int waterColorMultipliere;

       /** The biome decorator. */
       public BiomeDecorator theBiomeDecoratore;

       /**
        * Holds the classes of IMobs (hostile mobs) that can be spawned in the biome.
        */
       protected List spawnableMonsterListe;

       /**
        * Holds the classes of any creature that can be spawned in the biome as friendly creature.
        */
       protected List spawnableCreatureListe;

       /**
        * Holds the classes of any aquatic creature that can be spawned in the water of the biome.
        */
       protected List spawnableWaterCreatureListe;
       protected List spawnableCaveCreatureListe;

       /** Set to true if snow is enabled for this biome. */
       private boolean enableSnow;

       /**
        * Is true (default) if the biome support rain (desert and nether can't have rain)
        */
       private boolean enableRain;

       /** The id number to this biome, and its index in the biomeList array. */
       public int biomeIDe;
       
       public void BiomeGenBase(int par1)
       {
    	   this.topBlocke = (byte)Famous.bblock.blockID;
           this.fillerBlocke = (byte)Block.dirt.blockID;
           this.field_76754_C = 5169201;
           this.minHeighte = 0.1F;
           this.maxHeighte = 0.3F;
           this.temperature = 0.5F;
           this.rainfalle = 0.5F;
           this.waterColorMultipliere = 16777215;
           this.spawnableMonsterListe = new ArrayList();
           this.spawnableCreatureListe = new ArrayList();
           this.spawnableWaterCreatureListe = new ArrayList();
           this.spawnableCaveCreatureListe = new ArrayList();
           this.enableRain = false;
           this.worldGeneratorTrees = new WorldGenTrees(false);
           this.worldGeneratorBigTree = new WorldGenBigTree(false);
           this.worldGeneratorForest = new WorldGenForest(false);
           this.worldGeneratorSwamp = new WorldGenSwamp();
           this.biomeIDe = par1;
           biomeList[par1] = Famous.BudderBiome;
           this.theBiomeDecorator = this.createBiomeDecorator();
           this.spawnableMonsterListe.add(new SpawnListEntry(BudderCow.class, 1, 1, 4));
       }
}