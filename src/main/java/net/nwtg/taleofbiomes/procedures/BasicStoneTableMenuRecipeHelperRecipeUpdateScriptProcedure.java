package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BasicStoneTableMenuRecipeHelperRecipeUpdateScriptProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipeHelperUpdateTimer == 0) {
				BasicStoneTableMenuRecipeHelperCobbledBlockScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperPolishedBlockScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperMossyCobbledBlockScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperStairsBlockScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperSlabBlockScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperWallScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperPressurePlateScriptProcedure.execute(world, entity);
				BasicStoneTableMenuRecipeHelperButtonScriptProcedure.execute(world, entity);
				{
					double _setval = 20;
					entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.recipeHelperUpdateTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = (entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipeHelperUpdateTimer - 1;
					entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.recipeHelperUpdateTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
