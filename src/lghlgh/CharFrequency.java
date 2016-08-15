package lghlgh;

import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {

	public static void main(String agrs[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string to count letters: ");

		while (true) {
			String str = input.nextLine();
			if (str.isEmpty()) break;
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i = 0; i < str.length(); i++) {
				if(map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), (map.get(str.charAt(i)) + 1));
					
				}
				else
					map.put(str.charAt(i), 1);

			}
			System.out.println(map.toString());

		}
	}

}
