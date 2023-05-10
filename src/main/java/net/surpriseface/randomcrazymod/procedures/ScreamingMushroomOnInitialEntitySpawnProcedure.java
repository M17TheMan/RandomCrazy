package net.surpriseface.randomcrazymod.procedures;

import net.surpriseface.randomcrazymod.entity.ScreamingMushroomEntity;

import net.minecraft.world.entity.Entity;

public class ScreamingMushroomOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ScreamingMushroomEntity) {
			((ScreamingMushroomEntity) entity).setAnimation("dig");
		}
	}
}
