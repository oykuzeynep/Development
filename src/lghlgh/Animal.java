package lghlgh;

public class Animal{
	private String type;
	private int age;
	private String name;
	
	public Animal(String name, String type, int age) {
		this.name = name;
		this.type = type;

		if (age > 0)
			if (age < 100)
				this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if (age > 0)
			if (age < 100)
				this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	

}
