package StaffDrops.republica.devteam;

import net.minecraft.server.NBTBase;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagList;
import net.minecraft.server.NBTTagString;

import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class Legendarys {
	
	private CraftItemStack LegendaryItem;
	private NBTTagCompound tags;
	private NBTTagCompound display;
	private String name = "";
	private String lore = "";

	public Legendarys(ItemStack is){
		this(new CraftItemStack(is));
	}
	
	public Legendarys(CraftItemStack cis){
		LegendaryItem = cis;
		
		tags = LegendaryItem.getHandle().tag;
		
		if(tags == null){
			tags = new NBTTagCompound();
		}
		
		if(tags.hasKey("Display")){
			display = new NBTTagCompound();
		}
		

	}
	
	public void setItemName(String _name){
		if(tags.hasKey("Name")){
			name = _name;
			display.setString("Name", name);
		}
	}
	
	public void setItemRarity(int i){
		if(tags.hasKey("Name")){
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
	
	public void setItemLore(String _lore){
		if(display.hasKey("Lore")){
			lore = ChatColor.DARK_PURPLE + _lore;
			NBTTagString temp = new NBTTagString(lore);
			
			display.set("Lore", temp);
		}
	}
	
	public ItemStack getItemStack(){
		
		if(display != null){
			tags.setCompound("display", display);
		}
		
		return LegendaryItem;
	}
	
}
