package me.pegabeavercorn.OresomeQuest;

import java.util.logging.Logger;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;



public class oresomequest extends JavaPlugin {


	public final Plugin pl = this;
	
	public final Logger logger = Logger.getLogger("Minecraft");


	globalListener gL;
	
	public void onEnable(){
		
		gL = new globalListener(this);
		
		getServer().getPluginManager().registerEvents(gL, this); 
		LevelUpEvent lvlUp = new LevelUpEvent(1);
		
		  PluginDescriptionFile pdfFile = getDescription();
		    this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + "is now enabled");
		    
	}
	
	public void onDisable(){
		
		pl.saveConfig();
		
	}
	
	/*int x = plugin.pl.getConfig().getInt(name + ".Char1.LastLocation.x");
	int y = plugin.pl.getConfig().getInt(name + ".Char1.LastLocation.y");
	int z = plugin.pl.getConfig().getInt(name + ".Char1.LastLocation.z");
	String world = plugin.pl.getConfig().getString(name + ".Char1.LastLocation.world");
	
	Location lastLoc = new Location(plugin.pl.getServer().getWorld(world), x, y, z);
	
	p.teleport(lastLoc);*/
	
	
}
