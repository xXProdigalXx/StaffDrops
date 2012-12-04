package StaffDrops.republica.devteam;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class LegendaryCommandExecutor implements CommandExecutor {

	StaffList sl = new StaffList();

	private DropStaffItem plugin;
	public LegendaryCommandExecutor(DropStaffItem plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String l,
			String[] args) {
		Player p = (Player) s;

		Bukkit.broadcastMessage("You said a command.");

		if (cmd.getName().equalsIgnoreCase("legendary")) {
			if (p.isOp()) {
				if (args[0].equals("all")) {
					for (ItemStack is : sl.getAllItems()) {
						p.getInventory().addItem(is);
					}
				} else {
					boolean playerIsOnline = plugin.getPlayerIsOnline(args[0]);
					playerIsOnline = true; // this is for debugging anyways, right?
					p.getInventory().addItem(
							sl.getStaffDrop(args[0],
									playerIsOnline));
				}
			}
		}

		return false;
	}

}
