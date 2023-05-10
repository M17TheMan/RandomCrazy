package net.surpriseface.randomcrazymod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.surpriseface.randomcrazymod.entity.SpeedyMushroomEntity;

import net.minecraft.resources.ResourceLocation;

public class SpeedyMushroomModel extends AnimatedGeoModel<SpeedyMushroomEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpeedyMushroomEntity entity) {
		return new ResourceLocation("randomcrazymod", "animations/mushroom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpeedyMushroomEntity entity) {
		return new ResourceLocation("randomcrazymod", "geo/mushroom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpeedyMushroomEntity entity) {
		return new ResourceLocation("randomcrazymod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
