package lghlgh;

import java.util.Scanner;

public class FactorialTest {
	public static void main(String args[]) {
		
		Factorial sayi = new Factorial();
		
		System.out.println("Faktoriyelini almak istediğiniz sayıyı giriniz: ");
		Scanner input = new Scanner(System.in);
		
		int inputval = input.nextInt();
		
		
		System.out.println("Faktöriyeli: " + sayi.Fact(inputval));
		

	}

}
