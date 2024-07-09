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
                return fourCVIT_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/4cvit_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ALCEST_M_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/alcest_m_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ALFEDOV_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/alfedov_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ALTTERA__PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/alttera__plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ANTFROST_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/antfrost_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ARATHAIN_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/arathain_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ARLABUS_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/arlabus_plushie");
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
                return ASAI_HATSUYO_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/asai_hatsuyo_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ASHSWAGG_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/ashswagg_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return AWESAMDUDE_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/awesamdude_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return BACONNWAFFLESzero_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/baconnwaffles0_plushie");
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
                return BARSIGOLD_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/barsigold_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return BEZ_LS_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/bez_ls_plushie");
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
                return BRANZYCRAFT_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/branzycraft_plushie");
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
                return CAPTAINPUFFY_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/captainpuffy_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return CAPXENOMORPH_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/capxenomorph_plushie");
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
                return CHIEFXD_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/chiefxd_plushie");
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
                return CONNOREATSPANTS_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/connoreatspants_plushie");
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
                return DERAPCHU_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/derapchu_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return DIAMKEY_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/diamkey_plushie");
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
                return DOCTORfourT_PLUSHIE;
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
                return DREAM_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/dream_plushie");
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
                return DUSHENKA__PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/dushenka__plushie");
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
                return ECORRIDOR_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/ecorridor_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return EIGHTSIDEDSQUARE_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/eightsidedsquare_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return ERET_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/eret_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return FARADEY_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/faradey_plushie");
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
                return FLAMEFRAGS_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/flamefrags_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return FOOLISH_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/foolish_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return FUNDY_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/fundy_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return GEL_MO_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/gel_mo_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return GEORGENOTFOUND_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/georgenotfound_plushie");
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
                return HANNAHXXROSE_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/hannahxxrose_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return HAYDone__PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/hayd1__plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return HBOMBninefour_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/hbomb94_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return HREL_MC_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/hrel_mc_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return INAGGY_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/inaggy_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return JACKMANIFOLD_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/jackmanifold_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return JAY_POKERMAN_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/jay_pokerman_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return JEPEXX_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/jepexx_plushie");
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
                return JUMPERWHO_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/jumperwho_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return JUSTKABOODLE_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/justkaboodle_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return JUST_S_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/just_s_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return KADOTANUKLES_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/kadotanukles_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return KARLJACOBS_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/karljacobs_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return KAVKIN_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/kavkin_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return KETRINCYST_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/ketrincyst_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return KLASHRAICK_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/klashraick_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return KLUV_V_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/kluv_v_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return KROLIKMUN_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/krolikmun_plushie");
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
                return LEOWzeroOK_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/leow0ok_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return LORDSANTOS_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/lordsantos_plushie");
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
                return MAGMUSTX_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/magmustx_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return MAKAFOLZ_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/makafolz_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return MANEPEAR_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/manepear_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return MAPICC_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/mapicc_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return MARTSCOMM_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/martscomm_plushie");
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
                return MICHAELMCCHILL_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/michaelmcchill_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return MINUTETECH_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/minutetech_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return MOoneVINE_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/mo1vine_plushie");
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
                return MRCUBEsix_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/mrcube6_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return MRPUPE_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/mrpupe_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return M_MAFINEV_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/m_mafinev_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return NAGIBAYKA_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/nagibayka_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return NEADAPTAR_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/neadaptar_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return NERKIN__PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/nerkin__plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return NIHACHU_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/nihachu_plushie");
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
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return OBSIDIANTIMEsixnine_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/obsidiantime69_plushie");
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
                return OLYACHESAPIK_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/olyachesapik_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return OPTIMIST_EZZ_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/optimist_ezz_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return PANGI_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/pangi_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return PEENTAR_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/peentar_plushie");
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
                return PLANETLORD_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/planetlord_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return PONK_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/ponk_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return PRINCEZAM_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/princezam_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return PURPLED_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/purpled_plushie");
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
                return PWGOOOD_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/pwgoood_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return QUACKITY_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/quackity_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return RfourTMAID_PLUSHIE;
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
                return REDDOONS_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/reddoons_plushie");
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
                return ROSHAMBOGAMES_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/roshambogames_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return SANHEZ_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/sanhez_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        });
        blockStateModelGenerator.blockStateCollector.accept(new BlockStateSupplier() {
            @Override
            public Block getBlock() {
                return SAPNAP_PLUSHIE;
            }
            @Override
            public JsonElement get() {
                JsonObject json = new JsonObject();
                JsonObject variants = new JsonObject();
                JsonObject model = new JsonObject();
                model.addProperty("model", Plushified.MOD_ID+":block/sapnap_plushie");
                variants.add("", model);
                json.add("variants", variants);
                return json;
            }
        }); //this comment is autogenerated
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ALEXNOMPE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/alexnompe_plushie")), Optional.empty()));
        itemModelGenerator.register(fourCVIT_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/4cvit_plushie")), Optional.empty()));
        itemModelGenerator.register(ALCEST_M_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/alcest_m_plushie")), Optional.empty()));
        itemModelGenerator.register(ALFEDOV_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/alfedov_plushie")), Optional.empty()));
        itemModelGenerator.register(ALTTERA__PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/alttera__plushie")), Optional.empty()));
        itemModelGenerator.register(ANTFROST_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/antfrost_plushie")), Optional.empty()));
        itemModelGenerator.register(ARATHAIN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/arathain_plushie")), Optional.empty()));
        itemModelGenerator.register(ARLABUS_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/arlabus_plushie")), Optional.empty()));
        itemModelGenerator.register(ARUYUKI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/aruyuki_plushie")), Optional.empty()));
        itemModelGenerator.register(ASAI_HATSUYO_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/asai_hatsuyo_plushie")), Optional.empty()));
        itemModelGenerator.register(ASHSWAGG_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/ashswagg_plushie")), Optional.empty()));
        itemModelGenerator.register(AWESAMDUDE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/awesamdude_plushie")), Optional.empty()));
        itemModelGenerator.register(BACONNWAFFLESzero_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/baconnwaffles0_plushie")), Optional.empty()));
        itemModelGenerator.register(BADBOYHALO_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/badboyhalo_plushie")), Optional.empty()));
        itemModelGenerator.register(BARSIGOLD_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/barsigold_plushie")), Optional.empty()));
        itemModelGenerator.register(BEZ_LS_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/bez_ls_plushie")), Optional.empty()));
        itemModelGenerator.register(BLACKHOLE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/blackhole_plushie")), Optional.empty()));
        itemModelGenerator.register(BRANZYCRAFT_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/branzycraft_plushie")), Optional.empty()));
        itemModelGenerator.register(BRIM_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/brim_plushie")), Optional.empty()));
        itemModelGenerator.register(CAPTAINPUFFY_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/captainpuffy_plushie")), Optional.empty()));
        itemModelGenerator.register(CAPXENOMORPH_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/capxenomorph_plushie")), Optional.empty()));
        itemModelGenerator.register(CHECKGOODMAN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/checkgoodman_plushie")), Optional.empty()));
        itemModelGenerator.register(CHIEFXD_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/chiefxd_plushie")), Optional.empty()));
        itemModelGenerator.register(CLOWNPIERCE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/clownpierce_plushie")), Optional.empty()));
        itemModelGenerator.register(CONNOREATSPANTS_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/connoreatspants_plushie")), Optional.empty()));
        itemModelGenerator.register(DEB_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/deb_plushie")), Optional.empty()));
        itemModelGenerator.register(DERAPCHU_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/derapchu_plushie")), Optional.empty()));
        itemModelGenerator.register(DIAMKEY_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/diamkey_plushie")), Optional.empty()));
        itemModelGenerator.register(DIANSU_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/diansu_plushie")), Optional.empty()));
        itemModelGenerator.register(DLZ_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/dlz_plushie")), Optional.empty()));
        itemModelGenerator.register(DOCTORfourT_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/doctor4t_plushie")), Optional.empty()));
        itemModelGenerator.register(DREAM_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/dream_plushie")), Optional.empty()));
        itemModelGenerator.register(DURAWKA_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/durawka_plushie")), Optional.empty()));
        itemModelGenerator.register(DUSHENKA__PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/dushenka__plushie")), Optional.empty()));
        itemModelGenerator.register(EBONI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/eboni_plushie")), Optional.empty()));
        itemModelGenerator.register(ECORRIDOR_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/ecorridor_plushie")), Optional.empty()));
        itemModelGenerator.register(EIGHTSIDEDSQUARE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/eightsidedsquare_plushie")), Optional.empty()));
        itemModelGenerator.register(ERET_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/eret_plushie")), Optional.empty()));
        itemModelGenerator.register(FARADEY_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/faradey_plushie")), Optional.empty()));
        itemModelGenerator.register(FELIKTON_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/felikton_plushie")), Optional.empty()));
        itemModelGenerator.register(FEREDEN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/fereden_plushie")), Optional.empty()));
        itemModelGenerator.register(FINEK_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/finek_plushie")), Optional.empty()));
        itemModelGenerator.register(FLAMEFRAGS_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/flamefrags_plushie")), Optional.empty()));
        itemModelGenerator.register(FOOLISH_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/foolish_plushie")), Optional.empty()));
        itemModelGenerator.register(FUNDY_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/fundy_plushie")), Optional.empty()));
        itemModelGenerator.register(GEL_MO_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/gel_mo_plushie")), Optional.empty()));
        itemModelGenerator.register(GEORGENOTFOUND_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/georgenotfound_plushie")), Optional.empty()));
        itemModelGenerator.register(GOOSE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/goose_plushie")), Optional.empty()));
        itemModelGenerator.register(HANNAHXXROSE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/hannahxxrose_plushie")), Optional.empty()));
        itemModelGenerator.register(HAYDone__PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/hayd1__plushie")), Optional.empty()));
        itemModelGenerator.register(HBOMBninefour_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/hbomb94_plushie")), Optional.empty()));
        itemModelGenerator.register(HREL_MC_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/hrel_mc_plushie")), Optional.empty()));
        itemModelGenerator.register(INAGGY_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/inaggy_plushie")), Optional.empty()));
        itemModelGenerator.register(JACKMANIFOLD_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/jackmanifold_plushie")), Optional.empty()));
        itemModelGenerator.register(JAY_POKERMAN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/jay_pokerman_plushie")), Optional.empty()));
        itemModelGenerator.register(JEPEXX_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/jepexx_plushie")), Optional.empty()));
        itemModelGenerator.register(JEREMI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/jeremi_plushie")), Optional.empty()));
        itemModelGenerator.register(JUMPERWHO_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/jumperwho_plushie")), Optional.empty()));
        itemModelGenerator.register(JUSTKABOODLE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/justkaboodle_plushie")), Optional.empty()));
        itemModelGenerator.register(JUST_S_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/just_s_plushie")), Optional.empty()));
        itemModelGenerator.register(KADOTANUKLES_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/kadotanukles_plushie")), Optional.empty()));
        itemModelGenerator.register(KARLJACOBS_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/karljacobs_plushie")), Optional.empty()));
        itemModelGenerator.register(KAVKIN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/kavkin_plushie")), Optional.empty()));
        itemModelGenerator.register(KETRINCYST_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/ketrincyst_plushie")), Optional.empty()));
        itemModelGenerator.register(KLASHRAICK_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/klashraick_plushie")), Optional.empty()));
        itemModelGenerator.register(KLUV_V_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/kluv_v_plushie")), Optional.empty()));
        itemModelGenerator.register(KROLIKMUN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/krolikmun_plushie")), Optional.empty()));
        itemModelGenerator.register(LAMPCAT_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/lampcat_plushie")), Optional.empty()));
        itemModelGenerator.register(LEOWzeroOK_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/leow0ok_plushie")), Optional.empty()));
        itemModelGenerator.register(LORDSANTOS_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/lordsantos_plushie")), Optional.empty()));
        itemModelGenerator.register(LUX_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/lux_plushie")), Optional.empty()));
        itemModelGenerator.register(MAGMUSTX_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/magmustx_plushie")), Optional.empty()));
        itemModelGenerator.register(MAKAFOLZ_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/makafolz_plushie")), Optional.empty()));
        itemModelGenerator.register(MANEPEAR_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/manepear_plushie")), Optional.empty()));
        itemModelGenerator.register(MAPICC_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/mapicc_plushie")), Optional.empty()));
        itemModelGenerator.register(MARTSCOMM_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/martscomm_plushie")), Optional.empty()));
        itemModelGenerator.register(MASK_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/mask_plushie")), Optional.empty()));
        itemModelGenerator.register(MICHAELMCCHILL_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/michaelmcchill_plushie")), Optional.empty()));
        itemModelGenerator.register(MINUTETECH_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/minutetech_plushie")), Optional.empty()));
        itemModelGenerator.register(MOoneVINE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/mo1vine_plushie")), Optional.empty()));
        itemModelGenerator.register(MODDY_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/moddy_plushie")), Optional.empty()));
        itemModelGenerator.register(MRCUBEsix_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/mrcube6_plushie")), Optional.empty()));
        itemModelGenerator.register(MRPUPE_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/mrpupe_plushie")), Optional.empty()));
        itemModelGenerator.register(M_MAFINEV_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/m_mafinev_plushie")), Optional.empty()));
        itemModelGenerator.register(NAGIBAYKA_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/nagibayka_plushie")), Optional.empty()));
        itemModelGenerator.register(NEADAPTAR_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/neadaptar_plushie")), Optional.empty()));
        itemModelGenerator.register(NERKIN__PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/nerkin__plushie")), Optional.empty()));
        itemModelGenerator.register(NIHACHU_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/nihachu_plushie")), Optional.empty()));
        itemModelGenerator.register(NIKI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/niki_plushie")), Optional.empty()));
        itemModelGenerator.register(NOVIKONY_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/novikony_plushie")), Optional.empty()));
        itemModelGenerator.register(NUROFEN_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/nurofen_plushie")), Optional.empty()));
        itemModelGenerator.register(OBSIDIANTIMEsixnine_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/obsidiantime69_plushie")), Optional.empty()));
        itemModelGenerator.register(OBSI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/obsi_plushie")), Optional.empty()));
        itemModelGenerator.register(OLYACHESAPIK_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/olyachesapik_plushie")), Optional.empty()));
        itemModelGenerator.register(OPTIMIST_EZZ_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/optimist_ezz_plushie")), Optional.empty()));
        itemModelGenerator.register(PANGI_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/pangi_plushie")), Optional.empty()));
        itemModelGenerator.register(PEENTAR_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/peentar_plushie")), Optional.empty()));
        itemModelGenerator.register(PHILZA_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/philza_plushie")), Optional.empty()));
        itemModelGenerator.register(PLANETLORD_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/planetlord_plushie")), Optional.empty()));
        itemModelGenerator.register(PONK_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/ponk_plushie")), Optional.empty()));
        itemModelGenerator.register(PRINCEZAM_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/princezam_plushie")), Optional.empty()));
        itemModelGenerator.register(PURPLED_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/purpled_plushie")), Optional.empty()));
        itemModelGenerator.register(PWGOOD_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/pwgood_plushie")), Optional.empty()));
        itemModelGenerator.register(PWGOOOD_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/pwgoood_plushie")), Optional.empty()));
        itemModelGenerator.register(QUACKITY_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/quackity_plushie")), Optional.empty()));
        itemModelGenerator.register(RfourTMAID_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/r4tmaid_plushie")), Optional.empty()));
        itemModelGenerator.register(RANBOO_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/ranboo_plushie")), Optional.empty()));
        itemModelGenerator.register(REDDOONS_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/reddoons_plushie")), Optional.empty()));
        itemModelGenerator.register(RESOTA_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/resota_plushie")), Optional.empty()));
        itemModelGenerator.register(ROSHAMBOGAMES_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/roshambogames_plushie")), Optional.empty()));
        itemModelGenerator.register(SANHEZ_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/sanhez_plushie")), Optional.empty()));
        itemModelGenerator.register(SAPNAP_PLUSHIE.asItem(), new Model(Optional.of(Identifier.of(Plushified.MOD_ID,"block/sapnap_plushie")), Optional.empty())); //this comment is autogenerated
    }
}
