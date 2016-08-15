package lghlgh;

public class Fibonacci1 {
	
	public void Fib1(int x) {
		int fib1 = 0;
		int fib2 = 1;	
		int tmp;
		
		for(int i = 0; i < x; i++) {
		    System.out.print(fib1 + " ");
		    tmp = fib1 + fib2;
		    fib1 = fib2;
		    fib2 = tmp;
		    
		}
	}

}
