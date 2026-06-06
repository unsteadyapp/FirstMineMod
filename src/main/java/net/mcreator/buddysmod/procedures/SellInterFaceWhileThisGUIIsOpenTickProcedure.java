package net.mcreator.buddysmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.buddysmod.network.BuddysmodModVariables;
import net.mcreator.buddysmod.init.BuddysmodModMenus;

public class SellInterFaceWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(Blocks.AIR.asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem())) {
			if (entity instanceof Player _player && _player.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				BuddysmodModVariables.PlayerVariables _vars = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES);
				_vars.Cash = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES).Cash + 1;
				_vars.markSyncDirty();
			}
		}
	}
}