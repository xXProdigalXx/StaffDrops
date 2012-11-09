package StaffDrops.republica.devteam;

import net.minecraft.server.NBTBase;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagList;
import net.minecraft.server.NBTTagString;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class Legendarys {
	
	private CraftItemStack LegendaryItem;
	private String name = "";
	private String lore = "";
	private NBTTagCompound tags;
	private NBTTagCompound display = null;
	private NBTTagString _lore;
	private NBTTagList thisIsFuckingStupid;

	public Legendarys(ItemStack is){
		this(new CraftItemStack(is));
	}
	
	public Legendarys(CraftItemStack cis){
		LegendaryItem = cis;
		
		tags = cis.getHandle().tag;
		
		if(tags == null){
			tags = new NBTTagCompound();
		}
		
		if(tags.hasKey("display")){
			display = tags.getCompound("display");
		}
		else{
			display = new NBTTagCompound();
		}
	}
	
	public void setItemName(String _name){	
		Bukkit.broadcastMessage("Item name was called");
		itemInfos(_name, "Name");
	}
	
	public void setItemRarity(int i){
		if(display != null){
			if(display.hasKey("Name")){
				switch(i){
				case 1:
					name = ChatColor.GREEN + name;
					setItemName(name);
					break;
				case 2:
					name = ChatColor.BLUE + name;
					setItemName(name);
					break;
				case 3:
					name = ChatColor.RED + name;
					setItemName(name);
					break;
				case 4: 
					name =  ChatColor.YELLOW + name;
					setItemName(name);
					break;
				}
			}
		}
	}
	
	public void setItemLore(String _lore_){
		Bukkit.broadcastMessage("Item lore was called");
		itemInfos(_lore_, "Lore");
	}
	
	public void itemInfos(String s, String type){	
		if(display != null){
			Bukkit.broadcastMessage("It was actually called if that helps...");
			if(type == "Lore"){
				if(display.hasKey("Lore")){//test
					Bukkit.broadcastMessage("THE LORE IS WORKING DIPSHIT");
					lore = ChatColor.DARK_PURPLE + s;
					_lore = new NBTTagString(lore);
					thisIsFuckingStupid.add(_lore);
					displayNeedsToGetItsShitTogether(thisIsFuckingStupid, "Lore");
				}
				
			}
			if(type == "Name"){
				if(display.hasKey("Name")){//test
					Bukkit.broadcastMessage("THE NAME IS WORKING DIPSHIT");
					name = s;
					displayNeedsToGetItsShitTogether(name, "Name");
				}
			}
			tags.setCompound("display", display);
		}
		else{
			Bukkit.broadcastMessage("Display is null");
		}
	}
	
	public void displayNeedsToGetItsShitTogether(Object o, String type){
		if(type == "Lore"){
			display.set("Lore", thisIsFuckingStupid);
		}
		if(type == "Name"){
			display.setString("Name", name);
		}
	}
	
	public ItemStack getItemStack(){
		return LegendaryItem;
	}
	
}
