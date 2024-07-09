package net.plushified.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.plushified.Plushified;

import java.util.concurrent.CompletableFuture;

import static net.plushified.registry.BlockRegistry.*;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider{
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of(Plushified.MOD_ID, "plushie")))
                .add(ALEXNOMPE_PLUSHIE)
                .add(fourCVIT_PLUSHIE)
                .add(ALCEST_M_PLUSHIE)
                .add(ALFEDOV_PLUSHIE)
                .add(ALTTERA__PLUSHIE)
                .add(ANTFROST_PLUSHIE)
                .add(ARATHAIN_PLUSHIE)
                .add(ARLABUS_PLUSHIE)
                .add(ARUYUKI_PLUSHIE)
                .add(ASAI_HATSUYO_PLUSHIE)
                .add(ASHSWAGG_PLUSHIE)
                .add(AWESAMDUDE_PLUSHIE)
                .add(BACONNWAFFLESzero_PLUSHIE)
                .add(BADBOYHALO_PLUSHIE)
                .add(BARSIGOLD_PLUSHIE)
                .add(BEZ_LS_PLUSHIE)
                .add(BLACKHOLE_PLUSHIE)
                .add(BRANZYCRAFT_PLUSHIE)
                .add(BRIM_PLUSHIE)
                .add(CAPTAINPUFFY_PLUSHIE)
                .add(CAPXENOMORPH_PLUSHIE)
                .add(CHECKGOODMAN_PLUSHIE)
                .add(CHIEFXD_PLUSHIE)
                .add(CLOWNPIERCE_PLUSHIE)
                .add(CONNOREATSPANTS_PLUSHIE)
                .add(DEB_PLUSHIE)
                .add(DERAPCHU_PLUSHIE)
                .add(DIAMKEY_PLUSHIE)
                .add(DIANSU_PLUSHIE)
                .add(DLZ_PLUSHIE)
                .add(DOCTORfourT_PLUSHIE)
                .add(DREAM_PLUSHIE)
                .add(DURAWKA_PLUSHIE)
                .add(DUSHENKA__PLUSHIE)
                .add(EBONI_PLUSHIE)
                .add(ECORRIDOR_PLUSHIE)
                .add(EIGHTSIDEDSQUARE_PLUSHIE)
                .add(ERET_PLUSHIE)
                .add(FARADEY_PLUSHIE)
                .add(FELIKTON_PLUSHIE)
                .add(FEREDEN_PLUSHIE)
                .add(FINEK_PLUSHIE)
                .add(FLAMEFRAGS_PLUSHIE)
                .add(FOOLISH_PLUSHIE)
                .add(FUNDY_PLUSHIE)
                .add(GEL_MO_PLUSHIE)
                .add(GEORGENOTFOUND_PLUSHIE)
                .add(GOOSE_PLUSHIE)
                .add(HANNAHXXROSE_PLUSHIE)
                .add(HAYDone__PLUSHIE)
                .add(HBOMBninefour_PLUSHIE)
                .add(HREL_MC_PLUSHIE)
                .add(INAGGY_PLUSHIE)
                .add(JACKMANIFOLD_PLUSHIE)
                .add(JAY_POKERMAN_PLUSHIE)
                .add(JEPEXX_PLUSHIE)
                .add(JEREMI_PLUSHIE)
                .add(JUMPERWHO_PLUSHIE)
                .add(JUSTKABOODLE_PLUSHIE)
                .add(JUST_S_PLUSHIE)
                .add(KADOTANUKLES_PLUSHIE)
                .add(KARLJACOBS_PLUSHIE)
                .add(KAVKIN_PLUSHIE)
                .add(KETRINCYST_PLUSHIE)
                .add(KLASHRAICK_PLUSHIE)
                .add(KLUV_V_PLUSHIE)
                .add(KROLIKMUN_PLUSHIE)
                .add(LAMPCAT_PLUSHIE)
                .add(LEOWzeroOK_PLUSHIE)
                .add(LORDSANTOS_PLUSHIE)
                .add(LUX_PLUSHIE)
                .add(MAGMUSTX_PLUSHIE)
                .add(MAKAFOLZ_PLUSHIE)
                .add(MANEPEAR_PLUSHIE)
                .add(MAPICC_PLUSHIE)
                .add(MARTSCOMM_PLUSHIE)
                .add(MASK_PLUSHIE)
                .add(MICHAELMCCHILL_PLUSHIE)
                .add(MINUTETECH_PLUSHIE)
                .add(MOoneVINE_PLUSHIE)
                .add(MODDY_PLUSHIE)
                .add(MRCUBEsix_PLUSHIE)
                .add(MRPUPE_PLUSHIE)
                .add(M_MAFINEV_PLUSHIE)
                .add(NAGIBAYKA_PLUSHIE)
                .add(NEADAPTAR_PLUSHIE)
                .add(NERKIN__PLUSHIE)
                .add(NIHACHU_PLUSHIE)
                .add(NIKI_PLUSHIE)
                .add(NOVIKONY_PLUSHIE)
                .add(NUROFEN_PLUSHIE)
                .add(OBSIDIANTIMEsixnine_PLUSHIE)
                .add(OBSI_PLUSHIE)
                .add(OLYACHESAPIK_PLUSHIE)
                .add(OPTIMIST_EZZ_PLUSHIE)
                .add(PANGI_PLUSHIE)
                .add(PEENTAR_PLUSHIE)
                .add(PHILZA_PLUSHIE)
                .add(PLANETLORD_PLUSHIE)
                .add(PONK_PLUSHIE)
                .add(PRINCEZAM_PLUSHIE)
                .add(PURPLED_PLUSHIE)
                .add(PWGOOD_PLUSHIE)
                .add(PWGOOOD_PLUSHIE)
                .add(QUACKITY_PLUSHIE)
                .add(RfourTMAID_PLUSHIE)
                .add(RANBOO_PLUSHIE)
                .add(REDDOONS_PLUSHIE)
                .add(RESOTA_PLUSHIE)
                .add(ROSHAMBOGAMES_PLUSHIE)
                .add(SANHEZ_PLUSHIE)
                .add(SAPNAP_PLUSHIE);
    }
}
