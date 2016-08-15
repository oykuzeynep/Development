package book;

public class Test {
	public static void main(String args[]) {
		Customer c1 = new Customer("Öykü", "Bayramoğlu");
		
		HardCopyBook book1 = new HardCopyBook("Java How to Program", "anonim", "1", 25, 1, 1);
		HardCopyBook book2 = new HardCopyBook("C How to Program", "anonim", "2", 20, 1, 1);
		HardCopyBook book3 = new HardCopyBook("C++ How to Program", "anonim", "3", 25, 1, 1);			
		HardCopyBook book4 = new HardCopyBook("The Java Programming Language", "anonim", "4", 30, 1, 1);

		ShoppingCart cart = new ShoppingCart();
		
		cart.addBook(book1);
		cart.addBook(book2);
		cart.addBook(book3);
		cart.addBook(book4);

		Purchase pur1 = new Purchase("", "", 2);
		System.out.println(c1.placePurchase(pur1));
		

		
		EBook book5 = new EBook("Learn you some Erlang", "anonim", "5",  75, 200, "pdf", 1);
		EBook book6 = new EBook("Principals of Programming Languages", "anonim", "6",  125, 125, "chm", 3);
		EBook book7 = new EBook("Advanced Operating Systems", "anonim", "7",  50, 250, "chm", 2);
		
		pur1.addBook(book5);
		pur1.addBook(book6);
		pur1.addBook(book7);
		System.out.println(pur1);

		Purchase pur2 = new Purchase("", "", 3);
		System.out.println(c1.placePurchase(pur2));
		
		System.out.println(pur2);

		
		

		
		

	}

}
