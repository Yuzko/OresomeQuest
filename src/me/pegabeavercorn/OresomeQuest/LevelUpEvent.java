package me.pegabeavercorn.OresomeQuest;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LevelUpEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Player player;
	int level = 0;
	
	oresomequest plugin;
	
	public LevelUpEvent(oresomequest pl){
		plugin = pl;}
	
	
	
	public LevelUpEvent(Player p){
	player = p;
		
	}

public Player getPlayer(){
	
	return player;
}
	
	
public int getLevel(){

	String name = player.getName();

	
	if(plugin.pl.getConfig().get(name) != null ){
		
		if(plugin.pl.getConfig().get(name + ".Level") != null ){
	int level = plugin.pl.getConfig().getInt(name + ".Level"); 	
		
	return level;
	}else{
		return 0;
	}
	}else{
		return 0;
	}

	
	
	
}



	
	public HandlerList getHandlers() {
		return handlers;
	}
	
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
