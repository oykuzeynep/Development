package Vehicle;

public class Test {
	
	public static void main(String args[]) {
		Car car1 = new Car(300, "Tofaş", "Doğan görünümlü şahin", "06 GB 666");
		
		System.out.println(car1);

		Plane plane1 = new Plane("Boeing 747", "747-100", 893, 480, 4, false, false, 48, "B741", false);
		System.out.println(plane1);

		
	}

}
