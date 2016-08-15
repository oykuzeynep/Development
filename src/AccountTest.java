
public class AccountTest {

	public static void main(String args[]) {
		Account acc1 = new Account(123);
		System.out.print(acc1.getBalance());
		acc1.deposit(20);
		
		System.out.print(acc1.getBalance());
		System.out.print(acc1.getId());

		acc1.withdraw(21);

	}
}
