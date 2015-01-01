package net.fusionlord.bukkit.skmcmmo.experssions;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import net.fusionlord.bukkit.skmcmmo.events.skript.EvtMcMMOLevelUp;
import org.bukkit.event.Event;

public class SkillName extends SimpleExpression<String>
{

	@Override
	protected String[] get(Event event)
	{
		if (event instanceof EvtMcMMOLevelUp)
		{
			return new String[]{((EvtMcMMOLevelUp) event).getSkill().getSkillName()};
		}
		return null;
	}

	@Override
	public boolean isSingle()
	{
		return true;
	}

	@Override
	public Class<? extends String> getReturnType()
	{
		return String.class;
	}

	@Override
	public String toString(Event event, boolean debug)
	{
		return this.getClass().getName();
	}

	@Override
	public boolean init(Expression<?>[] exprs, int matchedPattern, Kleenean isDelayed, SkriptParser.ParseResult parseResult)
	{
		return true;
	}
}
