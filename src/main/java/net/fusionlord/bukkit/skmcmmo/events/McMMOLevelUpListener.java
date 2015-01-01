package net.fusionlord.bukkit.skmcmmo.events;

import com.gmail.nossr50.events.experience.McMMOPlayerLevelUpEvent;
import net.fusionlord.bukkit.skmcmmo.classes.Skill;
import net.fusionlord.bukkit.skmcmmo.events.skript.EvtMcMMOLevelUp;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class McMMOLevelUpListener implements Listener
{
	@EventHandler
	public void onPlayerLevelUp(final McMMOPlayerLevelUpEvent event)
	{
		EvtMcMMOLevelUp mmoEvent = new EvtMcMMOLevelUp(
				event.getPlayer(), new Skill(
				event.getSkill(),
				event.getSkillLevel()
		)
		);
		Bukkit.getServer().getPluginManager().callEvent(mmoEvent);
		event.setCancelled(mmoEvent.isCancelled());
	}
}
