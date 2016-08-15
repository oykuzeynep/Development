package Vehicle;

public abstract class Vehicle implements Driveable{

	private String brand;
	private String model;
	private int speed;
	private int capacity;
	private int numberOfWheels;
	private boolean hasAerofoil;
	private boolean hasAutoPilot;
	
	public Vehicle(int speed, String brand, String model) {
		this.speed = speed;
		this.brand = brand;
		this.model = model;
	}

	public Vehicle(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofoil, boolean hasAutoPilot) {
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.capacity = capacity;
		this.numberOfWheels = numberOfWheels;
		this.hasAerofoil = hasAerofoil;
		this.hasAutoPilot = hasAutoPilot;
	}

	

    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public boolean isHasAerofoil() {
		return hasAerofoil;
	}

	public void setHasAerofoil(boolean hasAerofoil) {
		this.hasAerofoil = hasAerofoil;
	}

	public boolean isHasAutoPilot() {
		return hasAutoPilot;
	}

	public void setHasAutoPilot(boolean hasAutoPilot) {
		this.hasAutoPilot = hasAutoPilot;
	}



	enum GasType{

    	GASOLINE, LPG, DIESEL_FUEL, JET_FUEL
    }
	

	
}
