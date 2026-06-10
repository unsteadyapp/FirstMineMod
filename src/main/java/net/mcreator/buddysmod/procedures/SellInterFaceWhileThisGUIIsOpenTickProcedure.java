package net.mcreator.buddysmod.procedures;

import org.checkerframework.checker.units.qual.s;

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
		String sub = "";
		double subindex = 0;
		if (!(Blocks.AIR.asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem())) {
			if ((BuiltInRegistries.ITEM.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()).toString())
					.contains(":")) {
				sub = (BuiltInRegistries.ITEM.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()).toString())
						.substring(1
								+ (BuiltInRegistries.ITEM.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem())
										.toString()).indexOf(":", 0));
				if (BuddysmodModVariables.MapVariables.get(world).blockName.contains(sub)) {
					subindex = BuddysmodModVariables.MapVariables.get(world).blockName.indexOf(sub);
					BuddysmodMod.LOGGER.warn((subindex + "" + (BuddysmodModVariables.MapVariables.get(world).blockValue.get((int) subindex) instanceof Double _doub10 ? _doub10 : 0.0D)));
					BuddysmodMod.LOGGER.warn(("As a string, looks like" + (BuddysmodModVariables.MapVariables.get(world).blockValue.get((int) subindex) instanceof String _str12 ? _str12 : "") + "As a converted number, looks like" + new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(BuddysmodModVariables.MapVariables.get(world).blockValue.get((int) subindex) instanceof String _str13 ? _str13 : "") + "this should be the name of the item"
							+ (BuddysmodModVariables.MapVariables.get(world).blockName.get((int) subindex) instanceof String _str14 ? _str14 : "") + "two sizes, should be the same" + BuddysmodModVariables.MapVariables.get(world).blockName.size()
							+ BuddysmodModVariables.MapVariables.get(world).blockValue.size()));
					{
						BuddysmodModVariables.PlayerVariables _vars = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES);
						_vars.Cash = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES).Cash + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(BuddysmodModVariables.MapVariables.get(world).blockValue.get((int) subindex) instanceof String _str18 ? _str18 : "");
						_vars.markSyncDirty();
					}
				} else {
					{
						BuddysmodModVariables.PlayerVariables _vars = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES);
						_vars.Cash = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES).Cash + 1;
						_vars.markSyncDirty();
					}
					BuddysmodMod.LOGGER.warn(("Failed to find: "
							+ (BuiltInRegistries.ITEM.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu19 ? _menu19.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem())
									.toString())
							+ ((BuiltInRegistries.ITEM.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu21 ? _menu21.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem())
									.toString())
									.substring(1 + (BuiltInRegistries.ITEM
											.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu23 ? _menu23.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()).toString())
											.indexOf(":", 0)))));
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu) {
					_menu.getSlots().get(0).remove(1);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				{
					BuddysmodModVariables.PlayerVariables _vars = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES);
					_vars.Cash = entity.getData(BuddysmodModVariables.PLAYER_VARIABLES).Cash + 1;
					_vars.markSyncDirty();
				}
				BuddysmodMod.LOGGER.warn(("Failed to find semicoloin in while text is: " + (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof BuddysmodModMenus.MenuAccessor _menu27 ? _menu27.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()).toString())));
			}
		}
	}
}