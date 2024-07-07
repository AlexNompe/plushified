package net.plushified.registry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.plushified.Plushified;
import net.plushified.block.*;
import net.plushified.block.entity.PlushieBlockEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.plushified.registry.BlockEntityRegistry.*;
import static net.plushified.registry.SoundEventRegistry.*;

public class BlockRegistry {

    public static final Block ALEXNOMPE_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new AlexNompePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ALEXNOMPE_PLUSHIE_BLOCK_ENTITY,
                    AlexNompePlushieBlockEntity::tick);
        }
    };
    public static final Block ARUYUKI_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new AruyukiPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ARUYUKI_PLUSHIE_BLOCK_ENTITY,
                    AruyukiPlushieBlockEntity::tick);
        }
    };
    public static final Block BADBOYHALO_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new BadBoyHaloPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, BADBOYHALO_PLUSHIE_BLOCK_ENTITY,
                    BadBoyHaloPlushieBlockEntity::tick);
        }
    };
    public static final Block BLACKHOLE_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new BlackholePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, BLACKHOLE_PLUSHIE_BLOCK_ENTITY,
                    BlackholePlushieBlockEntity::tick);
        }
    };
    public static final Block BRIM_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new BrimPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, BRIM_PLUSHIE_BLOCK_ENTITY,
                    BrimPlushieBlockEntity::tick);
        }
    };
    public static final Block CHECKGOODMAN_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new CheckgoodmanPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, CHECKGOODMAN_PLUSHIE_BLOCK_ENTITY,
                    CheckgoodmanPlushieBlockEntity::tick);
        }
    };
    public static final Block CLOWNPIERCE_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ClownpiercePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, CLOWNPIERCE_PLUSHIE_BLOCK_ENTITY,
                    ClownpiercePlushieBlockEntity::tick);
        }
    };
    public static final Block DEB_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new DebPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, DEB_PLUSHIE_BLOCK_ENTITY,
                    DebPlushieBlockEntity::tick);
        }
    };
    public static final Block DIANSU_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new DiansuPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, DIANSU_PLUSHIE_BLOCK_ENTITY,
                    DiansuPlushieBlockEntity::tick);
        }
    };
    public static final Block DLZ_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new DlzPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, DLZ_PLUSHIE_BLOCK_ENTITY,
                    DlzPlushieBlockEntity::tick);
        }
    };
    public static final Block DOCTOR4T_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Doctor4tPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, DOCTOR4T_PLUSHIE_BLOCK_ENTITY,
                    Doctor4tPlushieBlockEntity::tick);
        }
    };
    public static final Block DURAWKA_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new DurawkaPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, DURAWKA_PLUSHIE_BLOCK_ENTITY,
                    DurawkaPlushieBlockEntity::tick);
        }
    };
    public static final Block EBONI_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new EboniPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, EBONI_PLUSHIE_BLOCK_ENTITY,
                    EboniPlushieBlockEntity::tick);
        }
    };
    public static final Block FELIKTON_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new FeliktonPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, FELIKTON_PLUSHIE_BLOCK_ENTITY,
                    FeliktonPlushieBlockEntity::tick);
        }
    };
    public static final Block FEREDEN_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new FeredenPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, FEREDEN_PLUSHIE_BLOCK_ENTITY,
                    FeredenPlushieBlockEntity::tick);
        }
    };
    public static final Block FINEK_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new FinekPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, FINEK_PLUSHIE_BLOCK_ENTITY,
                    FinekPlushieBlockEntity::tick);
        }
    };
    public static final Block GOOSE_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new GoosePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, GOOSE_PLUSHIE_BLOCK_ENTITY,
                    GoosePlushieBlockEntity::tick);
        }
    };
    public static final Block LAMPCAT_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new LampcatPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, LAMPCAT_PLUSHIE_BLOCK_ENTITY,
                    LampcatPlushieBlockEntity::tick);
        }
    };
    public static final Block LUX_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new LuxPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, LUX_PLUSHIE_BLOCK_ENTITY,
                    LuxPlushieBlockEntity::tick);
        }
    };
    public static final Block MASK_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new MaskPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MASK_PLUSHIE_BLOCK_ENTITY,
                    MaskPlushieBlockEntity::tick);
        }
    };
    public static final Block MODDY_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ModdyPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MODDY_PLUSHIE_BLOCK_ENTITY,
                    ModdyPlushieBlockEntity::tick);
        }
    };
    public static final Block NIKI_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new NikiPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, NIKI_PLUSHIE_BLOCK_ENTITY,
                    NikiPlushieBlockEntity::tick);
        }
    };
    public static final Block NOVIKONY_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new NovikonyPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, NOVIKONY_PLUSHIE_BLOCK_ENTITY,
                    NovikonyPlushieBlockEntity::tick);
        }
    };
    public static final Block OBSI_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ObsiPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, OBSI_PLUSHIE_BLOCK_ENTITY,
                    ObsiPlushieBlockEntity::tick);
        }
    };
    public static final Block PHILZA_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new PhilzaPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, PHILZA_PLUSHIE_BLOCK_ENTITY,
                    PhilzaPlushieBlockEntity::tick);
        }
    };
    public static final Block PWGOOD_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new PwgoodPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, PWGOOD_PLUSHIE_BLOCK_ENTITY,
                    PwgoodPlushieBlockEntity::tick);
        }
    };
    public static final Block R4TMAID_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new R4tmaidPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, R4TMAID_PLUSHIE_BLOCK_ENTITY,
                    R4tmaidPlushieBlockEntity::tick);
        }
    };
    public static final Block RANBOO_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new RanbooPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, RANBOO_PLUSHIE_BLOCK_ENTITY,
                    RanbooPlushieBlockEntity::tick);
        }
    };
    public static final Block RESOTA_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ResotaPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, RESOTA_PLUSHIE_BLOCK_ENTITY,
                    ResotaPlushieBlockEntity::tick);
        }
    };
    public static final Block SQUIDDO_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new SquiddoPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, SQUIDDO_PLUSHIE_BLOCK_ENTITY,
                    SquiddoPlushieBlockEntity::tick);
        }
    };
    public static final Block STALIN_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new StalinPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, STALIN_PLUSHIE_BLOCK_ENTITY,
                    StalinPlushieBlockEntity::tick);
        }
    };
    public static final Block TECHNO_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new TechnoPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, TECHNO_PLUSHIE_BLOCK_ENTITY,
                    TechnoPlushieBlockEntity::tick);
        }
    };
    public static final Block TUVIKU_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new TuvikuPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, TUVIKU_PLUSHIE_BLOCK_ENTITY,
                    TuvikuPlushieBlockEntity::tick);
        }
    };
    public static final Block VERYLOUDER_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new VerylouderPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, VERYLOUDER_PLUSHIE_BLOCK_ENTITY,
                    VerylouderPlushieBlockEntity::tick);
        }
    };
    public static final Block VMUTED_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new VmutedPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, VMUTED_PLUSHIE_BLOCK_ENTITY,
                    VmutedPlushieBlockEntity::tick);
        }
    };
    public static final Block WINSWEEP_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new WinsweepPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, WINSWEEP_PLUSHIE_BLOCK_ENTITY,
                    WinsweepPlushieBlockEntity::tick);
        }
    };
    public static final Block ZMEEC_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ZmeecPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ZMEEC_PLUSHIE_BLOCK_ENTITY,
                    ZmeecPlushieBlockEntity::tick);
        }
    };
    public static final Block ZMEEVIG_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ZmeevigPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ZMEEVIG_PLUSHIE_BLOCK_ENTITY,
                    ZmeevigPlushieBlockEntity::tick);
        }
    };
    public static final Block JEREMI_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new JeremiPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, JEREMI_PLUSHIE_BLOCK_ENTITY,
                    JeremiPlushieBlockEntity::tick);
        }
    };
    public static final Block NUROFEN_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new NurofenPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, NUROFEN_PLUSHIE_BLOCK_ENTITY,
                    NurofenPlushieBlockEntity::tick);
        }
    }; //this comment is autogenerated

    public static void registering() {
        Plushified.LOGGER.info("OMG! Block registry...");

        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "alexnompe_plushie"), ALEXNOMPE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "aruyuki_plushie"), ARUYUKI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "badboyhalo_plushie"), BADBOYHALO_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "blackhole_plushie"), BLACKHOLE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "brim_plushie"), BRIM_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "checkgoodman_plushie"), CHECKGOODMAN_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "clownpierce_plushie"), CLOWNPIERCE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "deb_plushie"), DEB_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "diansu_plushie"), DIANSU_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "dlz_plushie"), DLZ_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "doctor4t_plushie"), DOCTOR4T_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "durawka_plushie"), DURAWKA_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "eboni_plushie"), EBONI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "felikton_plushie"), FELIKTON_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "fereden_plushie"), FEREDEN_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "finek_plushie"), FINEK_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "goose_plushie"), GOOSE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "lampcat_plushie"), LAMPCAT_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "lux_plushie"), LUX_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "mask_plushie"), MASK_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "moddy_plushie"), MODDY_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "niki_plushie"), NIKI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "novikony_plushie"), NOVIKONY_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "obsi_plushie"), OBSI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "philza_plushie"), PHILZA_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "pwgood_plushie"), PWGOOD_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "r4tmaid_plushie"), R4TMAID_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "ranboo_plushie"), RANBOO_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "resota_plushie"), RESOTA_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "squiddo_plushie"), SQUIDDO_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "stalin_plushie"), STALIN_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "techno_plushie"), TECHNO_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "tuviku_plushie"), TUVIKU_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "verylouder_plushie"), VERYLOUDER_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "vmuted_plushie"), VMUTED_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "winsweep_plushie"), WINSWEEP_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "zmeec_plushie"), ZMEEC_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "zmeevig_plushie"), ZMEEVIG_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "jeremi_plushie"), JEREMI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "nurofen_plushie"), NUROFEN_PLUSHIE); //this comment is autogenerated
    }

    public static void RegisterBlockItem(Identifier path, Block block) {
        Registry.register(Registries.BLOCK, path, block);
        Registry.register(Registries.ITEM, path, new BlockItem(block, new Item.Settings()));
    }
}