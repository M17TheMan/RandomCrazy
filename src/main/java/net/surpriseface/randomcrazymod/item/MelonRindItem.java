
package net.surpriseface.randomcrazymod.item;

import net.surpriseface.randomcrazymod.init.RandomcrazymodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MelonRindItem extends Item {
	public MelonRindItem() {
		super(new Item.Properties().tab(RandomcrazymodModTabs.TAB_RANDOM_CRAZY).stacksTo(64).rarity(Rarity.COMMON));
	}
}
