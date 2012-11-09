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
		
		display = new NBTTagCompound();
		
		tags = LegendaryItem.getHandle().tag;
		
		if(tags == null){
			tags = new NBTTagCompound();
		}

	}
	
	public void setItemName(String _name){
		name = _name;
		display.setString("Name", name);
	}
	
	public void setItemRarity(int i){
		switch(i){
		case 1:
			name = name + ChatColor.GREEN;
			setItemName(name);
			break;
		case 2:
			name = name + ChatColor.BLUE;
			setItemName(name);
			break;
		case 3:
			name = name + ChatColor.RED;
			setItemName(name);
			break;
		case 4: 
			name = name + ChatColor.YELLOW;
			setItemName(name);
			break;
		}
	}
	
	public void setItemLore(String _lore){
		lore = ChatColor.DARK_PURPLE + _lore;
		NBTTagString temp = new NBTTagString(lore);
		
		display.set("Lore", temp);
	}
	
	public ItemStack getItemStack(){
		
		tags.setCompound("display", display);
		
		return LegendaryItem;
	}
	
}
