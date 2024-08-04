package net.nwtg.taleofbiomes.procedures;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class CropSettingsGeneratorProcedure {
	public static void execute() {
		File fmFile = new File("");
		boolean reset = false;
		com.google.gson.JsonObject fmMain = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmCrops = new com.google.gson.JsonObject();
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "crop_settings.json");
		if (!fmFile.exists()) {
			try {
				fmFile.getParentFile().mkdirs();
				fmFile.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			fmMain.addProperty("reset", false);
			fmCrops.addProperty("temp", "temp");
			fmMain.add("crops", fmCrops);
			fmCrops.remove("temp");
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
			RiceCropGenerateConfigSettingsProcedure.execute();
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
					reset = fmMain.get("reset").getAsBoolean();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (reset) {
				fmMain.addProperty("reset", false);
				fmMain.remove("crops");
				fmCrops.addProperty("temp", "temp");
				fmCrops.remove("temp");
				fmMain.add("crops", fmCrops);
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
				RiceCropGenerateConfigSettingsProcedure.execute();
			}
		}
	}
}
