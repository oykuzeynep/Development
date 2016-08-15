package lghlgh;

public class StaticTest {

	public static void main(String args[]) {
		
		StaticExample.setTestValue(5);
		StaticExample.testString = "Hebele";
		System.out.println(StaticExample.getTestString());
		
		System.out.println("testValue = " + StaticExample.getTestString());
	}
}
