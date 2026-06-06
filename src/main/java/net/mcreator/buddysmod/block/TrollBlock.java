package net.mcreator.buddysmod.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class TrollBlock extends Block {
	public TrollBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("buddysmod:sounds")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone.step")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone.place")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone.hit")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone.fall"))))
				.strength(0.2f, 10f));
	}
}