
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.surpriseface.randomcrazymod.init;

import net.surpriseface.randomcrazymod.client.renderer.ScreamingMushroomRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RandomcrazymodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RandomcrazymodModEntities.SCREAMING_MUSHROOM.get(), ScreamingMushroomRenderer::new);
	}
}
