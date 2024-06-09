package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.entity.Entity;

public class BasicToolTableMenuThisGUIIsOpenedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
<<<<<<< HEAD
			_vars.recipeHelperUpdateTimer = 0;
			_vars.syncPlayerVariables(entity);
		}
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
=======
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
			_vars.isBasicToolTableRecipeBookOpen = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}
