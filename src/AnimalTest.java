
public class AnimalTest {

	public static void main(String args[]){
		
		Bird birdie = new Bird("Tweety");
		birdie.fly();

		Cat kitty = new Cat("Siri");
		System.out.println(kitty.getName());
		
		Dog dog = new Dog("Snoppy");
		dog.bark();
		
	}
}
