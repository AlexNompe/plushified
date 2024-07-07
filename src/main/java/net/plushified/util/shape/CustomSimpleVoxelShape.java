package net.plushified.util.shape;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.FractionalDoubleList;
import net.minecraft.util.shape.VoxelSet;
import net.minecraft.util.shape.VoxelShape;

public final class CustomSimpleVoxelShape extends VoxelShape {
    public CustomSimpleVoxelShape(VoxelSet voxelSet) {
        super(voxelSet);
    }

    @Override
    public DoubleList getPointPositions(Direction.Axis axis) {
        return new FractionalDoubleList(this.voxels.getSize(axis));
    }

    @Override
    protected int getCoordIndex(Direction.Axis axis, double coord) {
        int i = this.voxels.getSize(axis);
        return MathHelper.floor(MathHelper.clamp(coord * (double)i, -1.0, (double)i));
    }
}
