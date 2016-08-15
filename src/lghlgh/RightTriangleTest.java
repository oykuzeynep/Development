package lghlgh;

public class RightTriangleTest {

	public static void main(String args[]) {
	
		for(int i = 0; i < 10; i++) {
			int A = (int) (Math.random() * 49 + 1);
			int B = (int) (Math.random() * 49 + 1);
	        RightTriangle tri1 = new RightTriangle(A, B);

			System.out.println(tri1);
			
			
		}

	}
}
