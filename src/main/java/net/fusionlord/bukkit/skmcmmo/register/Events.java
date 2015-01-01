package net.fusionlord.bukkit.skmcmmo.register;

import net.fusionlord.bukkit.skmcmmo.events.skript.EvtMcMMOLevelUp;
import net.fusionlord.bukkit.skmcmmo.util.doc.Element;
import net.fusionlord.bukkit.skmcmmo.util.doc.Type;

public class Events
{

	public static void registerEvents()
	{
		RegisterManager.registerEvent(new Element(Type.EVENT)
											  .name("on McMMO")
											  .version("1.0")
											  .desc("Called when a player levels in mcmmo")
											  .example(new String[]{
															   "on mcmmo-level-up:",
															   "	send ''%event-player% leveled up %event-skill% to %event-skill-level%'' to event-player"
													   })
											  .usage(new String[]{
															 "on [mcmmo-]level[-up]:"
													 })
				, EvtMcMMOLevelUp.class);
	}
}
