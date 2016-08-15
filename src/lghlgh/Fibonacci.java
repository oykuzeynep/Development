package lghlgh;

public class Fibonacci {
	
	public int Fib(int x) {
		if (x == 0 || x == 1) {
			return x;
		}
		else
			return Fib(x-1) + Fib(x-2);
	}

}
