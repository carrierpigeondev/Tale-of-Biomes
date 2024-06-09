package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BasicToolTableMenuRecipeHelperForwardButtonProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
<<<<<<< HEAD
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage < 12) {
=======
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage < 1) {
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
			{
				TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
				_vars.recipePage = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage + 1;
				_vars.syncPlayerVariables(entity);
			}
			BasicToolTableMenuRecipeHelperRecipeUpdateScriptProcedure.execute(world, entity);
		}
	}
}
