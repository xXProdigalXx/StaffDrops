package StaffDrops.republica.devteam;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class LegendaryCommandExecutor implements CommandExecutor{
	
	staffList sl = new staffList();
	
	private DropStaffItem plugin;
	private Yaml yml = new Yaml(new Constructor(List.class));
	 
	public LegendaryCommandExecutor(DropStaffItem plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender s, Command cmd, String l, String[] args){
		Player p = (Player) s;
		
		Bukkit.broadcastMessage("You said a command.");
		
		if(cmd.getName().equalsIgnoreCase("legendary")){
			if(p.isOp()){
				p.getInventory().addItem(sl.getStaffDrop(args[0], plugin.getPlayerIsOnline(args[0])));
			}
		}
		
		return false;
	}
	
}
