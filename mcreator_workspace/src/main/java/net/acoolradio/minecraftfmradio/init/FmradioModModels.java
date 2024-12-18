
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.acoolradio.minecraftfmradio.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.acoolradio.minecraftfmradio.client.model.Modelradio;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FmradioModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelradio.LAYER_LOCATION, Modelradio::createBodyLayer);
	}
}
