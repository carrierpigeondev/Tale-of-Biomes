
package net.nwtg.taleofbiomes.world.features;

import net.nwtg.taleofbiomes.world.features.configurations.StructureFeatureConfiguration;
import net.nwtg.taleofbiomes.procedures.VolcanicLargeBasaltColumnsAdditionalGenerationConditionProcedure;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

public class VolcanicLargeBasaltColumnsFeature extends StructureFeature {
	public VolcanicLargeBasaltColumnsFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!VolcanicLargeBasaltColumnsAdditionalGenerationConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
