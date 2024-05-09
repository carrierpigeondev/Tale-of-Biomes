package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class BasicStoneTableRecipeHelperREcipeNameScriptProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 0) {
			return Component.translatable(("gui." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".basic_stone_table.cobbled_block")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 1) {
			return Component.translatable(("gui." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".basic_stone_table.polished_block")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 2) {
			return Component.translatable(("gui." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".basic_stone_table.mossy_cobbled_block")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 3) {
			return Component.translatable(("gui." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".basic_stone_table.stairs_block")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 4) {
			return Component.translatable(("gui." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".basic_stone_table.slab_block")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 5) {
			return Component.translatable(("gui." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".basic_stone_table.wall_block")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 6) {
			return Component.translatable(("gui." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".basic_stone_table.pressure_plate_block")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 7) {
			return Component.translatable(("gui." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".basic_stone_table.button_block")).getString();
		}
		return "";
	}
}
