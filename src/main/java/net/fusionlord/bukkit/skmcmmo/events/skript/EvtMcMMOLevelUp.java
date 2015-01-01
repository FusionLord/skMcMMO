package net.fusionlord.bukkit.skmcmmo.events.skript;

import com.gmail.nossr50.datatypes.skills.SkillType;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class EvtMcMMOLevelUp extends Event implements Cancellable
{
	private static final HandlerList handlers = new HandlerList();

	private Player player;
	private SkillType skill;
	private int skillLevel;
	private boolean canceled;

	public EvtMcMMOLevelUp(Player player, SkillType skill, int skillLevel)
	{
		this.player = player;
		this.skill = skill;
		this.skillLevel = skillLevel;
	}

	@Override
	public boolean isCancelled()
	{
		return this.canceled;
	}

	@Override
	public void setCancelled(boolean cancel)
	{
		this.canceled = cancel;
	}

	@Override
	public HandlerList getHandlers()
	{
		return handlers;
	}

	public static HandlerList getHandlerList()
	{
		return handlers;
	}
	public Player getPlayer()
	{
		return player;
	}

	public SkillType getSkill()
	{
		return skill;
	}

	public int getSkillLevel()
	{
		return skillLevel;
	}
}
