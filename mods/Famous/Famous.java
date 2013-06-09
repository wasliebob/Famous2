package mods.Famous;

import ibxm.Player;

import java.awt.print.Book;

import mods.Famous.FamDrops.BD;
import mods.Famous.FamDrops.HD;
import mods.Famous.Famator.Famator;
import mods.Famous.Famator.GuiFamator;
import mods.Famous.Famator.TileEntityFamator;
import mods.Famous.blocks.Ablock;
import mods.Famous.blocks.Bblock;
import mods.Famous.blocks.BlockBlueBrick;
import mods.Famous.blocks.BlockGreenBrick;
import mods.Famous.blocks.BlockRedBrick;
import mods.Famous.blocks.ClickHere;
import mods.Famous.dimension.AnimeWorldProvider;
import mods.Famous.dimension.AtlanticWorldProvider;
import mods.Famous.dimension.BiomeGenAnime;
import mods.Famous.dimension.BiomeGenAtlantic;
import mods.Famous.dimension.BlockAnime;
import mods.Famous.dimension.BlockAtlantic;
import mods.Famous.dimension.PortalA;
import mods.Famous.indexer.Indexer;
import mods.Famous.indexer.TileEntityIndexer;
import mods.Famous.items.AIngot;
import mods.Famous.items.ASword;
import mods.Famous.items.BBread;
import mods.Famous.items.Bapple;
import mods.Famous.items.ButterCookie;
import mods.Famous.items.Club;
import mods.Famous.items.FamousItem;
import mods.Famous.items.FireBlade;
import mods.Famous.items.FireSword;
import mods.Famous.items.FoodJaffa;
import mods.Famous.items.HKiller;
import mods.Famous.items.HealPowder;
import mods.Famous.items.HeroBlade;
import mods.Famous.items.ItemHandle;
import mods.Famous.items.ItemNinjaIngot;
import mods.Famous.items.ItemPortalPlacer;
import mods.Famous.items.ItemSword;
import mods.Famous.items.JerrySlime;
import mods.Famous.items.LavaStack;
import mods.Famous.items.NStaff;
import mods.Famous.items.NinjaSword;
import mods.Famous.items.SSword;
import mods.Famous.items.SpawnBreeper;
import mods.Famous.items.SpawnFilitor;
import mods.Famous.items.SpawnWaterPlace;
import mods.Famous.items.SquidItem;
import mods.Famous.items.SunGlass;
import mods.Famous.items.Sword;
import mods.Famous.liquid.LiquidButterStill;
import mods.Famous.mobs.Ant;
import mods.Famous.mobs.BGolem;
import mods.Famous.mobs.Bajan;
import mods.Famous.mobs.Bertie;
import mods.Famous.mobs.BossFox;
import mods.Famous.mobs.BudderCow;
import mods.Famous.mobs.Cap;
import mods.Famous.mobs.Cata;
import mods.Famous.mobs.Cave;
import mods.Famous.mobs.Chim;
import mods.Famous.mobs.Cody;
import mods.Famous.mobs.Creeper2;
import mods.Famous.mobs.Dawn;
import mods.Famous.mobs.Dead;
import mods.Famous.mobs.Dire;
import mods.Famous.mobs.Duncan;
import mods.Famous.mobs.EntitySMan;
import mods.Famous.mobs.Etho;
import mods.Famous.mobs.Game;
import mods.Famous.mobs.Gib;
import mods.Famous.mobs.Gizzy;
import mods.Famous.mobs.GolemRender;
import mods.Famous.mobs.Hannah;
import mods.Famous.mobs.Herobrine;
import mods.Famous.mobs.Honeydew;
import mods.Famous.mobs.Hu;
import mods.Famous.mobs.Hy;
import mods.Famous.mobs.Hypno;
import mods.Famous.mobs.IMail;
import mods.Famous.mobs.Ihas;
import mods.Famous.mobs.Isp;
import mods.Famous.mobs.Jeb;
import mods.Famous.mobs.Jero;
import mods.Famous.mobs.Jerry;
import mods.Famous.mobs.Joebuz;
import mods.Famous.mobs.Keralis;
import mods.Famous.mobs.Kermit;
import mods.Famous.mobs.Martyn;
import mods.Famous.mobs.ModelCreeper;
import mods.Famous.mobs.ModelFox;
import mods.Famous.mobs.ModelGolem;
import mods.Famous.mobs.Mr;
import mods.Famous.mobs.Ninja;
import mods.Famous.mobs.Notch;
import mods.Famous.mobs.P;
import mods.Famous.mobs.RenderCreeper2;
import mods.Famous.mobs.RenderFox;
import mods.Famous.mobs.SS;
import mods.Famous.mobs.Sc;
import mods.Famous.mobs.Set;
import mods.Famous.mobs.Seth;
import mods.Famous.mobs.Sips;
import mods.Famous.mobs.Sjin;
import mods.Famous.mobs.Skit;
import mods.Famous.mobs.Sky;
import mods.Famous.mobs.Sly;
import mods.Famous.mobs.Tct;
import mods.Famous.mobs.Th;
import mods.Famous.mobs.Uber;
import mods.Famous.mobs.Un;
import mods.Famous.mobs.Void;
import mods.Famous.mobs.Vox;
import mods.Famous.mobs.Xephos;
import mods.Famous.mobs.wasliebob;
import mods.Famous.riser.Riser;
import mods.Famous.riser.TileEntityRiser;
import mods.Famous.smelter.Smelter;
import mods.Famous.smelter.TileEntitySmelter;
import mods.Famous.tools.BudderAxe;
import mods.Famous.tools.BudderPickaxe;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.Icon;
import net.minecraft.world.WorldManager;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Famous", name = "Famous", version = "2.1.5")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = { "FamousButton" }, packetHandler = PackageHandler.class)
public class Famous {

	// The instance of your mod that Forge uses.
	@Instance("Famous")
	public static Famous instance;
	public static Block indexer;
	public static Block portal;
	public static Block AtlanticPortal;
	public static Block dblock;
	public static Block lblock;
	public static Block gblock;
	public static Block bblock;
	public static Block bd;
	public static Block eggm;
	public static Item heal;
	public static Item jaffa;
	public static Item portalPlacer;
	public static Item portala;
	public static Item bs;
	public static Block ablock;
	public static Block Click;
	public static Block ladder;
	public static Block fam;
	public static Item hd;
	public static Block fs;
	public static Block bss;
	public static Block smelt;
	public static Block rise;
	public static Item bbread;
	public static Item fe;
	public static Item be;

	//2.0
	public static Item bd2;
	public static Item jerry;
    public static Item bpick;
    public static Item sun;
	public static Item lava;
	public static Item bcook;
	public static Item bapple;
    public static Item baxe;

	public static final CreativeTabs tabCustom = new CreativeTabCustom(12,
			"Famous");
	public static final CreativeTabs tabSword = new CreativeTabSword(13,
			"Sword");
	public static final CreativeTabs tabHD = new CreativeTabHD(14, "Famator");

	public final static Item FamousItem = new FamousItem(5000, 4, 4F, false)
			.setFull3D();
	public final static Item squid = new SquidItem(5002).setFull3D();
	public final static Item Club = new Club(8003,
			EnumToolMaterial.EMERALD, "Club").setFull3D();
	
	public final static Item BudderSword = new ItemSword(5003,
			EnumToolMaterial.EMERALD, "Butter Sword").setFull3D();
	public final static Item SSword = new SSword(5004,
			EnumToolMaterial.EMERALD, "Squid Sword").setFull3D();
	public final static Item ningot = new ItemNinjaIngot(5005).setFull3D();
	public final static Item nsword = new NinjaSword(5006,
			EnumToolMaterial.EMERALD, "Ninja Sword").setFull3D();
	public final static Item gsword = new Sword(5007, EnumToolMaterial.EMERALD,
			"Jerry Sword").setFull3D();
	public final static Item asword = new ASword(5008,
			EnumToolMaterial.EMERALD, "Atlantic Sword").setFull3D();
	public final static Item aingot = new AIngot(5009).setFull3D();
	public final static Item nstaff = new NStaff(5010,
			EnumToolMaterial.EMERALD, "Notch's Staff").setFull3D();

	// Special Swords
	public final static Item handle = new ItemHandle(5011).setFull3D();
	public final static Item fire = new FireBlade(5012).setFull3D();
	public final static Item fsword = new FireSword(5013,
			EnumToolMaterial.EMERALD, "Fire Sword").setFull3D();

	public final static Item hb = new HeroBlade(5014).setFull3D();
	public final static Item hk = new HKiller(5015, EnumToolMaterial.EMERALD,
			"Herobrine Killer").setFull3D();

	int MyItemID = FamousItem.itemID;

	public IconRegister blockIcon;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "mods.Famous.client.ClientProxy", serverSide = "mods.Famous.CommonProxy")
	public static CommonProxy proxy;

	static int startEntityId = 300;
	public static int dimension = 20;
	public static int dimension2 = 22;

	public static BiomeGenAnime BudderBiome;
	public static BiomeGenAtlantic AtlanticBiome;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Config cc = new Config();

		Config.loadConfig(event);

	}

	
	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();

		//club
		GameRegistry.registerItem(Club, "Club");
		LanguageRegistry.addName(Club, "Club");
		
		//sunglass
		sun = new SunGlass(8179, EnumArmorMaterial.DIAMOND, 0, 0).setCreativeTab(Famous.tabSword);
		GameRegistry.registerItem(sun, "sun");
		LanguageRegistry.addName(sun, "CaptainSparklez's SunGlasses");

		//tools
		bpick = new BudderPickaxe(8180, EnumToolMaterial.EMERALD).setUnlocalizedName("Famous:bpick").setCreativeTab(Famous.tabCustom);
		GameRegistry.registerItem(bpick, "bpick");
		LanguageRegistry.addName(bpick, "Butter Pickaxe");
		
		baxe = new BudderAxe(8181, EnumToolMaterial.EMERALD).setUnlocalizedName("Famous:baxe").setCreativeTab(Famous.tabCustom);
		GameRegistry.registerItem(baxe, "baxe");
		LanguageRegistry.addName(baxe, "Butter Axe");
		
		
		// Portal creator
		portalPlacer = new ItemPortalPlacer(6001);
		GameRegistry.registerItem(portalPlacer, "portala");

		if (Config.config2 == false) {
			LanguageRegistry.addName(portalPlacer, "Butter");
		} else if (Config.config2 == true) {
			LanguageRegistry.addName(portalPlacer, "Budder");
		}

		portala = new PortalA(6002);
		GameRegistry.registerItem(portala, "portalb");
		LanguageRegistry.addName(portala, "Atlantic");

		//register egg
		fe = new SpawnFilitor(7004);
		GameRegistry.registerItem(fe, "fe");
		LanguageRegistry.addName(fe, "Spawn Filitor");
		
		be = new SpawnBreeper(7005);
		GameRegistry.registerItem(be, "be");
		LanguageRegistry.addName(be, "Spawn Breeper");
		
		// Generate blocks

		// Tab fix
		LanguageRegistry.instance().addStringLocalization("itemGroup.Famous",
				"Famous");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Sword",
				"Sword");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Famator",
				"Famous Machines");

		// portal budder
		portal = new BlockAnime(255);
		GameRegistry.registerBlock(portal, "Budder");
		if (Config.config2 == false) {
			LanguageRegistry.addName(portal, "Butter Portal");
		} else if (Config.config2 == true) {
			LanguageRegistry.addName(portal, "Budder Portal");
		}

		bblock = new Bblock(674);
		GameRegistry.registerBlock(bblock, "ButterB");
		if (Config.config2 == false) {
			LanguageRegistry.addName(bblock, "Butter Block");
		} else if (Config.config2 == true) {
			LanguageRegistry.addName(bblock, "Budder Block");
		}

		ablock = new Ablock(675);
		GameRegistry.registerBlock(ablock, "AtlanticB");
		LanguageRegistry.addName(ablock, "Atlantic Block");

		// Portal Atlantic
		AtlanticPortal = new BlockAtlantic(643);
		GameRegistry.registerBlock(AtlanticPortal, "Atlantic");
		LanguageRegistry.addName(AtlanticPortal, "Atlantic Portal");

		// Click
		Click = new ClickHere(645);
		GameRegistry.registerBlock(Click, "Click");
		LanguageRegistry.addName(Click, "Click Here");

		// Gui Handler
		//NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());

		// Indexer
		//indexer = new Indexer(646);
		//GameRegistry.registerBlock(indexer, "Indexer");
		//LanguageRegistry.addName(indexer, "Indexer");
		//GameRegistry.registerTileEntity(TileEntityIndexer.class, "Indexer");

		// famator
		//fam = new Famator(647);
		//GameRegistry.registerBlock(fam, "Famator");
		//LanguageRegistry.addName(fam, "Famator");
		//GameRegistry.registerTileEntity(TileEntityFamator.class, "Famator");

		// smelter
		//smelt = new Smelter(648);
		//GameRegistry.registerBlock(smelt, "Smelter");
		//LanguageRegistry.addName(smelt, "Smelter");
		//GameRegistry.registerTileEntity(TileEntitySmelter.class, "Smelter");

		// riser
		//rise = new Riser(649);
		//GameRegistry.registerBlock(rise, "Riser");
		//LanguageRegistry.addName(rise, "Riser");
		//GameRegistry.registerTileEntity(TileEntityRiser.class, "Riser");
		
		// Design Block red
		dblock = new BlockRedBrick(656);
		GameRegistry.registerBlock(dblock, "dblock");
		LanguageRegistry.addName(dblock, "Red Brick");

		// Design Block Blue
		lblock = new BlockBlueBrick(657);
		GameRegistry.registerBlock(lblock, "lblock");
		LanguageRegistry.addName(lblock, "Blue Brick");

		// Design Block Green
		gblock = new BlockGreenBrick(658);
		GameRegistry.registerBlock(gblock, "gb");
		LanguageRegistry.addName(gblock, "Green Brick");

		// Food
		jaffa = new FoodJaffa(659, 4, 4F, false);
		GameRegistry.registerItem(jaffa, "jaffa");
		LanguageRegistry.addName(jaffa, "Jaffa Cake");

		heal = new HealPowder(660, 4, 4F, false);
		GameRegistry.registerItem(heal, "heal");
		LanguageRegistry.addName(heal, "Heal Stick");

		bbread = new BBread(663, 4, 4F, false);
		GameRegistry.registerItem(bbread, "bbread");
		if (Config.config2 == false) {
			LanguageRegistry.addName(bbread, "Butter Bread");
		} else if (Config.config2 == true) {
			LanguageRegistry.addName(bbread, "Budder Bread");
		}

		bcook = new ButterCookie(664, 4, 4F, false);
		GameRegistry.registerItem(bcook, "bcook");
		if (Config.config2 == false) {
			LanguageRegistry.addName(bcook, "Butter Cookie");
		} else if (Config.config2 == true) {
			LanguageRegistry.addName(bcook, "Budder Cookie");
		}
		
		bapple = new Bapple(665, 4, 4F, false);
		GameRegistry.registerItem(bapple, "bapple");
		if (Config.config2 == false) {
			LanguageRegistry.addName(bapple, "Butter Apple");
		} else if (Config.config2 == true) {
			LanguageRegistry.addName(bapple, "Budder Apple");
		}
		
		// Water Safety
		bs = new SpawnWaterPlace(661);
		GameRegistry.registerItem(bs, "bs");
		LanguageRegistry.addName(bs, "Atlantic Safety Kit");

		//lava
		lava = new LavaStack(703);
		GameRegistry.registerItem(lava, "lava");
		LanguageRegistry.addName(lava, "Furnace Lava");
		
		// Fam drops
		hd = new HD(662);
		GameRegistry.registerItem(hd, "hd");
		LanguageRegistry.addName(hd, "Filigor Drop");

		bd2 = new BD(701);
		GameRegistry.registerItem(bd2, "bd2");
		LanguageRegistry.addName(bd2, "Breeper Drop");
		
		//famous items
		jerry = new JerrySlime(702);
		GameRegistry.registerItem(jerry, "jerry");
		LanguageRegistry.addName(jerry, "Jerry Slime");
		
		// liquid
		//bss = new LiquidButterStill(664, Material.water);
		//GameRegistry.registerBlock(bss, "bss");
		//if (Config.config2 == false) {
		//	LanguageRegistry.addName(bss, "Liquid Butter");
		//} else if (Config.config2 == true) {
		//	LanguageRegistry.addName(bss, "Liquid Budder");
		//}

		// Blocks

		// Entity
		EntityRegistry.registerModEntity(Sky.class, "SkyDoesMinecraft", 1,
				this, 70, 3, true);
		EntityRegistry
				.addSpawn(Sky.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Joebuz.class, "Joebuz", 2, this, 70,
				3, true);
		EntityRegistry.addSpawn(Joebuz.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Cody.class, "TheCodyMaverick", 3,
				this, 70, 3, true);
		EntityRegistry.addSpawn(Cody.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Honeydew.class, "Honeydew", 4, this,
				70, 3, true);
		EntityRegistry.addSpawn(Honeydew.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Xephos.class, "Xephos", 5, this, 70,
				3, true);
		EntityRegistry.addSpawn(Xephos.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(EntitySMan.class, "Squidman", 6, this,
				70, 3, true);
		EntityRegistry.addSpawn(Xephos.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(IMail.class, "IpodMail", 7, this, 70,
				3, true);
		EntityRegistry.addSpawn(IMail.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(wasliebob.class, "Wasliebob", 8, this,
				70, 3, true);
		EntityRegistry.addSpawn(wasliebob.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Isp.class, "Israphel", 9, this, 70, 3,
				true);
		EntityRegistry
				.addSpawn(Isp.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Duncan.class, "Duncan", 10, this, 70,
				3, true);
		EntityRegistry.addSpawn(Duncan.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Martyn.class, "Mart", 11, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Martyn.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Cap.class, "Cap", 12, this, 70, 3,
				true);
		EntityRegistry
				.addSpawn(Cap.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Un.class, "Un", 13, this, 70, 3, true);
		EntityRegistry
				.addSpawn(Un.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Cave.class, "Cave", 14, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Cave.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Ant.class, "Ant", 15, this, 70, 3,
				true);
		EntityRegistry
				.addSpawn(Ant.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Sips.class, "Sips", 16, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Sips.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Sjin.class, "Sjin", 17, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Sjin.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Herobrine.class, "Herobrine", 18,
				this, 70, 3, true);
		EntityRegistry.addSpawn(Herobrine.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Notch.class, "Notch", 19, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Notch.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Vox.class, "Vox", 20, this, 70, 3,
				true);
		EntityRegistry
				.addSpawn(Vox.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Dead.class, "Dead", 21, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Dead.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Chim.class, "Chim", 22, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Chim.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Hu.class, "Hu", 23, this, 70, 3, true);
		EntityRegistry
				.addSpawn(Hu.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Jeb.class, "Jeb", 24, this, 70, 3,
				true);
		EntityRegistry
				.addSpawn(Jeb.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Sly.class, "Sly", 25, this, 70, 3,
				true);
		EntityRegistry
				.addSpawn(Sly.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Th.class, "Th", 26, this, 70, 3, true);
		EntityRegistry
				.addSpawn(Th.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(P.class, "P", 27, this, 70, 3, true);
		EntityRegistry
				.addSpawn(P.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Mr.class, "Mr", 28, this, 70, 3, true);
		EntityRegistry
				.addSpawn(Mr.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Ninja.class, "Ninja", 29, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Ninja.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Seth.class, "seth", 30, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Seth.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Hy.class, "Hy", 31, this, 70, 3, true);
		EntityRegistry
				.addSpawn(Hy.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Ihas.class, "Ihas", 32, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Ihas.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Set.class, "Set", 33, this, 70, 3,
				true);
		EntityRegistry
				.addSpawn(Set.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Gizzy.class, "Gizzy", 34, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Gizzy.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Kermit.class, "Kermit", 35, this, 70,
				3, true);
		EntityRegistry.addSpawn(Kermit.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(SS.class, "Ss", 36, this, 70, 3, true);
		EntityRegistry
				.addSpawn(SS.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Dawn.class, "Dawn", 37, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Dawn.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Tct.class, "Tcn", 38, this, 70, 3,
				true);
		EntityRegistry
				.addSpawn(Tct.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Gib.class, "Gib", 39, this, 70, 3,
				true);
		EntityRegistry
				.addSpawn(Gib.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Hannah.class, "Hannah", 40, this, 70,
				3, true);
		EntityRegistry.addSpawn(Hannah.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Game.class, "Game", 41, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Game.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Bertie.class, "Bertie", 42, this, 70,
				3, true);
		EntityRegistry.addSpawn(Bertie.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Sc.class, "Sc", 43, this, 70, 3, true);
		EntityRegistry
				.addSpawn(Sc.class, 10, 2, 4, EnumCreatureType.creature,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Skit.class, "Skit", 44, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Skit.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Etho.class, "Etho", 45, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Etho.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Keralis.class, "Keralis", 46, this,
				70, 3, true);
		EntityRegistry.addSpawn(Keralis.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Hypno.class, "Hypno", 47, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Hypno.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Void.class, "Void", 48, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Void.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Cata.class, "Cata", 49, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Cata.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Uber.class, "Uber", 50, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Uber.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(Jerry.class, "Jerry", 51, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Jerry.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);
		
		EntityRegistry.registerModEntity(Dire.class, "Dire", 52, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Dire.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);
		
		EntityRegistry.registerModEntity(Jero.class, "Jero", 53, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Jero.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);
		
		EntityRegistry.registerModEntity(Bajan.class, "Bajan", 54, this, 70, 3,
				true);
		EntityRegistry.addSpawn(Bajan.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);
		
		// animals
		EntityRegistry.registerModEntity(BudderCow.class, "gc", 199, this, 70,
				3, true);
		EntityRegistry.addSpawn(BudderCow.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		EntityRegistry.registerModEntity(BGolem.class, "bgolem", 211, this, 70,
				3, true);
		EntityRegistry.addSpawn(BGolem.class, 10, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.beach,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.forest, BiomeGenBase.forestHills,
				BiomeGenBase.jungle, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river,
				BiomeGenBase.swampland);

		// Fox
		EntityRegistry.registerModEntity(BossFox.class, "Fox", 299, this, 70,
				3, true);
		// Breeper
		EntityRegistry.registerModEntity(Creeper2.class, "Creeper2", 399, this,
				70, 3, true);

		// Dimension Budder
		DimensionManager.registerProviderType(dimension,
				AnimeWorldProvider.class, false);
		DimensionManager.registerDimension(dimension, dimension);

		// Biome Budder
		BudderBiome = new BiomeGenAnime(53);
		GameRegistry.addBiome(BudderBiome);

		// Dimension Atlantic
		DimensionManager.registerProviderType(dimension2,
				AtlanticWorldProvider.class, false);
		DimensionManager.registerDimension(dimension2, dimension2);

		// Biome Atlantic
		AtlanticBiome = new BiomeGenAtlantic(54);
		GameRegistry.addBiome(AtlanticBiome);

		// Items
		if (Config.config2 == false) {
			LanguageRegistry.addName(FamousItem, "Butter");
		} else if (Config.config2 == true) {
			LanguageRegistry.addName(FamousItem, "Budder");
		}

		if (Config.config2 == false) {
			LanguageRegistry.addName(squid, "Squid Butter");
		} else if (Config.config2 == true) {
			LanguageRegistry.addName(squid, "Squid Budder");
		}

		if (Config.config2 == false) {
			LanguageRegistry.addName(BudderSword, "Butter Sword");
		} else if (Config.config2 == true) {
			LanguageRegistry.addName(BudderSword, "Budder Sword");
		}

		LanguageRegistry.addName(SSword, "Squid Sword");
		LanguageRegistry.addName(ningot, "Ninja Ingot");
		LanguageRegistry.addName(nsword, "Ninja Sword");
		LanguageRegistry.addName(gsword, "Jerry's Sword");
		LanguageRegistry.addName(asword, "Atlantic Sword");
		LanguageRegistry.addName(aingot, "Atlantic Ingot");
		LanguageRegistry.addName(nstaff, "Wand Of Notch");

		// Special Swords
		LanguageRegistry.addName(handle, "Handle");
		LanguageRegistry.addName(fire, "Fire Blade");
		LanguageRegistry.addName(fsword, "Fire Sword");

		LanguageRegistry.addName(hb, "Hero Blade");
		LanguageRegistry.addName(hk, "Herobrine Killer");

		
		// recipes
		GameRegistry.addShapelessRecipe(new ItemStack(fire), Block.blockGold,
				Block.blockDiamond, Item.bucketLava);
		GameRegistry.addShapelessRecipe(new ItemStack(handle), Item.ingotIron,
				Item.leather);


		GameRegistry.addRecipe(new ItemStack(bpick), "BBB", " S ", " S ",
				'B', FamousItem, 'S', Item.stick);
		
		GameRegistry.addRecipe(new ItemStack(baxe), " BB", " SB", " S ",
				'B', FamousItem, 'S', Item.stick);
		
		GameRegistry.addRecipe(new ItemStack(baxe), "BB ", "BS ", " S ",
				'B', FamousItem, 'S', Item.stick);
		
		GameRegistry.addRecipe(new ItemStack(BudderSword), " B ", " B ", " S ",
				'B', FamousItem, 'S', Item.stick);

		GameRegistry.addRecipe(new ItemStack(SSword), " B ", " B ", " S ", 'B',
				squid, 'S', Item.stick);

		GameRegistry.addRecipe(new ItemStack(nsword), " N ", " N ", " S ", 'N',
				ningot, 'S', Item.stick);

		GameRegistry.addRecipe(new ItemStack(asword), " N ", " N ", " S ", 'N',
				aingot, 'S', Item.stick);

		GameRegistry.addRecipe(new ItemStack(gsword), " N ", " N ", " S ", 'N',
				jerry, 'S', Item.stick);
		
		GameRegistry.addRecipe(new ItemStack(portalPlacer), "ONO", "NON",
				"ONO", 'N', FamousItem, 'O', Block.blockGold);

		GameRegistry.addRecipe(new ItemStack(portala), "ONO", "NON", "ONO",
				'N', aingot, 'O', Item.bucketWater);

		GameRegistry.addRecipe(new ItemStack(nstaff), "S  ", " S ", "  D", 'S',
				Item.blazeRod, 'D', Block.blockDiamond);

		// Swords
		GameRegistry.addRecipe(new ItemStack(fsword), " F ", " D ", " S ", 'S',
				handle, 'D', Item.diamond, 'F', fire);

		//GameRegistry.addRecipe(new ItemStack(indexer), "FFF", "FDF", "FFF",
				//'F', Block.chest, 'D', Famous.hd);

		//GameRegistry.addRecipe(new ItemStack(fam), "FFF", "FDF", "FFF", 'F',
				//Block.furnaceIdle, 'D', Block.blockIron);

		//GameRegistry.addRecipe(new ItemStack(smelt), "FFF", "FDF", "FFF", 'F',
				//Block.furnaceIdle, 'D', Item.bucketLava);
		
		//GameRegistry.addRecipe(new ItemStack(rise), "FFF", "FDF", "FFF", 'F',
				//Block.furnaceIdle, 'D', Item.bucketWater);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Famous.dblock),
				Item.redstone, Block.brick);
		GameRegistry.addShapelessRecipe(new ItemStack(Famous.lblock),
				Famous.dblock);
		GameRegistry.addShapelessRecipe(new ItemStack(Famous.gblock),
				Famous.lblock);

		GameRegistry.addShapelessRecipe(new ItemStack(Famous.bs),
				Famous.aingot, Famous.aingot);

		GameRegistry.addShapelessRecipe(new ItemStack(Famous.be),
				Block.blockDiamond, Famous.FamousItem);

		GameRegistry.addShapelessRecipe(new ItemStack(Item.bucketLava),
				Famous.lava);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Famous.fe),
				Block.blockDiamond, Famous.aingot, Famous.FamousItem);
		
		// egg
		registerEntityEgg(Sky.class, 0xffffff, 0x000000);
		registerEntityEgg(Joebuz.class, 0xffffff, 0x000000);
		registerEntityEgg(Cody.class, 0xffffff, 0x000000);
		registerEntityEgg(Honeydew.class, 0xffffff, 0x000000);
		registerEntityEgg(Xephos.class, 0xffffff, 0x000000);
		registerEntityEgg(EntitySMan.class, 0xffffff, 0x000000);
		registerEntityEgg(IMail.class, 0xffffff, 0x000000);
		registerEntityEgg(wasliebob.class, 0xffffff, 0x000000);
		registerEntityEgg(Isp.class, 0xffffff, 0x000000);
		registerEntityEgg(Cap.class, 0xffffff, 0x000000);
		registerEntityEgg(Cave.class, 0xffffff, 0x000000);
		registerEntityEgg(Un.class, 0xffffff, 0x000000);
		registerEntityEgg(Ant.class, 0xffffff, 0x000000);
		registerEntityEgg(Sjin.class, 0xffffff, 0x000000);
		registerEntityEgg(Sips.class, 0xffffff, 0x000000);
		registerEntityEgg(Herobrine.class, 0xffffff, 0x000000);
		registerEntityEgg(Notch.class, 0xffffff, 0x000000);
		registerEntityEgg(Vox.class, 0xffffff, 0x000000);
		registerEntityEgg(Dead.class, 0xffffff, 0x000000);
		registerEntityEgg(Chim.class, 0xffffff, 0x000000);
		registerEntityEgg(Jeb.class, 0xffffff, 0x000000);
		registerEntityEgg(Hu.class, 0xffffff, 0x000000);
		registerEntityEgg(Sly.class, 0xffffff, 0x000000);
		registerEntityEgg(Th.class, 0xffffff, 0x000000);
		registerEntityEgg(Mr.class, 0xffffff, 0x000000);
		registerEntityEgg(P.class, 0xffffff, 0x000000);
		registerEntityEgg(Ninja.class, 0xffffff, 0x000000);
		registerEntityEgg(Seth.class, 0xffffff, 0x000000);
		registerEntityEgg(Hy.class, 0xffffff, 0x000000);
		registerEntityEgg(Ihas.class, 0xffffff, 0x000000);
		registerEntityEgg(Set.class, 0xffffff, 0x000000);
		registerEntityEgg(Gizzy.class, 0xffffff, 0x000000);
		registerEntityEgg(Kermit.class, 0xffffff, 0x000000);
		registerEntityEgg(SS.class, 0xffffff, 0x000000);
		registerEntityEgg(Dawn.class, 0xffffff, 0x000000);
		registerEntityEgg(Tct.class, 0xffffff, 0x000000);
		registerEntityEgg(Gib.class, 0xffffff, 0x000000);
		registerEntityEgg(Hannah.class, 0xffffff, 0x000000);
		registerEntityEgg(Duncan.class, 0xffffff, 0x000000);
		registerEntityEgg(Martyn.class, 0xffffff, 0x000000);
		registerEntityEgg(Game.class, 0xffffff, 0x000000);
		registerEntityEgg(Bertie.class, 0xffffff, 0x000000);
		registerEntityEgg(Sc.class, 0xffffff, 0x000000);
		registerEntityEgg(Skit.class, 0xffffff, 0x000000);
		registerEntityEgg(Etho.class, 0xffffff, 0x000000);
		registerEntityEgg(Keralis.class, 0xffffff, 0x000000);
		registerEntityEgg(Void.class, 0xffffff, 0x000000);
		registerEntityEgg(Hypno.class, 0xffffff, 0x000000);
		registerEntityEgg(Uber.class, 0xffffff, 0x000000);
		registerEntityEgg(Cata.class, 0xffffff, 0x000000);
		registerEntityEgg(Jerry.class, 0xffffff, 0x000000);
		registerEntityEgg(Dire.class, 0xffffff, 0x000000);
		registerEntityEgg(Bajan.class, 0xffffff, 0x000000);
		registerEntityEgg(Jero.class, 0xffffff, 0x000000);

		registerEntityEgg(BudderCow.class, 0xffffff, 0x000000);
		registerEntityEgg(BGolem.class, 0xffffff, 0x000000);
		registerEntityEgg(BossFox.class, 0x000000, 0xffffff);
		registerEntityEgg(Creeper2.class, 0x000000, 0xffffff);

		// egg fix
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.SkyDoesMinecraft.name", "SkyDoesMinecraft");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Joebuz.name", "Joebuz");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.TheCodyMaverick.name", "TheCodyMaverick");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Honeydew.name", "Honeydew");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Xephos.name", "Xephos");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Squidman.name", "Squid Man");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.IpodMail.name", "IpodMail");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Wasliebob.name", "Wasliebob");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Israphel.name", "Israphel");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Un.name", "MinecraftUniverse");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Cave.name", "CavemanFilms");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Cap.name", "CaptainSparklez");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Ant.name", "AntVenom");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Sjin.name", "Sjin");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Sips.name", "Sips");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Herobrine.name", "Herobrine");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Notch.name", "Notch");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Vox.name", "BebopVox");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Dead.name", "Deadlox");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Chim.name", "ChimneySwift11");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Jeb.name", "Jeb");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Hu.name", "HuskyMudkipz");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Sly.name", "xXSlyFoxHoundXx");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Th.name", "ThnxCya");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Mr.name", "Mr360Game");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.P.name", "paulsoaresjr");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Hy.name", "Hypixel");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.seth.name", "SethBling");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Ninja.name", "TheNinjaProlog");

		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Ihas.name", "ihascupquake");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Set.name", "Setosorcerer");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Gizzy.name", "Gizzy Gazza");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Kermit.name", "KermitPlaysMinecraft");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Ss.name", "SSundee");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Dawn.name", "DawnDigsMinecraft");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Tcn.name", "TCTNGaming");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Gib.name", "MrGibbsPoweron");

		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Hannah.name", "Hannah");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Duncan.name", "Duncan");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Mart.name", "InTheLittleWood");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Game.name", "GameChap");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Bertie.name", "Bertie");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Sc.name", "SCMowns");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Skit.name", "SkitScape");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Etho.name", "EthosLab");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Fox.name", "Filitor");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Creeper2.name", "Breeper");

		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Keralis.name", "Keralis");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Void.name", "Xisumavoid");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Hypno.name", "Hypnotizd");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Cata.name", "OmfgCata");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Uber.name", "UberHaxorNova");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Dire.name", "Direwolf20");
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Jerry.name", "Jerry");
		
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Jero.name", "JeromeASF");
		
		LanguageRegistry.instance().addStringLocalization(
				"entity.Famous.Bajan.name", "BajanCanadian");
		// animals
		if (Config.config2 == false) {
			LanguageRegistry.instance().addStringLocalization(
					"entity.Famous.gc.name", "Butter Cow");
		} else if (Config.config2 == true) {
			LanguageRegistry.instance().addStringLocalization(
					"entity.Famous.gc.name", "Budder Cow");

			if (Config.config2 == false) {
				LanguageRegistry.instance().addStringLocalization(
						"entity.Famous.bgolem.name", "Butter Golem");
			} else if (Config.config2 == true) {
				LanguageRegistry.instance().addStringLocalization(
						"entity.Famous.bgolem.name", "Budder Golem");
			}

			// Modeling
			RenderingRegistry.registerEntityRenderingHandler(BossFox.class,
					new RenderFox(new ModelFox(), 0.3F));
			RenderingRegistry.registerEntityRenderingHandler(Creeper2.class,
					new RenderCreeper2(new ModelCreeper(), 0.3F));
			RenderingRegistry.registerEntityRenderingHandler(BGolem.class,
					new GolemRender(new ModelGolem(), 0.3F));

		}
	}

	// mob
	public static int getUniqueEntityId() {
		do {
			startEntityId++;
		} while (EntityList.getStringFromID(startEntityId) != null);

		return startEntityId;
	}

	public static int registerEntityEgg(Class<? extends Entity> entity,
			int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor,
				secondaryColor));
		return id;
	}

	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}

}
