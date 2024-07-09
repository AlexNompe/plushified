package net.plushified.registry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
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
    public static final Block fourCVIT_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new fourcvitPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, fourCVIT_PLUSHIE_BLOCK_ENTITY,
                    fourcvitPlushieBlockEntity::tick);
        }
    };
    public static final Block ALCEST_M_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Alcest_mPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ALCEST_M_PLUSHIE_BLOCK_ENTITY,
                    Alcest_mPlushieBlockEntity::tick);
        }
    };
    public static final Block ALFEDOV_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new AlfedovPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ALFEDOV_PLUSHIE_BLOCK_ENTITY,
                    AlfedovPlushieBlockEntity::tick);
        }
    };
    public static final Block ALTTERA__PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Alttera_PlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ALTTERA__PLUSHIE_BLOCK_ENTITY,
                    Alttera_PlushieBlockEntity::tick);
        }
    };
    public static final Block ANTFROST_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new AntfrostPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ANTFROST_PLUSHIE_BLOCK_ENTITY,
                    AntfrostPlushieBlockEntity::tick);
        }
    };
    public static final Block ARATHAIN_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ArathainPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ARATHAIN_PLUSHIE_BLOCK_ENTITY,
                    ArathainPlushieBlockEntity::tick);
        }
    };
    public static final Block ARLABUS_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ArlabusPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ARLABUS_PLUSHIE_BLOCK_ENTITY,
                    ArlabusPlushieBlockEntity::tick);
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
    public static final Block ASAI_HATSUYO_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Asai_hatsuyoPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ASAI_HATSUYO_PLUSHIE_BLOCK_ENTITY,
                    Asai_hatsuyoPlushieBlockEntity::tick);
        }
    };
    public static final Block ASHSWAGG_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new AshswaggPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ASHSWAGG_PLUSHIE_BLOCK_ENTITY,
                    AshswaggPlushieBlockEntity::tick);
        }
    };
    public static final Block AWESAMDUDE_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new AwesamdudePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, AWESAMDUDE_PLUSHIE_BLOCK_ENTITY,
                    AwesamdudePlushieBlockEntity::tick);
        }
    };
    public static final Block BACONNWAFFLESzero_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new BaconnwaffleszeroPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, BACONNWAFFLESzero_PLUSHIE_BLOCK_ENTITY,
                    BaconnwaffleszeroPlushieBlockEntity::tick);
        }
    };
    public static final Block BADBOYHALO_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new BadboyhaloPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, BADBOYHALO_PLUSHIE_BLOCK_ENTITY,
                    BadboyhaloPlushieBlockEntity::tick);
        }
    };
    public static final Block BARSIGOLD_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new BarsigoldPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, BARSIGOLD_PLUSHIE_BLOCK_ENTITY,
                    BarsigoldPlushieBlockEntity::tick);
        }
    };
    public static final Block BEZ_LS_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Bez_lsPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, BEZ_LS_PLUSHIE_BLOCK_ENTITY,
                    Bez_lsPlushieBlockEntity::tick);
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
    public static final Block BRANZYCRAFT_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new BranzycraftPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, BRANZYCRAFT_PLUSHIE_BLOCK_ENTITY,
                    BranzycraftPlushieBlockEntity::tick);
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
    public static final Block CAPTAINPUFFY_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new CaptainpuffyPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, CAPTAINPUFFY_PLUSHIE_BLOCK_ENTITY,
                    CaptainpuffyPlushieBlockEntity::tick);
        }
    };
    public static final Block CAPXENOMORPH_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new CapxenomorphPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, CAPXENOMORPH_PLUSHIE_BLOCK_ENTITY,
                    CapxenomorphPlushieBlockEntity::tick);
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
    public static final Block CHIEFXD_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ChiefxdPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, CHIEFXD_PLUSHIE_BLOCK_ENTITY,
                    ChiefxdPlushieBlockEntity::tick);
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
    public static final Block CONNOREATSPANTS_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ConnoreatspantsPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, CONNOREATSPANTS_PLUSHIE_BLOCK_ENTITY,
                    ConnoreatspantsPlushieBlockEntity::tick);
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
    public static final Block DERAPCHU_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new DerapchuPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, DERAPCHU_PLUSHIE_BLOCK_ENTITY,
                    DerapchuPlushieBlockEntity::tick);
        }
    };
    public static final Block DIAMKEY_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new DiamkeyPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, DIAMKEY_PLUSHIE_BLOCK_ENTITY,
                    DiamkeyPlushieBlockEntity::tick);
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
    public static final Block DOCTORfourT_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new DoctorfourtPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, DOCTORfourT_PLUSHIE_BLOCK_ENTITY,
                    DoctorfourtPlushieBlockEntity::tick);
        }
    };
    public static final Block DREAM_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new DreamPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, DREAM_PLUSHIE_BLOCK_ENTITY,
                    DreamPlushieBlockEntity::tick);
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
    public static final Block DUSHENKA__PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Dushenka_PlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, DUSHENKA__PLUSHIE_BLOCK_ENTITY,
                    Dushenka_PlushieBlockEntity::tick);
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
    public static final Block ECORRIDOR_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new EcorridorPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ECORRIDOR_PLUSHIE_BLOCK_ENTITY,
                    EcorridorPlushieBlockEntity::tick);
        }
    };
    public static final Block EIGHTSIDEDSQUARE_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new EightsidedsquarePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, EIGHTSIDEDSQUARE_PLUSHIE_BLOCK_ENTITY,
                    EightsidedsquarePlushieBlockEntity::tick);
        }
    };
    public static final Block ERET_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new EretPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ERET_PLUSHIE_BLOCK_ENTITY,
                    EretPlushieBlockEntity::tick);
        }
    };
    public static final Block FARADEY_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new FaradeyPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, FARADEY_PLUSHIE_BLOCK_ENTITY,
                    FaradeyPlushieBlockEntity::tick);
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
    public static final Block FLAMEFRAGS_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new FlamefragsPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, FLAMEFRAGS_PLUSHIE_BLOCK_ENTITY,
                    FlamefragsPlushieBlockEntity::tick);
        }
    };
    public static final Block FOOLISH_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new FoolishPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, FOOLISH_PLUSHIE_BLOCK_ENTITY,
                    FoolishPlushieBlockEntity::tick);
        }
    };
    public static final Block FUNDY_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new FundyPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, FUNDY_PLUSHIE_BLOCK_ENTITY,
                    FundyPlushieBlockEntity::tick);
        }
    };
    public static final Block GEL_MO_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Gel_moPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, GEL_MO_PLUSHIE_BLOCK_ENTITY,
                    Gel_moPlushieBlockEntity::tick);
        }
    };
    public static final Block GEORGENOTFOUND_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new GeorgenotfoundPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, GEORGENOTFOUND_PLUSHIE_BLOCK_ENTITY,
                    GeorgenotfoundPlushieBlockEntity::tick);
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
    public static final Block HANNAHXXROSE_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new HannahxxrosePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, HANNAHXXROSE_PLUSHIE_BLOCK_ENTITY,
                    HannahxxrosePlushieBlockEntity::tick);
        }
    };
    public static final Block HAYDone__PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Haydone_PlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, HAYDone__PLUSHIE_BLOCK_ENTITY,
                    Haydone_PlushieBlockEntity::tick);
        }
    };
    public static final Block HBOMBninefour_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new HbombninefourPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, HBOMBninefour_PLUSHIE_BLOCK_ENTITY,
                    HbombninefourPlushieBlockEntity::tick);
        }
    };
    public static final Block HREL_MC_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Hrel_mcPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, HREL_MC_PLUSHIE_BLOCK_ENTITY,
                    Hrel_mcPlushieBlockEntity::tick);
        }
    };
    public static final Block INAGGY_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new InaggyPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, INAGGY_PLUSHIE_BLOCK_ENTITY,
                    InaggyPlushieBlockEntity::tick);
        }
    };
    public static final Block JACKMANIFOLD_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new JackmanifoldPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, JACKMANIFOLD_PLUSHIE_BLOCK_ENTITY,
                    JackmanifoldPlushieBlockEntity::tick);
        }
    };
    public static final Block JAY_POKERMAN_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Jay_pokermanPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, JAY_POKERMAN_PLUSHIE_BLOCK_ENTITY,
                    Jay_pokermanPlushieBlockEntity::tick);
        }
    };
    public static final Block JEPEXX_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new JepexxPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, JEPEXX_PLUSHIE_BLOCK_ENTITY,
                    JepexxPlushieBlockEntity::tick);
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
    public static final Block JUMPERWHO_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new JumperwhoPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, JUMPERWHO_PLUSHIE_BLOCK_ENTITY,
                    JumperwhoPlushieBlockEntity::tick);
        }
    };
    public static final Block JUSTKABOODLE_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new JustkaboodlePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, JUSTKABOODLE_PLUSHIE_BLOCK_ENTITY,
                    JustkaboodlePlushieBlockEntity::tick);
        }
    };
    public static final Block JUST_S_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Just_sPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, JUST_S_PLUSHIE_BLOCK_ENTITY,
                    Just_sPlushieBlockEntity::tick);
        }
    };
    public static final Block KADOTANUKLES_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new KadotanuklesPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, KADOTANUKLES_PLUSHIE_BLOCK_ENTITY,
                    KadotanuklesPlushieBlockEntity::tick);
        }
    };
    public static final Block KARLJACOBS_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new KarljacobsPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, KARLJACOBS_PLUSHIE_BLOCK_ENTITY,
                    KarljacobsPlushieBlockEntity::tick);
        }
    };
    public static final Block KAVKIN_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new KavkinPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, KAVKIN_PLUSHIE_BLOCK_ENTITY,
                    KavkinPlushieBlockEntity::tick);
        }
    };
    public static final Block KETRINCYST_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new KetrincystPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, KETRINCYST_PLUSHIE_BLOCK_ENTITY,
                    KetrincystPlushieBlockEntity::tick);
        }
    };
    public static final Block KLASHRAICK_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new KlashraickPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, KLASHRAICK_PLUSHIE_BLOCK_ENTITY,
                    KlashraickPlushieBlockEntity::tick);
        }
    };
    public static final Block KLUV_V_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Kluv_vPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, KLUV_V_PLUSHIE_BLOCK_ENTITY,
                    Kluv_vPlushieBlockEntity::tick);
        }
    };
    public static final Block KROLIKMUN_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new KrolikmunPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, KROLIKMUN_PLUSHIE_BLOCK_ENTITY,
                    KrolikmunPlushieBlockEntity::tick);
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
    public static final Block LEOWzeroOK_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new LeowzerookPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, LEOWzeroOK_PLUSHIE_BLOCK_ENTITY,
                    LeowzerookPlushieBlockEntity::tick);
        }
    };
    public static final Block LORDSANTOS_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new LordsantosPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, LORDSANTOS_PLUSHIE_BLOCK_ENTITY,
                    LordsantosPlushieBlockEntity::tick);
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
    public static final Block MAGMUSTX_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new MagmustxPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MAGMUSTX_PLUSHIE_BLOCK_ENTITY,
                    MagmustxPlushieBlockEntity::tick);
        }
    };
    public static final Block MAKAFOLZ_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new MakafolzPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MAKAFOLZ_PLUSHIE_BLOCK_ENTITY,
                    MakafolzPlushieBlockEntity::tick);
        }
    };
    public static final Block MANEPEAR_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ManepearPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MANEPEAR_PLUSHIE_BLOCK_ENTITY,
                    ManepearPlushieBlockEntity::tick);
        }
    };
    public static final Block MAPICC_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new MapiccPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MAPICC_PLUSHIE_BLOCK_ENTITY,
                    MapiccPlushieBlockEntity::tick);
        }
    };
    public static final Block MARTSCOMM_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new MartscommPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MARTSCOMM_PLUSHIE_BLOCK_ENTITY,
                    MartscommPlushieBlockEntity::tick);
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
    public static final Block MICHAELMCCHILL_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new MichaelmcchillPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MICHAELMCCHILL_PLUSHIE_BLOCK_ENTITY,
                    MichaelmcchillPlushieBlockEntity::tick);
        }
    };
    public static final Block MINUTETECH_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new MinutetechPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MINUTETECH_PLUSHIE_BLOCK_ENTITY,
                    MinutetechPlushieBlockEntity::tick);
        }
    };
    public static final Block MOoneVINE_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new MoonevinePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MOoneVINE_PLUSHIE_BLOCK_ENTITY,
                    MoonevinePlushieBlockEntity::tick);
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
    public static final Block MRCUBEsix_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new MrcubesixPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MRCUBEsix_PLUSHIE_BLOCK_ENTITY,
                    MrcubesixPlushieBlockEntity::tick);
        }
    };
    public static final Block MRPUPE_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new MrpupePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, MRPUPE_PLUSHIE_BLOCK_ENTITY,
                    MrpupePlushieBlockEntity::tick);
        }
    };
    public static final Block M_MAFINEV_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new M_mafinevPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, M_MAFINEV_PLUSHIE_BLOCK_ENTITY,
                    M_mafinevPlushieBlockEntity::tick);
        }
    };
    public static final Block NAGIBAYKA_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new NagibaykaPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, NAGIBAYKA_PLUSHIE_BLOCK_ENTITY,
                    NagibaykaPlushieBlockEntity::tick);
        }
    };
    public static final Block NEADAPTAR_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new NeadaptarPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, NEADAPTAR_PLUSHIE_BLOCK_ENTITY,
                    NeadaptarPlushieBlockEntity::tick);
        }
    };
    public static final Block NERKIN__PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Nerkin_PlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, NERKIN__PLUSHIE_BLOCK_ENTITY,
                    Nerkin_PlushieBlockEntity::tick);
        }
    };
    public static final Block NIHACHU_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new NihachuPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, NIHACHU_PLUSHIE_BLOCK_ENTITY,
                    NihachuPlushieBlockEntity::tick);
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
    };
    public static final Block OBSIDIANTIMEsixnine_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ObsidiantimesixninePlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, OBSIDIANTIMEsixnine_PLUSHIE_BLOCK_ENTITY,
                    ObsidiantimesixninePlushieBlockEntity::tick);
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
    public static final Block OLYACHESAPIK_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new OlyachesapikPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, OLYACHESAPIK_PLUSHIE_BLOCK_ENTITY,
                    OlyachesapikPlushieBlockEntity::tick);
        }
    };
    public static final Block OPTIMIST_EZZ_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new Optimist_ezzPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, OPTIMIST_EZZ_PLUSHIE_BLOCK_ENTITY,
                    Optimist_ezzPlushieBlockEntity::tick);
        }
    };
    public static final Block PANGI_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new PangiPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, PANGI_PLUSHIE_BLOCK_ENTITY,
                    PangiPlushieBlockEntity::tick);
        }
    };
    public static final Block PEENTAR_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new PeentarPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, PEENTAR_PLUSHIE_BLOCK_ENTITY,
                    PeentarPlushieBlockEntity::tick);
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
    public static final Block PLANETLORD_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new PlanetlordPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, PLANETLORD_PLUSHIE_BLOCK_ENTITY,
                    PlanetlordPlushieBlockEntity::tick);
        }
    };
    public static final Block PONK_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new PonkPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, PONK_PLUSHIE_BLOCK_ENTITY,
                    PonkPlushieBlockEntity::tick);
        }
    };
    public static final Block PRINCEZAM_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new PrincezamPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, PRINCEZAM_PLUSHIE_BLOCK_ENTITY,
                    PrincezamPlushieBlockEntity::tick);
        }
    };
    public static final Block PURPLED_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new PurpledPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, PURPLED_PLUSHIE_BLOCK_ENTITY,
                    PurpledPlushieBlockEntity::tick);
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
    public static final Block PWGOOOD_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new PwgooodPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, PWGOOOD_PLUSHIE_BLOCK_ENTITY,
                    PwgooodPlushieBlockEntity::tick);
        }
    };
    public static final Block QUACKITY_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new QuackityPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, QUACKITY_PLUSHIE_BLOCK_ENTITY,
                    QuackityPlushieBlockEntity::tick);
        }
    };
    public static final Block RfourTMAID_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new RfourtmaidPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, RfourTMAID_PLUSHIE_BLOCK_ENTITY,
                    RfourtmaidPlushieBlockEntity::tick);
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
    public static final Block REDDOONS_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new ReddoonsPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, REDDOONS_PLUSHIE_BLOCK_ENTITY,
                    ReddoonsPlushieBlockEntity::tick);
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
    public static final Block ROSHAMBOGAMES_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new RoshambogamesPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, ROSHAMBOGAMES_PLUSHIE_BLOCK_ENTITY,
                    RoshambogamesPlushieBlockEntity::tick);
        }
    };
    public static final Block SANHEZ_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new SanhezPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, SANHEZ_PLUSHIE_BLOCK_ENTITY,
                    SanhezPlushieBlockEntity::tick);
        }
    };
    public static final Block SAPNAP_PLUSHIE = new Plushie(Block.Settings.create().strength(1.0f).sounds(PLUSHIE_SOUND_GROUP)) {
        @Override
        public @NotNull BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new SapnapPlushieBlockEntity(pos, state);
        }
        @Nullable
        @Override
        public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
            return validateTicker(type, SAPNAP_PLUSHIE_BLOCK_ENTITY,
                    SapnapPlushieBlockEntity::tick);
        }
    }; //this comment is autogenerated

    public static final ItemConvertible[] PLUSHIES = new ItemConvertible[]{ALEXNOMPE_PLUSHIE/*array*/,fourCVIT_PLUSHIE/*array*/,ALCEST_M_PLUSHIE/*array*/,ALFEDOV_PLUSHIE/*array*/,ALTTERA__PLUSHIE/*array*/,ANTFROST_PLUSHIE/*array*/,ARATHAIN_PLUSHIE/*array*/,ARLABUS_PLUSHIE/*array*/,ARUYUKI_PLUSHIE/*array*/,ASAI_HATSUYO_PLUSHIE/*array*/,ASHSWAGG_PLUSHIE/*array*/,AWESAMDUDE_PLUSHIE/*array*/,BACONNWAFFLESzero_PLUSHIE/*array*/,BADBOYHALO_PLUSHIE/*array*/,BARSIGOLD_PLUSHIE/*array*/,BEZ_LS_PLUSHIE/*array*/,BLACKHOLE_PLUSHIE/*array*/,BRANZYCRAFT_PLUSHIE/*array*/,BRIM_PLUSHIE/*array*/,CAPTAINPUFFY_PLUSHIE/*array*/,CAPXENOMORPH_PLUSHIE/*array*/,CHECKGOODMAN_PLUSHIE/*array*/,CHIEFXD_PLUSHIE/*array*/,CLOWNPIERCE_PLUSHIE/*array*/,CONNOREATSPANTS_PLUSHIE/*array*/,DEB_PLUSHIE/*array*/,DERAPCHU_PLUSHIE/*array*/,DIAMKEY_PLUSHIE/*array*/,DIANSU_PLUSHIE/*array*/,DLZ_PLUSHIE/*array*/,DOCTORfourT_PLUSHIE/*array*/,DREAM_PLUSHIE/*array*/,DURAWKA_PLUSHIE/*array*/,DUSHENKA__PLUSHIE/*array*/,EBONI_PLUSHIE/*array*/,ECORRIDOR_PLUSHIE/*array*/,EIGHTSIDEDSQUARE_PLUSHIE/*array*/,ERET_PLUSHIE/*array*/,FARADEY_PLUSHIE/*array*/,FELIKTON_PLUSHIE/*array*/,FEREDEN_PLUSHIE/*array*/,FINEK_PLUSHIE/*array*/,FLAMEFRAGS_PLUSHIE/*array*/,FOOLISH_PLUSHIE/*array*/,FUNDY_PLUSHIE/*array*/,GEL_MO_PLUSHIE/*array*/,GEORGENOTFOUND_PLUSHIE/*array*/,GOOSE_PLUSHIE/*array*/,HANNAHXXROSE_PLUSHIE/*array*/,HAYDone__PLUSHIE/*array*/,HBOMBninefour_PLUSHIE/*array*/,HREL_MC_PLUSHIE/*array*/,INAGGY_PLUSHIE/*array*/,JACKMANIFOLD_PLUSHIE/*array*/,JAY_POKERMAN_PLUSHIE/*array*/,JEPEXX_PLUSHIE/*array*/,JEREMI_PLUSHIE/*array*/,JUMPERWHO_PLUSHIE/*array*/,JUSTKABOODLE_PLUSHIE/*array*/,JUST_S_PLUSHIE/*array*/,KADOTANUKLES_PLUSHIE/*array*/,KARLJACOBS_PLUSHIE/*array*/,KAVKIN_PLUSHIE/*array*/,KETRINCYST_PLUSHIE/*array*/,KLASHRAICK_PLUSHIE/*array*/,KLUV_V_PLUSHIE/*array*/,KROLIKMUN_PLUSHIE/*array*/,LAMPCAT_PLUSHIE/*array*/,LEOWzeroOK_PLUSHIE/*array*/,LORDSANTOS_PLUSHIE/*array*/,LUX_PLUSHIE/*array*/,MAGMUSTX_PLUSHIE/*array*/,MAKAFOLZ_PLUSHIE/*array*/,MANEPEAR_PLUSHIE/*array*/,MAPICC_PLUSHIE/*array*/,MARTSCOMM_PLUSHIE/*array*/,MASK_PLUSHIE/*array*/,MICHAELMCCHILL_PLUSHIE/*array*/,MINUTETECH_PLUSHIE/*array*/,MOoneVINE_PLUSHIE/*array*/,MODDY_PLUSHIE/*array*/,MRCUBEsix_PLUSHIE/*array*/,MRPUPE_PLUSHIE/*array*/,M_MAFINEV_PLUSHIE/*array*/,NAGIBAYKA_PLUSHIE/*array*/,NEADAPTAR_PLUSHIE/*array*/,NERKIN__PLUSHIE/*array*/,NIHACHU_PLUSHIE/*array*/,NIKI_PLUSHIE/*array*/,NOVIKONY_PLUSHIE/*array*/,NUROFEN_PLUSHIE/*array*/,OBSIDIANTIMEsixnine_PLUSHIE/*array*/,OBSI_PLUSHIE/*array*/,OLYACHESAPIK_PLUSHIE/*array*/,OPTIMIST_EZZ_PLUSHIE/*array*/,PANGI_PLUSHIE/*array*/,PEENTAR_PLUSHIE/*array*/,PHILZA_PLUSHIE/*array*/,PLANETLORD_PLUSHIE/*array*/,PONK_PLUSHIE/*array*/,PRINCEZAM_PLUSHIE/*array*/,PURPLED_PLUSHIE/*array*/,PWGOOD_PLUSHIE/*array*/,PWGOOOD_PLUSHIE/*array*/,QUACKITY_PLUSHIE/*array*/,RfourTMAID_PLUSHIE/*array*/,RANBOO_PLUSHIE/*array*/,REDDOONS_PLUSHIE/*array*/,RESOTA_PLUSHIE/*array*/,ROSHAMBOGAMES_PLUSHIE/*array*/,SANHEZ_PLUSHIE/*array*/,SAPNAP_PLUSHIE/*array*/};

    public static void registering() {
        Plushified.LOGGER.info("OMG! Block registry...");

        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "alexnompe_plushie"), ALEXNOMPE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "4cvit_plushie"), fourCVIT_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "alcest_m_plushie"), ALCEST_M_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "alfedov_plushie"), ALFEDOV_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "alttera__plushie"), ALTTERA__PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "antfrost_plushie"), ANTFROST_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "arathain_plushie"), ARATHAIN_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "arlabus_plushie"), ARLABUS_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "aruyuki_plushie"), ARUYUKI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "asai_hatsuyo_plushie"), ASAI_HATSUYO_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "ashswagg_plushie"), ASHSWAGG_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "awesamdude_plushie"), AWESAMDUDE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "baconnwaffles0_plushie"), BACONNWAFFLESzero_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "badboyhalo_plushie"), BADBOYHALO_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "barsigold_plushie"), BARSIGOLD_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "bez_ls_plushie"), BEZ_LS_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "blackhole_plushie"), BLACKHOLE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "branzycraft_plushie"), BRANZYCRAFT_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "brim_plushie"), BRIM_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "captainpuffy_plushie"), CAPTAINPUFFY_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "capxenomorph_plushie"), CAPXENOMORPH_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "checkgoodman_plushie"), CHECKGOODMAN_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "chiefxd_plushie"), CHIEFXD_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "clownpierce_plushie"), CLOWNPIERCE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "connoreatspants_plushie"), CONNOREATSPANTS_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "deb_plushie"), DEB_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "derapchu_plushie"), DERAPCHU_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "diamkey_plushie"), DIAMKEY_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "diansu_plushie"), DIANSU_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "dlz_plushie"), DLZ_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "doctor4t_plushie"), DOCTORfourT_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "dream_plushie"), DREAM_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "durawka_plushie"), DURAWKA_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "dushenka__plushie"), DUSHENKA__PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "eboni_plushie"), EBONI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "ecorridor_plushie"), ECORRIDOR_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "eightsidedsquare_plushie"), EIGHTSIDEDSQUARE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "eret_plushie"), ERET_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "faradey_plushie"), FARADEY_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "felikton_plushie"), FELIKTON_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "fereden_plushie"), FEREDEN_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "finek_plushie"), FINEK_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "flamefrags_plushie"), FLAMEFRAGS_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "foolish_plushie"), FOOLISH_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "fundy_plushie"), FUNDY_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "gel_mo_plushie"), GEL_MO_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "georgenotfound_plushie"), GEORGENOTFOUND_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "goose_plushie"), GOOSE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "hannahxxrose_plushie"), HANNAHXXROSE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "hayd1__plushie"), HAYDone__PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "hbomb94_plushie"), HBOMBninefour_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "hrel_mc_plushie"), HREL_MC_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "inaggy_plushie"), INAGGY_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "jackmanifold_plushie"), JACKMANIFOLD_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "jay_pokerman_plushie"), JAY_POKERMAN_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "jepexx_plushie"), JEPEXX_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "jeremi_plushie"), JEREMI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "jumperwho_plushie"), JUMPERWHO_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "justkaboodle_plushie"), JUSTKABOODLE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "just_s_plushie"), JUST_S_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "kadotanukles_plushie"), KADOTANUKLES_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "karljacobs_plushie"), KARLJACOBS_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "kavkin_plushie"), KAVKIN_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "ketrincyst_plushie"), KETRINCYST_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "klashraick_plushie"), KLASHRAICK_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "kluv_v_plushie"), KLUV_V_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "krolikmun_plushie"), KROLIKMUN_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "lampcat_plushie"), LAMPCAT_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "leow0ok_plushie"), LEOWzeroOK_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "lordsantos_plushie"), LORDSANTOS_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "lux_plushie"), LUX_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "magmustx_plushie"), MAGMUSTX_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "makafolz_plushie"), MAKAFOLZ_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "manepear_plushie"), MANEPEAR_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "mapicc_plushie"), MAPICC_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "martscomm_plushie"), MARTSCOMM_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "mask_plushie"), MASK_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "michaelmcchill_plushie"), MICHAELMCCHILL_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "minutetech_plushie"), MINUTETECH_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "mo1vine_plushie"), MOoneVINE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "moddy_plushie"), MODDY_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "mrcube6_plushie"), MRCUBEsix_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "mrpupe_plushie"), MRPUPE_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "m_mafinev_plushie"), M_MAFINEV_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "nagibayka_plushie"), NAGIBAYKA_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "neadaptar_plushie"), NEADAPTAR_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "nerkin__plushie"), NERKIN__PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "nihachu_plushie"), NIHACHU_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "niki_plushie"), NIKI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "novikony_plushie"), NOVIKONY_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "nurofen_plushie"), NUROFEN_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "obsidiantime69_plushie"), OBSIDIANTIMEsixnine_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "obsi_plushie"), OBSI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "olyachesapik_plushie"), OLYACHESAPIK_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "optimist_ezz_plushie"), OPTIMIST_EZZ_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "pangi_plushie"), PANGI_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "peentar_plushie"), PEENTAR_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "philza_plushie"), PHILZA_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "planetlord_plushie"), PLANETLORD_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "ponk_plushie"), PONK_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "princezam_plushie"), PRINCEZAM_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "purpled_plushie"), PURPLED_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "pwgood_plushie"), PWGOOD_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "pwgoood_plushie"), PWGOOOD_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "quackity_plushie"), QUACKITY_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "r4tmaid_plushie"), RfourTMAID_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "ranboo_plushie"), RANBOO_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "reddoons_plushie"), REDDOONS_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "resota_plushie"), RESOTA_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "roshambogames_plushie"), ROSHAMBOGAMES_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "sanhez_plushie"), SANHEZ_PLUSHIE);
        RegisterBlockItem(Identifier.of(Plushified.MOD_ID, "sapnap_plushie"), SAPNAP_PLUSHIE); //this comment is autogenerated
    }

    public static void RegisterBlockItem(Identifier path, Block block) {
        Registry.register(Registries.BLOCK, path, block);
        Registry.register(Registries.ITEM, path, new BlockItem(block, new Item.Settings()));
    }
}