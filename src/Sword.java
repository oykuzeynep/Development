
public class Sword extends Weapon{

	
	public Sword(double price, double weight, double damage) {
		super(price, weight, damage);
	}

	@Override
	public boolean useItem() {
		System.out.println("The sword is used and caused damage of " + damageAmount + " points.");
		return true;
	}

	@Override
	public String toString() {
		return "Sword [damageAmount=" + damageAmount + ", itemPrice=" + itemPrice + ", itemWeight=" + itemWeight + "]";
	}
	
	


}
