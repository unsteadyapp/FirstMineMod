/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buddysmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.buddysmod.world.inventory.SellInterFaceMenu;
import net.mcreator.buddysmod.world.inventory.BuyGuiMenu;
import net.mcreator.buddysmod.network.MenuStateUpdateMessage;
import net.mcreator.buddysmod.BuddysmodMod;

import java.util.Map;

public class BuddysmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, BuddysmodMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<SellInterFaceMenu>> SELL_INTER_FACE = REGISTRY.register("sell_inter_face", () -> IMenuTypeExtension.create(SellInterFaceMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BuyGuiMenu>> BUY_GUI = REGISTRY.register("buy_gui", () -> IMenuTypeExtension.create(BuyGuiMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof BuddysmodModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				PacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}