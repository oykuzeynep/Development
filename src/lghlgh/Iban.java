package lghlgh;

import java.util.Scanner;

public class Iban {

	public static void main(String args[]) {
		System.out.println("IBAN numarasını giriniz: ");
		Scanner input = new Scanner(System.in);

		String iban = input.next();
		if (!isValidIban(iban))
			System.out.println("Geçersiz IBAN");

	}

	public static boolean isValidIban(String iban) {
		boolean bool = false;
		if (iban.length() == 26 && iban.startsWith("TR")) {
			String iban1 = iban.substring(2, 26);
			if (isAllDigit(iban1)) {
				bool = true;
			} else
				return bool;

			System.out.println("Country Code: " + iban.substring(0, 2));
			System.out.println("Control Code: " + iban.substring(2, 4));
			System.out.println("Bank Code: " + iban.substring(4, 9));
			System.out.println("Account Number: " + iban.substring(9, 26));
			

		}

		return bool;
	}

	public static boolean isAllDigit(String iban) {
		int i = 0;
		boolean bool = false;
		while (i < iban.length() && Character.isDigit(iban.charAt(i)))
			i++;
		if (i == iban.length())
			bool = true;
		return bool;

	}
}
