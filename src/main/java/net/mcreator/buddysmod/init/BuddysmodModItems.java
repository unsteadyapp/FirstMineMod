/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buddysmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.buddysmod.item.*;
import net.mcreator.buddysmod.BuddysmodMod;

public class BuddysmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BuddysmodMod.MODID);
	public static final DeferredItem<Item> LUCKY_BLOCK;
	public static final DeferredItem<Item> LUCKY_CORE;
	public static final DeferredItem<Item> LUCKY_ORE;
	public static final DeferredItem<Item> REINFORCED_GLASS;
	public static final DeferredItem<Item> RARE_LUCKY_BLOCK;
	public static final DeferredItem<Item> FARMER_LUCKY_BLOCK;
	public static final DeferredItem<Item> REDSTONE_LUCKY_BLOCK;
	public static final DeferredItem<Item> BOWY;
	public static final DeferredItem<Item> STRAFER;
	public static final DeferredItem<Item> REALLY_LONG_STICK;
	public static final DeferredItem<Item> DIAMOND_LUCKY_BLOCK_BLOCK;
	public static final DeferredItem<Item> EXPLOSIVE_PICKAXE;
	public static final DeferredItem<Item> SMELT_PICKAXE;
	public static final DeferredItem<Item> DIRT_ARMOR_HELMET;
	public static final DeferredItem<Item> DIRT_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> DIRT_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> DIRT_ARMOR_BOOTS;
	public static final DeferredItem<Item> TROLL;
	public static final DeferredItem<Item> COOKED_FLESHED;
	public static final DeferredItem<Item> KIT;
	public static final DeferredItem<Item> BOUNCY_HAMMER;
	public static final DeferredItem<Item> LUCK_VERSE;
	public static final DeferredItem<Item> NATRURE_RECLAIMER;
	public static final DeferredItem<Item> WOOD_LUCKY_BLOCK;
	static {
		LUCKY_BLOCK = block(BuddysmodModBlocks.LUCKY_BLOCK);
		LUCKY_CORE = REGISTRY.register("lucky_core", LuckyCoreItem::new);
		LUCKY_ORE = block(BuddysmodModBlocks.LUCKY_ORE);
		REINFORCED_GLASS = block(BuddysmodModBlocks.REINFORCED_GLASS);
		RARE_LUCKY_BLOCK = block(BuddysmodModBlocks.RARE_LUCKY_BLOCK);
		FARMER_LUCKY_BLOCK = block(BuddysmodModBlocks.FARMER_LUCKY_BLOCK);
		REDSTONE_LUCKY_BLOCK = block(BuddysmodModBlocks.REDSTONE_LUCKY_BLOCK);
		BOWY = REGISTRY.register("bowy", BowyItem::new);
		STRAFER = REGISTRY.register("strafer", StraferItem::new);
		REALLY_LONG_STICK = REGISTRY.register("really_long_stick", ReallyLongStickItem::new);
		DIAMOND_LUCKY_BLOCK_BLOCK = block(BuddysmodModBlocks.DIAMOND_LUCKY_BLOCK_BLOCK);
		EXPLOSIVE_PICKAXE = REGISTRY.register("explosive_pickaxe", ExplosivePickaxeItem::new);
		SMELT_PICKAXE = REGISTRY.register("smelt_pickaxe", SmeltPickaxeItem::new);
		DIRT_ARMOR_HELMET = REGISTRY.register("dirt_armor_helmet", DirtArmorItem.Helmet::new);
		DIRT_ARMOR_CHESTPLATE = REGISTRY.register("dirt_armor_chestplate", DirtArmorItem.Chestplate::new);
		DIRT_ARMOR_LEGGINGS = REGISTRY.register("dirt_armor_leggings", DirtArmorItem.Leggings::new);
		DIRT_ARMOR_BOOTS = REGISTRY.register("dirt_armor_boots", DirtArmorItem.Boots::new);
		TROLL = block(BuddysmodModBlocks.TROLL);
		COOKED_FLESHED = REGISTRY.register("cooked_fleshed", CookedFleshedItem::new);
		KIT = REGISTRY.register("kit", KitItem::new);
		BOUNCY_HAMMER = REGISTRY.register("bouncy_hammer", BouncyHammerItem::new);
		LUCK_VERSE = REGISTRY.register("luck_verse", LuckVerseItem::new);
		NATRURE_RECLAIMER = REGISTRY.register("natrure_reclaimer", NatrureReclaimerItem::new);
		WOOD_LUCKY_BLOCK = block(BuddysmodModBlocks.WOOD_LUCKY_BLOCK);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}