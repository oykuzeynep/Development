package lghlgh;

public class MyClass {
	
	int i;
	
	public MyClass(int i) {
		this.i = i;
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Finalize methodundan gelen i, i = " + i);
		super.finalize();
		
	}

}
