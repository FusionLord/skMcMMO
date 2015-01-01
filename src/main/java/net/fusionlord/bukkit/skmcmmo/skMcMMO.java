package net.fusionlord.bukkit.skmcmmo;

import ch.njol.skript.Skript;
import net.fusionlord.bukkit.skmcmmo.events.McMMOLevelUpListener;
import net.fusionlord.bukkit.skmcmmo.register.Register;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class skMcMMO extends JavaPlugin
{

	public static skMcMMO INSTANCE;
	@Override
	public void onEnable()
	{
		INSTANCE = this;
		registerEvents();
	}

	private void registerEvents()
	{
		Bukkit.getServer().getPluginManager().registerEvents(new McMMOLevelUpListener(), this);
		Register.register();
		Skript.registerAddon(this);
	}

	@Override
	public void onDisable()
	{}
}
