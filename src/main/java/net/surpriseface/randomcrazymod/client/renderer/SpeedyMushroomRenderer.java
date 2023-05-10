
package net.surpriseface.randomcrazymod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.surpriseface.randomcrazymod.entity.model.SpeedyMushroomModel;
import net.surpriseface.randomcrazymod.entity.SpeedyMushroomEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SpeedyMushroomRenderer extends GeoEntityRenderer<SpeedyMushroomEntity> {
	public SpeedyMushroomRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SpeedyMushroomModel());
		this.shadowRadius = 0.4f;
	}

	@Override
	public RenderType getRenderType(SpeedyMushroomEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
