package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.entity.PrairieDogEntity;

import net.minecraft.world.entity.Entity;

public class PrairieDogStandingDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof PrairieDogEntity _datEntS ? _datEntS.getEntityData().get(PrairieDogEntity.DATA_animation) : "").equals("standing");
	}
}
