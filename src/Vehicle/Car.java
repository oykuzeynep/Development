package Vehicle;

public class Car extends Vehicle {

	private String id;

	public Car(int speed, String brand, String model, String id) {
		super(speed, brand, model);
		this.id = id;
	}


	@Override
	public void executeMotor() {
		System.out.println("Motor is executed.");
		
	}

	@Override
	public void processGas() {
		System.out.println("Gas is processed.");
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void enableSteeringWheelControls() {
		System.out.println("Steering wheel controls are enabled.");
		
	}


	@Override
	public String toString() {
		return "Car [ID =" + id + ", Brand = " + getBrand() + ", Model = " + getModel() + ", Speed = "
				+ getSpeed() + ", Capacity = " + getCapacity() + ", Number Of Wheels = " + getNumberOfWheels()
				+ ", Aerofoil = " + isHasAerofoil() + ", Auto Pilot = " + isHasAutoPilot() + "]";
	}




	
	
	

}
