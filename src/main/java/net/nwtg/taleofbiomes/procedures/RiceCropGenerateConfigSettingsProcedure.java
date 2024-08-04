package net.nwtg.taleofbiomes.procedures;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class RiceCropGenerateConfigSettingsProcedure {
	public static void execute() {
		File fmFile = new File("");
		boolean bReset = false;
		com.google.gson.JsonObject fmMain = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmRice = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmTemperature = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmLight = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDisease = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmWater = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmFertilizer = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmPh = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDiseaseStunned = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDiseaseBrownSpot = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDiseaseBlight = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDiseases = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmHarvest = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmHarvestQuality = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmHarvestQuality1 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmHarvestQuality2 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmHarvestQuality3 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmHarvestQuality4 = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmCrops = new com.google.gson.JsonObject();
		fmFile = new File(RootConfigFileFolderProcedure.execute(), File.separator + "crop_settings.json");
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
					if (fmMain.has("crops")) {
						fmCrops = fmMain.get("crops").getAsJsonObject();
						if (!fmCrops.has("rice")) {
							fmRice.addProperty("growth_time", 24000);
							fmRice.addProperty("max_health", 300);
							fmRice.addProperty("damage_time", 20);
							fmRice.addProperty("min_soil_composition", 2);
							fmRice.addProperty("max_soil_composition", 4);
							fmDisease.addProperty("enabled", true);
							fmDisease.addProperty("chance", 5);
							fmDiseaseBlight.addProperty("name", "blight");
							fmDiseaseBlight.addProperty("risk", "High");
							fmDiseaseBlight.addProperty("damage", 5);
							fmDiseaseBrownSpot.addProperty("name", "brown_spot");
							fmDiseaseBrownSpot.addProperty("risk", "Medium");
							fmDiseaseBrownSpot.addProperty("damage", 2);
							fmDiseaseStunned.addProperty("name", "stunned");
							fmDiseaseStunned.addProperty("risk", "Low");
							fmDiseaseStunned.addProperty("damage", 1);
							fmDiseases.add("disease_1", fmDiseaseBlight);
							fmDiseases.add("disease_2", fmDiseaseBrownSpot);
							fmDiseases.add("disease_3", fmDiseaseStunned);
							fmDisease.add("diseases", fmDiseases);
							fmRice.add("disease", fmDisease);
							fmFertilizer.addProperty("damage", 1);
							fmFertilizer.addProperty("min_amount", 1);
							fmFertilizer.addProperty("drain_time", 400);
							fmFertilizer.addProperty("drain_amount", 1);
							fmRice.add("fertilizer", fmFertilizer);
							fmHarvestQuality1.addProperty("name", "dead");
							fmHarvestQuality1.addProperty("loot_table", "tale_of_biomes:blocks/rice_crop_harvest_dead");
							fmHarvestQuality1.addProperty("min_health", (-1));
							fmHarvestQuality1.addProperty("max_health", 0);
							fmHarvestQuality.add("quality_0", fmHarvestQuality1);
							fmHarvestQuality2.addProperty("name", "poor");
							fmHarvestQuality2.addProperty("loot_table", "tale_of_biomes:blocks/rice_crop_harvest_poor");
							fmHarvestQuality2.addProperty("min_health", 1);
							fmHarvestQuality2.addProperty("max_health", 24);
							fmHarvestQuality.add("quality_1", fmHarvestQuality2);
							fmHarvestQuality3.addProperty("name", "normal");
							fmHarvestQuality3.addProperty("loot_table", "tale_of_biomes:blocks/rice_crop_harvest_normal");
							fmHarvestQuality3.addProperty("min_health", 25);
							fmHarvestQuality3.addProperty("max_health", 75);
							fmHarvestQuality.add("quality_2", fmHarvestQuality3);
							fmHarvestQuality4.addProperty("name", "good");
							fmHarvestQuality4.addProperty("loot_table", "tale_of_biomes:blocks/rice_crop_harvest_good");
							fmHarvestQuality4.addProperty("min_health", 76);
							fmHarvestQuality4.addProperty("max_health", 100);
							fmHarvestQuality.add("quality_3", fmHarvestQuality4);
							fmHarvest.add("quality", fmHarvestQuality);
							fmRice.add("harvest", fmHarvest);
							fmLight.addProperty("min_time", 6000);
							fmLight.addProperty("damage", 1);
							fmRice.add("light", fmLight);
							fmPh.addProperty("damage", 1);
							fmPh.addProperty("min_amount", 1);
							fmPh.addProperty("drain_time", 400);
							fmPh.addProperty("drain_amount", 1);
							fmRice.add("ph", fmPh);
							fmTemperature.addProperty("damage", 1);
							fmTemperature.addProperty("halt_time", 24000);
							fmTemperature.addProperty("min", 21);
							fmTemperature.addProperty("max", 37);
							fmRice.add("temperature", fmTemperature);
							fmWater.addProperty("damage", 1);
							fmWater.addProperty("min_amount", 1);
							fmWater.addProperty("drain_time", 400);
							fmWater.addProperty("drain_amount", 1);
							fmRice.add("water", fmWater);
							fmCrops.add("rice", fmRice);
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
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
