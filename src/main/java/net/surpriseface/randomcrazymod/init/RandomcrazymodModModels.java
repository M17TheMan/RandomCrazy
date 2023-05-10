
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.surpriseface.randomcrazymod.init;

import net.surpriseface.randomcrazymod.client.model.ModelMelonArmorTop;
import net.surpriseface.randomcrazymod.client.model.ModelMelonArmorBottom;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RandomcrazymodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelMelonArmorBottom.LAYER_LOCATION, ModelMelonArmorBottom::createBodyLayer);
		event.registerLayerDefinition(ModelMelonArmorTop.LAYER_LOCATION, ModelMelonArmorTop::createBodyLayer);
	}
}
