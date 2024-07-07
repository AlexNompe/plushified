package net.plushified.datagen;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.plushified.Plushified;

import java.util.Optional;

import static net.plushified.registry.BlockRegistry.*;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ALEXNOMPE_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/alexnompe_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ARUYUKI_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/aruyuki_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return BADBOYHALO_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/badboyhalo_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return BLACKHOLE_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/blackhole_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return BRIM_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/brim_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return CHECKGOODMAN_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/checkgoodman_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return CLOWNPIERCE_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/clownpierce_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return DEB_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/deb_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return DIANSU_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/diansu_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return DLZ_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/dlz_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return DOCTOR4T_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/doctor4t_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return DURAWKA_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/durawka_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return EBONI_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/eboni_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return FELIKTON_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/felikton_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return FEREDEN_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/fereden_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return FINEK_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/finek_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return GOOSE_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/goose_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return LAMPCAT_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/lampcat_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return LUX_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/lux_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return MASK_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/mask_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return MODDY_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/moddy_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return NIKI_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/niki_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return NOVIKONY_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/novikony_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return OBSI_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/obsi_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return PHILZA_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/philza_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return PWGOOD_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/pwgood_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return R4TMAID_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/r4tmaid_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return RANBOO_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/ranboo_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return RESOTA_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/resota_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return SQUIDDO_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/squiddo_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return STALIN_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/stalin_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return TECHNO_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/techno_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return TUVIKU_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/tuviku_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return VERYLOUDER_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/verylouder_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return VMUTED_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/vmuted_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return WINSWEEP_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/winsweep_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ZMEEC_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/zmeec_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ZMEEVIG_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/zmeevig_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return JEREMI_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/jeremi_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return NUROFEN_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/nurofen_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        }); //this comment is autogenerated
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ALEXNOMPE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/alexnompe_plushie")), Optional.empty()));
        itemModelGenerator.register(ARUYUKI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/aruyuki_plushie")), Optional.empty()));
        itemModelGenerator.register(BADBOYHALO_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/badboyhalo_plushie")), Optional.empty()));
        itemModelGenerator.register(BLACKHOLE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/blackhole_plushie")), Optional.empty()));
        itemModelGenerator.register(BRIM_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/brim_plushie")), Optional.empty()));
        itemModelGenerator.register(CHECKGOODMAN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/checkgoodman_plushie")), Optional.empty()));
        itemModelGenerator.register(CLOWNPIERCE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/clownpierce_plushie")), Optional.empty()));
        itemModelGenerator.register(DEB_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/deb_plushie")), Optional.empty()));
        itemModelGenerator.register(DIANSU_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/diansu_plushie")), Optional.empty()));
        itemModelGenerator.register(DLZ_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/dlz_plushie")), Optional.empty()));
        itemModelGenerator.register(DOCTOR4T_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/doctor4t_plushie")), Optional.empty()));
        itemModelGenerator.register(DURAWKA_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/durawka_plushie")), Optional.empty()));
        itemModelGenerator.register(EBONI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/eboni_plushie")), Optional.empty()));
        itemModelGenerator.register(FELIKTON_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/felikton_plushie")), Optional.empty()));
        itemModelGenerator.register(FEREDEN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/fereden_plushie")), Optional.empty()));
        itemModelGenerator.register(FINEK_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/finek_plushie")), Optional.empty()));
        itemModelGenerator.register(GOOSE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/goose_plushie")), Optional.empty()));
        itemModelGenerator.register(LAMPCAT_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/lampcat_plushie")), Optional.empty()));
        itemModelGenerator.register(LUX_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/lux_plushie")), Optional.empty()));
        itemModelGenerator.register(MASK_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/mask_plushie")), Optional.empty()));
        itemModelGenerator.register(MODDY_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/moddy_plushie")), Optional.empty()));
        itemModelGenerator.register(NIKI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/niki_plushie")), Optional.empty()));
        itemModelGenerator.register(NOVIKONY_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/novikony_plushie")), Optional.empty()));
        itemModelGenerator.register(OBSI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/obsi_plushie")), Optional.empty()));
        itemModelGenerator.register(PHILZA_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/philza_plushie")), Optional.empty()));
        itemModelGenerator.register(PWGOOD_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/pwgood_plushie")), Optional.empty()));
        itemModelGenerator.register(R4TMAID_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/r4tmaid_plushie")), Optional.empty()));
        itemModelGenerator.register(RANBOO_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/ranboo_plushie")), Optional.empty()));
        itemModelGenerator.register(RESOTA_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/resota_plushie")), Optional.empty()));
        itemModelGenerator.register(SQUIDDO_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/squiddo_plushie")), Optional.empty()));
        itemModelGenerator.register(STALIN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/stalin_plushie")), Optional.empty()));
        itemModelGenerator.register(TECHNO_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/techno_plushie")), Optional.empty()));
        itemModelGenerator.register(TUVIKU_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/tuviku_plushie")), Optional.empty()));
        itemModelGenerator.register(VERYLOUDER_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/verylouder_plushie")), Optional.empty()));
        itemModelGenerator.register(VMUTED_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/vmuted_plushie")), Optional.empty()));
        itemModelGenerator.register(WINSWEEP_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/winsweep_plushie")), Optional.empty()));
        itemModelGenerator.register(ZMEEC_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/zmeec_plushie")), Optional.empty()));
        itemModelGenerator.register(ZMEEVIG_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/zmeevig_plushie")), Optional.empty()));
        itemModelGenerator.register(JEREMI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/jeremi_plushie")), Optional.empty()));
        itemModelGenerator.register(NUROFEN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/nurofen_plushie")), Optional.empty())); //this comment is autogenerated
    }
}
