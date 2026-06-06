/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buddysmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.buddysmod.block.*;
import net.mcreator.buddysmod.BuddysmodMod;

public class BuddysmodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BuddysmodMod.MODID);
	public static final DeferredBlock<Block> LUCKY_BLOCK;
	public static final DeferredBlock<Block> LUCKY_ORE;
	public static final DeferredBlock<Block> REINFORCED_GLASS;
	public static final DeferredBlock<Block> RARE_LUCKY_BLOCK;
	public static final DeferredBlock<Block> FARMER_LUCKY_BLOCK;
	public static final DeferredBlock<Block> REDSTONE_LUCKY_BLOCK;
	public static final DeferredBlock<Block> DIAMOND_LUCKY_BLOCK_BLOCK;
	public static final DeferredBlock<Block> TROLL;
	public static final DeferredBlock<Block> LUCK_VERSE_PORTAL;
	public static final DeferredBlock<Block> WOOD_LUCKY_BLOCK;
	static {
		LUCKY_BLOCK = REGISTRY.register("lucky_block", LuckyBlockBlock::new);
		LUCKY_ORE = REGISTRY.register("lucky_ore", LuckyOreBlock::new);
		REINFORCED_GLASS = REGISTRY.register("reinforced_glass", ReinforcedGlassBlock::new);
		RARE_LUCKY_BLOCK = REGISTRY.register("rare_lucky_block", RareLuckyBlockBlock::new);
		FARMER_LUCKY_BLOCK = REGISTRY.register("farmer_lucky_block", FarmerLuckyBlockBlock::new);
		REDSTONE_LUCKY_BLOCK = REGISTRY.register("redstone_lucky_block", RedstoneLuckyBlockBlock::new);
		DIAMOND_LUCKY_BLOCK_BLOCK = REGISTRY.register("diamond_lucky_block_block", DiamondLuckyBlockBlockBlock::new);
		TROLL = REGISTRY.register("troll", TrollBlock::new);
		LUCK_VERSE_PORTAL = REGISTRY.register("luck_verse_portal", LuckVersePortalBlock::new);
		WOOD_LUCKY_BLOCK = REGISTRY.register("wood_lucky_block", WoodLuckyBlockBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}