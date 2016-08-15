package lghlgh;

public class MyClassTest {

	public static void main(String args[]) {
		
		MyClass obj1 = new MyClass(10);
		MyClass obj2 = new MyClass(20);
		
		try{
			obj1.finalize();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		
		obj1 = obj2;
		System.out.println("Bitti");
	}
}
