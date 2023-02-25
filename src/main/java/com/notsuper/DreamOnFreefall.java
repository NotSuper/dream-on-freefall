package com.notsuper;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class DreamOnFreefall implements ModInitializer {
	public static final String MOD_ID = "dream-on-freefall";
	public static final Logger LOGGER = LoggerFactory.getLogger("dream-on-freefall");

	public static final Identifier SOUND_ID = new Identifier("kratosreference:dream_on");
	public static SoundEvent SOUND_EVENT = SoundEvent.of(SOUND_ID);

	@Override
	public void onInitialize() {
		Registry.register(Registries.SOUND_EVENT, SOUND_ID, SOUND_EVENT);
	}

	public static void playSong() {

	}
}