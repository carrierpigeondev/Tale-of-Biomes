package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class BasicStoneTableMenuWhileThisGUIIsOpenTick2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (BasicStoneTableMenuShaleStairsConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.SHALE_STAIRS.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuShaleSlabConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.SHALE_SLAB.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuShaleWallConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.SHALE_WALL.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuShalePressurePlateConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.SHALE_PRESSURE_PLATE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuShaleButtonConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.SHALE_BUTTON.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuCobbledShaleConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_SHALE.get()).copy();
				_setstack.setCount(4);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuPolishedShaleConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_SHALE.get()).copy();
				_setstack.setCount(9);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuCobbledShaleStairsConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_SHALE_STAIRS.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuCobbledShaleSlabConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_SHALE_SLAB.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuCobbledShaleWallConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.COBBLED_SHALE_WALL.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMossyCobbledShaleConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMossyCobbledShaleStairsConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_STAIRS.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMossyCobbledShaleSlabConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_SLAB.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuMossyCobbledShaleWallConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.MOSSY_COBBLED_SHALE_WALL.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuPolishedShaleStairsConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_SHALE_STAIRS.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuPolishedShaleSlabConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_SHALE_SLAB.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicStoneTableMenuPolishedShaleWallConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModBlocks.POLISHED_SHALE_WALL.get()).copy();
				_setstack.setCount(6);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
