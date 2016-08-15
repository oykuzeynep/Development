package lghlgh;

public class SumArray {
	
	public static int ArrSum(int [] arr1) {
		int sum = 0;
		for(int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		return sum;
	}

}
