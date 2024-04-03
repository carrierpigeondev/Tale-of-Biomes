package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetWorldTemperatureScriptProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double temperature = 0;
		double time = 0;
		double repeatTime = 0;
		double value = 0;
		if (!world.isClientSide()) {
			time = world.dayTime() % 24000;
			if (time == 6001 || time == 7001 || time == 8001 || time == 9001 || time == 10001 || time == 11001 || time == 12001 || time == 13001 || time == 14001 || time == 15001 || time == 16001 || time == 17001) {
				value = 0;
				repeatTime = 6001;
				for (int index0 = 0; index0 < 12; index0++) {
					if (time == repeatTime) {
						break;
					}
					value = value + 1;
					repeatTime = repeatTime + 1000;
				}
				temperature = (TaleOfBiomesModVariables.WorldVariables.get(world).worldWindTemperature + TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature) - value;
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureC = temperature;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureF = temperature * 1.8 + 32;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			} else if (time == 18001 || time == 19001 || time == 20001 || time == 21001 || time == 22001 || time == 23001 || time == 1 || time == 1001 || time == 2001 || time == 3001 || time == 4001 || time == 5001) {
				value = 0;
				repeatTime = 18001;
				for (int index1 = 0; index1 < 12; index1++) {
					if (repeatTime == 24001) {
						repeatTime = 1;
					}
					if (time == repeatTime) {
						break;
					}
					value = value + 1;
					repeatTime = repeatTime + 1000;
				}
				temperature = TaleOfBiomesModVariables.WorldVariables.get(world).worldWindTemperature + TaleOfBiomesModVariables.WorldVariables.get(world).worldSeasonTemperature + value;
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureC = temperature;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
				TaleOfBiomesModVariables.WorldVariables.get(world).worldTemperatureF = temperature * 1.8 + 32;
				TaleOfBiomesModVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}
}
