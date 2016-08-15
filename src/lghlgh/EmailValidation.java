package lghlgh;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Email adresinizi giriniz: ");
		String mail = input.next();

		if (isValidMail(mail)) {
			System.out.println("Geçerli bir email.");
		} else
			System.out.println("Geçersiz bir email.");

	}

	public static boolean isValidMail(String mail) {
		boolean bool = false;
		if (mail.contains(".") && mail.contains("@") && !mail.contains(" ") && !mail.startsWith("@")
				&& !mail.startsWith(".")) {
			if (mail.indexOf("@") - mail.lastIndexOf(".") > 1) {
				if (mail.length() - mail.lastIndexOf(".") > 2) {
					bool = true;
				}

			}
		}
		return bool;

	}

}
