
package net.nwtg.taleofbiomes.network;

import net.nwtg.taleofbiomes.world.inventory.BasicStoneTableMenuRecipeBookMenu;
import net.nwtg.taleofbiomes.procedures.BasicStoneTableMenuRecipeHelperForwardButtonProcedure;
import net.nwtg.taleofbiomes.procedures.BasicStoneTableMenuRecipeHelperButtonCloseProcedure;
import net.nwtg.taleofbiomes.procedures.BasicStoneTableMenuRecipeHelperBackButtonProcedure;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record BasicStoneTableMenuRecipeBookButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<BasicStoneTableMenuRecipeBookButtonMessage> TYPE = new Type<>(new ResourceLocation(TaleOfBiomesMod.MODID, "basic_stone_table_menu_recipe_book_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, BasicStoneTableMenuRecipeBookButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, BasicStoneTableMenuRecipeBookButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new BasicStoneTableMenuRecipeBookButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<BasicStoneTableMenuRecipeBookButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final BasicStoneTableMenuRecipeBookButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BasicStoneTableMenuRecipeBookMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BasicStoneTableMenuRecipeHelperBackButtonProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			BasicStoneTableMenuRecipeHelperForwardButtonProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			BasicStoneTableMenuRecipeHelperButtonCloseProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TaleOfBiomesMod.addNetworkMessage(BasicStoneTableMenuRecipeBookButtonMessage.TYPE, BasicStoneTableMenuRecipeBookButtonMessage.STREAM_CODEC, BasicStoneTableMenuRecipeBookButtonMessage::handleData);
	}
}
