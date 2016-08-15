package lghlgh;

public class Factorial {


	public static int Fact(int x) {
		int result = 1;
		if(x > 0) {
			result = Fact(x-1) * x;
		}
		return result;
	}

}
