package innerClass;

import java.util.ArrayList;
import java.util.Collection;

public class Person extends AbstractPerson{

	public enum Currency {
		TL, DOLLAR
	}
	
	private String name;
	private Integer age;
	private Collection<Money> moneyList = new ArrayList<>();
	private int exchangeRate = 3;
	//olabilecek kadar üst hiyerarşi olmalı
	
	public Person(String name, Integer age, int exchangeRate) {
		super("tryout"); //iki constructerdan birini çağırmak için
		System.out.println("Person const");
		this.name = name;
		this.age = age;
		this.exchangeRate = exchangeRate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void addMoney(int value, Currency currency) {
		this.addMoney(new Money(value, currency));
	}
	
	public void addMoney(Money m) {
		moneyList.add(m);
	}
	

	public int getTotalMoney() {
		int total = 0;
		for(Money i: moneyList) {
			total  += i.getValue();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", money=" + moneyList + "]";
	}
	
	public class Money{
		
		private int value;
		private Currency currency;
		
		public Money(int value2, Currency currency2) {
			value = value2;
			currency = currency2;

		}

		public int getValue() {
			
			switch (currency) {
	    		case TL:
		    		return value;
			    case DOLLAR:
				    return value * exchangeRate;
			}
			
			return 0; //FIXME
		}
	}
	
	
	
	
	
}
