package StaffDrops.republica.devteam;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.ItemStack;
import org.fusesource.jansi.Ansi.Color;

import net.minecraft.server.NBTTagCompound;

public class staffList {
	
	private  final String[] staffList = {
		"Jefe323", "MajorKane", "SupahTree", "Mekaj", "Emma1337",
		"Bcuz", "Str8tUpSkillz", "Ragnas", "Dt546", "xXProdigalXx"
	};//TODO: Make array constant
	
	//TODO: Name each item
	
	//Skull ProdigalSkull = new Skull();
	
	ItemStack staff_Skull = new ItemStack(397, 1, (short) 3);//Respiration 3, Aqua-affinity 3, Fortune 3
		Enchantment staff_SkullEnchant1 = new EnchantmentWrapper(5);
		Enchantment staff_SkullEnchant2 = new EnchantmentWrapper(6);
		Enchantment staff_SkullEnchant3 = new EnchantmentWrapper(35);
		
		//TODO: Make the tag of the staff skull be dependent on the staff member who dropped it
	
	ItemStack jefe_Sword =  new ItemStack(283, 1);//Sharpness 2, Fire Aspect 3
		Enchantment jefe_SwordEnchant1 = new EnchantmentWrapper(20);
		Enchantment jefe_SwordEnchant2 = new EnchantmentWrapper(16);
	ItemStack jefe_Helmet = new ItemStack(314, 1);//Protection 4
		Enchantment jefe_HelmetEnchant = new EnchantmentWrapper(0);
	ItemStack jefe_ChestPlate = new ItemStack(315, 1);//Fire Protection 4
		Enchantment jefe_ChestPlateEnchant = new EnchantmentWrapper(1);
	ItemStack jefe_PlateLegs = new ItemStack(316, 1);//Projectile Protection 4
		Enchantment jefe_PlateLegsEnchant = new EnchantmentWrapper(4);
	ItemStack jefe_Boots = new ItemStack(317, 1);//Feather-falling 4, Blast Protection 4
		Enchantment jefe_BootsEnchant1 = new EnchantmentWrapper(3);
		Enchantment jefe_BootsEnchant2 = new EnchantmentWrapper(2);
		
	ItemStack majorKane_Pick = new ItemStack(285, 1);//Sharpness 5, Smite 5, Fire Aspect 2
		Enchantment majorKane_PickEnchant1 = new EnchantmentWrapper(16);
		Enchantment majorKane_PickEnchant2 = new EnchantmentWrapper(17);
		Enchantment majorKane_PickEnchant3 = new EnchantmentWrapper(20);
	ItemStack majorKane_PimpCane = new ItemStack(294, 1);//Looting 3
		Enchantment majorKane_PimpCaneEnchant = new EnchantmentWrapper(21);
	
	ItemStack supahTree_Sapling = new ItemStack(6, 1);//Sharpness 5
		Enchantment supahTree_SaplingEnchant = new EnchantmentWrapper(35);
	ItemStack supahTree_Stick = new ItemStack(280, 1);//Silk-Touch 3
		Enchantment supahTree_StickEnchant = new EnchantmentWrapper(33);
		
	ItemStack mekaj_DoucheBagBow = new ItemStack(261, 1);//Infinity 1, Flame 1
		Enchantment mekaj_DoucheBagBowEnchant1 = new EnchantmentWrapper(50);
		Enchantment mekaj_DoucheBagBowEnchant2 = new EnchantmentWrapper(51);
		
	ItemStack emma1337_DiamondBootsies = new ItemStack(313, 1);//Feather-falling 5
		Enchantment emma1337_DiamondBootsiesEnchant = new EnchantmentWrapper(2);
		
	ItemStack bcuz_PumpkinVision = new ItemStack(91, 1);
		//No enchantment, only a potion effect
		
	//TODO: Make Str8tUpSkillz a legendary
		
	ItemStack ragnas_DiamondPick = new ItemStack(278, 1);//Efficiency 5, Unbreaking 3
		Enchantment ragnas_DiamondPickEnchant1 = new EnchantmentWrapper(32);
		Enchantment ragnas_DiamondPickEnchant2 = new EnchantmentWrapper(34);
		
	//TODO: Make Dt546 a legendary
		
	ItemStack xxprodigalxx_Rose = new ItemStack(38, 1);//Fortune 5
		Enchantment xxprodigalxx_RoseEnchant = new EnchantmentWrapper(35);
		
	ItemStack prodigalSkull;
	
	CraftItemStack test = new CraftItemStack(38, 1);	
		
	Random rand = new Random();
	
	public staffList(){ //Possibly nerf a few of these
		
		Legendarys JefeSword = new Legendarys(jefe_Sword);
		
//		staff_Skull.addEnchantment(staff_SkullEnchant1, 3);
//		staff_Skull.addEnchantment(staff_SkullEnchant2, 3);
//		staff_Skull.addEnchantment(staff_SkullEnchant3, 3);
//		
//		jefe_Sword.addEnchantment(jefe_SwordEnchant1, 2);
//		jefe_Sword.addEnchantment(jefe_SwordEnchant2, 3);
//		
//		jefe_Helmet.addEnchantment(jefe_HelmetEnchant, 4);
//		
//		jefe_ChestPlate.addEnchantment(jefe_ChestPlateEnchant, 4);
//		
//		jefe_PlateLegs.addEnchantment(jefe_PlateLegsEnchant, 4);
//		
//		jefe_Boots.addEnchantment(jefe_BootsEnchant1, 4);
//		jefe_Boots.addEnchantment(jefe_BootsEnchant2, 4);
//		
//		majorKane_Pick.addEnchantment(majorKane_PickEnchant1, 5);
//		majorKane_Pick.addEnchantment(majorKane_PickEnchant2, 5);
//		majorKane_Pick.addEnchantment(majorKane_PickEnchant3, 2);
//		
//		majorKane_PimpCane.addEnchantment(majorKane_PimpCaneEnchant, 3);
//		
//		supahTree_Sapling.addEnchantment(supahTree_SaplingEnchant, 5);
//		
//		supahTree_Stick.addEnchantment(supahTree_StickEnchant, 3);
//		
//		mekaj_DoucheBagBow.addEnchantment(mekaj_DoucheBagBowEnchant1, 1);
//		mekaj_DoucheBagBow.addEnchantment(mekaj_DoucheBagBowEnchant2, 1);
//		
//		emma1337_DiamondBootsies.addEnchantment(emma1337_DiamondBootsiesEnchant, 5);
//		
//		//TODO: Make Str8tUpSkillz Lengendaries enchanted
//		
//		ragnas_DiamondPick.addEnchantment(ragnas_DiamondPickEnchant1, 5);
//		ragnas_DiamondPick.addEnchantment(ragnas_DiamondPickEnchant2, 3);
//		
//		//TODO: Make Dt546's Legendaries enchanted
//		
//		xxprodigalxx_Rose.addEnchantment(xxprodigalxx_RoseEnchant, 5);
	
	}
	
	public boolean isStaff(String name){
		boolean returnVal = false;
		
		for(String sl : staffList){
			if(name == sl){
				returnVal = true;
				break;
			}
		}
		
		return returnVal;
	}
	
	public ItemStack getStaffDrop(String name){

		ItemStack sd = null;
		int randVal = 0;
				
		if(name == null)
			return null;
		
		if(name == staffList[0]){
			randVal = rand.nextInt(5);
			
			switch(randVal){
				case 0:
					sd = jefe_Sword;
					break;
				case 1:
					sd = jefe_Helmet;
					break;
				case 2:
					sd = jefe_ChestPlate;
					break;
				case 3:
					sd = jefe_PlateLegs;
					break;
				case 4:
					sd = jefe_Boots;
					break;
			}
		} else if(name == staffList[1]){
			randVal = rand.nextInt(3);
			
			if(randVal <= 2){
				sd = majorKane_PimpCane;
			}
			else{
				sd = majorKane_Pick;
			}
		} else if(name == staffList[2]){
			randVal = rand.nextInt(1);
			
			if(randVal == 0){
				sd = supahTree_Sapling;
			}
			else{
				sd = supahTree_Stick;
			}
		} else if(name == staffList[3]){
			sd = mekaj_DoucheBagBow;
		} else if(name == staffList[4]){
			sd = emma1337_DiamondBootsies;
		} else if(name == staffList[5]){
			sd = bcuz_PumpkinVision;
		} else if(name == staffList[6]){
			//TODO: Str8tUpSkillz's Legendary
			Bukkit.broadcastMessage(Color.RED + "REMIND XXPRODIGALXX TO MAKE STR8UPSKILLZ A LEGENDARY");
		} else if(name == staffList[7]){
			sd = ragnas_DiamondPick;
		} else if(name == staffList[8]){
			//TODO: Dt546's Legendary
			Bukkit.broadcastMessage(Color.RED + "REMIND XXPRODIGALXX TO MAKE DT546 A LEGENDARY");
		} else if(name == staffList[9]){
			sd = xxprodigalxx_Rose;
		}
		
		randVal = rand.nextInt(5);
		
		if(randVal > 2){
			Legendarys temp = new Legendarys(new Skull(name).getItemStack());
				temp.setItemName(name + "'s skull");
				temp.setItemRarity(3);
				temp.setItemLore("The skull of " + name + ".");
				
			sd = temp.getItemStack();
			
		}
		
		Legendarys temp = new Legendarys(new Skull(name).getItemStack());
			temp.setItemName(name + "'s skull");
			temp.setItemRarity(3);
			temp.setItemLore("The skull of " + name + ".");
		
			sd = temp.getItemStack();
		
		return sd;
	}
	
	public ItemStack getStaffSkull(){
		return staff_Skull;
	}
	
}
