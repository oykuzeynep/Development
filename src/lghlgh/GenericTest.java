package lghlgh;

public class GenericTest {

	public static void main(String args[]) {
		
		GenericMethod newGM = new GenericMethod();
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.2,3.2,4.5,5.6};
		String[] stringArray = {"h", "o", "r", "s", "e"};
		
		System.out.println("intArray'in elemanları: ");
		newGM.printArray(intArray);
		newGM.printArray(doubleArray);
		newGM.printArray(stringArray);

	}
}
