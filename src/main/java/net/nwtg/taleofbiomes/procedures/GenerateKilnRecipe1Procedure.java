package net.nwtg.taleofbiomes.procedures;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class GenerateKilnRecipe1Procedure {
	public static void execute() {
		File fmFile = new File("");
		com.google.gson.JsonObject fmMain = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmRecipes = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmRecipe1 = new com.google.gson.JsonObject();
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "kiln_recipes.json");
		if (fmFile.exists()) {
			{
				try {
					BufferedReader bufferedReader = new BufferedReader(new FileReader(fmFile));
					StringBuilder jsonstringbuilder = new StringBuilder();
					String line;
					while ((line = bufferedReader.readLine()) != null) {
						jsonstringbuilder.append(line);
					}
					bufferedReader.close();
					fmMain = new com.google.gson.Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
					if (!fmMain.has("recipes")) {
						fmRecipe1.addProperty("layer_1", "minecraft:coal_block");
						fmRecipe1.addProperty("layer_2", "tale_of_biomes:cobbled_limestone");
						fmRecipe1.addProperty("layer_3", "tale_of_biomes:cobbled_limestone");
						fmRecipe1.addProperty("layer_4", "tale_of_biomes:cobbled_limestone");
						fmRecipe1.addProperty("display", "tale_of_biomes:cobbled_limestone");
						fmRecipe1.addProperty("output", "tale_of_biomes:quicklime_block");
						fmRecipe1.addProperty("min_temperature", 825);
						fmRecipe1.addProperty("max_temperature", 950);
						fmRecipe1.addProperty("amount", 27);
						fmRecipes.add("1", fmRecipe1);
						fmMain.add("recipes", fmRecipes);
						{
							com.google.gson.Gson mainGSONBuilderVariable = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
							try {
								FileWriter fileWriter = new FileWriter(fmFile);
								fileWriter.write(mainGSONBuilderVariable.toJson(fmMain));
								fileWriter.close();
							} catch (IOException exception) {
								exception.printStackTrace();
							}
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
