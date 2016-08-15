package Oyun;


public class Bow extends Weapon implements Upgradable{

	private int numArrows;
	
	public Bow(double price, double weight, double damage, int numArrows) {

		super(price, weight, damage);
		if (numArrows < 0) {
			this.numArrows = 0;
		}
		else
			this.numArrows = numArrows;
		
	}


	public int getNumArrows() {
		return numArrows;
	}




	@Override
	public void upgrade() {

		numArrows += 10;
	}


	@Override
	public boolean useItem() {
		if(numArrows > 0) {
			numArrows--;
			System.out.println("The bow is used to throw an arrow and caused damage of " + getDamageAmount() + " points.");
			return true;
		}
		else {
			return false;
		}
		
	}


	@Override
	public String toString() {
		return "Bow [numArrows=" + numArrows + ", damageAmount=" + getDamageAmount() + ", itemPrice=" + getItemPrice()
				+ ", itemWeight=" + getItemWeight() + "]";
	}
	

}