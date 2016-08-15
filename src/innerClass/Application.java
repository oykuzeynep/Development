package innerClass;

import innerClass.Person.Currency;
import innerClass.Person.Money;

public class Application {

	public static void main(String[] args) {
		Person p1 = new Person("John", 23);
		
		Money m = new Money(10, Currency.TL); 
		
		p1.addMoney(10, Currency.DOLLAR);
		p1.addMoney(5, Currency.TL); 
		p1.addMoney(25, Currency.TL);
		
		System.out.println(p1.toString());
	}
}
