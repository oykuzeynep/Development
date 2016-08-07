package lghlgh;

public class Immutable {
	
	private final int value; //override edilemez
	
	public Immutable(int value) {
		
		this.value = value;
	}
	
	public int getValue() {
		
		return value;
	}

}
