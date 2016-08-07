package lghlgh;

import java.util.Scanner;

public class ClassAverage {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int total = 0;
		int gradeCounter = 1;
		System.out.println("10 adet notu giriniz: ");

		while (gradeCounter <= 10) {
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;

		}
		int average = total / 10;

		System.out.println("10 notun toplamı: " + total);
		System.out.println("Sınıf ortalaması: " + average);
	}

}
