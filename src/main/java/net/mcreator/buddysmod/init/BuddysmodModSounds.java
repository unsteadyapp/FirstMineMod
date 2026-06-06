/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buddysmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.buddysmod.BuddysmodMod;

public class BuddysmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, BuddysmodMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> SOUNDS = REGISTRY.register("sounds", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("buddysmod", "sounds")));
}