package Animals;

public class Dog extends Mammal implements Carnivore{

    String name;
	public Dog(String name) {
		super(name);
	}

	public void bark(){
		System.out.println("Bark! BARK!!");

	}
	
	public void sniff(){
		System.out.println("Sniffing...");

	}

	@Override
	public void hunt() {
		
		System.out.println("Chasing cats.");
	}

	@Override
	public void hasShortBowel() {
		
		System.out.println("Dog has short bowel.");

	}

	@Override
	public void giveBirth() {
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
