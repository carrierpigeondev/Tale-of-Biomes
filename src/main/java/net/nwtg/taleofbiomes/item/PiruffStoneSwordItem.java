
package net.nwtg.taleofbiomes.item;

import net.nwtg.taleofbiomes.procedures.PiruffStoneAxeBlockDestroyedWithToolProcedure;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

public class PiruffStoneSwordItem extends SwordItem {
	public PiruffStoneSwordItem() {
		super(new Tier() {
			public int getUses() {
<<<<<<< HEAD
				return 40;
=======
				return 35;
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.4f, new Item.Properties());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		PiruffStoneAxeBlockDestroyedWithToolProcedure.execute(entity, itemstack);
		return retval;
	}
}
