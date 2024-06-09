package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BasicToolTableMenuRecipeHelperRecipeUpdateScriptProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
<<<<<<< HEAD
		BasicToolTableMenuRecipeHelperGripProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperAxeHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperHoeHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPickaxeHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperShovelHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperSickleHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperSwordHeadProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperAxeProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperHoeProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPickaxeProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperShovelProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperSickleProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperSwordProcedure.execute(world, entity);
=======
		BasicToolTableMenuRecipeHelperPiruffGripScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStoneAxeHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStoneHoeHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStonePickaxeHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStoneShovelHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStoneSickleHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperStoneSwordHeadScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStoneAxeScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStoneHoeScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStonePickaxeScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStoneShovelScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStoneSickleScriptProcedure.execute(world, entity);
		BasicToolTableMenuRecipeHelperPiruffStoneSwordScriptProcedure.execute(world, entity);
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
	}
}
