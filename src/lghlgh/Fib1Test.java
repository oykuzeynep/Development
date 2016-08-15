package lghlgh;

import java.util.Scanner;

public class Fib1Test {
	public static void main(String args[]) {
		System.out.println("Sayıyı giriniz: ");
		Scanner input = new Scanner(System.in);
		
		Fibonacci1 fib1 = new Fibonacci1();
		
		int sayi = input.nextInt();
		
		fib1.Fib1(sayi);
	}
}
