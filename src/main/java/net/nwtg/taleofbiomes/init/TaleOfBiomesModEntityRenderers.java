
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.client.renderer.PrairieDogRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TaleOfBiomesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TaleOfBiomesModEntities.PRAIRIE_DOG.get(), PrairieDogRenderer::new);
	}
}
