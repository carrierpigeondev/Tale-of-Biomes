package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

public class InventoryReplaceEldenmoorScriptProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot0.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot0.getCount());
			_modHandler.setStackInSlot(0, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot1.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot1.getCount());
			_modHandler.setStackInSlot(1, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot2.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot2.getCount());
			_modHandler.setStackInSlot(2, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot3.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot3.getCount());
			_modHandler.setStackInSlot(3, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot4.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot4.getCount());
			_modHandler.setStackInSlot(4, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot5.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot5.getCount());
			_modHandler.setStackInSlot(5, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot6.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot6.getCount());
			_modHandler.setStackInSlot(6, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot7.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot7.getCount());
			_modHandler.setStackInSlot(7, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot8.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot8.getCount());
			_modHandler.setStackInSlot(8, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot9.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot9.getCount());
			_modHandler.setStackInSlot(9, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot10.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot10.getCount());
			_modHandler.setStackInSlot(10, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot11.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot11.getCount());
			_modHandler.setStackInSlot(11, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot12.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot12.getCount());
			_modHandler.setStackInSlot(12, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot13.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot13.getCount());
			_modHandler.setStackInSlot(13, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot14.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot14.getCount());
			_modHandler.setStackInSlot(14, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot15.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot15.getCount());
			_modHandler.setStackInSlot(15, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot16.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot16.getCount());
			_modHandler.setStackInSlot(16, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot17.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot17.getCount());
			_modHandler.setStackInSlot(17, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot18.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot18.getCount());
			_modHandler.setStackInSlot(18, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot19.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot19.getCount());
			_modHandler.setStackInSlot(19, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot20.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot20.getCount());
			_modHandler.setStackInSlot(20, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot21.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot21.getCount());
			_modHandler.setStackInSlot(21, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot22.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot22.getCount());
			_modHandler.setStackInSlot(22, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot23.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot23.getCount());
			_modHandler.setStackInSlot(23, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot24.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot24.getCount());
			_modHandler.setStackInSlot(24, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot25.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot25.getCount());
			_modHandler.setStackInSlot(25, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot26.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot26.getCount());
			_modHandler.setStackInSlot(26, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot27.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot27.getCount());
			_modHandler.setStackInSlot(27, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot28.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot28.getCount());
			_modHandler.setStackInSlot(28, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot29.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot29.getCount());
			_modHandler.setStackInSlot(29, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot30.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot30.getCount());
			_modHandler.setStackInSlot(30, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot31.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot31.getCount());
			_modHandler.setStackInSlot(31, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot32.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot32.getCount());
			_modHandler.setStackInSlot(32, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot33.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot33.getCount());
			_modHandler.setStackInSlot(33, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot34.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot34.getCount());
			_modHandler.setStackInSlot(34, _setstack);
		}
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot35.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot35.getCount());
			_modHandler.setStackInSlot(35, _setstack);
		}
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot36.copy();
			_setstack.setCount(entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot36.getCount());
			_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(0, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot37);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.FEET, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot37);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(1, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot38);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.LEGS, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot38);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(2, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot39);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.CHEST, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot39);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(3, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot40);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES).eldenmoorSlot40);
			}
		}
	}
}
