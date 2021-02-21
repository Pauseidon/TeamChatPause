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

	String Prefix = main.getPlugin().getConfig().getString("Prefix");
	String SendPermission = main.getPlugin().getConfig().getString("SendPermission");
	String SeePermission = main.getPlugin().getConfig().getString("SeePermission");
	String color = main.getPlugin().getConfig().getString("NameColor");
	String mcolor = main.getPlugin().getConfig().getString("MessageColor");
	String nomessage = main.getPlugin().getConfig().getString("NoMessageAfterCommand");
	String alias = main.getPlugin().getConfig().getString("CommandAlias");

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		Player p = (Player) sender;
		String message = "";
		for (int i = 0; i < args.length; i++) {
			message = message + args[i] + " ";
		}
		if (p.hasPermission(SendPermission) || p.hasPermission("teamchat")) {
			if (args.length > 0) {
				if ((message.equals(" ")) || (message.equals(""))) {
					p.sendMessage(Prefix + " " + nomessage);
				} else {

					for (Player player : Bukkit.getOnlinePlayers()) {
						if (player.hasPermission(SeePermission) || p.hasPermission("teamchat")) {
							player.sendMessage(Prefix + " " + color + p.getDisplayName() + mcolor + " " + message);
						}
					}
				}
			} else {
				p.sendMessage(Prefix  + " " +  nomessage);
			}
		}
		return false;
	}

}
