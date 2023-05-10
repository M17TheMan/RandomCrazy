package net.surpriseface.randomcrazymod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.surpriseface.randomcrazymod.entity.ScreamingMushroomEntity;

import net.minecraft.resources.ResourceLocation;

public class ScreamingMushroomModel extends AnimatedGeoModel<ScreamingMushroomEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScreamingMushroomEntity entity) {
		return new ResourceLocation("randomcrazymod", "animations/mushroom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScreamingMushroomEntity entity) {
		return new ResourceLocation("randomcrazymod", "geo/mushroom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScreamingMushroomEntity entity) {
		return new ResourceLocation("randomcrazymod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
