/**
Copyright Paul-Theodor.de to Present
All rights reserved.
*/
package de.pauseidon.TeamChat.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;

public class PluginInfoCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {

		if (arg0 instanceof Player)
			;
		if (arg3.length == 0)
			;

		TextComponent message = new TextComponent("This Plugin was made by Pauseidon! [Click Me]");
		message.setColor(ChatColor.AQUA);
		message.setClickEvent(
				new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/members/pauseidon.1195717/"));
		message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Surprise!")));
		message.setColor(ChatColor.YELLOW);
		arg0.spigot().sendMessage(message);
		return false;
	}

}
