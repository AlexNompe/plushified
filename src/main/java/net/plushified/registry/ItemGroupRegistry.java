package net.plushified.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.plushified.Plushified;

import static net.plushified.registry.BlockRegistry.*;

public class ItemGroupRegistry {
    private static final ItemGroup PLUSHIES_ITEMGROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ALEXNOMPE_PLUSHIE))
            .displayName(Text.translatable("itemGroup."+Plushified.MOD_ID+".plushies"))
            .entries((context, entries) -> {
                entries.add(ALEXNOMPE_PLUSHIE);
                entries.add(fourCVIT_PLUSHIE);
                entries.add(ALCEST_M_PLUSHIE);
                entries.add(ALFEDOV_PLUSHIE);
                entries.add(ALTTERA__PLUSHIE);
                entries.add(ANTFROST_PLUSHIE);
                entries.add(ARATHAIN_PLUSHIE);
                entries.add(ARLABUS_PLUSHIE);
                entries.add(ARUYUKI_PLUSHIE);
                entries.add(ASAI_HATSUYO_PLUSHIE);
                entries.add(ASHSWAGG_PLUSHIE);
                entries.add(AWESAMDUDE_PLUSHIE);
                entries.add(BACONNWAFFLESzero_PLUSHIE);
                entries.add(BADBOYHALO_PLUSHIE);
                entries.add(BARSIGOLD_PLUSHIE);
                entries.add(BEZ_LS_PLUSHIE);
                entries.add(BLACKHOLE_PLUSHIE);
                entries.add(BRANZYCRAFT_PLUSHIE);
                entries.add(BRIM_PLUSHIE);
                entries.add(CAPTAINPUFFY_PLUSHIE);
                entries.add(CAPXENOMORPH_PLUSHIE);
                entries.add(CHECKGOODMAN_PLUSHIE);
                entries.add(CHIEFXD_PLUSHIE);
                entries.add(CLOWNPIERCE_PLUSHIE);
                entries.add(CONNOREATSPANTS_PLUSHIE);
                entries.add(DEB_PLUSHIE);
                entries.add(DERAPCHU_PLUSHIE);
                entries.add(DIAMKEY_PLUSHIE);
                entries.add(DIANSU_PLUSHIE);
                entries.add(DLZ_PLUSHIE);
                entries.add(DOCTORfourT_PLUSHIE);
                entries.add(DREAM_PLUSHIE);
                entries.add(DURAWKA_PLUSHIE);
                entries.add(DUSHENKA__PLUSHIE);
                entries.add(EBONI_PLUSHIE);
                entries.add(ECORRIDOR_PLUSHIE);
                entries.add(EIGHTSIDEDSQUARE_PLUSHIE);
                entries.add(ERET_PLUSHIE);
                entries.add(FARADEY_PLUSHIE);
                entries.add(FELIKTON_PLUSHIE);
                entries.add(FEREDEN_PLUSHIE);
                entries.add(FINEK_PLUSHIE);
                entries.add(FLAMEFRAGS_PLUSHIE);
                entries.add(FOOLISH_PLUSHIE);
                entries.add(FUNDY_PLUSHIE);
                entries.add(GEL_MO_PLUSHIE);
                entries.add(GEORGENOTFOUND_PLUSHIE);
                entries.add(GOOSE_PLUSHIE);
                entries.add(HANNAHXXROSE_PLUSHIE);
                entries.add(HAYDone__PLUSHIE);
                entries.add(HBOMBninefour_PLUSHIE);
                entries.add(HREL_MC_PLUSHIE);
                entries.add(INAGGY_PLUSHIE);
                entries.add(JACKMANIFOLD_PLUSHIE);
                entries.add(JAY_POKERMAN_PLUSHIE);
                entries.add(JEPEXX_PLUSHIE);
                entries.add(JEREMI_PLUSHIE);
                entries.add(JUMPERWHO_PLUSHIE);
                entries.add(JUSTKABOODLE_PLUSHIE);
                entries.add(JUST_S_PLUSHIE);
                entries.add(KADOTANUKLES_PLUSHIE);
                entries.add(KARLJACOBS_PLUSHIE);
                entries.add(KAVKIN_PLUSHIE);
                entries.add(KETRINCYST_PLUSHIE);
                entries.add(KLASHRAICK_PLUSHIE);
                entries.add(KLUV_V_PLUSHIE);
                entries.add(KROLIKMUN_PLUSHIE);
                entries.add(LAMPCAT_PLUSHIE);
                entries.add(LEOWzeroOK_PLUSHIE);
                entries.add(LORDSANTOS_PLUSHIE);
                entries.add(LUX_PLUSHIE);
                entries.add(MAGMUSTX_PLUSHIE);
                entries.add(MAKAFOLZ_PLUSHIE);
                entries.add(MANEPEAR_PLUSHIE);
                entries.add(MAPICC_PLUSHIE);
                entries.add(MARTSCOMM_PLUSHIE);
                entries.add(MASK_PLUSHIE);
                entries.add(MICHAELMCCHILL_PLUSHIE);
                entries.add(MINUTETECH_PLUSHIE);
                entries.add(MOoneVINE_PLUSHIE);
                entries.add(MODDY_PLUSHIE);
                entries.add(MRCUBEsix_PLUSHIE);
                entries.add(MRPUPE_PLUSHIE);
                entries.add(M_MAFINEV_PLUSHIE);
                entries.add(NAGIBAYKA_PLUSHIE);
                entries.add(NEADAPTAR_PLUSHIE);
                entries.add(NERKIN__PLUSHIE);
                entries.add(NIHACHU_PLUSHIE);
                entries.add(NIKI_PLUSHIE);
                entries.add(NOVIKONY_PLUSHIE);
                entries.add(NUROFEN_PLUSHIE);
                entries.add(OBSIDIANTIMEsixnine_PLUSHIE);
                entries.add(OBSI_PLUSHIE);
                entries.add(OLYACHESAPIK_PLUSHIE);
                entries.add(OPTIMIST_EZZ_PLUSHIE);
                entries.add(PANGI_PLUSHIE);
                entries.add(PEENTAR_PLUSHIE);
                entries.add(PHILZA_PLUSHIE);
                entries.add(PLANETLORD_PLUSHIE);
                entries.add(PONK_PLUSHIE);
                entries.add(PRINCEZAM_PLUSHIE);
                entries.add(PURPLED_PLUSHIE);
                entries.add(PWGOOD_PLUSHIE);
                entries.add(PWGOOOD_PLUSHIE);
                entries.add(QUACKITY_PLUSHIE);
                entries.add(RfourTMAID_PLUSHIE);
                entries.add(RANBOO_PLUSHIE);
                entries.add(REDDOONS_PLUSHIE);
                entries.add(RESOTA_PLUSHIE);
                entries.add(ROSHAMBOGAMES_PLUSHIE);
                entries.add(SANHEZ_PLUSHIE);
                entries.add(SAPNAP_PLUSHIE); //this comment is autogenerated
            })
            .build();

    public static void registering() {
        Plushified.LOGGER.info("OMG! ItemGroup registry...");
        Registry.register(Registries.ITEM_GROUP, Identifier.of(Plushified.MOD_ID, "plushies"), PLUSHIES_ITEMGROUP);
    }
}
