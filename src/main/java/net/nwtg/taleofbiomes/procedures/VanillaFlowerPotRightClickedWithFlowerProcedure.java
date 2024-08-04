package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.init.TaleOfBiomesModBlocks;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@EventBusSubscriber
public class VanillaFlowerPotRightClickedWithFlowerProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		BlockState blockToReplace = Blocks.AIR.defaultBlockState();
		boolean replaceBlock = false;
		ItemStack mainhandItem = ItemStack.EMPTY;
		if (blockstate.getBlock() == Blocks.FLOWER_POT) {
			mainhandItem = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			replaceBlock = true;
			if (mainhandItem.getItem() == TaleOfBiomesModBlocks.BLUE_ASTER.get().asItem()) {
				blockToReplace = TaleOfBiomesModBlocks.BLUE_ASTER_FLOWER_POT.get().defaultBlockState();
			} else if (mainhandItem.getItem() == TaleOfBiomesModBlocks.PURPLE_ASTER.get().asItem()) {
				blockToReplace = TaleOfBiomesModBlocks.PURPLE_ASTER_FLOWER_POT.get().defaultBlockState();
			} else if (mainhandItem.getItem() == TaleOfBiomesModBlocks.MAGENTA_ASTER.get().asItem()) {
				blockToReplace = TaleOfBiomesModBlocks.MAGENTA_ASTER_FLOWER_POT.get().defaultBlockState();
			} else if (mainhandItem.getItem() == TaleOfBiomesModBlocks.GOLDENROD.get().asItem()) {
				blockToReplace = TaleOfBiomesModBlocks.GOLDENROD_FLOWER_POT.get().defaultBlockState();
			} else if (mainhandItem.getItem() == TaleOfBiomesModBlocks.WILD_INDIGO.get().asItem()) {
				blockToReplace = TaleOfBiomesModBlocks.WILD_INDIGO_FLOWER_POT.get().defaultBlockState();
			} else {
				replaceBlock = false;
			}
			if (replaceBlock) {
				if (mainhandItem.getCount() > 1) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = mainhandItem.copy();
						_setstack.setCount((int) (mainhandItem.getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = blockToReplace;
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
