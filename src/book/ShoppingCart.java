package book;

import java.util.Arrays;

public class ShoppingCart {
	
	public Book[] contents = new Book[10];
	private int numEntriesInCart = 0;
	
	public int getNumEntriesInCart(){
		return numEntriesInCart;
	}
	public void setNumEntriesInCart(int numEntriesInCart) {
		this.numEntriesInCart = numEntriesInCart;
	}
	
	public boolean addBook(Book book) {
		if(numEntriesInCart < 10) {
			contents[numEntriesInCart] = book;
			numEntriesInCart++;
			return true;
		}
		return false;
	}
	
	public boolean removeLastBook() {
		if(numEntriesInCart > 0) {
			contents[numEntriesInCart - 1] = null;
			numEntriesInCart--;
			return true;
		}
		return false;

	}
    public String toString(){
        String myToString = "==========================\n" +
                "This cart has " + numEntriesInCart + " books. \n";

        double totalPrice = 0.0;
        double totalCost = 0.0;
        for (int i = 0; i < numEntriesInCart; i++){
      	  myToString += contents[i].toString() + "\n";

            totalPrice += contents[i].getPrice();
            if(contents[i] instanceof HardCopyBook)
                totalCost += ((HardCopyBook) contents[i]).getTotalCost();
            else
                totalCost += contents[i].getPrice();

        }
        myToString += "Total price of the books in the cart: " + totalPrice + "\n" +
                "Total cost of the books in the cart: " + totalCost + ". \n";
        return myToString;
}
	
	

}
