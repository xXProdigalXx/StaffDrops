package StaffDrops.republica.devteam;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class jefeSuitEffect {
	
	staffList sl = new staffList();
	PotionEffect DR = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10, 4);
	PotionEffect S = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10, 4);
	
	PotionEffect B = new PotionEffect(PotionEffectType.BLINDNESS, 30, 4);
	PotionEffect C = new PotionEffect(PotionEffectType.CONFUSION, 120, 4);
	PotionEffect P = new PotionEffect(PotionEffectType.POISON, 120, 4);
	
	Player[] wearers;
	boolean tempBool; //TODO: rename variable
	
	/*public void giveJefeSuitEffect(Player player){
		PlayerInventory inven = player.getInventory();
		
		ItemStack JH = sl.jefe_Helmet;
		ItemStack JCP = sl.jefe_ChestPlate;
		ItemStack JPL = sl.jefe_PlateLegs;
		ItemStack JB = sl.jefe_Boots;
		
		if(inven.getHelmet() == JH && inven.getChestplate() == JCP && inven.getLeggings() == JPL
				&& inven.getBoots() == JB){
			
			
			player.addPotionEffect(DR);
			player.addPotionEffect(S);
			
			addPlayer(player);
		}
		else{
			
			for(Player p : wearers){
				if(p == player){
					tempBool = true;
					break;
				}
			}
			
			if(tempBool){
				player.addPotionEffect(B);
				player.addPotionEffect(C);
				player.addPotionEffect(P);
				
				removePlayer(player);
			}
		}
	}*/
	
	public void addPlayer(Player player){
		wearers[wearers.length] = player;
	}
	
	@SuppressWarnings("null")
	public void removePlayer(Player player){
		Player[] temp = null;
		
		int x = 0;
		
		for(int i = 0; i < wearers.length - x; i++){
			if(player != wearers[i]){
				temp[i] = wearers[i];
				x++;
			}
		}
		
		wearers = temp;
	}
}
