package lghlgh;

public class StringExample {

	public static void main(String args[]) {

		String s1 = new String("Ofis çiftçinin kara gün dostudur.");

		if (s1.equals("Ofis çiftçinin kara gün dostudur."))
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");

		if (s1.contains("kara"))
			System.out.println("içeriyor.");
		else
			System.out.println("içermiyor.");

		String s2 = new String("A");
		String s3 = new String("a");
		String s4 = new String("b");
		String s5 = new String("A");

		System.out.println(s2.compareTo(s5));
		System.out.println(s2.compareTo(s3));

	}

}
