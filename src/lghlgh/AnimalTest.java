package lghlgh;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String args[]) {
		Animal ani1 = new Animal("Siri", "Kedi", 1);

		System.out.println("Adı: " + ani1.getName() + "   Türü: "
				+ ani1.getType() + "   Yaşı: " + ani1.getAge());
		
		ani1.setAge(2);
		ani1.setName("Putin");
		ani1.setType("Russian Blue");	
		
		System.out.println("Adı: " + ani1.getName() + "   Türü: "
				+ ani1.getType() + "   Yaşı: " + ani1.getAge());
		System.out.println(ani1.toString());
		
		ArrayList errey = new ArrayList();
		errey.add(ani1);
		System.out.println(errey.get(0));
		
		
	}

}
