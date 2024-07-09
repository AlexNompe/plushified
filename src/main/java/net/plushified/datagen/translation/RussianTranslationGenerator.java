package net.plushified.datagen.translation;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.plushified.Plushified;

import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import static net.plushified.registry.BlockRegistry.*;

public class RussianTranslationGenerator extends FabricLanguageProvider {
    public RussianTranslationGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ALEXNOMPE_PLUSHIE, "Плюшевая игрушка AlexNompe");
        translationBuilder.add(fourCVIT_PLUSHIE, "Плюшевая игрушка fourcvit");
        translationBuilder.add(ALCEST_M_PLUSHIE, "Плюшевая игрушка Alcest_m");
        translationBuilder.add(ALFEDOV_PLUSHIE, "Плюшевая игрушка Alfedov");
        translationBuilder.add(ALTTERA__PLUSHIE, "Плюшевая игрушка Alttera_");
        translationBuilder.add(ANTFROST_PLUSHIE, "Плюшевая игрушка Antfrost");
        translationBuilder.add(ARATHAIN_PLUSHIE, "Плюшевая игрушка Arathain");
        translationBuilder.add(ARLABUS_PLUSHIE, "Плюшевая игрушка Arlabus");
        translationBuilder.add(ARUYUKI_PLUSHIE, "Плюшевая игрушка Aruyuki");
        translationBuilder.add(ASAI_HATSUYO_PLUSHIE, "Плюшевая игрушка Asai_hatsuyo");
        translationBuilder.add(ASHSWAGG_PLUSHIE, "Плюшевая игрушка Ashswagg");
        translationBuilder.add(AWESAMDUDE_PLUSHIE, "Плюшевая игрушка Awesamdude");
        translationBuilder.add(BACONNWAFFLESzero_PLUSHIE, "Плюшевая игрушка Baconnwaffleszero");
        translationBuilder.add(BADBOYHALO_PLUSHIE, "Плюшевая игрушка Badboyhalo");
        translationBuilder.add(BARSIGOLD_PLUSHIE, "Плюшевая игрушка Barsigold");
        translationBuilder.add(BEZ_LS_PLUSHIE, "Плюшевая игрушка Bez_ls");
        translationBuilder.add(BLACKHOLE_PLUSHIE, "Плюшевая игрушка Blackhole");
        translationBuilder.add(BRANZYCRAFT_PLUSHIE, "Плюшевая игрушка Branzycraft");
        translationBuilder.add(BRIM_PLUSHIE, "Плюшевая игрушка Brim");
        translationBuilder.add(CAPTAINPUFFY_PLUSHIE, "Плюшевая игрушка Captainpuffy");
        translationBuilder.add(CAPXENOMORPH_PLUSHIE, "Плюшевая игрушка Capxenomorph");
        translationBuilder.add(CHECKGOODMAN_PLUSHIE, "Плюшевая игрушка Checkgoodman");
        translationBuilder.add(CHIEFXD_PLUSHIE, "Плюшевая игрушка Chiefxd");
        translationBuilder.add(CLOWNPIERCE_PLUSHIE, "Плюшевая игрушка Clownpierce");
        translationBuilder.add(CONNOREATSPANTS_PLUSHIE, "Плюшевая игрушка Connoreatspants");
        translationBuilder.add(DEB_PLUSHIE, "Плюшевая игрушка Deb");
        translationBuilder.add(DERAPCHU_PLUSHIE, "Плюшевая игрушка Derapchu");
        translationBuilder.add(DIAMKEY_PLUSHIE, "Плюшевая игрушка Diamkey");
        translationBuilder.add(DIANSU_PLUSHIE, "Плюшевая игрушка Diansu");
        translationBuilder.add(DLZ_PLUSHIE, "Плюшевая игрушка Dlz");
        translationBuilder.add(DOCTORfourT_PLUSHIE, "Плюшевая игрушка Doctorfourt");
        translationBuilder.add(DREAM_PLUSHIE, "Плюшевая игрушка Dream");
        translationBuilder.add(DURAWKA_PLUSHIE, "Плюшевая игрушка Durawka");
        translationBuilder.add(DUSHENKA__PLUSHIE, "Плюшевая игрушка Dushenka_");
        translationBuilder.add(EBONI_PLUSHIE, "Плюшевая игрушка Eboni");
        translationBuilder.add(ECORRIDOR_PLUSHIE, "Плюшевая игрушка Ecorridor");
        translationBuilder.add(EIGHTSIDEDSQUARE_PLUSHIE, "Плюшевая игрушка Eightsidedsquare");
        translationBuilder.add(ERET_PLUSHIE, "Плюшевая игрушка Eret");
        translationBuilder.add(FARADEY_PLUSHIE, "Плюшевая игрушка Faradey");
        translationBuilder.add(FELIKTON_PLUSHIE, "Плюшевая игрушка Felikton");
        translationBuilder.add(FEREDEN_PLUSHIE, "Плюшевая игрушка Fereden");
        translationBuilder.add(FINEK_PLUSHIE, "Плюшевая игрушка Finek");
        translationBuilder.add(FLAMEFRAGS_PLUSHIE, "Плюшевая игрушка Flamefrags");
        translationBuilder.add(FOOLISH_PLUSHIE, "Плюшевая игрушка Foolish");
        translationBuilder.add(FUNDY_PLUSHIE, "Плюшевая игрушка Fundy");
        translationBuilder.add(GEL_MO_PLUSHIE, "Плюшевая игрушка Gel_mo");
        translationBuilder.add(GEORGENOTFOUND_PLUSHIE, "Плюшевая игрушка Georgenotfound");
        translationBuilder.add(GOOSE_PLUSHIE, "Плюшевая игрушка Goose");
        translationBuilder.add(HANNAHXXROSE_PLUSHIE, "Плюшевая игрушка Hannahxxrose");
        translationBuilder.add(HAYDone__PLUSHIE, "Плюшевая игрушка Haydone_");
        translationBuilder.add(HBOMBninefour_PLUSHIE, "Плюшевая игрушка Hbombninefour");
        translationBuilder.add(HREL_MC_PLUSHIE, "Плюшевая игрушка Hrel_mc");
        translationBuilder.add(INAGGY_PLUSHIE, "Плюшевая игрушка Inaggy");
        translationBuilder.add(JACKMANIFOLD_PLUSHIE, "Плюшевая игрушка Jackmanifold");
        translationBuilder.add(JAY_POKERMAN_PLUSHIE, "Плюшевая игрушка Jay_pokerman");
        translationBuilder.add(JEPEXX_PLUSHIE, "Плюшевая игрушка Jepexx");
        translationBuilder.add(JEREMI_PLUSHIE, "Плюшевая игрушка Jeremi");
        translationBuilder.add(JUMPERWHO_PLUSHIE, "Плюшевая игрушка Jumperwho");
        translationBuilder.add(JUSTKABOODLE_PLUSHIE, "Плюшевая игрушка Justkaboodle");
        translationBuilder.add(JUST_S_PLUSHIE, "Плюшевая игрушка Just_s");
        translationBuilder.add(KADOTANUKLES_PLUSHIE, "Плюшевая игрушка Kadotanukles");
        translationBuilder.add(KARLJACOBS_PLUSHIE, "Плюшевая игрушка Karljacobs");
        translationBuilder.add(KAVKIN_PLUSHIE, "Плюшевая игрушка Kavkin");
        translationBuilder.add(KETRINCYST_PLUSHIE, "Плюшевая игрушка Ketrincyst");
        translationBuilder.add(KLASHRAICK_PLUSHIE, "Плюшевая игрушка Klashraick");
        translationBuilder.add(KLUV_V_PLUSHIE, "Плюшевая игрушка Kluv_v");
        translationBuilder.add(KROLIKMUN_PLUSHIE, "Плюшевая игрушка Krolikmun");
        translationBuilder.add(LAMPCAT_PLUSHIE, "Плюшевая игрушка Lampcat");
        translationBuilder.add(LEOWzeroOK_PLUSHIE, "Плюшевая игрушка Leowzerook");
        translationBuilder.add(LORDSANTOS_PLUSHIE, "Плюшевая игрушка Lordsantos");
        translationBuilder.add(LUX_PLUSHIE, "Плюшевая игрушка Lux");
        translationBuilder.add(MAGMUSTX_PLUSHIE, "Плюшевая игрушка Magmustx");
        translationBuilder.add(MAKAFOLZ_PLUSHIE, "Плюшевая игрушка Makafolz");
        translationBuilder.add(MANEPEAR_PLUSHIE, "Плюшевая игрушка Manepear");
        translationBuilder.add(MAPICC_PLUSHIE, "Плюшевая игрушка Mapicc");
        translationBuilder.add(MARTSCOMM_PLUSHIE, "Плюшевая игрушка Martscomm");
        translationBuilder.add(MASK_PLUSHIE, "Плюшевая игрушка Mask");
        translationBuilder.add(MICHAELMCCHILL_PLUSHIE, "Плюшевая игрушка Michaelmcchill");
        translationBuilder.add(MINUTETECH_PLUSHIE, "Плюшевая игрушка Minutetech");
        translationBuilder.add(MOoneVINE_PLUSHIE, "Плюшевая игрушка Moonevine");
        translationBuilder.add(MODDY_PLUSHIE, "Плюшевая игрушка Moddy");
        translationBuilder.add(MRCUBEsix_PLUSHIE, "Плюшевая игрушка Mrcubesix");
        translationBuilder.add(MRPUPE_PLUSHIE, "Плюшевая игрушка Mrpupe");
        translationBuilder.add(M_MAFINEV_PLUSHIE, "Плюшевая игрушка M_mafinev");
        translationBuilder.add(NAGIBAYKA_PLUSHIE, "Плюшевая игрушка Nagibayka");
        translationBuilder.add(NEADAPTAR_PLUSHIE, "Плюшевая игрушка Neadaptar");
        translationBuilder.add(NERKIN__PLUSHIE, "Плюшевая игрушка Nerkin_");
        translationBuilder.add(NIHACHU_PLUSHIE, "Плюшевая игрушка Nihachu");
        translationBuilder.add(NIKI_PLUSHIE, "Плюшевая игрушка Niki");
        translationBuilder.add(NOVIKONY_PLUSHIE, "Плюшевая игрушка Novikony");
        translationBuilder.add(NUROFEN_PLUSHIE, "Плюшевая игрушка Nurofen");
        translationBuilder.add(OBSIDIANTIMEsixnine_PLUSHIE, "Плюшевая игрушка Obsidiantimesixnine");
        translationBuilder.add(OBSI_PLUSHIE, "Плюшевая игрушка Obsi");
        translationBuilder.add(OLYACHESAPIK_PLUSHIE, "Плюшевая игрушка Olyachesapik");
        translationBuilder.add(OPTIMIST_EZZ_PLUSHIE, "Плюшевая игрушка Optimist_ezz");
        translationBuilder.add(PANGI_PLUSHIE, "Плюшевая игрушка Pangi");
        translationBuilder.add(PEENTAR_PLUSHIE, "Плюшевая игрушка Peentar");
        translationBuilder.add(PHILZA_PLUSHIE, "Плюшевая игрушка Philza");
        translationBuilder.add(PLANETLORD_PLUSHIE, "Плюшевая игрушка Planetlord");
        translationBuilder.add(PONK_PLUSHIE, "Плюшевая игрушка Ponk");
        translationBuilder.add(PRINCEZAM_PLUSHIE, "Плюшевая игрушка Princezam");
        translationBuilder.add(PURPLED_PLUSHIE, "Плюшевая игрушка Purpled");
        translationBuilder.add(PWGOOD_PLUSHIE, "Плюшевая игрушка Pwgood");
        translationBuilder.add(PWGOOOD_PLUSHIE, "Плюшевая игрушка Pwgoood");
        translationBuilder.add(QUACKITY_PLUSHIE, "Плюшевая игрушка Quackity");
        translationBuilder.add(RfourTMAID_PLUSHIE, "Плюшевая игрушка Rfourtmaid");
        translationBuilder.add(RANBOO_PLUSHIE, "Плюшевая игрушка Ranboo");
        translationBuilder.add(REDDOONS_PLUSHIE, "Плюшевая игрушка Reddoons");
        translationBuilder.add(RESOTA_PLUSHIE, "Плюшевая игрушка Resota");
        translationBuilder.add(ROSHAMBOGAMES_PLUSHIE, "Плюшевая игрушка Roshambogames");
        translationBuilder.add(SANHEZ_PLUSHIE, "Плюшевая игрушка Sanhez");
        translationBuilder.add(SAPNAP_PLUSHIE, "Плюшевая игрушка Sapnap"); //this comment is autogenerated

        translationBuilder.add("itemGroup."+ Plushified.MOD_ID+".plushies", "Плюшевые игрушки");

        translationBuilder.add("subtitles."+Plushified.MOD_ID+".plushie_pat_sound", "Писк плюшевой игрушки");

        try {
            Optional<Path> path = dataOutput.getModContainer().findPath("assets/plushified/lang/ru_ru.json");
            translationBuilder.add(path.get());
        } catch (Exception e) {
            LOGGER.info("Failed to merge language file: " + e);
        }
    }
}
