package me.skizzy.main;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class core extends JavaPlugin implements Listener {
	
	@EventHandler
	  public void onJoin(PlayerJoinEvent e)
	  {
	    Player player = e.getPlayer();
	    
	    Location joinLocation = new Location(Bukkit.getServer().getWorld(getConfig().getString("Spawn.World")), 
	      this.getConfig().getDouble("Spawn.X"), 
	      this.getConfig().getDouble("Spawn.Y"), 
	      this.getConfig().getDouble("Spawn.Z"), 
	      this.getConfig().getInt("Spawn.Yaw"), 
	      this.getConfig().getInt("Spawn.Pitch"));
	    
	    player.teleport(joinLocation);
	  }
	}