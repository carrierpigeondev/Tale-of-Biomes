package net.nwtg.taleofbiomes.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class RiceCropDiseaseScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		File fmFile = new File("");
		com.google.gson.JsonObject fmMain = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmRice = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDisease = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDiseases = new com.google.gson.JsonObject();
		com.google.gson.JsonObject fmDiseaseType = new com.google.gson.JsonObject();
		String sDiseaseName = "";
		String sDiseaseRisk = "";
		double nDiseaseChance = 0;
		double nRandomDisease = 0;
		double nDiseaseDamage = 0;
		boolean bDiseaseEnabled = false;
		boolean bCreateDisease = false;
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "hasDisease"))) {
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
						if (fmMain.has("rice")) {
							fmRice = fmMain.get("rice").getAsJsonObject();
							if (fmRice.has("disease")) {
								fmDisease = fmRice.get("disease").getAsJsonObject();
								if (fmDisease.has("enabled")) {
									bDiseaseEnabled = fmDisease.get("enabled").getAsBoolean();
								}
								if (fmDisease.has("chance")) {
									nDiseaseChance = fmDisease.get("chance").getAsDouble();
								}
								if (fmDisease.has("diseases")) {
									fmDiseases = fmDisease.get("diseases").getAsJsonObject();
									if (bDiseaseEnabled && fmDiseases.size() > 0 && Mth.nextInt(RandomSource.create(), 1, 24000) <= nDiseaseChance) {
										nRandomDisease = Mth.nextInt(RandomSource.create(), 1, (int) fmDiseases.size());
										if (fmDiseases.has(("disease_" + new java.text.DecimalFormat("##").format(nRandomDisease)))) {
											fmDiseaseType = fmDiseases.get(("disease_" + new java.text.DecimalFormat("##").format(nRandomDisease))).getAsJsonObject();
											if (fmDiseaseType.has("name")) {
												sDiseaseName = fmDiseaseType.get("name").getAsString();
											}
											if (fmDiseaseType.has("risk")) {
												sDiseaseRisk = fmDiseaseType.get("risk").getAsString();
											}
											if (fmDiseaseType.has("damage")) {
												nDiseaseChance = fmDiseaseType.get("damage").getAsDouble();
											}
											if (fmDiseaseType.has("name") && fmDiseaseType.has("risk") && fmDiseaseType.has("damage")) {
												bCreateDisease = true;
											}
										}
									}
								}
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (bCreateDisease) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putString("diseaseName", sDiseaseName);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putString("diseaseRisk", sDiseaseRisk);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("diseaseDamage", nDiseaseDamage);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("hasDisease", true);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
