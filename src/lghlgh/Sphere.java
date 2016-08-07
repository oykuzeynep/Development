package lghlgh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sphere {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.println("Kürenin yarıçapını giriniz: ");
		try {
			double yaricap = input.nextDouble();

			System.out.println("Hacim: " + kureHacmi(yaricap));
		}
		catch(InputMismatchException e) {
			System.out.println("Başka bir şey değil, sayı gir. ");
		}
 


	}

	public static double kureHacmi(double yaricap) {

		double hacim = (4.0 / 3.0) * Math.PI * Math.pow(yaricap, 2);

		return hacim;
	}

}
