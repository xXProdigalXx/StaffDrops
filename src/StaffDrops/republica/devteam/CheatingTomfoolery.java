package StaffDrops.republica.devteam;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public class CheatingTomfoolery {
	
	private static void checkForProtip(Player p, ItemStack heldItem) {
		// assuming helmet has fortune enchantment
		// if held item has enchantments, warn the player that their item enchantments
		// are not being used
		if (heldItem.getEnchantments().isEmpty()) return;
		p.sendMessage("PROTIP: The Fortune-enchanted helmet cancels item enchantments.");
	}

	public static void helmetEnchantmentsChangingMining(BlockBreakEvent e) {
		if (e.isCancelled()) return;
		Player player = e.getPlayer();
		ItemStack helmet = player.getInventory().getHelmet();
		if (helmet == null) return;
		// we know the only helmet enchantment to worry about is fortune 3
		ItemStack fakeHeldItem = new ItemStack(1); // something
		fakeHeldItem.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		if (helmet.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS)) {
			e.setCancelled(true);
			handleFortune(fakeHeldItem, e.getBlock());
			checkForProtip(player, player.getItemInHand());
		}
	}
	
	public static void toolEnchantmentsOnSticksAndRoses(BlockBreakEvent e) {
		if (e.isCancelled()) return;
		Player player = e.getPlayer();
		ItemStack heldItem = player.getItemInHand();
		if (heldItem == null) return;
		// stick has silk touch
		// rose has fortune
		if (heldItem.getType().equals(Material.STICK)) {
			handleSilkTouch(heldItem, e.getBlock());
		}
		if (heldItem.getType().equals(Material.RED_ROSE)) {
			handleFortune(heldItem, e.getBlock());
		}
	}
	
	public static void swordEnchantmentsOnToolsAndSaplings(EntityDamageByEntityEvent e) {
		Entity damager = e.getDamager();
		if (!(damager instanceof Player)) return;
		Player player = (Player) damager;
		Entity damaged = e.getEntity();
		ItemStack heldItem = player.getItemInHand();
		if (!(damaged instanceof LivingEntity)) return;
		LivingEntity victim = (LivingEntity) damaged;
		if (heldItem.getType().equals(Material.SAPLING)) {
			handleSharpness(heldItem, victim);
		}
		if (heldItem.getType().equals(Material.DIAMOND_PICKAXE)) {
			handleSharpness(heldItem, victim);
			handleSmite(heldItem, victim);
			handleFireAspect(heldItem, victim);
		}
		if (heldItem.getType().equals(Material.DIAMOND_HOE)) {
			handleLooting(heldItem, victim);
		}
		// pickaxe has sharpness, smite, fire aspect
		// sapling has sharpness
		// hoe has looting
	}
	
	private static void handleFortune(ItemStack heldItem, Block target) {
		if (heldItem.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS)) {
			int level = heldItem.getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS);
			Material type = target.getType();
			for (int i = 0; i < level; i++) {
				target.breakNaturally();
				target.setType(type);
			}
			target.breakNaturally();
		}
	}
	
	private static void handleSilkTouch(ItemStack heldItem, Block target) {
		if (heldItem.containsEnchantment(Enchantment.SILK_TOUCH)) {
			Location pos = target.getLocation();
			Material type = target.getType();
			ItemStack item = new ItemStack(type, 1);
			item.setData(new MaterialData(type, target.getData()));
			target.getWorld().dropItemNaturally(pos, item);
			target.setTypeId(0);
		}
	}

	private static void handleSharpness(ItemStack heldItem, LivingEntity victim) {
		if (heldItem.containsEnchantment(Enchantment.DAMAGE_ALL)) {
			int level = heldItem.getEnchantmentLevel(Enchantment.DAMAGE_ALL);
			int bonus = 0;
			for (int i = 0; i < level; i++) {
				bonus += new Random().nextInt(3) + 1;
			}
			victim.damage(bonus);
		}
	}

	private static void handleSmite(ItemStack heldItem, LivingEntity victim) {
		if (victim.getType() == EntityType.PIG_ZOMBIE || victim.getType() == EntityType.ZOMBIE || victim.getType() == EntityType.SKELETON || victim.getType() == EntityType.WITHER) {
			if (heldItem.containsEnchantment(Enchantment.DAMAGE_UNDEAD)) {
				int level = heldItem.getEnchantmentLevel(Enchantment.DAMAGE_UNDEAD);
				int bonus = 0;
				for (int i = 0; i < level; i++) {
					bonus += new Random().nextInt(3) + 1;
				}
				victim.damage(bonus);
			}
		}
	}

	private static void handleFireAspect(ItemStack heldItem, LivingEntity victim) {
		if (heldItem.containsEnchantment(Enchantment.FIRE_ASPECT)) {
			int level = heldItem.getEnchantmentLevel(Enchantment.FIRE_ASPECT);
			int seconds = level * 4;
			victim.setFireTicks(seconds * 20);
		}
	}
	
	private static void handleLooting(ItemStack heldItem, LivingEntity victim) {
		if (heldItem.containsEnchantment(Enchantment.LOOT_BONUS_MOBS)) {
			int level = heldItem.getEnchantmentLevel(Enchantment.LOOT_BONUS_MOBS);
			// TODO make this much, much better
			for (int i = 0; i < level; i++) {
				Entity newlyCreated = victim.getWorld().spawnEntity(victim.getLocation(), victim.getType());
				LivingEntity newly = (LivingEntity) newlyCreated;
				newly.setHealth(0);
			}
		}
	}
}
