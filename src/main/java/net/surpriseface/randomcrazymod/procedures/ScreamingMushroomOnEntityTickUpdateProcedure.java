package net.surpriseface.randomcrazymod.procedures;

import net.surpriseface.randomcrazymod.entity.ScreamingMushroomEntity;
import net.surpriseface.randomcrazymod.RandomcrazymodMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class ScreamingMushroomOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty() || !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
			if (entity instanceof ScreamingMushroomEntity) {
				((ScreamingMushroomEntity) entity).setAnimation("emurge");
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.MYCELIUM, x, y, z, 10, 1, 1, 1, 1);
			if (entity instanceof ScreamingMushroomEntity) {
				((ScreamingMushroomEntity) entity).setAnimation("empty");
			}
		} else if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty() || !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty()) {
			if (entity instanceof ScreamingMushroomEntity) {
				((ScreamingMushroomEntity) entity).setAnimation("scream");
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("randomcrazymod:mushroom_scream")), SoundSource.VOICE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("randomcrazymod:mushroom_scream")), SoundSource.VOICE, 1, 1, false);
				}
			}
			RandomcrazymodMod.queueServerWork(120, () -> {
				RandomcrazymodMod.LOGGER.info("screamed");
			});
			if (entity instanceof ScreamingMushroomEntity) {
				((ScreamingMushroomEntity) entity).setAnimation("empty");
			}
		} else if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty() || !world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
			if (entity instanceof ScreamingMushroomEntity) {
				((ScreamingMushroomEntity) entity).setAnimation("dig");
			}
			if (entity instanceof ScreamingMushroomEntity) {
				((ScreamingMushroomEntity) entity).setAnimation("empty");
			}
		} else {
			if (entity instanceof ScreamingMushroomEntity) {
				((ScreamingMushroomEntity) entity).setAnimation("dig");
			}
			RandomcrazymodMod.queueServerWork(20, () -> {
				RandomcrazymodMod.LOGGER.info("dug");
			});
			if (entity instanceof ScreamingMushroomEntity) {
				((ScreamingMushroomEntity) entity).setAnimation("idle");
			}
		}
	}
}
