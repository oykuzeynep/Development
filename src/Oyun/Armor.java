package Oyun;

/** @author oyku */

public class Armor extends Item implements Upgradable{

	private double defencePoints;
	private boolean isWorn;
	

	public Armor(double price, double weight, double defencePoints) {
		super(price, weight);
		isWorn = false;
		if(defencePoints < 0)
			defencePoints = 0;
		this.defencePoints = defencePoints;
	}

	public double getHit(double damagePoints) {
		if (isWorn) {
			if(defencePoints >= damagePoints) {
				defencePoints -= damagePoints;
				return 0;
			}
			
			else {
				defencePoints = 0;
				damagePoints -= defencePoints;
				return damagePoints;
			}
			
		}
		else {
			return damagePoints;
		}
		
	}



	public double getDefencePoints() {
		return defencePoints;
	}

	public boolean isWorn() {
		return isWorn;
	}

	public boolean useItem() {
		isWorn = true;
		return isWorn;
	}

	@Override
	public void upgrade() {
		defencePoints += 100;
		
	}

	@Override
	public String toString() {
		return "Armor [defencePoints=" + defencePoints + ", Price=" + getItemPrice() + ", Weight=" + getItemWeight() +"]";
	}
	
	


}