/**
Copyright Paul-Theodor.de to Present
All rights reserved.
*/
package de.pauseidon.TeamChat.cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.pauseidon.TeamChat.main;

public class TeamChatCMD implements CommandExecutor {

	//(Ignore if u are on GitHub) I SAID FUCK OFF AND DONT STEAL THE FUCKING CODE JUST DOWNLOAD IT FROM MY ODYSEE!
	
	String Prefix = main.getPlugin().getConfig().getString("Prefix"); 
	String Permission = main.getPlugin().getConfig().getString("Permission"); 
	String color = main.getPlugin().getConfig().getString("NameColor");
	String mcolor = main.getPlugin().getConfig().getString("MessageColor"); 
	String nomessage = main.getPlugin().getConfig().getString("NoMessageAfterCommand"); 
	String alias = main.getPlugin().getConfig().getString("CommandAlias"); 
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String lable, String[] args) {
		if (command.getName().equalsIgnoreCase("tc") || command.getName().equalsIgnoreCase("teamchat") || command.getName().equalsIgnoreCase(alias)) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				if (p.hasPermission(Permission)) {
					if (args.length == 0) {
						p.sendMessage(Prefix + " " + nomessage);
					}
					if (args.length != 0) {
						for (Player player : Bukkit.getOnlinePlayers()) {
								player.sendMessage(Prefix + " " + color + p.getDisplayName() + mcolor + args[0].toString());
						}
					}
				} else
					p.sendMessage(Prefix  + " " +  Permission);
			}

		}
		return false;
	}
}

