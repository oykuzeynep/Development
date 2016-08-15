package lghlgh;

import java.util.Scanner;

public class MultiTable {

	public static int[][] Table(int n) {
		int[][] Tab1 = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < n; k++) {
				Tab1[i][k] = (i + 1 )*(k+1);
			}
		}
		
		return Tab1;
	}
	public static void ArrayToString(int[][] errey) {
		for(int i = 0; i < errey.length; i++) {
			for(int k = 0; k < errey.length; k++) {
				System.out.printf("%4d ", errey[i][k]);
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		System.out.println("Çarpım tablosunun boyutunu giriniz: ");
		Scanner input = new Scanner(System.in);
		
		int sayi = input.nextInt();

		ArrayToString(Table(sayi));

	}
}
