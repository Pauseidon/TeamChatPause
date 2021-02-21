package de.pauseidon.TeamChat.Listener;

import org.bukkit.event.Listener;

/**
Copyright Paul-Theodor.de to Present
All rights reserved.
*/
/*package de.pauseidon.TeamChat.Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.pauseidon.TeamChat.main;

public class TeamChat implements Listener{

	
	String Prefix = main.getPlugin().getConfig().getString("Prefix"); 
	String Permission = main.getPlugin().getConfig().getString("Permission"); 
	String color = main.getPlugin().getConfig().getString("NameColor");
	String mcolor = main.getPlugin().getConfig().getString("MessageColor"); 
	String nomessage = main.getPlugin().getConfig().getString("NoMessageAfterCommand"); 
	String alias = main.getPlugin().getConfig().getString("CommandAlias"); 
	
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		if(e.getMessage().startsWith("/teamchat") || e.getMessage().startsWith("/tc") || e.getMessage().startsWith(alias)) {
		if(p.hasPermission(Permission)) {
		String msg = e.getMessage();
		for (Player player : Bukkit.getOnlinePlayers()) {
if(msg.toLowerCase().equals("/tc") || msg.toLowerCase().equals("/teamchat") || msg.toLowerCase().equals(alias)) {
p.sendMessage(Prefix + " " + nomessage);
} else {	
msg.toLowerCase().replace("/tc", "");
msg.toLowerCase().replace("/teamchat", "");
msg.toLowerCase().replace(alias, "");

			
	}
		player.sendMessage(Prefix + " " + color + p.getDisplayName() + mcolor + " " + msg);
		}
		} else
			p.sendMessage(Prefix  + " " +  Permission);
			
			
		}
	}
	
}
*/
public class TeamChat implements Listener{
 
}