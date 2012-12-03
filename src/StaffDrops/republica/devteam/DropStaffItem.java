package StaffDrops.republica.devteam;

import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class DropStaffItem extends JavaPlugin implements Listener {

	private static DropStaffItem instance;
	private LegendaryCommandExecutor lce;
	public DropStaffItem() {
		super();
		instance = this;
	}

	public static Logger getInstanceLogger() {
		return instance.getLogger();
	}

	public ItemStack staff_Drop;
	public StaffList sl = new StaffList();
	public DeathMessages dm = new DeathMessages();

	@Override
	public void onEnable() {
		getLogger().info("Plugin Enabled!");
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(this, this);

		getCommand("legendary").getExecutor();
		lce = new LegendaryCommandExecutor(this);
		getCommand("legendary").setExecutor(lce);
	}

	@Override
	public void onDisable() {
		getLogger().info("Plugin Disabled!");
	}

	public boolean getPlayerIsOnline(String pl) {
		return getServer().getOfflinePlayer(pl).isOnline();
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		CheatingTomfoolery.helmetEnchantmentsChangingMining(e);
		CheatingTomfoolery.toolEnchantmentsOnSticksAndRoses(e);
	}
	
	@EventHandler
	public void onEntityDamageEvent(EntityDamageByEntityEvent e) {
		CheatingTomfoolery.swordEnchantmentsOnToolsAndSaplings(e);
	}

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		Player victim = e.getEntity();
		String playerName = victim.getName();

		String deathMessage;

		ItemStack staffDrop = null;

		if (sl.isStaff(playerName)) {
			boolean temp = getServer().getOfflinePlayer(playerName).isOnline();
			staffDrop = sl.getStaffDrop(playerName, temp);
			if (victim.getKiller() instanceof Player) {
				Random rand = new Random();
	
				if (rand.nextInt(5) == 3) {
					victim.getWorld().dropItemNaturally(victim.getLocation(), staffDrop);
					
					Player killer = victim.getKiller();
	
					deathMessage = dm.getDeathMessage(victim, killer);
	
					e.setDeathMessage(deathMessage);
	
					Bukkit.broadcastMessage(ChatColor.AQUA + killer.getName()
							+ ChatColor.RED + " Has recieved a legendary!");
	
				}
			}
		}
	}

}
