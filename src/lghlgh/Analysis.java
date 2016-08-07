package lghlgh;

import java.util.Scanner;

public class Analysis {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		while (studentCounter <= 10) {

			System.out.println("Sonucu giriniz (1=geçti, 2=kaldı)");

			int result = input.nextInt();

			if (result == 1) {
				studentCounter++;
				passes++;

			} else if (result == 2) {
				studentCounter++;
				failures++;

			}

			else
				System.out.println("Lütfen '1' ya da '2' olarak giriniz. ");

		}

		System.out.println("Geçen: " + passes + " Kalan: " + failures);
		if (passes > 8)
			System.out.println("Eğitmene afferim!");
	}

}
