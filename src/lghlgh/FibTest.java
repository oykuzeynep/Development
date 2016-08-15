package lghlgh;

import java.util.Scanner;

public class FibTest {

	public static void main(String args[]) {
		System.out.println("Sayıyı giriniz: ");
		Scanner input = new Scanner(System.in);
		
		Fibonacci fib1 = new Fibonacci();
		
		int sayi = input.nextInt();
		for(int i = 0; i <= sayi; i++) {
			System.out.print(fib1.Fib(i) + " ");
		}
		
	}
}
