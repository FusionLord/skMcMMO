package net.fusionlord.bukkit.skmcmmo.register;

import ch.njol.skript.classes.SerializableGetter;
import ch.njol.skript.registrations.EventValues;
import net.fusionlord.bukkit.skmcmmo.events.skript.EvtMcMMOLevelUp;
import net.fusionlord.bukkit.skmcmmo.util.doc.Element;
import net.fusionlord.bukkit.skmcmmo.util.doc.Type;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class EventValue
{
	public static void registerEventValues()
	{
		List<Element> es = new ArrayList<>();

		es.add(new Element(Type.EVENT_VALUE).name("[on McMMO] event-player"));
		EventValues.registerEventValue(
				EvtMcMMOLevelUp.class, Player.class, new SerializableGetter<Player, EvtMcMMOLevelUp>()
				{
					public Player get(EvtMcMMOLevelUp event)
					{
						return event.getPlayer();
					}
				}, 0
		);

		es.add(new Element(Type.EVENT_VALUE).name("[on McMMO] event-skill"));
		EventValues.registerEventValue(
				EvtMcMMOLevelUp.class, String.class, new SerializableGetter<String, EvtMcMMOLevelUp>()
				{
					public String get(EvtMcMMOLevelUp event)
					{
						return event.getSkill().getName();
					}
				}, 0
		);

		es.add(new Element(Type.EVENT_VALUE).name("[on McMMO] event-level"));
		EventValues.registerEventValue(
				EvtMcMMOLevelUp.class, Integer.class, new SerializableGetter<Integer, EvtMcMMOLevelUp>()
				{
					public Integer get(EvtMcMMOLevelUp event)
					{
						return event.getSkillLevel();
					}
				}, 0
		);

		RegisterManager.registerEventValues(es);
	}
}
