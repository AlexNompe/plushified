package net.plushified.datagen.translation;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.plushified.Plushified;

import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import static net.plushified.registry.BlockRegistry.*;

public class EnglishTranslationGenerator extends FabricLanguageProvider {
    public EnglishTranslationGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ALEXNOMPE_PLUSHIE, "AlexNompe plushie");
        translationBuilder.add(fourCVIT_PLUSHIE, "fourcvit plushie");
        translationBuilder.add(ALCEST_M_PLUSHIE, "Alcest_m plushie");
        translationBuilder.add(ALFEDOV_PLUSHIE, "Alfedov plushie");
        translationBuilder.add(ALTTERA__PLUSHIE, "Alttera_ plushie");
        translationBuilder.add(ANTFROST_PLUSHIE, "Antfrost plushie");
        translationBuilder.add(ARATHAIN_PLUSHIE, "Arathain plushie");
        translationBuilder.add(ARLABUS_PLUSHIE, "Arlabus plushie");
        translationBuilder.add(ARUYUKI_PLUSHIE, "Aruyuki plushie");
        translationBuilder.add(ASAI_HATSUYO_PLUSHIE, "Asai_hatsuyo plushie");
        translationBuilder.add(ASHSWAGG_PLUSHIE, "Ashswagg plushie");
        translationBuilder.add(AWESAMDUDE_PLUSHIE, "Awesamdude plushie");
        translationBuilder.add(BACONNWAFFLESzero_PLUSHIE, "Baconnwaffleszero plushie");
        translationBuilder.add(BADBOYHALO_PLUSHIE, "Badboyhalo plushie");
        translationBuilder.add(BARSIGOLD_PLUSHIE, "Barsigold plushie");
        translationBuilder.add(BEZ_LS_PLUSHIE, "Bez_ls plushie");
        translationBuilder.add(BLACKHOLE_PLUSHIE, "Blackhole plushie");
        translationBuilder.add(BRANZYCRAFT_PLUSHIE, "Branzycraft plushie");
        translationBuilder.add(BRIM_PLUSHIE, "Brim plushie");
        translationBuilder.add(CAPTAINPUFFY_PLUSHIE, "Captainpuffy plushie");
        translationBuilder.add(CAPXENOMORPH_PLUSHIE, "Capxenomorph plushie");
        translationBuilder.add(CHECKGOODMAN_PLUSHIE, "Checkgoodman plushie");
        translationBuilder.add(CHIEFXD_PLUSHIE, "Chiefxd plushie");
        translationBuilder.add(CLOWNPIERCE_PLUSHIE, "Clownpierce plushie");
        translationBuilder.add(CONNOREATSPANTS_PLUSHIE, "Connoreatspants plushie");
        translationBuilder.add(DEB_PLUSHIE, "Deb plushie");
        translationBuilder.add(DERAPCHU_PLUSHIE, "Derapchu plushie");
        translationBuilder.add(DIAMKEY_PLUSHIE, "Diamkey plushie");
        translationBuilder.add(DIANSU_PLUSHIE, "Diansu plushie");
        translationBuilder.add(DLZ_PLUSHIE, "Dlz plushie");
        translationBuilder.add(DOCTORfourT_PLUSHIE, "Doctorfourt plushie");
        translationBuilder.add(DREAM_PLUSHIE, "Dream plushie");
        translationBuilder.add(DURAWKA_PLUSHIE, "Durawka plushie");
        translationBuilder.add(DUSHENKA__PLUSHIE, "Dushenka_ plushie");
        translationBuilder.add(EBONI_PLUSHIE, "Eboni plushie");
        translationBuilder.add(ECORRIDOR_PLUSHIE, "Ecorridor plushie");
        translationBuilder.add(EIGHTSIDEDSQUARE_PLUSHIE, "Eightsidedsquare plushie");
        translationBuilder.add(ERET_PLUSHIE, "Eret plushie");
        translationBuilder.add(FARADEY_PLUSHIE, "Faradey plushie");
        translationBuilder.add(FELIKTON_PLUSHIE, "Felikton plushie");
        translationBuilder.add(FEREDEN_PLUSHIE, "Fereden plushie");
        translationBuilder.add(FINEK_PLUSHIE, "Finek plushie");
        translationBuilder.add(FLAMEFRAGS_PLUSHIE, "Flamefrags plushie");
        translationBuilder.add(FOOLISH_PLUSHIE, "Foolish plushie");
        translationBuilder.add(FUNDY_PLUSHIE, "Fundy plushie");
        translationBuilder.add(GEL_MO_PLUSHIE, "Gel_mo plushie");
        translationBuilder.add(GEORGENOTFOUND_PLUSHIE, "Georgenotfound plushie");
        translationBuilder.add(GOOSE_PLUSHIE, "Goose plushie");
        translationBuilder.add(HANNAHXXROSE_PLUSHIE, "Hannahxxrose plushie");
        translationBuilder.add(HAYDone__PLUSHIE, "Haydone_ plushie");
        translationBuilder.add(HBOMBninefour_PLUSHIE, "Hbombninefour plushie");
        translationBuilder.add(HREL_MC_PLUSHIE, "Hrel_mc plushie");
        translationBuilder.add(INAGGY_PLUSHIE, "Inaggy plushie");
        translationBuilder.add(JACKMANIFOLD_PLUSHIE, "Jackmanifold plushie");
        translationBuilder.add(JAY_POKERMAN_PLUSHIE, "Jay_pokerman plushie");
        translationBuilder.add(JEPEXX_PLUSHIE, "Jepexx plushie");
        translationBuilder.add(JEREMI_PLUSHIE, "Jeremi plushie");
        translationBuilder.add(JUMPERWHO_PLUSHIE, "Jumperwho plushie");
        translationBuilder.add(JUSTKABOODLE_PLUSHIE, "Justkaboodle plushie");
        translationBuilder.add(JUST_S_PLUSHIE, "Just_s plushie");
        translationBuilder.add(KADOTANUKLES_PLUSHIE, "Kadotanukles plushie");
        translationBuilder.add(KARLJACOBS_PLUSHIE, "Karljacobs plushie");
        translationBuilder.add(KAVKIN_PLUSHIE, "Kavkin plushie");
        translationBuilder.add(KETRINCYST_PLUSHIE, "Ketrincyst plushie");
        translationBuilder.add(KLASHRAICK_PLUSHIE, "Klashraick plushie");
        translationBuilder.add(KLUV_V_PLUSHIE, "Kluv_v plushie");
        translationBuilder.add(KROLIKMUN_PLUSHIE, "Krolikmun plushie");
        translationBuilder.add(LAMPCAT_PLUSHIE, "Lampcat plushie");
        translationBuilder.add(LEOWzeroOK_PLUSHIE, "Leowzerook plushie");
        translationBuilder.add(LORDSANTOS_PLUSHIE, "Lordsantos plushie");
        translationBuilder.add(LUX_PLUSHIE, "Lux plushie");
        translationBuilder.add(MAGMUSTX_PLUSHIE, "Magmustx plushie");
        translationBuilder.add(MAKAFOLZ_PLUSHIE, "Makafolz plushie");
        translationBuilder.add(MANEPEAR_PLUSHIE, "Manepear plushie");
        translationBuilder.add(MAPICC_PLUSHIE, "Mapicc plushie");
        translationBuilder.add(MARTSCOMM_PLUSHIE, "Martscomm plushie");
        translationBuilder.add(MASK_PLUSHIE, "Mask plushie");
        translationBuilder.add(MICHAELMCCHILL_PLUSHIE, "Michaelmcchill plushie");
        translationBuilder.add(MINUTETECH_PLUSHIE, "Minutetech plushie");
        translationBuilder.add(MOoneVINE_PLUSHIE, "Moonevine plushie");
        translationBuilder.add(MODDY_PLUSHIE, "Moddy plushie");
        translationBuilder.add(MRCUBEsix_PLUSHIE, "Mrcubesix plushie");
        translationBuilder.add(MRPUPE_PLUSHIE, "Mrpupe plushie");
        translationBuilder.add(M_MAFINEV_PLUSHIE, "M_mafinev plushie");
        translationBuilder.add(NAGIBAYKA_PLUSHIE, "Nagibayka plushie");
        translationBuilder.add(NEADAPTAR_PLUSHIE, "Neadaptar plushie");
        translationBuilder.add(NERKIN__PLUSHIE, "Nerkin_ plushie");
        translationBuilder.add(NIHACHU_PLUSHIE, "Nihachu plushie");
        translationBuilder.add(NIKI_PLUSHIE, "Niki plushie");
        translationBuilder.add(NOVIKONY_PLUSHIE, "Novikony plushie");
        translationBuilder.add(NUROFEN_PLUSHIE, "Nurofen plushie");
        translationBuilder.add(OBSIDIANTIMEsixnine_PLUSHIE, "Obsidiantimesixnine plushie");
        translationBuilder.add(OBSI_PLUSHIE, "Obsi plushie");
        translationBuilder.add(OLYACHESAPIK_PLUSHIE, "Olyachesapik plushie");
        translationBuilder.add(OPTIMIST_EZZ_PLUSHIE, "Optimist_ezz plushie");
        translationBuilder.add(PANGI_PLUSHIE, "Pangi plushie");
        translationBuilder.add(PEENTAR_PLUSHIE, "Peentar plushie");
        translationBuilder.add(PHILZA_PLUSHIE, "Philza plushie");
        translationBuilder.add(PLANETLORD_PLUSHIE, "Planetlord plushie");
        translationBuilder.add(PONK_PLUSHIE, "Ponk plushie");
        translationBuilder.add(PRINCEZAM_PLUSHIE, "Princezam plushie");
        translationBuilder.add(PURPLED_PLUSHIE, "Purpled plushie");
        translationBuilder.add(PWGOOD_PLUSHIE, "Pwgood plushie");
        translationBuilder.add(PWGOOOD_PLUSHIE, "Pwgoood plushie");
        translationBuilder.add(QUACKITY_PLUSHIE, "Quackity plushie");
        translationBuilder.add(RfourTMAID_PLUSHIE, "Rfourtmaid plushie");
        translationBuilder.add(RANBOO_PLUSHIE, "Ranboo plushie");
        translationBuilder.add(REDDOONS_PLUSHIE, "Reddoons plushie");
        translationBuilder.add(RESOTA_PLUSHIE, "Resota plushie");
        translationBuilder.add(ROSHAMBOGAMES_PLUSHIE, "Roshambogames plushie");
        translationBuilder.add(SANHEZ_PLUSHIE, "Sanhez plushie");
        translationBuilder.add(SAPNAP_PLUSHIE, "Sapnap plushie"); //this comment is autogenerated

        translationBuilder.add("itemGroup."+Plushified.MOD_ID+".plushies", "Plushies");

        translationBuilder.add("subtitles."+Plushified.MOD_ID+".plushie_pat_sound", "Plushie squeak");

        try {
            Optional<Path> path = dataOutput.getModContainer().findPath("assets/plushified/lang/en_us.json");
            translationBuilder.add(path.get());
        } catch (Exception e) {
            LOGGER.info("Failed to merge language file: " + e);
        }
    }
}
