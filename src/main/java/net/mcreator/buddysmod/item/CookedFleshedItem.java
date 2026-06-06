package net.mcreator.buddysmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.buddysmod.procedures.CookedFleshedPlayerFinishesUsingItemProcedure;

public class CookedFleshedItem extends Item {
	public CookedFleshedItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.3f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		CookedFleshedPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}