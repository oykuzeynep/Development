package lghlgh;

import java.util.Scanner;

public class PrimitiveCalculator {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		boolean ctn = true;
		
		while (ctn) {
			System.out.println("Bir sayı giriniz: ");
			double inputNumber1 = input.nextDouble();
			
			System.out.println("Bir işlem giriniz: ");
			String inputFunction = input.next();
			
			switch (inputFunction) {
			case "+":
				System.out.println("Bir sayı daha giriniz: ");
				double inputNumber2 = input.nextDouble();
				double result = inputNumber1 + inputNumber2;
				System.out.println(inputNumber1 + " + " + inputNumber2 + " = " + result);
				break;
			case "-":
				System.out.println("Bir sayı daha giriniz: ");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 - inputNumber2;
				System.out.println(inputNumber1 + " - " + inputNumber2 + " = " + result);
				break;
			case "*":
				System.out.println("Bir sayı daha giriniz: ");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 * inputNumber2;
				System.out.println(inputNumber1 + " * " + inputNumber2 + " = " + result);
				break;
			case "/":
				System.out.println("Bir sayı daha giriniz: ");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 / inputNumber2;
				System.out.println(inputNumber1 + " / " + inputNumber2 + " = " + result);
				break;
			default:
				System.out.println("Bu işlem geçersizdir.");
				break;
				
			}
			System.out.println("Devam etmek istiyor musunuz? (E/H)");
			String ctnString = input.next();
			if (ctnString.equals("H"))
				ctn = false;
			
			
			
			
		}
	}
}
