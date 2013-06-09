package mods.Famous;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import mods.Famous.Famator.GuiFamator;
import mods.Famous.Famator.TileEntityFamator;
import mods.Famous.indexer.GuiIndexer;
import mods.Famous.indexer.TileEntityIndexer;
import mods.Famous.mobs.BGolem;
import mods.Famous.mobs.BossFox;
import mods.Famous.mobs.Creeper2;
import mods.Famous.mobs.GolemRender;
import mods.Famous.mobs.Jerry;
import mods.Famous.mobs.ModelCreeper;
import mods.Famous.mobs.ModelFox;
import mods.Famous.mobs.ModelGolem;
import mods.Famous.mobs.RenderCreeper2;
import mods.Famous.mobs.RenderFox;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


public class CommonProxy{
        public static String ITEMS_PNG = "/mods/Famous/textures/items/items.png";
        public static String S_PNG = "/mods/Famous/textures/items/squid.png";
        public static String SKY_PNG = "/mods/Famous/textures/mobs/sky.png";
        public static String JOE_PNG = "/mods/Famous/textures/mobs/joe.png";
        public static String CODY_PNG = "/mods/Famous/textures/mobs/cody.png";
        public static String HONEYDEW_PNG = "/mods/Famous/textures/mobs/Honeydew.png";
        public static String XEPHOS_PNG = "/mods/Famous/textures/mobs/Xephos.png";
        public static String BSWORD_PNG = "/mods/Famous/textures/items/buddersword.png";
        public static String SMAN_PNG = "/mods/Famous/textures/mobs/squidman.png";
        public static String IMAIL_PNG = "/mods/Famous/textures/mobs/imail.png";
        public static String WASLIE_PNG = "/mods/Famous/textures/mobs/waslie.png";
        public static String SSWORD_PNG = "/mods/Famous/textures/items/ssword.png";
        public static String ISP_PNG = "/mods/Famous/textures/mobs/isp.png";
        public static String A_PNG = "/mods/Famous/textures/blocks/a.png";
        public static String SASUKE_PNG = "/mods/Famous/textures/mobs/sasuke.png";
        public static String NARUTO_PNG = "/mods/Famous/textures/mobs/naruto.png";
        public static String ORE_PNG = "/mods/Famous/textures/blocks/nore.png";
        public static String DBLOCK_PNG = "/mods/Famous/textures/blocks/bblock.png";
        public static String LBLOCK_PNG = "/mods/Famous/textures/blocks/lblock.png";
        public static String INGOT_PNG = "/mods/Famous/textures/items/ningot.png";
        public static String NSWORD_PNG = "/mods/Famous/textures/items/nsword.png";
        public static String CAP_PNG = "/mods/Famous/textures/mobs/cap.png";
        public static String CAVE_PNG = "/mods/Famous/textures/mobs/cave.png";
        public static String UN_PNG = "/mods/Famous/textures/mobs/un.png";
        public static String G_PNG = "/mods/Famous/textures/items/gsword.png";
        public static String ANT_PNG = "/mods/Famous/textures/mobs/ant.png";
        public static String SIPS_PNG = "/mods/Famous/textures/mobs/sips.png";
        public static String SJIN_PNG = "/mods/Famous/textures/mobs/sjin.png";
        public static String AINGOT_PNG = "/mods/Famous/textures/items/aingot.png";
        public static String ASWORD_PNG = "/mods/Famous/textures/items/asword.png";
        public static String HEROBRINE_PNG = "/mods/Famous/textures/mobs/herobrine.png";
        public static String NOTCH_PNG = "/mods/Famous/textures/mobs/notch.png";
        public static String VOX_PNG = "/mods/Famous/textures/mobs/vox.png";
        public static String NS_PNG = "/mods/Famous/textures/items/nstaff.png";
        public static String DEAD_PNG = "/mods/Famous/textures/mobs/dead.png";
        public static String CHIM_PNG = "/mods/Famous/textures/mobs/chim.png";
        public static String HU_PNG = "/mods/Famous/textures/mobs/hu.png";
        public static String JEB_PNG = "/mods/Famous/textures/mobs/jeb.png";
        public static String GB_PNG = "/mods/Famous/textures/blocks/gb.png";
        public static String SLY_PNG = "/mods/Famous/textures/mobs/sly.png";
        public static String TH_PNG = "/mods/Famous/textures/mobs/th.png";
        public static String P_PNG = "/mods/Famous/textures/mobs/p.png";
        public static String GA_PNG = "/mods/Famous/textures/mobs/mr.png";
        public static String NINJA_PNG = "/mods/Famous/textures/mobs/ninja.png";
        public static String HY_PNG = "/mods/Famous/textures/mobs/Hy.png";
        public static String SETH_PNG = "/mods/Famous/textures/mobs/seth.png";

        public static String CUP_PNG = "/mods/Famous/textures/mobs/ihas.png";
        public static String SET_PNG = "/mods/Famous/textures/mobs/set.png";
        public static String GIZ_PNG = "/mods/Famous/textures/mobs/giz.png";
        public static String KERMIT_PNG = "/mods/Famous/textures/mobs/kermit.png";
        public static String SS_PNG = "/mods/Famous/textures/mobs/ss.png";
        public static String DAWN_PNG = "/mods/Famous/textures/mobs/dawn.png";
        public static String TCN_PNG = "/mods/Famous/textures/mobs/tcn.png";
        public static String GIB_PNG = "/mods/Famous/textures/mobs/gib.png";
        public static String HANNAH_PNG = "/mods/Famous/textures/mobs/hannah.png";
        public static String DUNCAN_PNG = "/mods/Famous/textures/mobs/duncan.png";
        public static String MART_PNG = "/mods/Famous/textures/mobs/mart.png";
        public static String GAME_PNG = "/mods/Famous/textures/mobs/game.png";
        public static String BERTIE_PNG = "/mods/Famous/textures/mobs/bertie.png";
        public static String SC_PNG = "/mods/Famous/textures/mobs/sc.png";

        public static String SK_PNG = "/mods/Famous/textures/mobs/etho.png";
        public static String ETHO_PNG = "/mods/Famous/textures/mobs/skit.png";
        public static String KERALIS_PNG = "/mods/Famous/textures/mobs/keralis.png";
        public static String VOID_PNG = "/mods/Famous/textures/mobs/void.png";
        public static String HYPNO_PNG = "/mods/Famous/textures/mobs/hypno.png";
        public static String CATA_PNG = "/mods/Famous/textures/mobs/cata.png";
        public static String JERO_PNG = "/mods/Famous/textures/mobs/jero.png";
        public static String BAJAN_PNG = "/mods/Famous/textures/mobs/bajan.png";

        //Misc
        public static String SBR_PNG = "/mods/Famous/textures/items/sbr.png";
        public static String SFY_PNG = "/mods/Famous/textures/items/sfy.png";

        //Portal
        public static String AT_PNG = "/mods/Famous/textures/blocks/atlantic.png";

        //budder
        public static String GC_PNG = "/mods/Famous/textures/mobs/gc.png";

        //Food
        public static String JAFFA_PNG = "/mods/Famous/textures/items/jaffa.png";
        public static String BBREAD_PNG = "/mods/Famous/textures/items/bbread.png";

        //Custom Swords
        public static String HANDLE_PNG = "/mods/Famous/textures/items/handle.png";
        public static String FIRE_PNG = "/mods/Famous/textures/items/fire.png";
        public static String FIRES_PNG = "/mods/Famous/textures/items/fsword.png";

        public static String HB_PNG = "/mods/Famous/textures/items/hb.png";
        public static String HK_PNG = "/mods/Famous/textures/items/hk.png";

        public static String HEAL_PNG = "/mods/Famous/textures/items/heal.png";

        public static String FOX_PNG = "/mods/Famous/textures/mobs/fox.png";
        public static String CREEPER_PNG = "/mods/Famous/textures/model/creeper2.png";

        //portal
        public static String PORTALA_PNG = "/mods/Famous/textures/items/portala.png";
        public static String PORTALB_PNG = "/mods/Famous/textures/items/portalb.png";

        public static String BUDDERB_PNG = "/mods/Famous/textures/blocks/budderb.png";
        public static String ATLANTICA_PNG = "/mods/Famous/textures/blocks/atlantica.png";

        public static String CLICK_PNG = "/mods/Famous/textures/blocks/click.png";

        public static String WATERP_PNG = "/mods/Famous/textures/items/waterp.png";

        public static String BG_PNG = "/mods/Famous/textures/mobs/bgolem.png";

        //Machine textures
        public static String FAM_PNG = "/mods/Famous/textures/blocks/famator.png";
        public static String IN_PNG = "/mods/Famous/textures/blocks/indexer.png";
        public static String HD_PNG = "/mods/Famous/textures/items/hd.png";
        public static String LB_PNG = "/mods/Famous/textures/blocks/lb.png";
        public static String SMELT_PNG = "/mods/Famous/textures/blocks/smelt.png";
        public static String RISE_PNG = "/mods/Famous/textures/blocks/rise.png";
        public static String BD_PNG = "/mods/Famous/textures/items/bd.png";

        //2.0
        public static String JERRY_PNG = "/mods/Famous/textures/items/jerry.png";
        public static String SUN_PNG = "/mods/Famous/textures/items/sun.png";
        public static String CLUB_PNG = "/mods/Famous/textures/items/club.png";
        public static String BPICK_PNG = "/mods/Famous/textures/items/bpick.png";
        public static String LAVA_PNG = "/mods/Famous/textures/items/lava.png";
        public static String DIRE_PNG = "/mods/Famous/textures/mobs/dire.png";
        public static String JERRYS_PNG = "/mods/Famous/textures/mobs/jerry.png";
        public static String BCOOK_PNG = "/mods/Famous/textures/items/bcook.png";
        public static String BAPPLE_PNG = "/mods/Famous/textures/items/bapple.png";
        public static String BAXE_PNG = "/mods/Famous/textures/items/baxe.png";

        //Missing Textures
        public static String SWORD1_PNG = "/mods/Famous/textures/items/buddersword.png";
        public static String SWORD2_PNG = "/mods/Famous/textures/items/ssword.png";
        
        // Client stuff
        public void registerRenderers() {
        	RenderingRegistry.registerEntityRenderingHandler(BossFox.class, new RenderFox(new ModelFox(), 0.3F));
        	RenderingRegistry.registerEntityRenderingHandler(Creeper2.class, new RenderCreeper2(new ModelCreeper(), 0.3F));
        	RenderingRegistry.registerEntityRenderingHandler(BGolem.class, new GolemRender(new ModelGolem(), 0.3F));
        }
       
}
