
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.surpriseface.randomcrazymod.init;

import net.surpriseface.randomcrazymod.item.RawChaosGemItem;
import net.surpriseface.randomcrazymod.item.PumpkinPieSliceItem;
import net.surpriseface.randomcrazymod.item.MelonRindItem;
import net.surpriseface.randomcrazymod.item.MelonFleshItem;
import net.surpriseface.randomcrazymod.item.MelonArmorItem;
import net.surpriseface.randomcrazymod.item.GreenAppleItem;
import net.surpriseface.randomcrazymod.item.ChaosGemItem;
import net.surpriseface.randomcrazymod.RandomcrazymodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class RandomcrazymodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomcrazymodMod.MODID);
	public static final RegistryObject<Item> CHAOS_GEM = REGISTRY.register("chaos_gem", () -> new ChaosGemItem());
	public static final RegistryObject<Item> GREEN_APPLE = REGISTRY.register("green_apple", () -> new GreenAppleItem());
	public static final RegistryObject<Item> RAW_CHAOS_GEM = REGISTRY.register("raw_chaos_gem", () -> new RawChaosGemItem());
	public static final RegistryObject<Item> CHAOS_ORE = block(RandomcrazymodModBlocks.CHAOS_ORE, RandomcrazymodModTabs.TAB_RANDOM_CRAZY);
	public static final RegistryObject<Item> MELON_ARMOR_HELMET = REGISTRY.register("melon_armor_helmet", () -> new MelonArmorItem.Helmet());
	public static final RegistryObject<Item> MELON_ARMOR_CHESTPLATE = REGISTRY.register("melon_armor_chestplate", () -> new MelonArmorItem.Chestplate());
	public static final RegistryObject<Item> MELON_ARMOR_LEGGINGS = REGISTRY.register("melon_armor_leggings", () -> new MelonArmorItem.Leggings());
	public static final RegistryObject<Item> MELON_ARMOR_BOOTS = REGISTRY.register("melon_armor_boots", () -> new MelonArmorItem.Boots());
	public static final RegistryObject<Item> SCREAMING_MUSHROOM_SPAWN_EGG = REGISTRY.register("screaming_mushroom_spawn_egg",
			() -> new ForgeSpawnEggItem(RandomcrazymodModEntities.SCREAMING_MUSHROOM, -65536, -16777216, new Item.Properties().tab(RandomcrazymodModTabs.TAB_RANDOM_CRAZY)));
	public static final RegistryObject<Item> MELON_FLESH = REGISTRY.register("melon_flesh", () -> new MelonFleshItem());
	public static final RegistryObject<Item> MELON_RIND = REGISTRY.register("melon_rind", () -> new MelonRindItem());
	public static final RegistryObject<Item> PUMPKIN_PIE = block(RandomcrazymodModBlocks.PUMPKIN_PIE, null);
	public static final RegistryObject<Item> PUMPKIN_PIE_1 = block(RandomcrazymodModBlocks.PUMPKIN_PIE_1, null);
	public static final RegistryObject<Item> PUMPKIN_PIE_2 = block(RandomcrazymodModBlocks.PUMPKIN_PIE_2, null);
	public static final RegistryObject<Item> PUMPKIN_PIE_3 = block(RandomcrazymodModBlocks.PUMPKIN_PIE_3, null);
	public static final RegistryObject<Item> PUMPKIN_PIE_SLICE = REGISTRY.register("pumpkin_pie_slice", () -> new PumpkinPieSliceItem());
	public static final RegistryObject<Item> SPEEDY_MUSHROOM_SPAWN_EGG = REGISTRY.register("speedy_mushroom_spawn_egg",
			() -> new ForgeSpawnEggItem(RandomcrazymodModEntities.SPEEDY_MUSHROOM, -16724737, -16777216, new Item.Properties().tab(RandomcrazymodModTabs.TAB_RANDOM_CRAZY)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
