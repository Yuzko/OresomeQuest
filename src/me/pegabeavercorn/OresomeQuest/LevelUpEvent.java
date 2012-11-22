package me.pegabeavercorn.OresomeQuest;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LevelUpEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	
	public LevelUpEvent(int level){
	
		
	}


	public HandlerList getHandlers() {
		return handlers;
	}
	
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
