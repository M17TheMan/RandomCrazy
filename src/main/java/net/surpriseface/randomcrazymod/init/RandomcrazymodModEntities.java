
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.surpriseface.randomcrazymod.init;

import net.surpriseface.randomcrazymod.entity.ScreamingMushroomEntity;
import net.surpriseface.randomcrazymod.RandomcrazymodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RandomcrazymodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RandomcrazymodMod.MODID);
	public static final RegistryObject<EntityType<ScreamingMushroomEntity>> SCREAMING_MUSHROOM = register("screaming_mushroom",
			EntityType.Builder.<ScreamingMushroomEntity>of(ScreamingMushroomEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScreamingMushroomEntity::new)

					.sized(0.9f, 1.2000000000000002f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ScreamingMushroomEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SCREAMING_MUSHROOM.get(), ScreamingMushroomEntity.createAttributes().build());
	}
}
