package lghlgh;

import java.util.Scanner;

public class SumArrayTesst {

	public static void main(String args[]) {
		System.out.println("Array uzunluğunu giriniz: ");
		Scanner input = new Scanner(System.in);
		
		int len = input.nextInt();
		
		int[] Erey = new int[len];
		
		for(int i = 0; i < len; i++) {
			Erey[i] = RandomTest.randomIntegerRandom(1,50);
			System.out.print(Erey[i] + " ");
		}
		
		System.out.println("Sum: " + SumArray.ArrSum(Erey));
			
	}
}
