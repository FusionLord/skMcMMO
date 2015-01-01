package net.fusionlord.bukkit.skmcmmo.register;

import net.fusionlord.bukkit.skmcmmo.util.doc.Documentation;
import net.fusionlord.bukkit.skmcmmo.util.doc.Element;
import org.bukkit.event.Event;
import ch.njol.skript.Skript;
import ch.njol.skript.lang.util.SimpleEvent;

import java.util.List;

public class RegisterManager
{
	public static <E extends Event> void registerEvent(Element e, Class<E> c)
	{
		String[] usage = e.getRegisterUsage();
		for (int i = 0; i < usage.length; i++)
		{
			usage[i] = usage[i].replace("on ", "").replace(":", "");
		}
		Skript.registerEvent(e.getName(), SimpleEvent.class, c, usage);
		Documentation.addElement(e);
	}

	public static void registerEventValues(List<Element> es)
	{
		for(Element e : es)
		{
			Documentation.addElement(e);
		}
	}

}