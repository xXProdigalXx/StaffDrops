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
		
		if(killer.getItemInHand().getTypeId() != 0){
			returnVal = ChatColor.AQUA + player.getDisplayName() + ChatColor.RED + " was killed by " + ChatColor.AQUA + killer.getDisplayName() + ChatColor.RED + " wielding " + ChatColor.YELLOW + getItemName(killer.getItemInHand()) + ".";
		} else {
			returnVal = ChatColor.AQUA + player.getDisplayName() + ChatColor.RED + " was savagely beaten to death by " + ChatColor.AQUA + killer.getDisplayName() + ".";
		}
		
		return returnVal;
	}
	
	private String getItemName(ItemStack itm){
		
		String s;
		
		s = itemNameListUgghh(itm.getTypeId());
		
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
	
	private String itemNameListUgghh(int i){
		String rs = "null";
		
		switch(i){
			case 1:
				rs = "Stone";
				break;
			case 2:
				rs = "Grass";
				break;
			case 3:
				rs = "Dirt";
				break;
			case 4:
				rs = "Cobblestone";
				break;
			case 5:
				rs = "A wooden plank";
				break;
			case 6:
				rs = "A sapling";
				break;
			case 7:
				rs = "Bedrock";
				break;
			case 8:
				rs = "Water. " + ChatColor.RED + "Clearly someone is a Staff/Hacker";
				break;
			case 9:
				rs = "Water. " + ChatColor.RED + "Clearly someone is a Staff/Hacker";
				break;
			case 10:
				rs = "Lava. " + ChatColor.RED + "Clearly someone is a Staff/Hacker";
				break;
			case 11:
				rs = "Lava. " + ChatColor.RED + "Clearly someone is a Staff/Hacker";
				break;
			case 12:
				rs = "sand";
				break;
			case 13:
				rs = "gravel";
				break;
			case 14:
				rs = "Gold ore";
				break;
			case 15:
				rs = "Iron ore";
				break;
			case 16:
				rs = "Coal ore";
				break;
			case 17:
				rs = "Wood. " + ChatColor.RED + "TEEHEEHEE, Thats a boner joke!";
				break;
			case 18:
				rs = "Leaves";
				break;
			case 19:
				rs = "Sponge. " + ChatColor.RED + "Clearly someone is a Staff/Hacker";
				break;
			case 20:
				rs = "Glass";
				break;
			case 21:
				rs = "lapis lazuli ore";
				break;
			case 22:
				rs = "a lapis lazuli block";
				break;
			case 23:
				rs = "a dispenser";
				break;
			case 24:
				rs = "sandstone";
				break;
			case 25:
				rs = "a noteblock";
				break;
			case 26:
				rs = "a Bed Block. " + ChatColor.RED + "Clearly someone is a Staff/Hacker";
				break;
			case 27:
				rs = "a Powered rail";
				break;
			case 28:
				rs = "a detector rail";
				break;
			case 29:
				rs = "a sticky piston";
				break;
			case 30:
				rs = "web (spiderman, spiderman!)";
				break;
			case 31:
				rs = "tall grass";
				break;
			case 32:
				rs = "a dead shrub, " + ChatColor.RED + "thats cheerful";
				break;
			case 33:
				rs = "a piston";
				break;
			case 34:
				rs = "a piston head " + ChatColor.RED + "(Wat?)";
				break;
			case 35:
				rs = "wool";
				break;
			case 36:
				rs = "?????";
				break;
			case 37:
				rs = "a dandelion";
				break;
			case 38:
				rs = "a rose";
				break;
			case 39:
				rs = "a mushroom";
				break;
			case 40:
				rs = "a mushroom";
				break;
			case 41:
				rs = "a block of gold";
				break;
			case 42:
				rs = "a block of iron";
				break;
			case 43:
				rs = "slabs";
				break;
			case 44:
				rs = "slabs";
				break;
			case 45:
				rs = "bricks";
				break;
			case 46:
				rs = "TNT";
				break;
			case 47:
				rs = "bookcase";
				break;
			case 48:
				rs = "moss stone";
				break;
			case 49:
				rs = "obsidian";
				break;
			case 50:
				rs = "torch";
				break;
			case 51:
				rs = "fire..";
				break;
			case 52:
				rs = "mob spawner..";
				break;
			case 53:
				rs = "wooden stairs";
				break;
			case 54:
				rs = "a chest";
				break;
			case 55:
				rs = "redstone wire";
				break;
			case 56:
				rs = "diamond ore";
				break;
			case 57:
				rs = "a diamond block";
				break;
			case 58:
				rs = "a workbench";
				break;
			case 59:
				rs = "wheat";
				break;
			case 60:
				rs = "farmland..";
				break;
			case 61:
				rs = "furnace";
				break;
			case 62:
				rs = "furnace";
				break;
			case 63:
				rs = "Sign";
				break;
				
		}
		
		return rs.toLowerCase();
	}
	
}
/*
alex was here alex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herealex was herev


*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*
*alex was here 
*
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*alex was here 
*
*/

