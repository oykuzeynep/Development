package Animals;

public class Owl extends Bird implements Carnivore{

    String name;
	public Owl(String name) {
		super(name);
	}

	public void rotateHead270Degrees(){
		System.out.println("(^^)  (**)");
	}

	@Override
	public void hunt() {
		System.out.println("Hunting things.");
	}

	@Override
	public void hasShortBowel() {
		System.out.println("Owl has short Bowl.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
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
