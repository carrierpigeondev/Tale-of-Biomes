
package net.nwtg.taleofbiomes.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MixedCopperDustItem extends Item {
	public MixedCopperDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A78A common mineral dust"));
		list.add(Component.literal("\u00A78found across Eldenmoor!"));
		list.add(Component.literal("\u00A7fThis resource is \u00A7eMIXED\u00A7f!"));
	}
}
