package net.fusionlord.bukkit.skmcmmo.register;

public class Register
{
	public static void register()
	{
		Expressions.registerExpressions();
		Events.registerEvents();
		EventValue.registerEventValues();
	}
}
