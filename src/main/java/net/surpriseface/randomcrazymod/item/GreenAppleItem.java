
package net.surpriseface.randomcrazymod.item;

import net.surpriseface.randomcrazymod.init.RandomcrazymodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GreenAppleItem extends Item {
	public GreenAppleItem() {
		super(new Item.Properties().tab(RandomcrazymodModTabs.TAB_RANDOM_CRAZY).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.6f)

				.build()));
	}
}
