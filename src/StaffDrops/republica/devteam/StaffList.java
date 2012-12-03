package StaffDrops.republica.devteam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class StaffList {

	private final String[] staffList = { "Jefe323", "MajorKane", "SupahTree",
			"Mekaj", "Emma1337", "Bcuz", "Str8tUpSkillz", "Ragnas", "Dt546",
			"xXProdigalXx" };// TODO: Make array constant
	
	private HashMap<String, ArrayList<ItemStack>> legendaries = new HashMap<String, ArrayList<ItemStack>>();

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
	private ItemStack supahTreeStick = new ItemStack(280, 1);// Silk-Touch 1

	private ItemStack mekajBow = new ItemStack(261, 1);// Infinity 1, Flame 1

	private ItemStack emma1337Boots = new ItemStack(313, 1);// Feather-falling
																// 5

	// TODO: Make Str8tUpSkillz a legendary

	// TODO: Make Dt546 a legendary

	private ItemStack completeLoserRose = new ItemStack(38, 1);// Fortune 5 doesn't exist so 3

	private ILessThanThreeMeiskam book = new ILessThanThreeMeiskam();

	private Random rand = new Random();
	
	private ItemStack addInfo(ItemStack item, String name, int rarity, String lore) {
		Legendary itemLegendary = new Legendary(item);
		itemLegendary.setItemName(name);
		itemLegendary.setItemRarity(rarity);
		itemLegendary.setItemLore(lore);
		return itemLegendary.getItemStack();
	}

	public StaffList() { // Possibly nerf a few of these
		// possibly also buff mekaj's bow to match the lore for it
		staffSkull.addUnsafeEnchantment(Enchantment.OXYGEN, 3);
		staffSkull.addUnsafeEnchantment(Enchantment.WATER_WORKER, 1);
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

		supahTreeStick.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);

		mekajBow.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
		mekajBow.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);

		emma1337Boots.addUnsafeEnchantment(
				Enchantment.PROTECTION_FALL, 4);

		// TODO: Make Str8tUpSkillz Lengendaries enchanted

		// TODO: Make Dt546's Legendaries enchanted

		completeLoserRose.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);

		jefeSword = addInfo(jefeSword, "Jefe323's Sword", 4, "The sword of Jefe323.");

		jefeHelmet = addInfo(jefeHelmet, "Jefe323's Helmet", 4, "The helmet of Jefe323.");

		jefeChestPlate = addInfo(jefeChestPlate, "Jefe323's Breastplate", 4, "The breastplate of Jefe323.");

		jefeLeggings = addInfo(jefeLeggings, "Jefe323's Platelegs", 4, "The Platelegs of Jefe323.");

		jefeBoots = addInfo(jefeBoots, "Jefe323's Boots", 4, "The Boots of Jefe323.");

		majorKanePick = addInfo(majorKanePick, "MajorKane's ThunderPick", 4, "When the thunder starts a shocking, Its because MajorKane came a knocking.");

		majorKanePimpCane = addInfo(majorKanePimpCane, "The Pimp Kane", 4, "Who doesn't love a good hoe?");

		supahTreeSapling = addInfo(supahTreeSapling, "SupahSapling", 4, "You don't want to know where this came from...");

		supahTreeStick = addInfo(supahTreeStick, "Supah's Right Arm", 4, "How did you get this you douche?!?!");

		mekajBow = addInfo(mekajBow, "Mekaj's bow of douchbaggery", 4, "This isn't overpowered at all...");

		emma1337Boots = addInfo(emma1337Boots, "Emma1337's Diamond Bootsies", 4, "How did you get these? She never takes them off.");

		completeLoserRose = addInfo(completeLoserRose, "xXProdigalXx's Rose of Faggotry", 4, "Seriously, what kind of straight man carries roses on him?");
		
		add("Jefe323", jefeSword, jefeHelmet, jefeChestPlate, jefeLeggings, jefeBoots);
		add("MajorKane", majorKanePick, majorKanePimpCane);
		add("SupahTree", supahTreeSapling, supahTreeStick);
		add("Mekaj", mekajBow);
		add("Emma1337", emma1337Boots);
		add("xXProdigalXx", completeLoserRose);
		add("meiskam", book.getItemStack()); // this may or may not be useful
	}
	
	private void add(String user, ItemStack... itemStacks) {
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		for (ItemStack i : itemStacks) {
			items.add(i);
		}
		legendaries.put(user.toLowerCase(), items);
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
	
	public ArrayList<ItemStack> getAllItems() {
		ArrayList<ItemStack> result = new ArrayList<ItemStack>();
		for (ArrayList<ItemStack> items : legendaries.values()) {
			result.addAll(items);
		}
		return result;
	}
	
	public ItemStack decideFor(ArrayList<ItemStack> items) {
		int randVal = rand.nextInt(items.size());
		return items.get(randVal);
	}

	public ItemStack getStaffDrop(String playerName, boolean playerIsOnline) {
		String name = playerName.toLowerCase();
		if (!legendaries.containsKey(name)) return new ItemStack(0, 1);
		
		ItemStack sd = decideFor(legendaries.get(name));

		if (rand.nextInt(5) > 2 && playerIsOnline) {
			sd = addInfo(staffSkull, playerName + "'s skull", 3, "The skull of " + playerName + ".");
			Legendary usefulSkull = new Legendary(sd);
			usefulSkull.setSkullOwner(playerName);
			sd = usefulSkull.getItemStack();

		}
		return sd;
	}

}
