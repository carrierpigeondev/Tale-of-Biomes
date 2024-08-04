package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;

public class RiceCropSetHealthConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RiceCropDiseaseScriptProcedure.execute(world, x, y, z);
	}
}
