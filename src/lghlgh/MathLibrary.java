package lghlgh;

public class MathLibrary {

	public static void main(String[] args) {

		int i = 7;
		int j = -9;
		double x = 72.3;
		double y = 0.34;

		System.out.println("j'nin mutlak değeri: " + Math.abs(j));
		System.out.println("x'in yuvarlanmış hali: " + Math.round(x));
		
		System.out.println("Pi: " + Math.PI);
		System.out.println("E: " + Math.E);
		
		double angle = 45 * 2 * Math.PI/300;
		
		System.out.println("cos( " + angle + ") = " + Math.cos(angle));
		

		
	}

}
