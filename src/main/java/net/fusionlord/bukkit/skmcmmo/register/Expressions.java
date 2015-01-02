package net.fusionlord.bukkit.skmcmmo.register;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.ExpressionType;
import net.fusionlord.bukkit.skmcmmo.experssions.SkillLevel;
import net.fusionlord.bukkit.skmcmmo.experssions.SkillName;

public class Expressions
{

	public static void registerExpressions()
	{
		Skript.registerExpression(SkillName.class, String.class, ExpressionType.SIMPLE, "name of %skill%");
		Skript.registerExpression(SkillLevel.class, Integer.class, ExpressionType.SIMPLE, "level of %skill%");
	}
}
