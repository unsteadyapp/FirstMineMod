package net.mcreator.buddysmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.buddysmod.network.BuddysmodModVariables;
import net.mcreator.buddysmod.init.BuddysmodModMenus;
import net.mcreator.buddysmod.BuddysmodMod;

public class SellInterFaceWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(Blocks.AIR.asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem())) {
			if (BuddysmodModVariables.WorldVariables.get(world).blockName.contains((BuiltInRegistries.ITEM
					.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()).toString()))) {
				{
					BuddysmodModVariables.PlayerVariables _vars = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES);
					_vars.Cash = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES).Cash + (BuddysmodModVariables.WorldVariables.get(world).blockValue.get((int) BuddysmodModVariables.WorldVariables.get(world).blockName.indexOf(
							(BuiltInRegistries.ITEM.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu5 ? _menu5.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem())
									.toString()))) instanceof Double _doub8 ? _doub8 : 0.0D);
					_vars.markSyncDirty();
				}
			} else {
				{
					BuddysmodModVariables.PlayerVariables _vars = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES);
					_vars.Cash = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES).Cash + 1;
					_vars.markSyncDirty();
				}
				BuddysmodMod.LOGGER.warn(("Failed to find: " + (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()).toString())));
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}