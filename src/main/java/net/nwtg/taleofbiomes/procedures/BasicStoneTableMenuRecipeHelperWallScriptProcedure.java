package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;
import java.util.Map;

public class BasicStoneTableMenuRecipeHelperWallScriptProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String stone = "";
		ItemStack stoneItem = ItemStack.EMPTY;
		if ((entity.getCapability(TaleOfBiomesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TaleOfBiomesModVariables.PlayerVariables())).recipePage == 5) {
			stone = TaleOfBiomesModVariables.MapVariables.get(world).modNamespace + ":" + "basic_stone_table/wall";
			for (int index0 = 0; index0 < 32; index0++) {
				stoneItem = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation((stone).toLowerCase(java.util.Locale.ENGLISH)))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR)));
				if (!(stoneItem.getItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(13)).getItem() : ItemStack.EMPTY).getItem())) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(10)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(11)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(12)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = stoneItem;
						_setstack.setCount(1);
						((Slot) _slots.get(13)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = stoneItem;
						_setstack.setCount(1);
						((Slot) _slots.get(14)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = stoneItem;
						_setstack.setCount(1);
						((Slot) _slots.get(15)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = stoneItem;
						_setstack.setCount(1);
						((Slot) _slots.get(16)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = stoneItem;
						_setstack.setCount(1);
						((Slot) _slots.get(17)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = stoneItem;
						_setstack.setCount(1);
						((Slot) _slots.get(18)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					break;
				}
			}
		}
	}
}
