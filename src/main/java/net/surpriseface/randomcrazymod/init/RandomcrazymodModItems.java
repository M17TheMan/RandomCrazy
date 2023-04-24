
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.surpriseface.randomcrazymod.init;

import net.surpriseface.randomcrazymod.item.GreenAppleItem;
import net.surpriseface.randomcrazymod.RandomcrazymodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class RandomcrazymodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomcrazymodMod.MODID);
	public static final RegistryObject<Item> GREEN_APPLE = REGISTRY.register("green_apple", () -> new GreenAppleItem());
}
