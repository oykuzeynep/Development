package Animals;

public class Snake extends Reptile implements Carnivore{
	


	String name;
	public Snake(String name) {
		super(name);
	}

	public void poison(){
		System.out.println("You have been poisened :(");

	}
	
	public void hunt() {
		System.out.println("Hunting rats...");
	}
	
	public void hasShortBowel() {
		System.out.println("Has short Bowel.");
	}

	@Override
	public void crawl() {
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
