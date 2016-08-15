package lghlgh;

import java.util.Random;

public class RandomTest {

	public static void main(String args[]) {
		
		double randomNumber1 = Math.random();
		System.out.println(randomNumber1);
		
		double randomNumber2 = Math.random();
		System.out.println(randomNumber2);
		
		
		double randomNumber3 = randomIntegerMath(-5, 5);
		System.out.println(randomNumber3);
		

		double randomNumber4 = randomIntegerRandom(-5, 5);
		System.out.println(randomNumber4);
	}
	
	public static int randomIntegerMath(int min, int max) {
		int range = Math.abs(max-min)+1;
		
		int random = min + (int) (Math.random()*range);
		
		return random;
	}
	
	public static int randomIntegerRandom(int min, int max) {
		Random rgen = new Random();
		int range = Math.abs(max-min)+1;
		int random = min + rgen.nextInt(range);
		return random;
		
	}
	
}
