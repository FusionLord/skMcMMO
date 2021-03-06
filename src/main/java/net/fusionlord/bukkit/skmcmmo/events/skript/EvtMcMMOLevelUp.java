package net.fusionlord.bukkit.skmcmmo.events.skript;

import net.fusionlord.bukkit.skmcmmo.classes.Skill;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class EvtMcMMOLevelUp extends Event implements Cancellable
{
	private static final HandlerList handlers = new HandlerList();

	private Player player;
	private Skill skill;
	private boolean canceled;

	public EvtMcMMOLevelUp(Player player, Skill skill)
	{
		this.player = player;
		this.skill = skill;
	}

	public static HandlerList getHandlerList()
	{
		return handlers;
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

	public Player getPlayer()
	{
		return player;
	}

	public Skill getSkill()
	{
		return skill;
	}
}
