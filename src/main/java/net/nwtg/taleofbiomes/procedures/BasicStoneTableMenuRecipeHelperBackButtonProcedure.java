package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BasicStoneTableMenuRecipeHelperBackButtonProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage > 0) {
			{
				double _setval = 0;
				entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.recipeHelperUpdateTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage - 1;
				entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.recipePage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			BasicStoneTableMenuRecipeHelperRecipeUpdateScriptProcedure.execute(world, entity);
		}
	}
}
