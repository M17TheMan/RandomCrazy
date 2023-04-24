
package net.surpriseface.randomcrazymod.item;

import net.surpriseface.randomcrazymod.init.RandomcrazymodModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ChaosGemItem extends Item {
	public ChaosGemItem() {
		super(new Item.Properties().tab(RandomcrazymodModTabs.TAB_RANDOM_CRAZY).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
