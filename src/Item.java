
public abstract class Item {

	int itemQuantity = 0;
	double itemPrice;
	double itemWeight;
	
	public Item(double price, double weight) {
		if(price < 0) {
			price = 0;
		}
		if(weight < 0) {
			weight = 0;
		}
		this.itemPrice = price;
		this.itemWeight = weight;
	}
	

	public abstract boolean useItem();
	
	public static String getItemQuantity() {
		// TODO Auto-generated method stub
		return null;
	}
}
