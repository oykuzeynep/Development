package lghlgh;

import java.util.Arrays;

public class intArrayToString {
 
	public static void main(String args[]) {
		int[] intNumbers = new int[] {1, 2, 3 ,4 ,5};
		
		StringBuffer sBuffer = new StringBuffer();
		String strSeperator = " ";
		
		if(intNumbers.length > 0) {
			sBuffer.append(intNumbers[0]);
			
			for(int i = 1; i < intNumbers.length; i++) {
				sBuffer.append(strSeperator).append(intNumbers[i]);
			}
		}
		
		System.out.println("int erreyi stringe dönüştürüyor.");
		System.out.println(sBuffer.toString());
		
		String strNumbers = Arrays.toString(intNumbers);
		System.out.println(strNumbers);

		System.out.println("String, arrays.toString metodu aracılığıyla oluşturuldu.");
		
		strNumbers = strNumbers.replaceAll(", ", strSeperator).replace("[", "").replace("]", "");
		System.out.println("Final string: " + strNumbers);

		
	}
}
