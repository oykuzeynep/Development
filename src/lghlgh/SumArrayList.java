package lghlgh;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {

	public static void main(String args[]) {
		ArrayList<Integer> erey = new ArrayList<Integer>();
		
		System.out.println("Diziyi giriniz: ");
		Scanner input = new Scanner(System.in);
		
		while(true) {
			int int1 = input.nextInt();
			if(int1 == 0)
				break;
			
			erey.add(int1);

		}
		System.out.println("Sum: " + SumList(erey));
	}

	public static int SumList(ArrayList<Integer> erey) {
		int sum = 0;
		for (Integer i : erey)
			sum += i;

		return sum;
	}

}
