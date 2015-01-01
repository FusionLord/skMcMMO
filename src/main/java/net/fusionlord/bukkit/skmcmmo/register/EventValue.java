package net.fusionlord.bukkit.skmcmmo.register;

import ch.njol.skript.classes.SerializableGetter;
import ch.njol.skript.registrations.EventValues;
import net.fusionlord.bukkit.skmcmmo.classes.Skill;
import net.fusionlord.bukkit.skmcmmo.events.skript.EvtMcMMOLevelUp;
import org.bukkit.entity.Player;

public class EventValue
{
	public static void registerEventValues()
	{
		EventValues.registerEventValue(
				EvtMcMMOLevelUp.class, Player.class, new SerializableGetter<Player, EvtMcMMOLevelUp>()
				{
					public Player get(EvtMcMMOLevelUp event)
					{
						return event.getPlayer();
					}
				}, 0
		);

		EventValues.registerEventValue(
				EvtMcMMOLevelUp.class, Skill.class, new SerializableGetter<Skill, EvtMcMMOLevelUp>()
				{
					public Skill get(EvtMcMMOLevelUp event)
					{
						return event.getSkill();
					}
				}, 0
		);
	}
}
