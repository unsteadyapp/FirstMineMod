package net.mcreator.buddysmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.buddysmod.init.BuddysmodModItems;
import net.mcreator.buddysmod.BuddysmodMod;

public class ReallyLongStickToolInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (3 == (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.ENTITY_INTERACTION_RANGE) ? _livingEntity0.getAttribute(Attributes.ENTITY_INTERACTION_RANGE).getBaseValue() : 0)) {
			if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ENTITY_INTERACTION_RANGE))
				_livingEntity1.getAttribute(Attributes.ENTITY_INTERACTION_RANGE).setBaseValue(6);
		} else {
			BuddysmodMod.queueServerWork(20, () -> {
				if (!(BuddysmodModItems.REALLY_LONG_STICK.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem())) {
					if (6 == (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.ENTITY_INTERACTION_RANGE) ? _livingEntity4.getAttribute(Attributes.ENTITY_INTERACTION_RANGE).getBaseValue() : 0)) {
						if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.ENTITY_INTERACTION_RANGE))
							_livingEntity5.getAttribute(Attributes.ENTITY_INTERACTION_RANGE).setBaseValue(3);
					}
				}
			});
		}
	}
}