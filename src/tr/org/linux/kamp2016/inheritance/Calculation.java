package tr.org.linux.kamp2016.inheritance;

public class Calculation {

	protected int z;
	
	public void toplama(int x, int y) {
		
		z = x + y;
		System.out.println("Sayıların toplamı: " + z);
	}
	
	public void cikarma(int x, int y) {
		z = x -y;
		System.out.println("Sayıların farkı: " + z );
	}
}
