package StaffDrops.republica.devteam;

import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.fusesource.jansi.Ansi.Color;

public class DropStaffItem extends JavaPlugin implements Listener{
	
	private static DropStaffItem instance;
	private LegendaryCommandExecutor lce;
	private CommandExecutor ce;
	
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
		
		ce = getCommand("legendary").getExecutor();
		lce = new LegendaryCommandExecutor(this);
		getCommand("legendary").setExecutor(lce);
	}
 
	public void onDisable(){
		getLogger().info("Plugin Disabled!");
	}
	
	public boolean getPlayerIsOnline(String pl){
		return getServer().getOfflinePlayer(pl).isOnline();
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e){
		Player player = e.getEntity();
		String playerName = player.getName();
		
		String deathMessage;
		
		ItemStack staffDrop = null;
		
		if(sl.isStaff(playerName)){
			boolean temp = getServer().getOfflinePlayer(playerName).isOnline();
			staffDrop = sl.getStaffDrop(playerName, temp);
		}
		
		if(staffDrop != null && player.getKiller() instanceof Player){
			Random rand = new Random();
			
			if(rand.nextInt(5) == 3){
				Player killer = player.getKiller();
				Location temp = player.getLocation();
				
				killer.getWorld().dropItemNaturally(temp, staffDrop);
				
				deathMessage = dm.getDeathMessage(player, player.getKiller());
				
				e.setDeathMessage(deathMessage);
				
				Bukkit.broadcastMessage(ChatColor.AQUA + killer.getName() + ChatColor.RED + " Has recieved a legendary!");
				
			}
		}
	}
	
}
