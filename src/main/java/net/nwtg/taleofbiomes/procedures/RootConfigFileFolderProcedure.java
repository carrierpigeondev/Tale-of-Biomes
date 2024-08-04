package net.nwtg.taleofbiomes.procedures;

import net.neoforged.fml.loading.FMLPaths;

public class RootConfigFileFolderProcedure {
	public static String execute() {
		return FMLPaths.GAMEDIR.get().toString() + "/config/tale_of_biomes";
	}
}
