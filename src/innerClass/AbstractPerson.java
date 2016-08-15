package innerClass;

public abstract class AbstractPerson { 
	private String birthPlace;

	public AbstractPerson(String birthPlace) {
		super();
		this.birthPlace = birthPlace;
	}

	public AbstractPerson() {
		System.out.println("AbstractPerson const");
	}
	
	

	
}
