package StaffDrops.republica.devteam;

import java.util.ArrayList;

import net.minecraft.server.Item;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class pumpkinVision {
	
	private ArrayList<Player> playersWithPumpkinVision = new ArrayList<Player>();
	
//	for(Player pl : playersWithPumpkinVision){
//		playersWithPumpkinVision.remove(pl);
//	}
	
	staffList sl = new staffList();
	PlayerInventory pi;
	
	PotionEffect C = new PotionEffect(PotionEffectType.CONFUSION, 1000, 4);
	PotionEffect PM = new PotionEffect(PotionEffectType.NIGHT_VISION, 1000, 2);
	
	PotionEffect NC = new PotionEffect(PotionEffectType.CONFUSION, 0, 4);
	PotionEffect NPM = new PotionEffect(PotionEffectType.NIGHT_VISION, 0, 4);
	
	boolean check = true;
	
	public void givePumpkinVision(Player player){
		pi = player.getInventory();
		
		//DropStaffItem.getInstanceLogger().info("noobz = " + player.getName());
		if (pi.getHelmet() == null) return;
		//DropStaffItem.getInstanceLogger().info("helmet = " + pi.getHelmet().toString());
		
		//ItemStack PumpkinHelm = sl.bcuz_PumpkinVision;
		ItemStack PH = new ItemStack(310);
		
		if(pi.getHelmet().getTypeId() == 310 && !player.hasPotionEffect(PotionEffectType.CONFUSION) && !player.hasPotionEffect(PotionEffectType.NIGHT_VISION)){
			Bukkit.broadcastMessage("THE FUCKING CHECK WORKED DIPSHIT.");
			
			player.addPotionEffect(C);
			player.addPotionEffect(PM);
			
			for(Player pl : playersWithPumpkinVision){
				if(pl == player){
					check = false;
					break;
				}
			}
		}
		
		for(Player pl : playersWithPumpkinVision){
			if(pl.getInventory().getHelmet().getTypeId() != 310 || pl.getInventory().getHelmet() == null){
				Bukkit.broadcastMessage("FUCK!!!");
			}
		}
	}
	
}
