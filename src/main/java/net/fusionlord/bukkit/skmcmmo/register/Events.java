package net.fusionlord.bukkit.skmcmmo.register;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.util.SimpleEvent;
import net.fusionlord.bukkit.skmcmmo.events.skript.EvtMcMMOLevelUp;

public class Events
{
	public static void registerEvents()
	{
		Skript.registerEvent("on McMMO", SimpleEvent.class, EvtMcMMOLevelUp.class, "[on] [mcmmo-]level[-up]");
	}
}
