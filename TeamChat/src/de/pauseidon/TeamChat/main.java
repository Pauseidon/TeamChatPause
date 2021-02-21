/**
Copyright Paul-Theodor.de to Present
All rights reserved.
*/
package de.pauseidon.TeamChat;

import java.nio.file.Paths;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import de.pauseidon.TeamChat.cmd.PluginInfoCMD;
import de.pauseidon.TeamChat.cmd.TeamChatCMD;

public class main extends JavaPlugin {

	
	private static main plugin;

// Startup	
	public void onLoad() {

		saveDefaultConfig();

	}

	public void onEnable() {
		plugin.saveDefaultConfig();
		loadconfig();
		sendStartMessage();
		registerEvents();
		getCommands();


	}

// Shutdown
	public void onDisable() {
		sendStopMessage();
	}

// Plugin Instance
	public main() {
		if (main.plugin != null) {
			throw new Error("Plugin already initialized!");
		}
		main.plugin = this; // A plugin's constructor should only be called once
	}

	public static main getPlugin() {
		return plugin;
	}

// System Prints    
	public void sendStartMessage() {
// Press Insert/Einfg to keep the format
		System.out.println("------------------------------");
		System.out.println("|            [Team]          |");
		System.out.println("|       Made by Pauseidon    |");
		System.out.println("|          Activated         |");
		System.out.println("------------------------------");
	}

	public void sendStopMessage() {
// Press Insert/Einfg to keep the format
		System.out.println("------------------------------");
		System.out.println("|            [Team]          |");
		System.out.println("|       Made by Pauseidon    |");
		System.out.println("|          Deactivated       |");
		System.out.println("------------------------------");
	}

// Event registration    
	private void registerEvents() {

//		Bukkit.getServer().getPluginManager().registerEvents(new ClassName(), this);
//		Bukkit.getServer().getPluginManager().registerEvents(new ClassName(), this);
//		Bukkit.getServer().getPluginManager().registerEvents(new ClassName(), this);
//		Bukkit.getServer().getPluginManager().registerEvents(new ClassName(), this);
//		Bukkit.getServer().getPluginManager().registerEvents(new ClassName(), this);
//		Bukkit.getServer().getPluginManager().registerEvents(new ClassName(), this);
//		Bukkit.getServer().getPluginManager().registerEvents(new ClassName(), this);
	}

// Command registration
	private void getCommands() {
		getCommand("plugininfo").setExecutor((CommandExecutor) new PluginInfoCMD());
		getCommand("teamchat").setExecutor((CommandExecutor)new TeamChatCMD());
//		getCommand("COMMAND").setExecutor((CommandExecutor)new ClassName());
//		getCommand("COMMAND").setExecutor((CommandExecutor)new ClassName());
//		getCommand("COMMAND").setExecutor((CommandExecutor)new ClassName()),
	}


	public void loadconfig() {
		if (!Paths.get("plugins", new String[] { "TeamChatPause", "config.yml" }).toFile().exists()) {
			plugin.getConfig().options().copyDefaults(true);
			saveConfig();
		}

	}
}
