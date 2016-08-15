
public class Bow extends Weapon implements Upgradable{

	int numArrows;
	
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
			System.out.println("The bow is used to throw an arrow and caused damage of " + damageAmount + " points.");
			return true;
		}
		else {
			return false;
		}
		
	}


	@Override
	public String toString() {
		return "Bow [Number of Arrows=" + numArrows + ", Weapon damage amount=" + damageAmount + ", Weapon price=" + itemPrice
				+ ", Item weight=" + itemWeight + "]";
	}
	

}
