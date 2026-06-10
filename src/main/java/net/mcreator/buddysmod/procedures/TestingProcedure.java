package net.mcreator.buddysmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.buddysmod.BuddysmodMod;

public class TestingProcedure {
	public static void execute(LevelAccessor world) {
		BuddysmodMod.LOGGER.warn("Message");
		if (world instanceof ServerLevel _level)
			_level.setDayTime(1);
	}
}