package net.nwtg.taleofbiomes.procedures;

import net.nwtg.taleofbiomes.world.inventory.BasicToolTableMenuMenu;
<<<<<<< HEAD
import net.nwtg.taleofbiomes.network.TaleOfBiomesModVariables;
=======
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import io.netty.buffer.Unpooled;

public class BasicToolTableMenuRecipeHelperButtonCloseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
<<<<<<< HEAD
		{
			TaleOfBiomesModVariables.PlayerVariables _vars = entity.getData(TaleOfBiomesModVariables.PLAYER_VARIABLES);
			_vars.recipeHelperUpdateTimer = 0;
			_vars.syncPlayerVariables(entity);
		}
=======
>>>>>>> dc78bc576cac33261a34dd844807db5157120f1a
		if (entity instanceof ServerPlayer _ent) {
			BlockPos _bpos = BlockPos.containing(x, y, z);
			_ent.openMenu(new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("BasicToolTableMenu");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new BasicToolTableMenuMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
				}
			}, _bpos);
		}
	}
}
