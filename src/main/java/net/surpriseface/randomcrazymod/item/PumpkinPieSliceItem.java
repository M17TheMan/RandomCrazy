
package net.surpriseface.randomcrazymod.item;

import net.surpriseface.randomcrazymod.init.RandomcrazymodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PumpkinPieSliceItem extends Item {
	public PumpkinPieSliceItem() {
		super(new Item.Properties().tab(RandomcrazymodModTabs.TAB_RANDOM_CRAZY).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(2f)

				.build()));
	}
}
