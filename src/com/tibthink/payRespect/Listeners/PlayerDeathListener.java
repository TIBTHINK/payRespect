package com.tibthink.payRespect.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.tibthink.payRespect.Main;

public class PlayerDeathListener implements Listener {

	private static Main plugin;

	public PlayerDeathListener(Main plugin) {
		this.plugin = plugin;

		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		if (e.getEntity().getPlayer() instanceof Player) {
//			Player killer = e.getEntity().getKiller();
//			Player p = e.getEntity();

			Bukkit.broadcastMessage("[Server] §l§4F");
			
//			killer.sendMessage(Utils.chat("you have murdered" + p.getDisplayName()));
//			p.sendMessage(Utils.chat("you got vibechecked by" + killer.getDisplayName()));
			return;
		}
	}

}
