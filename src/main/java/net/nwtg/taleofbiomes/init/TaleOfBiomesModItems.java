
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.taleofbiomes.init;

import net.nwtg.taleofbiomes.procedures.SeasonDevicePropertyValueProviderProcedure;
<<<<<<< HEAD
import net.nwtg.taleofbiomes.item.UnpureCopperDustItem;
=======
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
import net.nwtg.taleofbiomes.item.StrawItem;
import net.nwtg.taleofbiomes.item.StoneSwordHeadItem;
import net.nwtg.taleofbiomes.item.StoneSickleHeadItem;
import net.nwtg.taleofbiomes.item.StoneShovelHeadItem;
import net.nwtg.taleofbiomes.item.StonePickaxeHeadItem;
import net.nwtg.taleofbiomes.item.StoneHoeHeadItem;
import net.nwtg.taleofbiomes.item.StoneAxeHeadItem;
import net.nwtg.taleofbiomes.item.SeasonDeviceItem;
import net.nwtg.taleofbiomes.item.RiceSeedsItem;
import net.nwtg.taleofbiomes.item.QuicklimeItem;
<<<<<<< HEAD
import net.nwtg.taleofbiomes.item.PureCopperDustItem;
import net.nwtg.taleofbiomes.item.PiruffSwordItem;
import net.nwtg.taleofbiomes.item.PiruffSwordHeadItem;
=======
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
import net.nwtg.taleofbiomes.item.PiruffStoneSwordItem;
import net.nwtg.taleofbiomes.item.PiruffStoneSickleItem;
import net.nwtg.taleofbiomes.item.PiruffStoneShovelItem;
import net.nwtg.taleofbiomes.item.PiruffStonePickaxeItem;
import net.nwtg.taleofbiomes.item.PiruffStoneHoeItem;
import net.nwtg.taleofbiomes.item.PiruffStoneAxeItem;
<<<<<<< HEAD
import net.nwtg.taleofbiomes.item.PiruffSickleItem;
import net.nwtg.taleofbiomes.item.PiruffSickleHeadItem;
import net.nwtg.taleofbiomes.item.PiruffShovelItem;
import net.nwtg.taleofbiomes.item.PiruffShovelHeadItem;
import net.nwtg.taleofbiomes.item.PiruffPickaxeItem;
import net.nwtg.taleofbiomes.item.PiruffPickaxeHeadItem;
import net.nwtg.taleofbiomes.item.PiruffHoeItem;
import net.nwtg.taleofbiomes.item.PiruffHoeHeadItem;
import net.nwtg.taleofbiomes.item.PiruffGripItem;
import net.nwtg.taleofbiomes.item.PiruffAxeItem;
import net.nwtg.taleofbiomes.item.PiruffAxeHeadItem;
=======
import net.nwtg.taleofbiomes.item.PiruffGripItem;
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
import net.nwtg.taleofbiomes.item.PhosphoriteSwordItem;
import net.nwtg.taleofbiomes.item.PhosphoriteShovelItem;
import net.nwtg.taleofbiomes.item.PhosphoritePickaxeItem;
import net.nwtg.taleofbiomes.item.PhosphoriteHoeItem;
import net.nwtg.taleofbiomes.item.PhosphoriteGemstoneItem;
import net.nwtg.taleofbiomes.item.PhosphoriteAxeItem;
<<<<<<< HEAD
import net.nwtg.taleofbiomes.item.MixedCopperDustItem;
=======
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
import net.nwtg.taleofbiomes.item.GhostBerriesItem;
import net.nwtg.taleofbiomes.item.ClayItem;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.item.ItemProperties;

public class TaleOfBiomesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, TaleOfBiomesMod.MODID);
	public static final DeferredHolder<Item, Item> GRASS_BLOCK = block(TaleOfBiomesModBlocks.GRASS_BLOCK);
	public static final DeferredHolder<Item, Item> DIRT = block(TaleOfBiomesModBlocks.DIRT);
	public static final DeferredHolder<Item, Item> BLUE_ASTER = block(TaleOfBiomesModBlocks.BLUE_ASTER);
	public static final DeferredHolder<Item, Item> PURPLE_ASTER = block(TaleOfBiomesModBlocks.PURPLE_ASTER);
	public static final DeferredHolder<Item, Item> MAGENTA_ASTER = block(TaleOfBiomesModBlocks.MAGENTA_ASTER);
	public static final DeferredHolder<Item, Item> BLUE_ASTER_FLOWER_POT = block(TaleOfBiomesModBlocks.BLUE_ASTER_FLOWER_POT);
	public static final DeferredHolder<Item, Item> PURPLE_ASTER_FLOWER_POT = block(TaleOfBiomesModBlocks.PURPLE_ASTER_FLOWER_POT);
	public static final DeferredHolder<Item, Item> MAGENTA_ASTER_FLOWER_POT = block(TaleOfBiomesModBlocks.MAGENTA_ASTER_FLOWER_POT);
	public static final DeferredHolder<Item, Item> GOLDENROD = block(TaleOfBiomesModBlocks.GOLDENROD);
	public static final DeferredHolder<Item, Item> GOLDENROD_FLOWER_POT = block(TaleOfBiomesModBlocks.GOLDENROD_FLOWER_POT);
	public static final DeferredHolder<Item, Item> WILD_INDIGO = block(TaleOfBiomesModBlocks.WILD_INDIGO);
	public static final DeferredHolder<Item, Item> WILD_INDIGO_FLOWER_POT = block(TaleOfBiomesModBlocks.WILD_INDIGO_FLOWER_POT);
	public static final DeferredHolder<Item, Item> STONE = block(TaleOfBiomesModBlocks.STONE);
	public static final DeferredHolder<Item, Item> SAND = block(TaleOfBiomesModBlocks.SAND);
	public static final DeferredHolder<Item, Item> FERTILE_SOIL = block(TaleOfBiomesModBlocks.FERTILE_SOIL);
	public static final DeferredHolder<Item, Item> TILLED_SOIL = block(TaleOfBiomesModBlocks.TILLED_SOIL);
	public static final DeferredHolder<Item, Item> TALL_GRASS_0 = block(TaleOfBiomesModBlocks.TALL_GRASS_0);
	public static final DeferredHolder<Item, Item> TALL_GRASS_1 = block(TaleOfBiomesModBlocks.TALL_GRASS_1);
	public static final DeferredHolder<Item, Item> TALL_GRASS_2 = block(TaleOfBiomesModBlocks.TALL_GRASS_2);
	public static final DeferredHolder<Item, Item> IVY_SHRUB = block(TaleOfBiomesModBlocks.IVY_SHRUB);
	public static final DeferredHolder<Item, Item> ROSE_SHRUB = block(TaleOfBiomesModBlocks.ROSE_SHRUB);
	public static final DeferredHolder<Item, Item> PURE_COAL_ORE = block(TaleOfBiomesModBlocks.PURE_COAL_ORE);
	public static final DeferredHolder<Item, Item> GRAVEL = block(TaleOfBiomesModBlocks.GRAVEL);
	public static final DeferredHolder<Item, Item> PHOSPHORITE_STONE = block(TaleOfBiomesModBlocks.PHOSPHORITE_STONE);
	public static final DeferredHolder<Item, Item> PHOSPHORITE_CRYSTAL = block(TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL);
	public static final DeferredHolder<Item, Item> PHOSPHORITE_CRYSTAL_BOTTOM = block(TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL_BOTTOM);
	public static final DeferredHolder<Item, Item> PHOSPHORITE_CRYSTAL_TOP = block(TaleOfBiomesModBlocks.PHOSPHORITE_CRYSTAL_TOP);
	public static final DeferredHolder<Item, Item> PHOSPHORITE_GEMSTONE = REGISTRY.register("phosphorite_gemstone", () -> new PhosphoriteGemstoneItem());
	public static final DeferredHolder<Item, Item> PHOSPHORITE_PICKAXE = REGISTRY.register("phosphorite_pickaxe", () -> new PhosphoritePickaxeItem());
	public static final DeferredHolder<Item, Item> PHOSPHORITE_AXE = REGISTRY.register("phosphorite_axe", () -> new PhosphoriteAxeItem());
	public static final DeferredHolder<Item, Item> PHOSPHORITE_SHOVEL = REGISTRY.register("phosphorite_shovel", () -> new PhosphoriteShovelItem());
	public static final DeferredHolder<Item, Item> PHOSPHORITE_HOE = REGISTRY.register("phosphorite_hoe", () -> new PhosphoriteHoeItem());
	public static final DeferredHolder<Item, Item> PHOSPHORITE_SWORD = REGISTRY.register("phosphorite_sword", () -> new PhosphoriteSwordItem());
	public static final DeferredHolder<Item, Item> PIRUFF_LOG = block(TaleOfBiomesModBlocks.PIRUFF_LOG);
	public static final DeferredHolder<Item, Item> PIRUFF_LEAVES = block(TaleOfBiomesModBlocks.PIRUFF_LEAVES);
	public static final DeferredHolder<Item, Item> PIRUFF_WOOD = block(TaleOfBiomesModBlocks.PIRUFF_WOOD);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_1_S_0 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_0);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_1_S_1 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_1);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_1_S_2 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_2);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_1_S_3 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_3);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_1_S_4 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_1_S_4);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_2_S_0 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_0);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_2_S_1 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_1);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_2_S_2 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_2);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_2_S_3 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_3);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_2_S_4 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_2_S_4);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_3_S_0 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_0);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_3_S_1 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_1);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_3_S_2 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_2);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_3_S_3 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_3);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_3_S_4 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_3_S_4);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_4_S_0 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_0);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_4_S_1 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_1);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_4_S_2 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_2);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_4_S_3 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_3);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_4_S_4 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_4_S_4);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_0_S_1 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_1);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_0_S_2 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_2);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_0_S_3 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_3);
	public static final DeferredHolder<Item, Item> TILLED_SOIL_W_0_S_4 = block(TaleOfBiomesModBlocks.TILLED_SOIL_W_0_S_4);
	public static final DeferredHolder<Item, Item> CLAY_BLOCK = block(TaleOfBiomesModBlocks.CLAY_BLOCK);
	public static final DeferredHolder<Item, Item> CLAY = REGISTRY.register("clay", () -> new ClayItem());
	public static final DeferredHolder<Item, Item> BRICKS = block(TaleOfBiomesModBlocks.BRICKS);
	public static final DeferredHolder<Item, Item> LARGE_BRICKS = block(TaleOfBiomesModBlocks.LARGE_BRICKS);
	public static final DeferredHolder<Item, Item> LARGE_BRICK_WALL = block(TaleOfBiomesModBlocks.LARGE_BRICK_WALL);
	public static final DeferredHolder<Item, Item> LARGE_BRICK_PRESSURE_PLATE = block(TaleOfBiomesModBlocks.LARGE_BRICK_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> LARGE_BRICK_BUTTON = block(TaleOfBiomesModBlocks.LARGE_BRICK_BUTTON);
	public static final DeferredHolder<Item, Item> BRICK_STAIRS = block(TaleOfBiomesModBlocks.BRICK_STAIRS);
	public static final DeferredHolder<Item, Item> BRICK_SLAB = block(TaleOfBiomesModBlocks.BRICK_SLAB);
	public static final DeferredHolder<Item, Item> BRICK_WALL = block(TaleOfBiomesModBlocks.BRICK_WALL);
	public static final DeferredHolder<Item, Item> BRICK_PRESSURE_PLATE = block(TaleOfBiomesModBlocks.BRICK_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> BRICK_BUTTON = block(TaleOfBiomesModBlocks.BRICK_BUTTON);
	public static final DeferredHolder<Item, Item> LIMESTONE = block(TaleOfBiomesModBlocks.LIMESTONE);
	public static final DeferredHolder<Item, Item> COBBLED_LIMESTONE = block(TaleOfBiomesModBlocks.COBBLED_LIMESTONE);
	public static final DeferredHolder<Item, Item> QUICKLIME_BLOCK = block(TaleOfBiomesModBlocks.QUICKLIME_BLOCK);
	public static final DeferredHolder<Item, Item> QUICKLIME = REGISTRY.register("quicklime", () -> new QuicklimeItem());
	public static final DeferredHolder<Item, Item> KILN_FURNACE = block(TaleOfBiomesModBlocks.KILN_FURNACE);
	public static final DeferredHolder<Item, Item> KILN_FURNACE_ON = block(TaleOfBiomesModBlocks.KILN_FURNACE_ON);
	public static final DeferredHolder<Item, Item> KILN_LADDER = block(TaleOfBiomesModBlocks.KILN_LADDER);
	public static final DeferredHolder<Item, Item> KILN_BLOCK_CORNER_BOTTOM = block(TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_BOTTOM);
	public static final DeferredHolder<Item, Item> KILN_BLOCK_CORNER_CENTER = block(TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_CENTER);
	public static final DeferredHolder<Item, Item> KILN_BLOCK_CORNER_TOP = block(TaleOfBiomesModBlocks.KILN_BLOCK_CORNER_TOP);
	public static final DeferredHolder<Item, Item> KILN_BLOCK_MIDDLE_BOTTOM = block(TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_BOTTOM);
	public static final DeferredHolder<Item, Item> KILN_BLOCK_MIDDLE_CENTER = block(TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_CENTER);
	public static final DeferredHolder<Item, Item> KILN_BLOCK_MIDDLE_TOP = block(TaleOfBiomesModBlocks.KILN_BLOCK_MIDDLE_TOP);
	public static final DeferredHolder<Item, Item> KILN_BLOCK_FOUNDATION = block(TaleOfBiomesModBlocks.KILN_BLOCK_FOUNDATION);
	public static final DeferredHolder<Item, Item> RICE_CROP_0 = block(TaleOfBiomesModBlocks.RICE_CROP_0);
	public static final DeferredHolder<Item, Item> RICE_CROP_1 = block(TaleOfBiomesModBlocks.RICE_CROP_1);
	public static final DeferredHolder<Item, Item> RICE_CROP_2 = block(TaleOfBiomesModBlocks.RICE_CROP_2);
	public static final DeferredHolder<Item, Item> RICE_CROP_3 = block(TaleOfBiomesModBlocks.RICE_CROP_3);
	public static final DeferredHolder<Item, Item> RICE_CROP_4 = block(TaleOfBiomesModBlocks.RICE_CROP_4);
	public static final DeferredHolder<Item, Item> RICE_CROP_5 = block(TaleOfBiomesModBlocks.RICE_CROP_5);
	public static final DeferredHolder<Item, Item> RICE_CROP_6 = block(TaleOfBiomesModBlocks.RICE_CROP_6);
	public static final DeferredHolder<Item, Item> RICE_CROP_7 = block(TaleOfBiomesModBlocks.RICE_CROP_7);
	public static final DeferredHolder<Item, Item> RICE_SEEDS = REGISTRY.register("rice_seeds", () -> new RiceSeedsItem());
	public static final DeferredHolder<Item, Item> STRIPPED_PIRUFF_LOG = block(TaleOfBiomesModBlocks.STRIPPED_PIRUFF_LOG);
	public static final DeferredHolder<Item, Item> STRIPPED_PIRUFF_WOOD = block(TaleOfBiomesModBlocks.STRIPPED_PIRUFF_WOOD);
	public static final DeferredHolder<Item, Item> PIRUFF_PLANKS = block(TaleOfBiomesModBlocks.PIRUFF_PLANKS);
	public static final DeferredHolder<Item, Item> PIRUFF_DOOR = doubleBlock(TaleOfBiomesModBlocks.PIRUFF_DOOR);
	public static final DeferredHolder<Item, Item> PIRUFF_TRAPDOOR = block(TaleOfBiomesModBlocks.PIRUFF_TRAPDOOR);
	public static final DeferredHolder<Item, Item> PIRUFF_FENCE = block(TaleOfBiomesModBlocks.PIRUFF_FENCE);
	public static final DeferredHolder<Item, Item> PIRUFF_FENCE_GATE = block(TaleOfBiomesModBlocks.PIRUFF_FENCE_GATE);
	public static final DeferredHolder<Item, Item> PIRUFF_BUTTON = block(TaleOfBiomesModBlocks.PIRUFF_BUTTON);
	public static final DeferredHolder<Item, Item> PIRUFF_PRESSURE_PLATE = block(TaleOfBiomesModBlocks.PIRUFF_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> PIRUFF_STAIRS = block(TaleOfBiomesModBlocks.PIRUFF_STAIRS);
	public static final DeferredHolder<Item, Item> PIRUFF_SLAB = block(TaleOfBiomesModBlocks.PIRUFF_SLAB);
	public static final DeferredHolder<Item, Item> HAY_GRASS = block(TaleOfBiomesModBlocks.HAY_GRASS);
	public static final DeferredHolder<Item, Item> HAY_STRAW = block(TaleOfBiomesModBlocks.HAY_STRAW);
	public static final DeferredHolder<Item, Item> STRAW = REGISTRY.register("straw", () -> new StrawItem());
	public static final DeferredHolder<Item, Item> THATCH_BLOCK = block(TaleOfBiomesModBlocks.THATCH_BLOCK);
	public static final DeferredHolder<Item, Item> THATCH_STAIRS = block(TaleOfBiomesModBlocks.THATCH_STAIRS);
	public static final DeferredHolder<Item, Item> THATCH_SLAB = block(TaleOfBiomesModBlocks.THATCH_SLAB);
	public static final DeferredHolder<Item, Item> LARGE_BRICK_STAIRS = block(TaleOfBiomesModBlocks.LARGE_BRICK_STAIRS);
	public static final DeferredHolder<Item, Item> LARGE_BRICK_SLAB = block(TaleOfBiomesModBlocks.LARGE_BRICK_SLAB);
	public static final DeferredHolder<Item, Item> PACKED_DIRT = block(TaleOfBiomesModBlocks.PACKED_DIRT);
	public static final DeferredHolder<Item, Item> SEASON_DEVICE = REGISTRY.register("season_device", () -> new SeasonDeviceItem());
	public static final DeferredHolder<Item, Item> PLOT_BLUEPRINT = block(TaleOfBiomesModBlocks.PLOT_BLUEPRINT);
	public static final DeferredHolder<Item, Item> WALL_BLUEPRINT = block(TaleOfBiomesModBlocks.WALL_BLUEPRINT);
	public static final DeferredHolder<Item, Item> DOOR_BLUEPRINT = block(TaleOfBiomesModBlocks.DOOR_BLUEPRINT);
	public static final DeferredHolder<Item, Item> WINDOW_BLUEPRINT = block(TaleOfBiomesModBlocks.WINDOW_BLUEPRINT);
	public static final DeferredHolder<Item, Item> HANGING_LANTERN = block(TaleOfBiomesModBlocks.HANGING_LANTERN);
	public static final DeferredHolder<Item, Item> HANGING_LANTERN_ON = block(TaleOfBiomesModBlocks.HANGING_LANTERN_ON);
	public static final DeferredHolder<Item, Item> GROUND_LANTERN = block(TaleOfBiomesModBlocks.GROUND_LANTERN);
	public static final DeferredHolder<Item, Item> GROUND_LANTERN_ON = block(TaleOfBiomesModBlocks.GROUND_LANTERN_ON);
	public static final DeferredHolder<Item, Item> TOOL_HANDLE_BLOCK = block(TaleOfBiomesModBlocks.TOOL_HANDLE_BLOCK);
	public static final DeferredHolder<Item, Item> PHOSPHORITE_HOE_BLOCK = block(TaleOfBiomesModBlocks.PHOSPHORITE_HOE_BLOCK);
	public static final DeferredHolder<Item, Item> PHOSPHORITE_SHOVEL_BLOCK = block(TaleOfBiomesModBlocks.PHOSPHORITE_SHOVEL_BLOCK);
	public static final DeferredHolder<Item, Item> PHOSPHORITE_RAKE_BLOCK = block(TaleOfBiomesModBlocks.PHOSPHORITE_RAKE_BLOCK);
	public static final DeferredHolder<Item, Item> YELLOW_PIRUFF_BED = block(TaleOfBiomesModBlocks.YELLOW_PIRUFF_BED);
	public static final DeferredHolder<Item, Item> YELLOW_PIRUFF_BED_TOP = block(TaleOfBiomesModBlocks.YELLOW_PIRUFF_BED_TOP);
	public static final DeferredHolder<Item, Item> BLUE_PIRUFF_BED = block(TaleOfBiomesModBlocks.BLUE_PIRUFF_BED);
	public static final DeferredHolder<Item, Item> BLUE_PIRUFF_BED_TOP = block(TaleOfBiomesModBlocks.BLUE_PIRUFF_BED_TOP);
	public static final DeferredHolder<Item, Item> LIGHT_PURPLE_PIRUFF_BED = block(TaleOfBiomesModBlocks.LIGHT_PURPLE_PIRUFF_BED);
	public static final DeferredHolder<Item, Item> LIGHT_PURPLE_PIRUFF_BED_TOP = block(TaleOfBiomesModBlocks.LIGHT_PURPLE_PIRUFF_BED_TOP);
	public static final DeferredHolder<Item, Item> MAGENTA_PIRUFF_BED = block(TaleOfBiomesModBlocks.MAGENTA_PIRUFF_BED);
	public static final DeferredHolder<Item, Item> MAGENTA_PIRUFF_BED_TOP = block(TaleOfBiomesModBlocks.MAGENTA_PIRUFF_BED_TOP);
	public static final DeferredHolder<Item, Item> PURPLE_PIRUFF_BED = block(TaleOfBiomesModBlocks.PURPLE_PIRUFF_BED);
	public static final DeferredHolder<Item, Item> PURPLE_PIRUFF_BED_TOP = block(TaleOfBiomesModBlocks.PURPLE_PIRUFF_BED_TOP);
	public static final DeferredHolder<Item, Item> BASIC_TOOL_TABLE = block(TaleOfBiomesModBlocks.BASIC_TOOL_TABLE);
	public static final DeferredHolder<Item, Item> STONE_AXE_HEAD = REGISTRY.register("stone_axe_head", () -> new StoneAxeHeadItem());
	public static final DeferredHolder<Item, Item> PIRUFF_GRIP = REGISTRY.register("piruff_grip", () -> new PiruffGripItem());
	public static final DeferredHolder<Item, Item> PIRUFF_STONE_AXE = REGISTRY.register("piruff_stone_axe", () -> new PiruffStoneAxeItem());
	public static final DeferredHolder<Item, Item> STONE_PICKAXE_HEAD = REGISTRY.register("stone_pickaxe_head", () -> new StonePickaxeHeadItem());
	public static final DeferredHolder<Item, Item> STONE_SHOVEL_HEAD = REGISTRY.register("stone_shovel_head", () -> new StoneShovelHeadItem());
	public static final DeferredHolder<Item, Item> STONE_HOE_HEAD = REGISTRY.register("stone_hoe_head", () -> new StoneHoeHeadItem());
	public static final DeferredHolder<Item, Item> STONE_SWORD_HEAD = REGISTRY.register("stone_sword_head", () -> new StoneSwordHeadItem());
	public static final DeferredHolder<Item, Item> PIRUFF_STONE_HOE = REGISTRY.register("piruff_stone_hoe", () -> new PiruffStoneHoeItem());
	public static final DeferredHolder<Item, Item> PIRUFF_STONE_SHOVEL = REGISTRY.register("piruff_stone_shovel", () -> new PiruffStoneShovelItem());
	public static final DeferredHolder<Item, Item> PIRUFF_STONE_PICKAXE = REGISTRY.register("piruff_stone_pickaxe", () -> new PiruffStonePickaxeItem());
	public static final DeferredHolder<Item, Item> PIRUFF_STONE_SWORD = REGISTRY.register("piruff_stone_sword", () -> new PiruffStoneSwordItem());
	public static final DeferredHolder<Item, Item> STONE_SICKLE_HEAD = REGISTRY.register("stone_sickle_head", () -> new StoneSickleHeadItem());
	public static final DeferredHolder<Item, Item> PIRUFF_STONE_SICKLE = REGISTRY.register("piruff_stone_sickle", () -> new PiruffStoneSickleItem());
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_N = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_N);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_E = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_E);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_I = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_I);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_L = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_L);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_LC = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_LC);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_LCC = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_LCC);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_LT = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_LT);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_LTC = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_LTC);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_T = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_T);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_TC = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_TC);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_TX = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_TX);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_TXC = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_TXC);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_TXCC = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_TXCC);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_X = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_X);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_XC = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_XC);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_F = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_F);
	public static final DeferredHolder<Item, Item> LOW_CAPACITY_CABLE_S = block(TaleOfBiomesModBlocks.LOW_CAPACITY_CABLE_S);
	public static final DeferredHolder<Item, Item> MOSS_BLOCK = block(TaleOfBiomesModBlocks.MOSS_BLOCK);
	public static final DeferredHolder<Item, Item> MOSS_CARPET = block(TaleOfBiomesModBlocks.MOSS_CARPET);
	public static final DeferredHolder<Item, Item> PIRUFF_VINES = block(TaleOfBiomesModBlocks.PIRUFF_VINES);
	public static final DeferredHolder<Item, Item> SOLAR_PANNEL = block(TaleOfBiomesModBlocks.SOLAR_PANNEL);
	public static final DeferredHolder<Item, Item> PIRUFF_SAPLING = block(TaleOfBiomesModBlocks.PIRUFF_SAPLING);
	public static final DeferredHolder<Item, Item> COPPER_BATTERY_0 = block(TaleOfBiomesModBlocks.COPPER_BATTERY_0);
	public static final DeferredHolder<Item, Item> COPPER_BATTERY_1 = block(TaleOfBiomesModBlocks.COPPER_BATTERY_1);
	public static final DeferredHolder<Item, Item> COPPER_BATTERY_2 = block(TaleOfBiomesModBlocks.COPPER_BATTERY_2);
	public static final DeferredHolder<Item, Item> COPPER_BATTERY_3 = block(TaleOfBiomesModBlocks.COPPER_BATTERY_3);
	public static final DeferredHolder<Item, Item> COPPER_BATTERY_4 = block(TaleOfBiomesModBlocks.COPPER_BATTERY_4);
	public static final DeferredHolder<Item, Item> DRILL = block(TaleOfBiomesModBlocks.DRILL);
	public static final DeferredHolder<Item, Item> GHOST_BUSH_0 = block(TaleOfBiomesModBlocks.GHOST_BUSH_0);
	public static final DeferredHolder<Item, Item> GHOST_BUSH_1 = block(TaleOfBiomesModBlocks.GHOST_BUSH_1);
	public static final DeferredHolder<Item, Item> GHOST_BUSH_2 = block(TaleOfBiomesModBlocks.GHOST_BUSH_2);
	public static final DeferredHolder<Item, Item> GHOST_BUSH_3 = block(TaleOfBiomesModBlocks.GHOST_BUSH_3);
	public static final DeferredHolder<Item, Item> GHOST_BERRIES = REGISTRY.register("ghost_berries", () -> new GhostBerriesItem());
	public static final DeferredHolder<Item, Item> MARBLE = block(TaleOfBiomesModBlocks.MARBLE);
	public static final DeferredHolder<Item, Item> COBBLED_MARBLE = block(TaleOfBiomesModBlocks.COBBLED_MARBLE);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_MARBLE = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE);
	public static final DeferredHolder<Item, Item> POLISHED_MARBLE = block(TaleOfBiomesModBlocks.POLISHED_MARBLE);
	public static final DeferredHolder<Item, Item> MARBLE_STAIRS = block(TaleOfBiomesModBlocks.MARBLE_STAIRS);
	public static final DeferredHolder<Item, Item> MARBLE_SLAB = block(TaleOfBiomesModBlocks.MARBLE_SLAB);
	public static final DeferredHolder<Item, Item> MARBLE_WALL = block(TaleOfBiomesModBlocks.MARBLE_WALL);
	public static final DeferredHolder<Item, Item> MARBLE_PRESSURE_PLATE = block(TaleOfBiomesModBlocks.MARBLE_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> MARBLE_BUTTON = block(TaleOfBiomesModBlocks.MARBLE_BUTTON);
	public static final DeferredHolder<Item, Item> COBBLED_MARBLE_STAIRS = block(TaleOfBiomesModBlocks.COBBLED_MARBLE_STAIRS);
	public static final DeferredHolder<Item, Item> COBBLED_MARBLE_SLAB = block(TaleOfBiomesModBlocks.COBBLED_MARBLE_SLAB);
	public static final DeferredHolder<Item, Item> COBBLED_MARBLE_WALL = block(TaleOfBiomesModBlocks.COBBLED_MARBLE_WALL);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_MARBLE_STAIRS = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_STAIRS);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_MARBLE_SLAB = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_SLAB);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_MARBLE_WALL = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_MARBLE_WALL);
	public static final DeferredHolder<Item, Item> POLISHED_MARBLE_STAIRS = block(TaleOfBiomesModBlocks.POLISHED_MARBLE_STAIRS);
	public static final DeferredHolder<Item, Item> POLISHED_MARBLE_SLAB = block(TaleOfBiomesModBlocks.POLISHED_MARBLE_SLAB);
	public static final DeferredHolder<Item, Item> POLISHED_MARBLE_WALL = block(TaleOfBiomesModBlocks.POLISHED_MARBLE_WALL);
	public static final DeferredHolder<Item, Item> BASALT = block(TaleOfBiomesModBlocks.BASALT);
	public static final DeferredHolder<Item, Item> BASALT_STAIRS = block(TaleOfBiomesModBlocks.BASALT_STAIRS);
	public static final DeferredHolder<Item, Item> BASALT_SLAB = block(TaleOfBiomesModBlocks.BASALT_SLAB);
	public static final DeferredHolder<Item, Item> BASALT_WALL = block(TaleOfBiomesModBlocks.BASALT_WALL);
	public static final DeferredHolder<Item, Item> BASALT_PRESSURE_PLATE = block(TaleOfBiomesModBlocks.BASALT_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> BASALT_BUTTON = block(TaleOfBiomesModBlocks.BASALT_BUTTON);
	public static final DeferredHolder<Item, Item> COBBLED_BASALT = block(TaleOfBiomesModBlocks.COBBLED_BASALT);
	public static final DeferredHolder<Item, Item> COBBLED_BASALT_STAIRS = block(TaleOfBiomesModBlocks.COBBLED_BASALT_STAIRS);
	public static final DeferredHolder<Item, Item> COBBLED_BASALT_SLAB = block(TaleOfBiomesModBlocks.COBBLED_BASALT_SLAB);
	public static final DeferredHolder<Item, Item> COBBLED_BASALT_WALL = block(TaleOfBiomesModBlocks.COBBLED_BASALT_WALL);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_BASALT = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_BASALT_STAIRS = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT_STAIRS);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_BASALT_SLAB = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT_SLAB);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_BASALT_WALL = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_BASALT_WALL);
	public static final DeferredHolder<Item, Item> POLISHED_BASALT = block(TaleOfBiomesModBlocks.POLISHED_BASALT);
	public static final DeferredHolder<Item, Item> POLISHED_BASALT_STAIRS = block(TaleOfBiomesModBlocks.POLISHED_BASALT_STAIRS);
	public static final DeferredHolder<Item, Item> POLISHED_BASALT_SLAB = block(TaleOfBiomesModBlocks.POLISHED_BASALT_SLAB);
	public static final DeferredHolder<Item, Item> POLISHED_BASALT_WALL = block(TaleOfBiomesModBlocks.POLISHED_BASALT_WALL);
	public static final DeferredHolder<Item, Item> SHALE = block(TaleOfBiomesModBlocks.SHALE);
	public static final DeferredHolder<Item, Item> SHALE_STAIRS = block(TaleOfBiomesModBlocks.SHALE_STAIRS);
	public static final DeferredHolder<Item, Item> SHALE_SLAB = block(TaleOfBiomesModBlocks.SHALE_SLAB);
	public static final DeferredHolder<Item, Item> SHALE_WALL = block(TaleOfBiomesModBlocks.SHALE_WALL);
	public static final DeferredHolder<Item, Item> SHALE_PRESSURE_PLATE = block(TaleOfBiomesModBlocks.SHALE_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> SHALE_BUTTON = block(TaleOfBiomesModBlocks.SHALE_BUTTON);
	public static final DeferredHolder<Item, Item> SHALE_FOSSIL = block(TaleOfBiomesModBlocks.SHALE_FOSSIL);
	public static final DeferredHolder<Item, Item> POLISHED_SHALE = block(TaleOfBiomesModBlocks.POLISHED_SHALE);
	public static final DeferredHolder<Item, Item> POLISHED_SHALE_STAIRS = block(TaleOfBiomesModBlocks.POLISHED_SHALE_STAIRS);
	public static final DeferredHolder<Item, Item> POLISHED_SHALE_SLAB = block(TaleOfBiomesModBlocks.POLISHED_SHALE_SLAB);
	public static final DeferredHolder<Item, Item> POLISHED_SHALE_WALL = block(TaleOfBiomesModBlocks.POLISHED_SHALE_WALL);
	public static final DeferredHolder<Item, Item> COBBLED_SHALE = block(TaleOfBiomesModBlocks.COBBLED_SHALE);
	public static final DeferredHolder<Item, Item> COBBLED_SHALE_STAIRS = block(TaleOfBiomesModBlocks.COBBLED_SHALE_STAIRS);
	public static final DeferredHolder<Item, Item> COBBLED_SHALE_SLAB = block(TaleOfBiomesModBlocks.COBBLED_SHALE_SLAB);
	public static final DeferredHolder<Item, Item> COBBLED_SHALE_WALL = block(TaleOfBiomesModBlocks.COBBLED_SHALE_WALL);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_SHALE = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_SHALE_STAIRS = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_STAIRS);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_SHALE_SLAB = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_SLAB);
	public static final DeferredHolder<Item, Item> MOSSY_COBBLED_SHALE_WALL = block(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_WALL);
	public static final DeferredHolder<Item, Item> BASIC_STONE_TABLE = block(TaleOfBiomesModBlocks.BASIC_STONE_TABLE);
<<<<<<< HEAD
	public static final DeferredHolder<Item, Item> PIRUFF_AXE_HEAD = REGISTRY.register("piruff_axe_head", () -> new PiruffAxeHeadItem());
	public static final DeferredHolder<Item, Item> PIRUFF_PICKAXE_HEAD = REGISTRY.register("piruff_pickaxe_head", () -> new PiruffPickaxeHeadItem());
	public static final DeferredHolder<Item, Item> PIRUFF_SHOVEL_HEAD = REGISTRY.register("piruff_shovel_head", () -> new PiruffShovelHeadItem());
	public static final DeferredHolder<Item, Item> PIRUFF_HOE_HEAD = REGISTRY.register("piruff_hoe_head", () -> new PiruffHoeHeadItem());
	public static final DeferredHolder<Item, Item> PIRUFF_SWORD_HEAD = REGISTRY.register("piruff_sword_head", () -> new PiruffSwordHeadItem());
	public static final DeferredHolder<Item, Item> PIRUFF_SICKLE_HEAD = REGISTRY.register("piruff_sickle_head", () -> new PiruffSickleHeadItem());
	public static final DeferredHolder<Item, Item> PIRUFF_AXE = REGISTRY.register("piruff_axe", () -> new PiruffAxeItem());
	public static final DeferredHolder<Item, Item> PIRUFF_HOE = REGISTRY.register("piruff_hoe", () -> new PiruffHoeItem());
	public static final DeferredHolder<Item, Item> PIRUFF_PICKAXE = REGISTRY.register("piruff_pickaxe", () -> new PiruffPickaxeItem());
	public static final DeferredHolder<Item, Item> PIRUFF_SHOVEL = REGISTRY.register("piruff_shovel", () -> new PiruffShovelItem());
	public static final DeferredHolder<Item, Item> PIRUFF_SICKLE = REGISTRY.register("piruff_sickle", () -> new PiruffSickleItem());
	public static final DeferredHolder<Item, Item> PIRUFF_SWORD = REGISTRY.register("piruff_sword", () -> new PiruffSwordItem());
	public static final DeferredHolder<Item, Item> PURE_COPPER_DUST = REGISTRY.register("pure_copper_dust", () -> new PureCopperDustItem());
	public static final DeferredHolder<Item, Item> MIXED_COPPER_DUST = REGISTRY.register("mixed_copper_dust", () -> new MixedCopperDustItem());
	public static final DeferredHolder<Item, Item> UNPURE_COPPER_DUST = REGISTRY.register("unpure_copper_dust", () -> new UnpureCopperDustItem());
	public static final DeferredHolder<Item, Item> PURE_COPPER_DUST_BLOCK = block(TaleOfBiomesModBlocks.PURE_COPPER_DUST_BLOCK);
	public static final DeferredHolder<Item, Item> MIXED_COPPER_DUST_BLOCK = block(TaleOfBiomesModBlocks.MIXED_COPPER_DUST_BLOCK);
	public static final DeferredHolder<Item, Item> UNPURE_COPPER_DUST_BLOCK = block(TaleOfBiomesModBlocks.UNPURE_COPPER_DUST_BLOCK);
=======
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredHolder<Item, Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void clientLoad(FMLClientSetupEvent event) {
			event.enqueueWork(() -> {
				ItemProperties.register(SEASON_DEVICE.get(), new ResourceLocation("tale_of_biomes:season_device_season_id"),
						(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) SeasonDevicePropertyValueProviderProcedure.execute(entity));
			});
		}
	}
}
