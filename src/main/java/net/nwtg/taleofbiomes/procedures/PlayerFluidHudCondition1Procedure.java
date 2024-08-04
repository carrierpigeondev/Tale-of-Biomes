package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class PlayerFluidHudCondition1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).playerFluid == 1;
	}
}
