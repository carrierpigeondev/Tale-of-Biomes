package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class RiceCropOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RiceCropHealthScriptProcedure.execute(world, x, y, z);
		RiceCropGrowthScriptProcedure.execute();
	}
}
