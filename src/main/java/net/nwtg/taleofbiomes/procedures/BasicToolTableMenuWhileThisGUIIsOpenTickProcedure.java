package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModItems;

<<<<<<< HEAD
=======
import net.minecraft.world.level.block.Blocks;
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class BasicToolTableMenuWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
<<<<<<< HEAD
		if (BasicToolTableMenuStoneHeadAxeConditionProcedure.execute(world, entity)) {
=======
		if (BasicToolTableMenuStoneAxeHeadConditionProcedure.execute(world, entity)) {
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.STONE_AXE_HEAD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
<<<<<<< HEAD
		} else if (BasicToolTableMenuStoneHeadHoeConditionProcedure.execute(world, entity)) {
=======
		} else if (BasicToolTableMenuStoneHoeHeadConditionProcedure.execute(world, entity)) {
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.STONE_HOE_HEAD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
<<<<<<< HEAD
		} else if (BasicToolTableMenuStoneHeadPickaxeConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.STONE_PICKAXE_HEAD.get()).copy();
=======
		} else if (BasicToolTableMenuStoneSwordHeadConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.STONE_SWORD_HEAD.get()).copy();
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
<<<<<<< HEAD
		} else if (BasicToolTableMenuStoneHeadShovelConditionProcedure.execute(world, entity)) {
=======
		} else if (BasicToolTableMenuStoneShovelHeadConditionProcedure.execute(world, entity)) {
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.STONE_SHOVEL_HEAD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
<<<<<<< HEAD
		} else if (BasicToolTableMenuStoneHeadSickleConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.STONE_SICKLE_HEAD.get()).copy();
=======
		} else if (BasicToolTableMenuStonePickaxeHeadConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.STONE_PICKAXE_HEAD.get()).copy();
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
<<<<<<< HEAD
		} else if (BasicToolTableMenuStoneHeadSwordConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.STONE_SWORD_HEAD.get()).copy();
=======
		} else if (BasicToolTableMenuStoneSickleHeadConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.STONE_SICKLE_HEAD.get()).copy();
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffGripConditionProcedure.execute(world, entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_GRIP.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffStoneAxeConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_STONE_AXE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffStonePickaxeConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_STONE_PICKAXE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffStoneShovelConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_STONE_SHOVEL.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffStoneHoeConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_STONE_HOE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffStoneSwordConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_STONE_SWORD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BasicToolTableMenuPiruffStoneSickleConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(TaleOfBiomesModItems.PIRUFF_STONE_SICKLE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
<<<<<<< HEAD
			BasicToolTableMenuWhileThisGUIIsOpenTick1Procedure.execute(world, entity);
=======
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(9)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
		}
	}
}
