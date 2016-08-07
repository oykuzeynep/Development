package lghlgh;

public class MutableTest {

	public static void main(String args[]) {

		Mutable mut = new Mutable(30);
		Immutable immut = new Immutable(55);
		System.out.println(mut.getValue());


		mut.setValue(20);
		immut.getValue();
		
		System.out.println(mut.getValue());
		System.out.println(immut.getValue());
		
		immut = new Immutable(11); //hala immutable objeler duruyor ancak immut referansının objesi değişiyor

	}
}
