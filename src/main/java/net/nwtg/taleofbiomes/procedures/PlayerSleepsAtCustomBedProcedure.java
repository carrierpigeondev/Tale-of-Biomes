package net.nwtg.taleofbiomes.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerSleepsAtCustomBedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("isPlayerSleeping")) {
			if (entity.getPersistentData().getDouble("playerSleepTimer") < 70) {
				entity.getPersistentData().putDouble("playerSleepTimer", (entity.getPersistentData().getDouble("playerSleepTimer") + 1));
			} else {
				entity.getPersistentData().putBoolean("isPlayerSleeping", false);
			}
		}
	}
}
