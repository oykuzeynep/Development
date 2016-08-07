package lghlgh;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String args[]) {
		int[] intArray1 = new int[] { 4, 8, 15, 16, 23, 42 };

		int[] intArray2 = new int[] { 4, 8, 15, 16, 23, 42 };

		boolean binResult = Arrays.equals(intArray1, intArray2);

		System.out.println("İki array eşit mi? " + binResult);

	}
}
