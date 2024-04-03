
package net.nwtg.taleofbiomes.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.nwtg.taleofbiomes.procedures.SetClientTemperatureFDisplayTextProcedure;
import net.nwtg.taleofbiomes.procedures.SetClientTemperatureCDisplayTextProcedure;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class TemperatureOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					SetClientTemperatureCDisplayTextProcedure.execute(entity), 6, 8, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					SetClientTemperatureFDisplayTextProcedure.execute(entity), 6, 17, -1, false);
		}
	}
}
