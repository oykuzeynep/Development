package book;

import java.util.Arrays;

public class Purchase extends ShoppingCart {

	private String purchaseDate;
	private String shippingDate;
	private int deliveryLength;
	
	public Purchase(String purchaseDate, String shippingDate, int deliveryLength) {
		super();
		this.purchaseDate = purchaseDate;
		this.shippingDate = shippingDate;
		if (deliveryLength >= 0)
			this.deliveryLength = deliveryLength;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	public int getDeliveryLength() {
		return deliveryLength;
	}

	public void setDeliveryLength(int deliveryLength) {
		if (deliveryLength >= 0)
			this.deliveryLength = deliveryLength;
		else 
			this.deliveryLength = 3;
		}
	
	public double getTotalPayment(){
		double total = 0;
		for (int i = 0; i < contents.length; i++) {
			if(contents[i] instanceof EBook)
				total += contents[i].getPrice();
			else if(contents[i] instanceof HardCopyBook)
				total += ((HardCopyBook)contents[i]).getTotalCost();
		}
		return total;
	}

	
    @Override
    public String toString() {
        String myToString ="Purchase Date: " + this.purchaseDate + "\n"
                + "Shipping Date: " + this.shippingDate + "\n"
                + "Delivery Length: " + this.deliveryLength + "\n"
                + super.toString();
        return myToString;
}
	
	
	
	
}
