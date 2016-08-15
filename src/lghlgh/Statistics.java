package lghlgh;

import java.nio.file.WatchEvent.Kind;
import java.util.HashMap;
import java.util.Scanner;

public class Statistics {
	
	public static void main(String args[]) {
		HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
		System.out.println("Öğrenci sayısını girin: ");
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		generateRandomValues(table, size);
//		System.out.println(table.toString());
		printTable(table);
		System.out.println("mean = " + mean(table));
	}
	private static void generateRandomValues(HashMap<Integer, Integer> map, int size) {

		for(int i = 0; i < size; i++) {
			map.put(i, RandomTest.randomIntegerRandom(0, 100));
		}
		
		
	}
	
	public static double mean(HashMap<Integer, Integer> map) {
		double answer = 0;
		for (int i = 0; i < map.size(); i++) { // Integer i: map.keySet()
			answer += map.get(i);              // Integer value: map.values()
		}
		answer /= map.size();
		return answer;

	}

	public static void printTable(HashMap<Integer, Integer> map) {
		for (int i = 0; i < map.size(); i++) {
			System.out.printf("%2d. Öğrenci: %2d    ", i + 1, map.get(i));
			if ((i + 1) % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
