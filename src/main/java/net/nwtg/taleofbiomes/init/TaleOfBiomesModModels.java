
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.client.model.Modelprairie_dog_standing;
import net.nwtg.taleofbiomes.client.model.Modelprairie_dog;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TaleOfBiomesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelprairie_dog.LAYER_LOCATION, Modelprairie_dog::createBodyLayer);
		event.registerLayerDefinition(Modelprairie_dog_standing.LAYER_LOCATION, Modelprairie_dog_standing::createBodyLayer);
	}
}
