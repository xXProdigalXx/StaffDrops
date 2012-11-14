package StaffDrops.republica.devteam;

import net.minecraft.server.NBTTagCompound;

import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.fusesource.jansi.Ansi.Color;

public class deathMessages {
	
	public String getDeathMessage(Player player, Player killer){
		String returnVal = null;
		
		if(killer.getItemInHand() != null){
			returnVal = ChatColor.AQUA + player.getDisplayName() + ChatColor.RED + " was killed by " + ChatColor.AQUA + killer.getDisplayName() + ChatColor.RED + " wielding a " + ChatColor.YELLOW + getItemName(killer.getItemInHand()) + ".";
		} else {
			returnVal = ChatColor.AQUA + player.getDisplayName() + ChatColor.RED + " was savagely beaten to death by " + ChatColor.AQUA + killer.getDisplayName() + ".";
		}
		
		return returnVal;
	}
	
	private String getItemName(ItemStack itm){
		
		String s;
		
		s = itm.getType().name();
		
		CraftItemStack cis = new CraftItemStack(itm);
		
		NBTTagCompound tags = cis.getHandle().tag;
		
		if(tags.hasKey("display")){
			NBTTagCompound display = tags.getCompound("display");
			if(display.hasKey("Name")){
				s = tags.getString("Name");
			}
		}
		return s;
	}
	
}
