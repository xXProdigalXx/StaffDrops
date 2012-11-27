package StaffDrops.republica.devteam;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class StaffList {

	private final String[] staffList = { "Jefe323", "MajorKane", "SupahTree",
			"Mekaj", "Emma1337", "Bcuz", "Str8tUpSkillz", "Ragnas", "Dt546",
			"xXProdigalXx" };// TODO: Make array constant

	// TODO: Name each item

	// Skull ProdigalSkull = new Skull();

	private ItemStack staffSkull = new ItemStack(397, 1, (short) 3);// Respiration 3,
																// Aqua-affinity
																// 3, Fortune 3

	// TODO: Make the tag of the staff skull be dependent on the staff member
	// who dropped it

	private ItemStack jefeSword = new ItemStack(283, 1);// Sharpness 2, Fire Aspect 3
	private ItemStack jefeHelmet = new ItemStack(314, 1);// Protection 4
	private ItemStack jefeChestPlate = new ItemStack(315, 1);// Fire Protection 4
	private ItemStack jefeLeggings = new ItemStack(316, 1);// Projectile Protection 4
	private ItemStack jefeBoots = new ItemStack(317, 1);// Feather-falling 4, Blast
													// Protection 4

	private ItemStack majorKanePick = new ItemStack(285, 1);// Sharpness 5, Smite 5,
														// Fire Aspect 2
	private ItemStack majorKanePimpCane = new ItemStack(294, 1);// Looting 3

	private ItemStack supahTreeSapling = new ItemStack(6, 1);// Sharpness 5
	private ItemStack supahTreeStick = new ItemStack(280, 1);// Silk-Touch 3

	private ItemStack mekajBow = new ItemStack(261, 1);// Infinity 1, Flame 1

	private ItemStack emma1337Boots = new ItemStack(313, 1);// Feather-falling
																// 5

	// TODO: Make Str8tUpSkillz a legendary

	// TODO: Make Dt546 a legendary

	private ItemStack completeLoserRose = new ItemStack(38, 1);// Fortune 5

	private ILessThanThreeMeiskam book = new ILessThanThreeMeiskam();

	private Random rand = new Random();

	public StaffList() { // Possibly nerf a few of these

		staffSkull.addUnsafeEnchantment(Enchantment.OXYGEN, 3);
		staffSkull.addUnsafeEnchantment(Enchantment.WATER_WORKER, 3);
		staffSkull.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);

		jefeSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
		jefeSword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 3);

		jefeHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

		jefeChestPlate.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 4);

		jefeLeggings.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);

		jefeBoots.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 4);
		jefeBoots.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 4);

		majorKanePick.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
		majorKanePick.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 5);
		majorKanePick.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);

		majorKanePimpCane.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);

		supahTreeSapling.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);

		supahTreeStick.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 3);

		mekajBow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 4);
		mekajBow.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 4);

		emma1337Boots.addUnsafeEnchantment(
				Enchantment.PROTECTION_FALL, 5);

		// TODO: Make Str8tUpSkillz Lengendaries enchanted

		// TODO: Make Dt546's Legendaries enchanted

		completeLoserRose.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);

		Legendary JefeSword = new Legendary(jefeSword);
		JefeSword.setItemName("Jefe323's Sword");
		JefeSword.setItemRarity(4);
		JefeSword.setItemLore("The sword of Jefe323.");

		jefeSword = JefeSword.getItemStack();

		Legendary JefeHelmet = new Legendary(jefeHelmet);
		JefeHelmet.setItemName("Jefe323's Helmet");
		JefeHelmet.setItemRarity(4);
		JefeHelmet.setItemLore("The helmet of Jefe323.");

		jefeHelmet = JefeHelmet.getItemStack();

		Legendary JefeChestPlate = new Legendary(jefeChestPlate);
		JefeChestPlate.setItemName("Jefe323's Breastplate");
		JefeChestPlate.setItemRarity(4);
		JefeChestPlate.setItemLore("The breastplate of Jefe323.");

		jefeChestPlate = JefeChestPlate.getItemStack();

		Legendary JefePlateLegs = new Legendary(jefeLeggings);
		JefePlateLegs.setItemName("Jefe323's Platelegs");
		JefePlateLegs.setItemRarity(4);
		JefePlateLegs.setItemLore("The Platelegs of Jefe323.");

		jefeLeggings = JefePlateLegs.getItemStack();

		Legendary JefeBoots = new Legendary(jefeBoots);
		JefeBoots.setItemName("Jefe323's Boots");
		JefeBoots.setItemRarity(4);
		JefeBoots.setItemLore("The Boots of Jefe323.");

		jefeBoots = JefeBoots.getItemStack();

		Legendary MajorKanePick = new Legendary(majorKanePick);
		MajorKanePick.setItemName("MajorKane's ThunderPick");
		MajorKanePick.setItemRarity(4);
		MajorKanePick
				.setItemLore("When the thunder starts a shocking, Its because MajorKane came a knocking.");

		majorKanePick = MajorKanePick.getItemStack();

		Legendary MajorKanePimpCane = new Legendary(majorKanePimpCane);
		MajorKanePimpCane.setItemName("The Pimp Kane");
		MajorKanePimpCane.setItemRarity(4);
		MajorKanePimpCane.setItemLore("Who doesn't love a good hoe?");

		majorKanePimpCane = MajorKanePimpCane.getItemStack();

		Legendary SupahTreeSapling = new Legendary(supahTreeSapling);
		SupahTreeSapling.setItemName("SupahSapling");
		SupahTreeSapling.setItemRarity(4);
		SupahTreeSapling
				.setItemLore("You don't want to know where this came from...");

		supahTreeSapling = SupahTreeSapling.getItemStack();

		Legendary SupahTreeArm = new Legendary(supahTreeStick);
		SupahTreeArm.setItemName("Supah's Right Arm");
		SupahTreeArm.setItemRarity(4);
		SupahTreeArm.setItemLore("How did you get this you douche?!?!");

		supahTreeStick = SupahTreeArm.getItemStack();

		Legendary MekajBow = new Legendary(mekajBow);
		MekajBow.setItemName("Mekaj's bow of douchbaggery");
		MekajBow.setItemRarity(4);
		MekajBow.setItemLore("This isn't overpowered at all...");

		mekajBow = MekajBow.getItemStack();

		Legendary EmmaBootsies = new Legendary(emma1337Boots);
		EmmaBootsies.setItemName("Emma1337's Diamond Bootsies");
		EmmaBootsies.setItemRarity(4);
		EmmaBootsies
				.setItemLore("How did you get these? She never takes them off.");

		emma1337Boots = EmmaBootsies.getItemStack();

		Legendary ProdigalRose = new Legendary(completeLoserRose);
		ProdigalRose.setItemName("xXProdigalXx's Rose of Faggotry");
		ProdigalRose.setItemRarity(4);
		ProdigalRose
				.setItemLore("Seriously, what kind of straight man carries roses on him?");

		completeLoserRose = ProdigalRose.getItemStack();

	}

	public boolean isStaff(String name) {
		boolean returnVal = false;

		for (String sl : staffList) {
			if (name.equalsIgnoreCase(sl)) {
				returnVal = true;
				break;
			}
		}

		return returnVal;
	}

	public ItemStack getStaffDrop(String name, boolean playerIsOnline) {

		ItemStack sd = null;
		int randVal = 0;

		if (name.toLowerCase().equals(staffList[0].toLowerCase())) {
			randVal = rand.nextInt(5);

			Bukkit.broadcastMessage(String.valueOf(randVal));

			switch (randVal) {
			case 0:
				sd = jefeSword;
				break;
			case 1:
				sd = jefeHelmet;
				break;
			case 2:
				sd = jefeChestPlate;
				break;
			case 3:
				sd = jefeLeggings;
				break;
			case 4:
				sd = jefeBoots;
				break;
			}
		} else if (name.toLowerCase().equals(staffList[1].toLowerCase())) {
			randVal = rand.nextInt(3);

			if (randVal <= 2) {
				sd = majorKanePimpCane;
			} else {
				sd = majorKanePick;
			}
		} else if (name.toLowerCase().equals(staffList[2].toLowerCase())) {
			randVal = rand.nextInt(1);

			if (randVal == 0) {
				sd = supahTreeSapling;
			} else {
				sd = supahTreeStick;
			}
		} else if (name.toLowerCase().equals(staffList[3].toLowerCase())) {
			sd = mekajBow;
		} else if (name.toLowerCase().equals(staffList[4].toLowerCase())) {
			sd = emma1337Boots;
		} else if (name.toLowerCase().equals(staffList[5].toLowerCase())) {
		} else if (name.toLowerCase().equals(staffList[6].toLowerCase())) {
			// TODO: Str8tUpSkillz's Legendary
			Bukkit.broadcastMessage(ChatColor.RED
					+ "REMIND XXPRODIGALXX TO MAKE STR8UPSKILLZ A LEGENDARY");
		} else if (name.toLowerCase().equals(staffList[7].toLowerCase())) {
		} else if (name.toLowerCase().equals(staffList[8].toLowerCase())) {
			// TODO: Dt546's Legendary
			Bukkit.broadcastMessage(ChatColor.RED
					+ "REMIND XXPRODIGALXX TO MAKE DT546 A LEGENDARY");
		} else if (name.toLowerCase().equals(staffList[9].toLowerCase())) {
			sd = completeLoserRose;
		} else if (name.toLowerCase().equals("meiskam")) {
			sd = book.getItemStack();
		} else {

			sd = new ItemStack(0, 1);
		}

		randVal = rand.nextInt(5);

		if (randVal > 2 && playerIsOnline) {
			Legendary StaffSkull = new Legendary(staffSkull);
			StaffSkull.setItemName(name + "'s skull");
			StaffSkull.setItemRarity(3);
			StaffSkull.setItemLore("The skull of " + name + ".");
			StaffSkull.setSkullOwner(name);

			sd = StaffSkull.getItemStack();

		}
		return sd;
	}

	public ItemStack getStaffSkull() {
		return staffSkull;
	}

}
