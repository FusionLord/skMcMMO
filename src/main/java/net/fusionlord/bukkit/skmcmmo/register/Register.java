package net.fusionlord.bukkit.skmcmmo.register;

import net.fusionlord.bukkit.skmcmmo.classes.Skill;

public class Register
{
	public static void register()
	{
		Skill.register();
		Expressions.registerExpressions();
		Events.registerEvents();
		EventValue.registerEventValues();
	}
}
