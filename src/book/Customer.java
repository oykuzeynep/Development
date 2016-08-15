package book;

import java.util.Arrays;

public class Customer {
	private String userName;
	private String userSurname;
	private int purchaseCount = 0;
	private Purchase[] purchaseHistory = new Purchase[2];

	public Customer(String userName, String userSurname) {
		super();
		this.userName = userName;
		this.userSurname = userSurname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public int getPurchaseCount() {
		return purchaseCount;
	}

	public void setPurchaseCount(int purchaseCount) {
		this.purchaseCount = purchaseCount;
	}

	public boolean placePurchase(Purchase current) {
		if (purchaseCount < 2) {
			purchaseHistory[purchaseCount] = current;
			purchaseCount++;
			return true;
		}
		
		System.out.println("We cannot process your purchase for now! Please try again later.");
		return false;

	}

	public double getTotalAmountSpent() {
		double total = 0;
		for (int i = 0; i < purchaseCount; i++)
			total += purchaseHistory[i].getTotalPayment();
		return total;
	}


    public String toString() {
        String myToString = "++++++++++++++++++++++++++++++++\n"
                + "Customer user name: " + this.userName + "\n"
                + "Customer user surname: " + this.userSurname + "\n";
        for(int i = 0; i < this.purchaseCount; i++){
            String temp = "--------------------------------\n"
                    + "*****Purchase #" + (i+1) + ":\n"
                    + this.purchaseHistory[i].toString() + "\n";
            myToString += temp;
        }
        return myToString;
}
	

}
