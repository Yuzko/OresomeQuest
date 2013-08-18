package me.yuzko.quest;

import java.util.logging.Logger;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Quest extends JavaPlugin {


	public final Plugin pl = this;

	public final Logger logger = Logger.getLogger("Minecraft");


	globalListener gL;

	public void onEnable(){

		gL = new globalListener(this);

		getServer().getPluginManager().registerEvents(gL, this); 
		LevelUpEvent lvlUp = new LevelUpEvent(1);
		GiveXpEvent giveXp = new GiveXpEvent();

		PluginDescriptionFile pdfFile = getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + "is now enabled");

	}

	public void onDisable(){

		pl.saveConfig();

	}
}
