package Animals;

public class Cat extends Mammal implements Carnivore{

	
	private String eyeColor;
	private String furColor;

	public Cat(String name, String furColor, String eyeColor) {
		super(name);
		this.furColor = furColor;
		this.eyeColor = eyeColor;
	}

	public void claw() {
		System.out.println("Pissed cat clawed your hand!");

	}
	
	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public void meow() {
		System.out.println("MEEOOWWWW!...");
	}

	@Override
	public void hunt() {
		System.out.println("Hunting fish.");
		
	}

	@Override
	public void hasShortBowel() {
		System.out.println("Cats have short bowel.");
		
	}

	@Override
	public void giveBirth() {
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
}
