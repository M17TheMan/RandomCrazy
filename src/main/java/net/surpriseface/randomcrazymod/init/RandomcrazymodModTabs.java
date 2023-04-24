
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.surpriseface.randomcrazymod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RandomcrazymodModTabs {
	public static CreativeModeTab TAB_RANDOM_CRAZY;

	public static void load() {
		TAB_RANDOM_CRAZY = new CreativeModeTab("tabrandom_crazy") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.FIRE);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
