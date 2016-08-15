package book;

public class HardCopyBook extends Book{
	
	private double weight;
	private double shippingCost;
	
	public HardCopyBook(String name, String author, String bookId, double price, double weight, double shippingCost) {
		super(name, author, bookId, price);
		this.weight = weight;
		this.shippingCost = shippingCost;
	}
	
	public double getTotalCost() {
		return shippingCost + this.getPrice(); 
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	@Override

    public String toString(){
        String myToString = super.toString() +
                "Book weight: " + this.getWeight() + "\n" +
                "Book shipping cost: " + this.getShippingCost() + "\n";
        return myToString;
}
	

}
