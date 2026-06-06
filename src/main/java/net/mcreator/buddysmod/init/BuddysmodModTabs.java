/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buddysmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.buddysmod.BuddysmodMod;

@EventBusSubscriber
public class BuddysmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BuddysmodMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BuddysmodModItems.STRAFER.get());
			tabData.accept(BuddysmodModItems.REALLY_LONG_STICK.get());
			tabData.accept(BuddysmodModItems.EXPLOSIVE_PICKAXE.get());
			tabData.accept(BuddysmodModItems.SMELT_PICKAXE.get());
			tabData.accept(BuddysmodModItems.BOUNCY_HAMMER.get());
			tabData.accept(BuddysmodModItems.LUCK_VERSE.get());
			tabData.accept(BuddysmodModItems.NATRURE_RECLAIMER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BuddysmodModItems.DIRT_ARMOR_HELMET.get());
			tabData.accept(BuddysmodModItems.DIRT_ARMOR_CHESTPLATE.get());
			tabData.accept(BuddysmodModItems.DIRT_ARMOR_LEGGINGS.get());
			tabData.accept(BuddysmodModItems.DIRT_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
			tabData.accept(BuddysmodModBlocks.WOOD_LUCKY_BLOCK.get().asItem());
		}
	}
}