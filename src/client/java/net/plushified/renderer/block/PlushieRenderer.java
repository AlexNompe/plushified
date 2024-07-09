package net.plushified.renderer.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.util.Identifier;
import net.plushified.block.entity.PlushieBlockEntity;
import net.plushified.model.block.*;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

@Environment(EnvType.CLIENT)
public class PlushieRenderer extends GeoBlockRenderer<PlushieBlockEntity> {
    public PlushieRenderer(Identifier assetSubpath) {
        super(new PlushieModel<>(assetSubpath));
    }

    @Nullable
    @Override
    public RenderLayer getRenderType(PlushieBlockEntity animatable, Identifier texture,
                                      @Nullable VertexConsumerProvider bufferSource,
                                      float partialTick) {
        return RenderLayer.getEntityTranslucent(texture);
    }
}
