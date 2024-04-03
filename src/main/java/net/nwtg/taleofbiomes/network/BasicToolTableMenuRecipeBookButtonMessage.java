
package net.nwtg.taleofbiomes.network;

import net.nwtg.taleofbiomes.world.inventory.BasicToolTableMenuRecipeBookMenu;
import net.nwtg.taleofbiomes.procedures.BasicToolTableMenuRecipeHelperForwardButtonProcedure;
import net.nwtg.taleofbiomes.procedures.BasicToolTableMenuRecipeHelperButtonCloseProcedure;
import net.nwtg.taleofbiomes.procedures.BasicToolTableMenuRecipeHelperBackButtonProcedure;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BasicToolTableMenuRecipeBookButtonMessage {
	private final int buttonID, x, y, z;

	public BasicToolTableMenuRecipeBookButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BasicToolTableMenuRecipeBookButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BasicToolTableMenuRecipeBookButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BasicToolTableMenuRecipeBookButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BasicToolTableMenuRecipeBookMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BasicToolTableMenuRecipeHelperBackButtonProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			BasicToolTableMenuRecipeHelperForwardButtonProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			BasicToolTableMenuRecipeHelperButtonCloseProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TaleOfBiomesMod.addNetworkMessage(BasicToolTableMenuRecipeBookButtonMessage.class, BasicToolTableMenuRecipeBookButtonMessage::buffer, BasicToolTableMenuRecipeBookButtonMessage::new, BasicToolTableMenuRecipeBookButtonMessage::handler);
	}
}
