package lghlgh;

public class Dice {

	private int faceValue;
	
	public Dice() {
		faceValue = 1;
	}
	
	public void roll() {
		faceValue = (int) (1 + Math.random() * 6);
	}

	public int getFaceValue() {
		return faceValue;
	}

	
	
}
