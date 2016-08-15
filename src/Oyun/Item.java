package Oyun;

public abstract class Item {

	private static int itemQuantity = 0;
	private double itemPrice;
	private double itemWeight;
	
	public Item(double price, double weight) {
		if(price < 0) {
			price = 0;
		}
		if(weight < 0) {
			weight = 0;
		}
		itemPrice = price;
		itemWeight = weight;
		itemQuantity++;
	}
	

	public double getItemPrice() {
		return itemPrice;
	}


	public double getItemWeight() {
		return itemWeight;
	}


	public abstract boolean useItem();
	
	public static int getItemQuantity() {
		return itemQuantity;
	}
}