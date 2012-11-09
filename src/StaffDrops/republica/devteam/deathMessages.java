package StaffDrops.republica.devteam;

import org.bukkit.entity.Player;
import org.fusesource.jansi.Ansi.Color;

public class deathMessages {
	
	public String getDeathMessage(Player player, Player killer){
		String returnVal = null;
		
		if(killer.getItemInHand() != null){
			returnVal = Color.CYAN + player.getDisplayName() + Color.RED + " was killed by " + Color.CYAN + killer.getDisplayName() + Color.RED + " wielding a " + Color.YELLOW + killer.getItemInHand() + ".";
		} else {
			returnVal = Color.CYAN + player.getDisplayName() + Color.RED + " was savagely beaten to death by " + Color.CYAN + killer.getDisplayName() + ".";
		}
		
		return returnVal;
	}
	
}
