/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buddysmod.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.buddysmod.client.gui.SellInterFaceScreen;
import net.mcreator.buddysmod.client.gui.BuyGuiScreen;

@EventBusSubscriber(Dist.CLIENT)
public class BuddysmodModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(BuddysmodModMenus.SELL_INTER_FACE.get(), SellInterFaceScreen::new);
		event.register(BuddysmodModMenus.BUY_GUI.get(), BuyGuiScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}