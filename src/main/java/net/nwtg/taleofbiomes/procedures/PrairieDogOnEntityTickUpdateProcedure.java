package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.entity.PrairieDogEntity;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class PrairieDogOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof PrairieDogEntity _datEntI ? _datEntI.getEntityData().get(PrairieDogEntity.DATA_animationTime) : 0) > 0) {
			if (entity instanceof PrairieDogEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PrairieDogEntity.DATA_animationTime, (int) ((entity instanceof PrairieDogEntity _datEntI ? _datEntI.getEntityData().get(PrairieDogEntity.DATA_animationTime) : 0) - 1));
		} else {
			if (entity instanceof PrairieDogEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PrairieDogEntity.DATA_animationTime, (int) (entity instanceof PrairieDogEntity _datEntI ? _datEntI.getEntityData().get(PrairieDogEntity.DATA_animationTimeDefault) : 0));
			if ((entity instanceof PrairieDogEntity _datEntS ? _datEntS.getEntityData().get(PrairieDogEntity.DATA_animation) : "").equals("normal")) {
				if (entity instanceof PrairieDogEntity _datEntSetS)
					_datEntSetS.getEntityData().set(PrairieDogEntity.DATA_animation, "standing");
				if (entity instanceof Mob _entity)
					_entity.getNavigation().stop();
			} else {
				if (entity instanceof PrairieDogEntity _datEntSetS)
					_datEntSetS.getEntityData().set(PrairieDogEntity.DATA_animation, "normal");
			}
		}
	}
}
