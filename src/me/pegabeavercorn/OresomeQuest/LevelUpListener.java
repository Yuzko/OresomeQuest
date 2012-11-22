package me.pegabeavercorn.OresomeQuest;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LevelUpListener implements Listener {

	oresomequest plugin;
	
	public LevelUpListener(oresomequest pl){
		plugin = pl;}
	
	@EventHandler(priority =  EventPriority.NORMAL)
	public void join(PlayerJoinEvent event){
		Player p = event.getPlayer();
		
	 LevelUpEvent lvlUp = new LevelUpEvent(p);
	 Bukkit.getServer().getPluginManager().callEvent(lvlUp);
	 
	}
	
}
