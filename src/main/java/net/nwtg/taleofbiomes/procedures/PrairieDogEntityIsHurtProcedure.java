package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.entity.PrairieDogEntity;

import net.minecraft.world.entity.Entity;

public class PrairieDogEntityIsHurtProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof PrairieDogEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PrairieDogEntity.DATA_animationTime, (int) (entity instanceof PrairieDogEntity _datEntI ? _datEntI.getEntityData().get(PrairieDogEntity.DATA_animationTimeDefault) : 0));
		if ((entity instanceof PrairieDogEntity _datEntS ? _datEntS.getEntityData().get(PrairieDogEntity.DATA_animation) : "").equals("standing")) {
			if (entity instanceof PrairieDogEntity _datEntSetS)
				_datEntSetS.getEntityData().set(PrairieDogEntity.DATA_animation, "normal");
		}
	}
}
