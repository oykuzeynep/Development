package Animals;

public abstract class Animal {

	String name;
	public Animal() {
		
	}
	public Animal(String name){
		this.name = name;
	}
	
	public abstract void sleep();
	
	public abstract void eat();
	
	public abstract void breath();
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

}
