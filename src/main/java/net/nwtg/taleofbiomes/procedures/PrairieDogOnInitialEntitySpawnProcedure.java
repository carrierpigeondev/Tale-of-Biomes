package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.entity.PrairieDogEntity;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PrairieDogOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double nRandom = 0;
		if (entity instanceof PrairieDogEntity _datEntSetI)
			_datEntSetI.getEntityData().set(PrairieDogEntity.DATA_animationTime, (int) (entity instanceof PrairieDogEntity _datEntI ? _datEntI.getEntityData().get(PrairieDogEntity.DATA_animationTimeDefault) : 0));
		nRandom = Mth.nextInt(RandomSource.create(), 0, 1);
		if (nRandom == 0) {
			if (entity instanceof PrairieDogEntity _datEntSetS)
				_datEntSetS.getEntityData().set(PrairieDogEntity.DATA_animation, "normal");
		} else {
			if (entity instanceof PrairieDogEntity _datEntSetS)
				_datEntSetS.getEntityData().set(PrairieDogEntity.DATA_animation, "standing");
		}
	}
}
