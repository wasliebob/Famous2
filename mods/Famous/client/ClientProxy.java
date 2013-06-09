package mods.Famous.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import mods.Famous.CommonProxy;
import mods.Famous.Famous;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{
       
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(S_PNG);
                MinecraftForgeClient.preloadTexture(SKY_PNG);
                MinecraftForgeClient.preloadTexture(JOE_PNG);
                MinecraftForgeClient.preloadTexture(CODY_PNG);
                MinecraftForgeClient.preloadTexture(HONEYDEW_PNG);
                MinecraftForgeClient.preloadTexture(XEPHOS_PNG);
                MinecraftForgeClient.preloadTexture(SMAN_PNG);
                MinecraftForgeClient.preloadTexture(IMAIL_PNG);
                MinecraftForgeClient.preloadTexture(WASLIE_PNG);
                MinecraftForgeClient.preloadTexture(SSWORD_PNG);
                MinecraftForgeClient.preloadTexture(ISP_PNG);
                MinecraftForgeClient.preloadTexture(A_PNG);
                MinecraftForgeClient.preloadTexture(NARUTO_PNG);
                MinecraftForgeClient.preloadTexture(SASUKE_PNG);
                MinecraftForgeClient.preloadTexture(ORE_PNG);
                MinecraftForgeClient.preloadTexture(DBLOCK_PNG);
                MinecraftForgeClient.preloadTexture(INGOT_PNG);
                MinecraftForgeClient.preloadTexture(NSWORD_PNG);
                MinecraftForgeClient.preloadTexture(CAP_PNG);
                MinecraftForgeClient.preloadTexture(CAVE_PNG);
                MinecraftForgeClient.preloadTexture(UN_PNG);
                MinecraftForgeClient.preloadTexture(G_PNG);
                MinecraftForgeClient.preloadTexture(ANT_PNG);
                MinecraftForgeClient.preloadTexture(AINGOT_PNG);
                MinecraftForgeClient.preloadTexture(ASWORD_PNG);
                MinecraftForgeClient.preloadTexture(HEROBRINE_PNG);
                MinecraftForgeClient.preloadTexture(NOTCH_PNG);
                MinecraftForgeClient.preloadTexture(VOX_PNG);
                MinecraftForgeClient.preloadTexture(LBLOCK_PNG);
                MinecraftForgeClient.preloadTexture(NS_PNG);
                MinecraftForgeClient.preloadTexture(CHIM_PNG);
                MinecraftForgeClient.preloadTexture(DEAD_PNG);
                MinecraftForgeClient.preloadTexture(HU_PNG);
                MinecraftForgeClient.preloadTexture(JEB_PNG);
                MinecraftForgeClient.preloadTexture(GB_PNG);
                MinecraftForgeClient.preloadTexture(SLY_PNG);
                MinecraftForgeClient.preloadTexture(TH_PNG);
                MinecraftForgeClient.preloadTexture(GA_PNG);
                MinecraftForgeClient.preloadTexture(P_PNG);
                MinecraftForgeClient.preloadTexture(NINJA_PNG);
                MinecraftForgeClient.preloadTexture(GC_PNG);
                
                MinecraftForgeClient.preloadTexture(CUP_PNG);
                MinecraftForgeClient.preloadTexture(SET_PNG);
                MinecraftForgeClient.preloadTexture(SETH_PNG);
                MinecraftForgeClient.preloadTexture(GIZ_PNG);
                MinecraftForgeClient.preloadTexture(KERMIT_PNG);
                MinecraftForgeClient.preloadTexture(SS_PNG);
                MinecraftForgeClient.preloadTexture(DAWN_PNG);
                MinecraftForgeClient.preloadTexture(TCN_PNG);
                MinecraftForgeClient.preloadTexture(GIB_PNG);
                MinecraftForgeClient.preloadTexture(HANNAH_PNG);
                MinecraftForgeClient.preloadTexture(DUNCAN_PNG);
                MinecraftForgeClient.preloadTexture(MART_PNG);
                MinecraftForgeClient.preloadTexture(GAME_PNG);
                MinecraftForgeClient.preloadTexture(BERTIE_PNG);
                MinecraftForgeClient.preloadTexture(SC_PNG);
                MinecraftForgeClient.preloadTexture(IN_PNG);
                MinecraftForgeClient.preloadTexture(FAM_PNG);
                MinecraftForgeClient.preloadTexture(HD_PNG);
                MinecraftForgeClient.preloadTexture(CATA_PNG);

                MinecraftForgeClient.preloadTexture(AT_PNG);
                
                MinecraftForgeClient.preloadTexture(ETHO_PNG);
                MinecraftForgeClient.preloadTexture(SK_PNG);

                MinecraftForgeClient.preloadTexture(FOX_PNG);
                MinecraftForgeClient.preloadTexture(KERALIS_PNG);
                MinecraftForgeClient.preloadTexture(VOID_PNG);
                MinecraftForgeClient.preloadTexture(HYPNO_PNG);
                MinecraftForgeClient.preloadTexture(HY_PNG);

                //Food
                MinecraftForgeClient.preloadTexture(JAFFA_PNG);
                
                //Swords
                MinecraftForgeClient.preloadTexture(HANDLE_PNG);
                MinecraftForgeClient.preloadTexture(FIRE_PNG);
                MinecraftForgeClient.preloadTexture(FIRES_PNG);

                MinecraftForgeClient.preloadTexture(HK_PNG);
                MinecraftForgeClient.preloadTexture(HB_PNG);
                
                MinecraftForgeClient.preloadTexture(HEAL_PNG);

                MinecraftForgeClient.preloadTexture(PORTALA_PNG);
                MinecraftForgeClient.preloadTexture(BUDDERB_PNG);

                MinecraftForgeClient.preloadTexture(ATLANTICA_PNG);
                MinecraftForgeClient.preloadTexture(PORTALB_PNG);

                MinecraftForgeClient.preloadTexture(CLICK_PNG);
                MinecraftForgeClient.preloadTexture(WATERP_PNG);
                MinecraftForgeClient.preloadTexture(BG_PNG);
                MinecraftForgeClient.preloadTexture(LB_PNG);
                MinecraftForgeClient.preloadTexture(BBREAD_PNG);
                MinecraftForgeClient.preloadTexture(RISE_PNG);
                MinecraftForgeClient.preloadTexture(SMELT_PNG);
                MinecraftForgeClient.preloadTexture(SFY_PNG);
                MinecraftForgeClient.preloadTexture(SBR_PNG);

                MinecraftForgeClient.preloadTexture(BD_PNG);
                
                //2.0
                MinecraftForgeClient.preloadTexture(JERRY_PNG);
                MinecraftForgeClient.preloadTexture(SUN_PNG);
                MinecraftForgeClient.preloadTexture(BPICK_PNG);
                MinecraftForgeClient.preloadTexture(CLUB_PNG);
                MinecraftForgeClient.preloadTexture(LAVA_PNG);
                MinecraftForgeClient.preloadTexture(DIRE_PNG);
                MinecraftForgeClient.preloadTexture(JERRYS_PNG);
                MinecraftForgeClient.preloadTexture(BCOOK_PNG);
                MinecraftForgeClient.preloadTexture(BAPPLE_PNG);
                MinecraftForgeClient.preloadTexture(BAXE_PNG);
                MinecraftForgeClient.preloadTexture(JERO_PNG);
                MinecraftForgeClient.preloadTexture(BAJAN_PNG);

                //Mising Textures
                MinecraftForgeClient.preloadTexture(SWORD1_PNG);
                MinecraftForgeClient.preloadTexture(SWORD2_PNG);

            	RenderingRegistry.registerEntityRenderingHandler(BGolem.class, new GolemRender(new ModelGolem(), 0.3F));
            	RenderingRegistry.registerEntityRenderingHandler(BossFox.class, new RenderFox(new ModelFox(), 0.3F));
            	RenderingRegistry.registerEntityRenderingHandler(Creeper2.class, new RenderCreeper2(new ModelCreeper(), 0.3F));

        }



}