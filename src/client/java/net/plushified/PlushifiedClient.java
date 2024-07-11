package net.plushified;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

import net.minecraft.util.Identifier;
import net.plushified.renderer.block.*;
import static net.plushified.registry.BlockEntityRegistry.*;
import static net.plushified.registry.BlockRegistry.*;

@Environment(EnvType.CLIENT)
public class PlushifiedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		Plushified.LOGGER.info("OMG! Initializing Client...");

		BlockRenderLayerMap.INSTANCE.putBlock(ALEXNOMPE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(fourCVIT_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ALCEST_M_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ALFEDOV_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ALTTERA__PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ANTFROST_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ARATHAIN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ARLABUS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ARUYUKI_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ASAI_HATSUYO_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ASHSWAGG_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(AWESAMDUDE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(BACONNWAFFLESzero_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(BADBOYHALO_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(BARSIGOLD_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(BEZ_LS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(BLACKHOLE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(BRANZYCRAFT_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(BRIM_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(CAPTAINPUFFY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(CAPXENOMORPH_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(CHECKGOODMAN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(CHIEFXD_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(CLOWNPIERCE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(CONNOREATSPANTS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(DEB_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(DERAPCHU_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(DIAMKEY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(DIANSU_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(DLZ_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(DOCTORfourT_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(DREAM_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(DURAWKA_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(DUSHENKA__PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(EBONI_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ECORRIDOR_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(EIGHTSIDEDSQUARE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ERET_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(FARADEY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(FELIKTON_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(FEREDEN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(FINEK_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(FLAMEFRAGS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(FOOLISH_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(FUNDY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(GEL_MO_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(GEORGENOTFOUND_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(GOOSE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(HANNAHXXROSE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(HAYDone__PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(HBOMBninefour_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(HREL_MC_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(INAGGY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(JACKMANIFOLD_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(JAY_POKERMAN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(JEPEXX_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(JEREMI_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(JUMPERWHO_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(JUSTKABOODLE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(JUST_S_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(KADOTANUKLES_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(KARLJACOBS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(KAVKIN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(KETRINCYST_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(KLASHRAICK_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(KLUV_V_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(KROLIKMUN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(LAMPCAT_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(LEOWzeroOK_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(LORDSANTOS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(LUX_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MAGMUSTX_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MAKAFOLZ_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MANEPEAR_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MAPICC_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MARTSCOMM_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MASK_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MICHAELMCCHILL_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MINUTETECH_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MOoneVINE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MODDY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MRCUBEsix_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MRPUPE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(M_MAFINEV_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(NAGIBAYKA_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(NEADAPTAR_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(NERKIN__PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(NIHACHU_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(NIKI_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(NOVIKONY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(NUROFEN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(OBSI_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(OLYACHESAPIK_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(OPTIMIST_EZZ_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(PANGI_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(PEENTAR_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(PHILZA_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(PLANETLORD_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(PONK_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(PRINCEZAM_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(PURPLED_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(PWGOOOD_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(QUACKITY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(RfourTMAID_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(RANBOO_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(REDDOONS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(RESOTA_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ROSHAMBOGAMES_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SANHEZ_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SAPNAP_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SBseventhreeseven_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SECB_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SIRPILIGRIM_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SKEPPY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SLOVENOF_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SMMASSH_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SNEEGSNAG_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SNRGIRAFFE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SPEPTICLE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SPOKEISHERE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SQUIDDO_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(STALIN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(TECHNO_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(THEKLYDE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(THETERRAIN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(TOMMYINNIT_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(TUBBO_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(TUVIKU_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(VACMAKAC_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(VENAZAR_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(VERYLOUDER_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(VIKKSTARonetwothree_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(VIPSSS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(VMUTED_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(VORTthreeXDRAGON_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(WEMMBU_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(WILBURSOOT_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(WINSWEEP_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(WOOGIEX_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(YEAH_JARON_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ZAKVIEL_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ZMEEC_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ZMEEVIG_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(_HEO__PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(eightONFIRE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ASTRONYU_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(BDOUBLEOonezerozero_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(CUBFANonethreefive_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(DOCMsevenseven_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(FALSESYMMETRY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(FOWRzero_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(FREAKGENIUS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(GEMINITAY_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(GOODTIMESWITHSCAR_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(GRIAN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(HYPNOTIZD_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(IJEVIN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(IMPULSESV_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ISKALLeightfive_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(JOEHILLSSAYS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(KERALIS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(KIRICATTUS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MORIYASHIINE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(MUMBOJUMBO_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(NOXINTRUS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(PEARLESCENTMOON_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(RENDOG_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SILLVIATV_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SKIZZLEMAN_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(SMALLISHBEANS_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(STRESSMONSTERonezeroone_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(TALON_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(TANGOTEK_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(VINTAGEBEEF_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(XBCRAFTED_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(XISUMA_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(YAHIAMICE_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ZEDAPH_PLUSHIE, RenderLayer.getTranslucent());
    	BlockRenderLayerMap.INSTANCE.putBlock(ZOMBIECLEO_PLUSHIE, RenderLayer.getTranslucent()); //this comment is autogenerated

		BlockEntityRendererFactories.register(ALEXNOMPE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "alexnompe_plushie")));
		BlockEntityRendererFactories.register(fourCVIT_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "4cvit_plushie")));
		BlockEntityRendererFactories.register(ALCEST_M_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "alcest_m_plushie")));
		BlockEntityRendererFactories.register(ALFEDOV_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "alfedov_plushie")));
		BlockEntityRendererFactories.register(ALTTERA__PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "alttera__plushie")));
		BlockEntityRendererFactories.register(ANTFROST_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "antfrost_plushie")));
		BlockEntityRendererFactories.register(ARATHAIN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "arathain_plushie")));
		BlockEntityRendererFactories.register(ARLABUS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "arlabus_plushie")));
		BlockEntityRendererFactories.register(ARUYUKI_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "aruyuki_plushie")));
		BlockEntityRendererFactories.register(ASAI_HATSUYO_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "asai_hatsuyo_plushie")));
		BlockEntityRendererFactories.register(ASHSWAGG_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "ashswagg_plushie")));
		BlockEntityRendererFactories.register(AWESAMDUDE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "awesamdude_plushie")));
		BlockEntityRendererFactories.register(BACONNWAFFLESzero_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "baconnwaffles0_plushie")));
		BlockEntityRendererFactories.register(BADBOYHALO_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "badboyhalo_plushie")));
		BlockEntityRendererFactories.register(BARSIGOLD_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "barsigold_plushie")));
		BlockEntityRendererFactories.register(BEZ_LS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "bez_ls_plushie")));
		BlockEntityRendererFactories.register(BLACKHOLE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "blackhole_plushie")));
		BlockEntityRendererFactories.register(BRANZYCRAFT_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "branzycraft_plushie")));
		BlockEntityRendererFactories.register(BRIM_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "brim_plushie")));
		BlockEntityRendererFactories.register(CAPTAINPUFFY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "captainpuffy_plushie")));
		BlockEntityRendererFactories.register(CAPXENOMORPH_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "capxenomorph_plushie")));
		BlockEntityRendererFactories.register(CHECKGOODMAN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "checkgoodman_plushie")));
		BlockEntityRendererFactories.register(CHIEFXD_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "chiefxd_plushie")));
		BlockEntityRendererFactories.register(CLOWNPIERCE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "clownpierce_plushie")));
		BlockEntityRendererFactories.register(CONNOREATSPANTS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "connoreatspants_plushie")));
		BlockEntityRendererFactories.register(DEB_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "deb_plushie")));
		BlockEntityRendererFactories.register(DERAPCHU_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "derapchu_plushie")));
		BlockEntityRendererFactories.register(DIAMKEY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "diamkey_plushie")));
		BlockEntityRendererFactories.register(DIANSU_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "diansu_plushie")));
		BlockEntityRendererFactories.register(DLZ_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "dlz_plushie")));
		BlockEntityRendererFactories.register(DOCTORfourT_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "doctor4t_plushie")));
		BlockEntityRendererFactories.register(DREAM_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "dream_plushie")));
		BlockEntityRendererFactories.register(DURAWKA_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "durawka_plushie")));
		BlockEntityRendererFactories.register(DUSHENKA__PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "dushenka__plushie")));
		BlockEntityRendererFactories.register(EBONI_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "eboni_plushie")));
		BlockEntityRendererFactories.register(ECORRIDOR_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "ecorridor_plushie")));
		BlockEntityRendererFactories.register(EIGHTSIDEDSQUARE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "eightsidedsquare_plushie")));
		BlockEntityRendererFactories.register(ERET_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "eret_plushie")));
		BlockEntityRendererFactories.register(FARADEY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "faradey_plushie")));
		BlockEntityRendererFactories.register(FELIKTON_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "felikton_plushie")));
		BlockEntityRendererFactories.register(FEREDEN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "fereden_plushie")));
		BlockEntityRendererFactories.register(FINEK_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "finek_plushie")));
		BlockEntityRendererFactories.register(FLAMEFRAGS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "flamefrags_plushie")));
		BlockEntityRendererFactories.register(FOOLISH_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "foolish_plushie")));
		BlockEntityRendererFactories.register(FUNDY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "fundy_plushie")));
		BlockEntityRendererFactories.register(GEL_MO_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "gel_mo_plushie")));
		BlockEntityRendererFactories.register(GEORGENOTFOUND_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "georgenotfound_plushie")));
		BlockEntityRendererFactories.register(GOOSE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "goose_plushie")));
		BlockEntityRendererFactories.register(HANNAHXXROSE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "hannahxxrose_plushie")));
		BlockEntityRendererFactories.register(HAYDone__PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "hayd1__plushie")));
		BlockEntityRendererFactories.register(HBOMBninefour_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "hbomb94_plushie")));
		BlockEntityRendererFactories.register(HREL_MC_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "hrel_mc_plushie")));
		BlockEntityRendererFactories.register(INAGGY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "inaggy_plushie")));
		BlockEntityRendererFactories.register(JACKMANIFOLD_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "jackmanifold_plushie")));
		BlockEntityRendererFactories.register(JAY_POKERMAN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "jay_pokerman_plushie")));
		BlockEntityRendererFactories.register(JEPEXX_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "jepexx_plushie")));
		BlockEntityRendererFactories.register(JEREMI_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "jeremi_plushie")));
		BlockEntityRendererFactories.register(JUMPERWHO_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "jumperwho_plushie")));
		BlockEntityRendererFactories.register(JUSTKABOODLE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "justkaboodle_plushie")));
		BlockEntityRendererFactories.register(JUST_S_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "just_s_plushie")));
		BlockEntityRendererFactories.register(KADOTANUKLES_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "kadotanukles_plushie")));
		BlockEntityRendererFactories.register(KARLJACOBS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "karljacobs_plushie")));
		BlockEntityRendererFactories.register(KAVKIN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "kavkin_plushie")));
		BlockEntityRendererFactories.register(KETRINCYST_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "ketrincyst_plushie")));
		BlockEntityRendererFactories.register(KLASHRAICK_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "klashraick_plushie")));
		BlockEntityRendererFactories.register(KLUV_V_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "kluv_v_plushie")));
		BlockEntityRendererFactories.register(KROLIKMUN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "krolikmun_plushie")));
		BlockEntityRendererFactories.register(LAMPCAT_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "lampcat_plushie")));
		BlockEntityRendererFactories.register(LEOWzeroOK_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "leow0ok_plushie")));
		BlockEntityRendererFactories.register(LORDSANTOS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "lordsantos_plushie")));
		BlockEntityRendererFactories.register(LUX_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "lux_plushie")));
		BlockEntityRendererFactories.register(MAGMUSTX_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "magmustx_plushie")));
		BlockEntityRendererFactories.register(MAKAFOLZ_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "makafolz_plushie")));
		BlockEntityRendererFactories.register(MANEPEAR_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "manepear_plushie")));
		BlockEntityRendererFactories.register(MAPICC_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "mapicc_plushie")));
		BlockEntityRendererFactories.register(MARTSCOMM_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "martscomm_plushie")));
		BlockEntityRendererFactories.register(MASK_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "mask_plushie")));
		BlockEntityRendererFactories.register(MICHAELMCCHILL_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "michaelmcchill_plushie")));
		BlockEntityRendererFactories.register(MINUTETECH_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "minutetech_plushie")));
		BlockEntityRendererFactories.register(MOoneVINE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "mo1vine_plushie")));
		BlockEntityRendererFactories.register(MODDY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "moddy_plushie")));
		BlockEntityRendererFactories.register(MRCUBEsix_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "mrcube6_plushie")));
		BlockEntityRendererFactories.register(MRPUPE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "mrpupe_plushie")));
		BlockEntityRendererFactories.register(M_MAFINEV_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "m_mafinev_plushie")));
		BlockEntityRendererFactories.register(NAGIBAYKA_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "nagibayka_plushie")));
		BlockEntityRendererFactories.register(NEADAPTAR_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "neadaptar_plushie")));
		BlockEntityRendererFactories.register(NERKIN__PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "nerkin__plushie")));
		BlockEntityRendererFactories.register(NIHACHU_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "nihachu_plushie")));
		BlockEntityRendererFactories.register(NIKI_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "niki_plushie")));
		BlockEntityRendererFactories.register(NOVIKONY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "novikony_plushie")));
		BlockEntityRendererFactories.register(NUROFEN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "nurofen_plushie")));
		BlockEntityRendererFactories.register(OBSI_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "obsi_plushie")));
		BlockEntityRendererFactories.register(OLYACHESAPIK_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "olyachesapik_plushie")));
		BlockEntityRendererFactories.register(OPTIMIST_EZZ_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "optimist_ezz_plushie")));
		BlockEntityRendererFactories.register(PANGI_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "pangi_plushie")));
		BlockEntityRendererFactories.register(PEENTAR_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "peentar_plushie")));
		BlockEntityRendererFactories.register(PHILZA_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "philza_plushie")));
		BlockEntityRendererFactories.register(PLANETLORD_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "planetlord_plushie")));
		BlockEntityRendererFactories.register(PONK_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "ponk_plushie")));
		BlockEntityRendererFactories.register(PRINCEZAM_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "princezam_plushie")));
		BlockEntityRendererFactories.register(PURPLED_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "purpled_plushie")));
		BlockEntityRendererFactories.register(PWGOOOD_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "pwgoood_plushie")));
		BlockEntityRendererFactories.register(QUACKITY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "quackity_plushie")));
		BlockEntityRendererFactories.register(RfourTMAID_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "r4tmaid_plushie")));
		BlockEntityRendererFactories.register(RANBOO_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "ranboo_plushie")));
		BlockEntityRendererFactories.register(REDDOONS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "reddoons_plushie")));
		BlockEntityRendererFactories.register(RESOTA_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "resota_plushie")));
		BlockEntityRendererFactories.register(ROSHAMBOGAMES_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "roshambogames_plushie")));
		BlockEntityRendererFactories.register(SANHEZ_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "sanhez_plushie")));
		BlockEntityRendererFactories.register(SAPNAP_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "sapnap_plushie")));
		BlockEntityRendererFactories.register(SBseventhreeseven_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "sb737_plushie")));
		BlockEntityRendererFactories.register(SECB_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "secb_plushie")));
		BlockEntityRendererFactories.register(SIRPILIGRIM_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "sirpiligrim_plushie")));
		BlockEntityRendererFactories.register(SKEPPY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "skeppy_plushie")));
		BlockEntityRendererFactories.register(SLOVENOF_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "slovenof_plushie")));
		BlockEntityRendererFactories.register(SMMASSH_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "smmassh_plushie")));
		BlockEntityRendererFactories.register(SNEEGSNAG_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "sneegsnag_plushie")));
		BlockEntityRendererFactories.register(SNRGIRAFFE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "snrgiraffe_plushie")));
		BlockEntityRendererFactories.register(SPEPTICLE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "spepticle_plushie")));
		BlockEntityRendererFactories.register(SPOKEISHERE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "spokeishere_plushie")));
		BlockEntityRendererFactories.register(SQUIDDO_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "squiddo_plushie")));
		BlockEntityRendererFactories.register(STALIN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "stalin_plushie")));
		BlockEntityRendererFactories.register(TECHNO_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "techno_plushie")));
		BlockEntityRendererFactories.register(THEKLYDE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "theklyde_plushie")));
		BlockEntityRendererFactories.register(THETERRAIN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "theterrain_plushie")));
		BlockEntityRendererFactories.register(TOMMYINNIT_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "tommyinnit_plushie")));
		BlockEntityRendererFactories.register(TUBBO_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "tubbo_plushie")));
		BlockEntityRendererFactories.register(TUVIKU_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "tuviku_plushie")));
		BlockEntityRendererFactories.register(VACMAKAC_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "vacmakac_plushie")));
		BlockEntityRendererFactories.register(VENAZAR_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "venazar_plushie")));
		BlockEntityRendererFactories.register(VERYLOUDER_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "verylouder_plushie")));
		BlockEntityRendererFactories.register(VIKKSTARonetwothree_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "vikkstar123_plushie")));
		BlockEntityRendererFactories.register(VIPSSS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "vipsss_plushie")));
		BlockEntityRendererFactories.register(VMUTED_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "vmuted_plushie")));
		BlockEntityRendererFactories.register(VORTthreeXDRAGON_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "vort3xdragon_plushie")));
		BlockEntityRendererFactories.register(WEMMBU_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "wemmbu_plushie")));
		BlockEntityRendererFactories.register(WILBURSOOT_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "wilbursoot_plushie")));
		BlockEntityRendererFactories.register(WINSWEEP_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "winsweep_plushie")));
		BlockEntityRendererFactories.register(WOOGIEX_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "woogiex_plushie")));
		BlockEntityRendererFactories.register(YEAH_JARON_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "yeah_jaron_plushie")));
		BlockEntityRendererFactories.register(ZAKVIEL_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "zakviel_plushie")));
		BlockEntityRendererFactories.register(ZMEEC_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "zmeec_plushie")));
		BlockEntityRendererFactories.register(ZMEEVIG_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "zmeevig_plushie")));
		BlockEntityRendererFactories.register(_HEO__PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "_heo__plushie")));
		BlockEntityRendererFactories.register(eightONFIRE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "8onfire_plushie")));
		BlockEntityRendererFactories.register(ASTRONYU_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "astronyu_plushie")));
		BlockEntityRendererFactories.register(BDOUBLEOonezerozero_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "bdoubleo100_plushie")));
		BlockEntityRendererFactories.register(CUBFANonethreefive_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "cubfan135_plushie")));
		BlockEntityRendererFactories.register(DOCMsevenseven_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "docm77_plushie")));
		BlockEntityRendererFactories.register(FALSESYMMETRY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "falsesymmetry_plushie")));
		BlockEntityRendererFactories.register(FOWRzero_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "fowr0_plushie")));
		BlockEntityRendererFactories.register(FREAKGENIUS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "freakgenius_plushie")));
		BlockEntityRendererFactories.register(GEMINITAY_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "geminitay_plushie")));
		BlockEntityRendererFactories.register(GOODTIMESWITHSCAR_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "goodtimeswithscar_plushie")));
		BlockEntityRendererFactories.register(GRIAN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "grian_plushie")));
		BlockEntityRendererFactories.register(HYPNOTIZD_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "hypnotizd_plushie")));
		BlockEntityRendererFactories.register(IJEVIN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "ijevin_plushie")));
		BlockEntityRendererFactories.register(IMPULSESV_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "impulsesv_plushie")));
		BlockEntityRendererFactories.register(ISKALLeightfive_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "iskall85_plushie")));
		BlockEntityRendererFactories.register(JOEHILLSSAYS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "joehillssays_plushie")));
		BlockEntityRendererFactories.register(KERALIS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "keralis_plushie")));
		BlockEntityRendererFactories.register(KIRICATTUS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "kiricattus_plushie")));
		BlockEntityRendererFactories.register(MORIYASHIINE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "moriyashiine_plushie")));
		BlockEntityRendererFactories.register(MUMBOJUMBO_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "mumbojumbo_plushie")));
		BlockEntityRendererFactories.register(NOXINTRUS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "noxintrus_plushie")));
		BlockEntityRendererFactories.register(PEARLESCENTMOON_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "pearlescentmoon_plushie")));
		BlockEntityRendererFactories.register(RENDOG_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "rendog_plushie")));
		BlockEntityRendererFactories.register(SILLVIATV_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "sillviatv_plushie")));
		BlockEntityRendererFactories.register(SKIZZLEMAN_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "skizzleman_plushie")));
		BlockEntityRendererFactories.register(SMALLISHBEANS_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "smallishbeans_plushie")));
		BlockEntityRendererFactories.register(STRESSMONSTERonezeroone_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "stressmonster101_plushie")));
		BlockEntityRendererFactories.register(TALON_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "talon_plushie")));
		BlockEntityRendererFactories.register(TANGOTEK_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "tangotek_plushie")));
		BlockEntityRendererFactories.register(VINTAGEBEEF_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "vintagebeef_plushie")));
		BlockEntityRendererFactories.register(XBCRAFTED_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "xbcrafted_plushie")));
		BlockEntityRendererFactories.register(XISUMA_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "xisuma_plushie")));
		BlockEntityRendererFactories.register(YAHIAMICE_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "yahiamice_plushie")));
		BlockEntityRendererFactories.register(ZEDAPH_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "zedaph_plushie")));
		BlockEntityRendererFactories.register(ZOMBIECLEO_PLUSHIE_BLOCK_ENTITY,
				context -> new PlushieRenderer(Identifier.of(Plushified.MOD_ID, "zombiecleo_plushie"))); //this comment is autogenerated
	}
}