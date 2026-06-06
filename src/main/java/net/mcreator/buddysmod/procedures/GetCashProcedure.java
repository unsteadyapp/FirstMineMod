package net.mcreator.buddysmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.buddysmod.network.BuddysmodModVariables;

public class GetCashProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Cash: " + entity.getData(BuddysmodModVariables.PLAYER_VARIABLES).Cash;
	}
}