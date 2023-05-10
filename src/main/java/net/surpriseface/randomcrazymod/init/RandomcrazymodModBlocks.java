
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.surpriseface.randomcrazymod.init;

import net.surpriseface.randomcrazymod.block.PumpkinPieBlock;
import net.surpriseface.randomcrazymod.block.PumpkinPie3Block;
import net.surpriseface.randomcrazymod.block.PumpkinPie2Block;
import net.surpriseface.randomcrazymod.block.PumpkinPie1Block;
import net.surpriseface.randomcrazymod.block.ChaosOreBlock;
import net.surpriseface.randomcrazymod.RandomcrazymodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class RandomcrazymodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomcrazymodMod.MODID);
	public static final RegistryObject<Block> CHAOS_ORE = REGISTRY.register("chaos_ore", () -> new ChaosOreBlock());
	public static final RegistryObject<Block> PUMPKIN_PIE = REGISTRY.register("pumpkin_pie", () -> new PumpkinPieBlock());
	public static final RegistryObject<Block> PUMPKIN_PIE_1 = REGISTRY.register("pumpkin_pie_1", () -> new PumpkinPie1Block());
	public static final RegistryObject<Block> PUMPKIN_PIE_2 = REGISTRY.register("pumpkin_pie_2", () -> new PumpkinPie2Block());
	public static final RegistryObject<Block> PUMPKIN_PIE_3 = REGISTRY.register("pumpkin_pie_3", () -> new PumpkinPie3Block());
}
