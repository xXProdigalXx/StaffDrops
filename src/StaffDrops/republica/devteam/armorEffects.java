package StaffDrops.republica.devteam;

import org.bukkit.entity.Player;

public class armorEffects {
	
	jefeSuitEffect jse = new jefeSuitEffect();
	pumpkinVision pv = new pumpkinVision();
	
	public void setArmorEffects(Player player){
		//jse.giveJefeSuitEffect(player);
		pv.givePumpkinVision(player);
	}
	
}
