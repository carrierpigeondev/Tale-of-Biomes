package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class BasicToolTableRecipeHelperRecipeNameScriptProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 0) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_grip")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 1) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_axe_head")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 2) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_hoe_head")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 3) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_pickaxe_head")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 4) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_shovel_head")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 5) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_sickle_head")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 6) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_sword_head")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 7) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_axe")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 8) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_hoe")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 9) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_pickaxe")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 10) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_shovel")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 11) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_sickle")).getString();
		} else if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 12) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_sword")).getString();
		}
		return "";
	}
}
