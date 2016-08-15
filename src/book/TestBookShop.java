package book;

public class TestBookShop {

    public static void main(String[] args){

		ShoppingCart cart = new ShoppingCart();

		Book b1 = new Book("Ah'lar Ağacı", "Didem Madak", "3418793409", 20.0);

		HardCopyBook b2 = new HardCopyBook("Sevdadır", "Arkadaş Zekai Özger" ,"3418793410", 80.0, 34.0, 10.0);
		HardCopyBook b3 = new HardCopyBook("Burada Gömülüdür", "Ahmet Erhan" ,"3418793411", 70.0, 42.0, 10.0);

		EBook b4 = new EBook("Hasretinden Prangalar Eskittim", "Ahmed Arif" ,"3418793412", 30.0, 3000.0, "mobi");
		b4.addDevice();
		EBook b5 = new EBook("Matematik ve Develerle Eşekler", "Ali Nesin", "3418793413", 40.0, 2000.0, "epub");

		cart.addBook(b1);
		cart.addBook(b2);
		cart.addBook(b3);
		cart.addBook(b4);
		cart.addBook(b5);

		System.out.println(cart.toString());

        Customer customer = new Customer("Ekim", "Akbay");
        HardCopyBook hcb1 = new HardCopyBook("Sırça Fanus", "Sylvia Plath", "3418793410", 25, 34.0, 10.0);
        HardCopyBook hcb2 = new HardCopyBook("Yabancı","Albert Camus" ,"3418793411", 20.0, 42.0, 10.0);
        HardCopyBook hcb3 = new HardCopyBook("Mülkiyet Nedir?","Pierre Joseph Proudhon" ,"3418793410", 80.0, 34.0, 10.0);
        HardCopyBook hcb4 = new HardCopyBook("Bulantı","Jean-Paul Sartre" ,"3418793411", 30.0, 42.0, 10.0);

        Purchase Purchase1 = new Purchase("10/08/2016", "13/08/2016", 5);
        Purchase1.addBook(hcb1);
        Purchase1.addBook(hcb2);
        Purchase1.addBook(hcb3);
        Purchase1.addBook(hcb4);
        customer.placePurchase(Purchase1);

        System.out.println(customer);

        EBook e1 = new EBook("Kalemimin Sapını Gülle Donattım", "Ferhan Şensoy", "3418793412", 75.0, 200, "epub");
        EBook e2 = new EBook("Şirince Meydan Muharebelerinin Mufassal Tarihçesi","Sevan Nişanyan" ,"3418793412", 125.0, 150, "epub");
        EBook e3 = new EBook("Mum Hala","Aziz Nesin" ,"3418793412", 50.0, 250, "epub");

        Purchase Purchase2 = new Purchase("17/02/2016", "19/02/2016", 5);
        Purchase2.addBook(e1);
        Purchase2.addBook(e2);
        Purchase2.addBook(e3);
        customer.placePurchase(Purchase2);

        System.out.println(customer);


        Book a1 = new Book("Dublinliler","James Joyce" ,"3418793409", 20.0);
        Purchase Purchase3 = new Purchase("17/02/2016", "19/02/2016", 5);
        Purchase3.addBook(a1);
        customer.placePurchase(Purchase3);

    }


}
