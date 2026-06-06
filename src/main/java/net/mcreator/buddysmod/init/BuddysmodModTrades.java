/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.buddysmod.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class BuddysmodModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == BuddysmodModVillagerProfessions.LUCKY_GUY.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(BuddysmodModBlocks.LUCKY_BLOCK.get()), 10, 5, 0.05f));
		}
		if (event.getType() == BuddysmodModVillagerProfessions.LUCKY_GUY.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(BuddysmodModItems.LUCKY_CORE.get()), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
		}
		if (event.getType() == BuddysmodModVillagerProfessions.LUCKY_GUY.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(BuddysmodModBlocks.RARE_LUCKY_BLOCK.get()), 10, 5, 0.05f));
		}
		if (event.getType() == BuddysmodModVillagerProfessions.LUCKY_GUY.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack(BuddysmodModBlocks.FARMER_LUCKY_BLOCK.get()), 10, 5, 0.05f));
		}
		if (event.getType() == BuddysmodModVillagerProfessions.LUCKY_GUY.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.END_CRYSTAL), new ItemStack(BuddysmodModBlocks.RARE_LUCKY_BLOCK.get(), 64), 10, 5, 0.05f));
		}
		if (event.getType() == BuddysmodModVillagerProfessions.LUCKY_GUY.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 15), new ItemStack(BuddysmodModBlocks.REDSTONE_LUCKY_BLOCK.get()), 10, 5, 0.05f));
		}
	}
}