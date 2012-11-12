package StaffDrops.republica.devteam;

import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.fusesource.jansi.Ansi.Color;

public class DropStaffItem extends JavaPlugin implements Listener{
	
	private static DropStaffItem instance;
	
	public DropStaffItem() {
		super();
		instance = this;
	}
	
	public static Logger getInstanceLogger() {
		return instance.getLogger();
	}
	
	public ItemStack staff_Drop;
	public staffList sl = new staffList();
	public deathMessages dm = new deathMessages();
	
	public void onEnable(){
		getLogger().info("Plugin Enabled!");
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(this, this);
	}
 
	public void onDisable(){
		getLogger().info("Plugin Disabled!");
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e){
		Player player = e.getEntity();
		String playerName = player.getName();
		
		String deathMessage;
		
		ItemStack staffDrop = null;
		
		if(sl.isStaff(playerName)){
			staffDrop = sl.getStaffDrop(playerName);
		}
		
		if(staffDrop != null && player.getKiller() instanceof Player){
			Random rand = new Random();
			
			if(rand.nextInt(5) == 3){
				Player killer = player.getKiller();
				PlayerInventory killerInventory = killer.getInventory();
				killerInventory.addItem(staffDrop);
				
				deathMessage = dm.getDeathMessage(player, player.getKiller());
				
				e.setDeathMessage(deathMessage);
				
				Bukkit.broadcastMessage(ChatColor.AQUA + killer.getName() + ChatColor.RED + " Has recieved a legendary!");
				
				//TODO: Change the color of the Drop to match the Rarity Scheme
			}
		}
	}
	
}
