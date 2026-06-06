package net.mcreator.buddysmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class LuckyOreBlock extends Block {
	public LuckyOreBlock() {
		super(BlockBehaviour.Properties.of().strength(2.2f, 14f).requiresCorrectToolForDrops());
	}
}