package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

<<<<<<< HEAD
import net.minecraft.world.entity.Entity;

public class BasicToolTableRecipeHelperRecipeNameScriptProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 0) {
			return "Tool Grip";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 1) {
			return "Axe Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 2) {
			return "Hoe Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 3) {
			return "Pickaxe Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 4) {
			return "Shovel Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 5) {
			return "Sickle Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 6) {
			return "Sword Head";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 7) {
			return "Axe Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 8) {
			return "Hoe Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 9) {
			return "Pickaxe Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 10) {
			return "Shovel Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 11) {
			return "Sickle Tool";
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 12) {
			return "Sword Tool";
=======
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class BasicToolTableRecipeHelperRecipeNameScriptProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 0) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_grip")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 1) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_axe_head")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 2) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_hoe_head")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 3) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_pickaxe_head")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 4) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_shovel_head")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 5) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_sickle_head")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 6) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".stone_sword_head")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 7) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_axe")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 8) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_hoe")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 9) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_pickaxe")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 10) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_shovel")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 11) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_sickle")).getString();
		} else if (entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).recipePage == 12) {
			return Component.translatable(("item." + TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ".piruff_stone_sword")).getString();
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
		}
		return "";
	}
}
