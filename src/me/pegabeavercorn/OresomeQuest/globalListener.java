package me.yuzko.quest;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class globalListener implements Listener
{
	Quest plugin;

	public globalListener(Quest pl)
	{
		plugin = pl;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void join(PlayerJoinEvent event)
	{
		Player player = event.getPlayer();
		String name = player.getName();

		Location spawn = new Location(plugin.getServer().getWorld("world"), 639, 68, 1072);

		player.teleport(spawn);

		if(plugin.pl.getConfig().get(name) == null ){
			{
				plugin.pl.getConfig().set(name + "Char1.Name", null);
				plugin.pl.getConfig().set(name + ".Char1.Level", null);
				plugin.pl.getConfig().set(name + ".Char1.Progression", null);
				plugin.pl.getConfig().set(name + ".Char1.Path", null);
				plugin.pl.getConfig().set(name + ".Char1.Preffered", null);
				plugin.pl.getConfig().set(name + ".Char1.Skills", null);
				plugin.pl.getConfig().set(name + ".Char1.LastLocation.x", null);
				plugin.pl.getConfig().set(name + ".Char1.LastLocation.y", null);
				plugin.pl.getConfig().set(name + ".Char1.LastLocation.z", null);
				plugin.pl.getConfig().set(name + ".Char1.LastLocation.world", null);
				plugin.pl.saveConfig();
				plugin.pl.reloadConfig();
			}
		}
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void quit(PlayerQuitEvent event)
	{
		Player player = event.getPlayer();
		String name = player.getName();
		Location location = player.getLocation();
		int x = location.getBlockX();
		int y = location.getBlockY();
		int z = location.getBlockZ();
		String world = location.getWorld().getName();
		
		plugin.pl.getConfig().set(name + ".Char1.LastLocation.x", x);
		plugin.pl.getConfig().set(name + ".Char1.LastLocation.y", y);
		plugin.pl.getConfig().set(name + ".Char1.LastLocation.z", z);
		plugin.pl.getConfig().set(name + ".Char1.LastLocation.world", world);
		plugin.pl.saveConfig();
		plugin.pl.reloadConfig();
		
	}
}
