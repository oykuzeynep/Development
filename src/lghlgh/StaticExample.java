package lghlgh;

public class StaticExample {
	static {
		System.out.println("İlk statik blok");
		setTestString("1.statik bloğun stringi");
		setTestValue(2);
	}

	static {
		System.out.println("İkinci statik blok");
	}
	
	private static int testValue;
	
	public int getTestValue() {
		return testValue;
	}
	
	public static void setTestValue(int testValue) {
		if(testValue > 0) {
			StaticExample.testValue = testValue;
			
		}
		
		System.out.println("setTestValue method: " + testValue);

		
		
	}
	public static String testString;
	
	public static String getTestString() {
		return testString;

	}
	

	public static void setTestString(String testString) {
		StaticExample.testString = testString;
	}

}
