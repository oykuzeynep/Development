package lghlgh;

public class MinNumber {

	public static void main(String args[]) {

		int a = 8;
		int b = 10;
		int c = minFunction(a, b);

	}

	public static int minFunction(int num1, int num2) {
		int min = num2;
		if (num1 > num2)
			min = num1;
		return min;
	}
}
