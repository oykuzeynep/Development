
public class Account {

	private double balance; // public olursa acc.balance ile ulaşılabilir
	private int id;
	
	public Account(int id) {
		this.id = id;
		balance = 0;
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		}
		else
			System.out.println("Yetersiz bakiye.");
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public double getBalance() {
		return balance;
	}

	public int getId() {
		return id;
	}
	
	
}
