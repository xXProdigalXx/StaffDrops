package StaffDrops.republica.devteam;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Server;
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
		Enchantment supahTree_SaplingEnchant = new EnchantmentWrapper(16);
	ItemStack supahTree_Stick = new ItemStack(280, 1);//Silk-Touch 3
		Enchantment supahTree_StickEnchant = new EnchantmentWrapper(33);
		
	ItemStack mekaj_DoucheBagBow = new ItemStack(261, 1);//Infinity 1, Flame 1
		Enchantment mekaj_DoucheBagBowEnchant1 = new EnchantmentWrapper(50);
		Enchantment mekaj_DoucheBagBowEnchant2 = new EnchantmentWrapper(51);
		
	ItemStack emma1337_DiamondBootsies = new ItemStack(313, 1);//Feather-falling 5
		Enchantment emma1337_DiamondBootsiesEnchant = new EnchantmentWrapper(2);
		
	//TODO: Make Str8tUpSkillz a legendary
		
	//TODO: Make Dt546 a legendary
		
	ItemStack xxprodigalxx_Rose = new ItemStack(38, 1);//Fortune 5
		Enchantment xxprodigalxx_RoseEnchant = new EnchantmentWrapper(35);
		
	ItemStack theKnowledgeOfMeiskam = new ItemStack(387, 1);
		
	Random rand = new Random();
	
	public staffList(){ //Possibly nerf a few of these
		
		staff_Skull.addUnsafeEnchantment(staff_SkullEnchant1, 3);
		staff_Skull.addUnsafeEnchantment(staff_SkullEnchant2, 3);
		staff_Skull.addUnsafeEnchantment(staff_SkullEnchant3, 3);
		
		jefe_Sword.addUnsafeEnchantment(jefe_SwordEnchant1, 2);
		jefe_Sword.addUnsafeEnchantment(jefe_SwordEnchant2, 3);
		
		jefe_Helmet.addUnsafeEnchantment(jefe_HelmetEnchant, 4);
		
		jefe_ChestPlate.addUnsafeEnchantment(jefe_ChestPlateEnchant, 4);
		
		jefe_PlateLegs.addUnsafeEnchantment(jefe_PlateLegsEnchant, 4);
		
		jefe_Boots.addUnsafeEnchantment(jefe_BootsEnchant1, 4);
		jefe_Boots.addUnsafeEnchantment(jefe_BootsEnchant2, 4);
		
		majorKane_Pick.addUnsafeEnchantment(majorKane_PickEnchant1, 5);
		majorKane_Pick.addUnsafeEnchantment(majorKane_PickEnchant2, 5);
		majorKane_Pick.addUnsafeEnchantment(majorKane_PickEnchant3, 2);
		
		majorKane_PimpCane.addUnsafeEnchantment(majorKane_PimpCaneEnchant, 3);
		
		supahTree_Sapling.addUnsafeEnchantment(supahTree_SaplingEnchant, 5);
		
		supahTree_Stick.addUnsafeEnchantment(supahTree_StickEnchant, 3);
		
		mekaj_DoucheBagBow.addUnsafeEnchantment(mekaj_DoucheBagBowEnchant1, 4);
		mekaj_DoucheBagBow.addUnsafeEnchantment(mekaj_DoucheBagBowEnchant2, 4);
		
		emma1337_DiamondBootsies.addUnsafeEnchantment(emma1337_DiamondBootsiesEnchant, 5);
		
		//TODO: Make Str8tUpSkillz Lengendaries enchanted
		
		//TODO: Make Dt546's Legendaries enchanted
		
		xxprodigalxx_Rose.addUnsafeEnchantment(xxprodigalxx_RoseEnchant, 5);
		
		Legendarys JefeSword = new Legendarys(jefe_Sword);
			JefeSword.setItemName("Jefe323's Sword");
			JefeSword.setItemRarity(4);
			JefeSword.setItemLore("The sword of Jefe323.");
			
		jefe_Sword = JefeSword.getItemStack();
		
		Legendarys JefeHelmet = new Legendarys(jefe_Helmet);
			JefeHelmet.setItemName("Jefe323's Helmet");
			JefeHelmet.setItemRarity(4);
			JefeHelmet.setItemLore("The helmet of Jefe323.");
		
		jefe_Helmet = JefeHelmet.getItemStack();
		
		Legendarys JefeChestPlate = new Legendarys(jefe_ChestPlate);
			JefeChestPlate.setItemName("Jefe323's Breastplate");
			JefeChestPlate.setItemRarity(4);
			JefeChestPlate.setItemLore("The breastplate of Jefe323.");
			
		jefe_ChestPlate = JefeChestPlate.getItemStack();
		
		Legendarys JefePlateLegs = new Legendarys(jefe_PlateLegs);
			JefePlateLegs.setItemName("Jefe323's Platelegs");
			JefePlateLegs.setItemRarity(4);
			JefePlateLegs.setItemLore("The Platelegs of Jefe323.");
			
		jefe_PlateLegs = JefePlateLegs.getItemStack();
			
		Legendarys JefeBoots = new Legendarys(jefe_Boots);
			JefeBoots.setItemName("Jefe323's Boots");
			JefeBoots.setItemRarity(4);
			JefeBoots.setItemLore("The Boots of Jefe323.");
			
		jefe_Boots = JefeBoots.getItemStack();
		
		Legendarys MajorKanePick = new Legendarys(majorKane_Pick);
			MajorKanePick.setItemName("MajorKane's ThunderPick");
			MajorKanePick.setItemRarity(4);
			MajorKanePick.setItemLore("When the thunder starts a shocking, Its because MajorKane came a knocking.");
			
		majorKane_Pick = MajorKanePick.getItemStack();
		
		Legendarys MajorKanePimpCane = new Legendarys(majorKane_PimpCane);
			MajorKanePimpCane.setItemName("The Pimp Kane");
			MajorKanePimpCane.setItemRarity(4);
			MajorKanePimpCane.setItemLore("Who doesn't love a good hoe?");
			
		majorKane_PimpCane = MajorKanePimpCane.getItemStack();
		
		Legendarys SupahTreeSapling = new Legendarys(supahTree_Sapling);
			SupahTreeSapling.setItemName("SupahSapling");
			SupahTreeSapling.setItemRarity(4);
			SupahTreeSapling.setItemLore("You don't want to know where this came from...");
			
		supahTree_Sapling = SupahTreeSapling.getItemStack();
		
		Legendarys SupahTreeArm = new Legendarys(supahTree_Stick);
			SupahTreeArm.setItemName("Supah's Right Arm");
			SupahTreeArm.setItemRarity(4);
			SupahTreeArm.setItemLore("How did you get this you douche?!?!");
			
		supahTree_Stick = SupahTreeArm.getItemStack();
		
		Legendarys MekajBow = new Legendarys(mekaj_DoucheBagBow);
			MekajBow.setItemName("Mekaj's bow of douchbaggery");
			MekajBow.setItemRarity(4);
			MekajBow.setItemLore("This isn't overpowered at all...");
			
		mekaj_DoucheBagBow = MekajBow.getItemStack();
		
		Legendarys EmmaBootsies = new Legendarys(emma1337_DiamondBootsies);
			EmmaBootsies.setItemName("Emma1337's Diamond Bootsies");
			EmmaBootsies.setItemRarity(4);
			EmmaBootsies.setItemLore("How did you get these? She never takes them off.");
			
		emma1337_DiamondBootsies = EmmaBootsies.getItemStack();
		
		Legendarys ProdigalRose = new Legendarys(xxprodigalxx_Rose);
			ProdigalRose.setItemName("xXProdigalXx's Rose of Faggotry");
			ProdigalRose.setItemRarity(4);
			ProdigalRose.setItemLore("Seriously, what kind of straight man carries roses on him?");
			
		xxprodigalxx_Rose = ProdigalRose.getItemStack();
			
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
	
	public ItemStack getStaffDrop(String name, boolean playerIsOnline){
		
		Bukkit.broadcastMessage(name);

		ItemStack sd = null;
		int randVal = 0;
				
		if(name == null){
			Bukkit.broadcastMessage(name);
			return null;
		}
		
		if(name.toLowerCase().equals(staffList[0].toLowerCase())){
			randVal = rand.nextInt(5);
			
			Bukkit.broadcastMessage(String.valueOf(randVal));
			
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
		} else if(name.toLowerCase().equals(staffList[1].toLowerCase())){
			randVal = rand.nextInt(3);
			
			if(randVal <= 2){
				sd = majorKane_PimpCane;
			}
			else{
				sd = majorKane_Pick;
			}
		} else if(name.toLowerCase().equals(staffList[2].toLowerCase())){
			randVal = rand.nextInt(1);
			
			if(randVal == 0){
				sd = supahTree_Sapling;
			}
			else{
				sd = supahTree_Stick;
			}
		} else if(name.toLowerCase().equals(staffList[3].toLowerCase())){
			sd = mekaj_DoucheBagBow;
		} else if(name.toLowerCase().equals(staffList[4].toLowerCase())){
			sd = emma1337_DiamondBootsies;
		} else if(name.toLowerCase().equals(staffList[5].toLowerCase())){
		} else if(name.toLowerCase().equals(staffList[6].toLowerCase())){
			//TODO: Str8tUpSkillz's Legendary
			Bukkit.broadcastMessage(Color.RED + "REMIND XXPRODIGALXX TO MAKE STR8UPSKILLZ A LEGENDARY");
		} else if(name.toLowerCase().equals(staffList[7].toLowerCase())){
		} else if(name.toLowerCase().equals(staffList[8].toLowerCase())){
			//TODO: Dt546's Legendary
			Bukkit.broadcastMessage(Color.RED + "REMIND XXPRODIGALXX TO MAKE DT546 A LEGENDARY");
		} else if(name.toLowerCase().equals(staffList[9].toLowerCase())){
			sd = xxprodigalxx_Rose;
		} else {
			sd = new ItemStack(0, 1);
		}
		
		randVal = rand.nextInt(5);
		
		if(randVal > 2 && playerIsOnline){
			Legendarys StaffSkull = new Legendarys(staff_Skull);
				StaffSkull.setItemName(name + "'s skull");
				StaffSkull.setItemRarity(3);
				StaffSkull.setItemLore("The skull of " + name + ".");
				StaffSkull.setSkullOwner(name);
				
			sd = StaffSkull.getItemStack();
			
		}
		
		Bukkit.broadcastMessage(sd.toString());
		
		return sd;
	}
	
	public ItemStack getStaffSkull(){
		return staff_Skull;
	}
	
}
