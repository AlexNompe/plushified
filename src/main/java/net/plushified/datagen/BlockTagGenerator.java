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
                .add(ARUYUKI_PLUSHIE)
                .add(BADBOYHALO_PLUSHIE)
                .add(BLACKHOLE_PLUSHIE)
                .add(BRIM_PLUSHIE)
                .add(CHECKGOODMAN_PLUSHIE)
                .add(CLOWNPIERCE_PLUSHIE)
                .add(DEB_PLUSHIE)
                .add(DIANSU_PLUSHIE)
                .add(DLZ_PLUSHIE)
                .add(DOCTOR4T_PLUSHIE)
                .add(DURAWKA_PLUSHIE)
                .add(EBONI_PLUSHIE)
                .add(FELIKTON_PLUSHIE)
                .add(FEREDEN_PLUSHIE)
                .add(FINEK_PLUSHIE)
                .add(GOOSE_PLUSHIE)
                .add(JEREMI_PLUSHIE)
                .add(LAMPCAT_PLUSHIE)
                .add(LUX_PLUSHIE)
                .add(MASK_PLUSHIE)
                .add(MODDY_PLUSHIE)
                .add(NIKI_PLUSHIE)
                .add(NOVIKONY_PLUSHIE)
                .add(NUROFEN_PLUSHIE)
                .add(OBSI_PLUSHIE)
                .add(PHILZA_PLUSHIE)
                .add(PWGOOD_PLUSHIE)
                .add(R4TMAID_PLUSHIE)
                .add(RANBOO_PLUSHIE)
                .add(RESOTA_PLUSHIE)
                .add(SQUIDDO_PLUSHIE)
                .add(STALIN_PLUSHIE)
                .add(TECHNO_PLUSHIE)
                .add(TUVIKU_PLUSHIE)
                .add(VERYLOUDER_PLUSHIE)
                .add(VMUTED_PLUSHIE)
                .add(WINSWEEP_PLUSHIE)
                .add(ZMEEC_PLUSHIE)
                .add(ZMEEVIG_PLUSHIE);
    }
}
