package net.fusionlord.bukkit.skmcmmo.experssions;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import net.fusionlord.bukkit.skmcmmo.events.skript.EvtMcMMOLevelUp;
import org.bukkit.event.Event;

public class SkillLevel extends SimpleExpression<Integer>
{

	@Override
	protected Integer[] get(Event event)
	{
		if (event instanceof EvtMcMMOLevelUp)
		{
			return new Integer[((EvtMcMMOLevelUp) event).getSkill().getSkillLevel()];
		}
		return null;
	}

	@Override
	public boolean isSingle()
	{
		return true;
	}

	@Override
	public Class<? extends Integer> getReturnType()
	{
		return Integer.class;
	}

	@Override
	public String toString(Event e, boolean debug)
	{
		return this.getClass().getName();
	}

	@Override
	public boolean init(Expression<?>[] exprs, int matchedPattern, Kleenean isDelayed, SkriptParser.ParseResult parseResult)
	{
		return true;
	}
}
