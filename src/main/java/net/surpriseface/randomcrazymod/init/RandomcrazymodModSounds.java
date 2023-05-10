
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.surpriseface.randomcrazymod.init;

import net.surpriseface.randomcrazymod.RandomcrazymodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class RandomcrazymodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RandomcrazymodMod.MODID);
	public static final RegistryObject<SoundEvent> MUSHROOM_SCREAM = REGISTRY.register("mushroom_scream", () -> new SoundEvent(new ResourceLocation("randomcrazymod", "mushroom_scream")));
}
