package net.nwtg.taleofbiomes.procedures;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class GenerateKilnRecipeFileProcedure {
	public static void execute() {
		File fmFile = new File("");
		com.google.gson.JsonObject fmMain = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmRecipes = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmRecipe1 = new com.google.gson.JsonObject();
		boolean bReset = false;
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "kiln_recipes.json");
		if (!fmFile.exists()) {
			try {
				fmFile.getParentFile().mkdirs();
				fmFile.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			fmMain.addProperty("reset", false);
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
			GenerateKilnRecipe1Procedure.execute();
		} else {
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
					bReset = fmMain.get("reset").getAsBoolean();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bReset) {
				try {
					fmFile.getParentFile().mkdirs();
					fmFile.createNewFile();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
				fmMain.addProperty("reset", false);
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
				GenerateKilnRecipe1Procedure.execute();
			}
		}
	}
}
