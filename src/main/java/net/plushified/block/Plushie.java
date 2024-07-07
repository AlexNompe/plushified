package net.plushified.block;

import com.mojang.serialization.MapCodec;
import io.netty.util.internal.ThreadLocalRandom;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Util;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.*;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.plushified.util.shape.CustomSimpleVoxelShape;
import net.plushified.util.shape.ShapeUtils;
import net.plushified.util.shape.CustomArrayVoxelShape;

import java.util.Arrays;
import java.util.Objects;

import static net.plushified.registry.SoundEventRegistry.*;
import static net.plushified.util.shape.ShapeUtils.*;

public abstract class Plushie extends BlockWithEntity implements Waterloggable, BlockEntityProvider {

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public Plushie(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState()
                .with(Properties.HORIZONTAL_FACING, Direction.NORTH)
                .with(WATERLOGGED, false));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView blockView, BlockPos pos, ShapeContext context) {
        VoxelShape voxel = VoxelShapes.union(
                Block.createCuboidShape(
                        3f, 5.725f, 4f,
                        13f, 15.725f, 14f),
                Block.createCuboidShape(
                        5f, 1.05f, 8.49f,
                        11f, 6.05f, 10.51f),
                Block.createCuboidShape(
                        1.175, 2.3, 6.75,
                        5.7,5.925,10.175),
                rotateShape(Direction.SOUTH, Block.createCuboidShape(
                        1.175, 2.3, 6.75,
                        5.7,5.925,10.175)),
                Block.createCuboidShape(
                        3, 0, 4,
                        8,3,10),
                Block.createCuboidShape(
                        8, 0, 4,
                        13,3,10));
        //return voxel;
        return switch (state.get(Properties.HORIZONTAL_FACING)) {
            case EAST -> rotateShape(Direction.EAST, voxel);
            case SOUTH -> rotateShape(Direction.SOUTH, voxel);
            case WEST -> rotateShape(Direction.WEST, voxel);
            default -> voxel;
        };
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return null;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING, WATERLOGGED);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return Objects.requireNonNull(super.getPlacementState(ctx))
                .with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite())
                .with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).isOf(Fluids.WATER));
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if ((Boolean)state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {
            world.playSound(null, pos, PLUSHIE_PAT_SOUND_EVENT, SoundCategory.BLOCKS, 1f, (float) ThreadLocalRandom.current().nextInt(9, 11 + 1) /10);
        }
        return ActionResult.SUCCESS;
    }
}