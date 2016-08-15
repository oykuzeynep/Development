package lghlgh;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		System.out.println("Bir metin giriniz: ");
		Scanner input = new Scanner(System.in);
		
		String txt = input.nextLine();
		
		if(Palin(txt)) {
			System.out.println("Palindrome");
			
		}
		else
			System.out.println("Palindrome değil");
	}
	
	public static boolean Palin(String text) {
		int i = 0;
		boolean bool = true;
		while (bool && i < text.length() /2 ) {
			if((text.charAt(i)) != (text.charAt(text.length() - i - 1)))
				bool = false;
			i++;
		}
		return bool;
	}

}
