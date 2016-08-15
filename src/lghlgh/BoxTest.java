package lghlgh;

public class BoxTest {

	public static void main(String args[]) {
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(new Integer(10));
		Integer someInteger = integerBox.get();
		System.out.println(someInteger);
	}
}
