package net.mcreator.buddysmod.network;

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
import net.minecraft.core.SectionPos;

import net.mcreator.buddysmod.procedures.SellOnKeyPressedProcedure;
import net.mcreator.buddysmod.BuddysmodMod;

@EventBusSubscriber
public record SellMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<SellMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(BuddysmodMod.MODID, "key_sell"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SellMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SellMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new SellMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<SellMessage> type() {
		return TYPE;
	}

	public static void handleData(final SellMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.getChunkSource().hasChunk(SectionPos.blockToSectionCoord(x), SectionPos.blockToSectionCoord(z)))
			return;
		if (type == 0) {

			SellOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		BuddysmodMod.addNetworkMessage(SellMessage.TYPE, SellMessage.STREAM_CODEC, SellMessage::handleData);
	}
}