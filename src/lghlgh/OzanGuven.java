package lghlgh;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OzanGuven {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Doğum yılınız: ");
		int year = input.nextInt();
		
		System.out.println("Doğum ayınız: ");
		int month = input.nextInt();

		System.out.println("Doğum gününüz: ");
		int day = input.nextInt();
		
		LocalDate birtday = LocalDate.of(year, month, day);

		
		System.out.println("Yaşadığınız günler: " + kacYasindasinSen(birtday) + " gün");


	}
	
	public static long kacYasindasinSen(LocalDate birtday) {
		LocalDate today = LocalDate.now();
		
		long daysAlive = ChronoUnit.DAYS.between(birtday, today);
		return daysAlive;
	}
}
