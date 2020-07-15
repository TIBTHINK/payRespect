package com.tibthink.payRespect;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		//startup
		//reloads
		//plugins do a reload
		
	}
	
	@Override
	public void onDisable() {
		//shutdown
		//reload
		//plugins reboot
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("hello")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.BLUE + "sup bitch");
				return true;
			}
			else {
				sender.sendMessage("hey admin");
				
			}
		}
		
		return false;
	}
	
	
}
