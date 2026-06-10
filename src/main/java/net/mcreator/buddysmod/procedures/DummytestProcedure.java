package net.mcreator.buddysmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.buddysmod.network.BuddysmodModVariables;

public class DummytestProcedure {
	public static void execute(LevelAccessor world) {
		BuddysmodModVariables.WorldVariables.get(world).dummy = 0;
		BuddysmodModVariables.WorldVariables.get(world).markSyncDirty();
	}
}