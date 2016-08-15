package Vehicle;

public class Plane extends Vehicle {

	private int maximumFeet;
	private String flightCode;
	private boolean isAutoPilotActive;

	public Plane(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofoil,
			boolean hasAutoPilot, int maximumFeet, String flightCode, boolean isAutoPilotActive) {
		super(brand, model, speed, capacity, numberOfWheels, hasAerofoil, hasAutoPilot);
		this.maximumFeet = maximumFeet;
		this.flightCode = flightCode;
		this.isAutoPilotActive = isAutoPilotActive;
	}

	@Override
	public void executeMotor() {
		System.out.println("Motor is executed.");

	}

	@Override
	public void processGas() {
		System.out.println("Gas is processed.");

	}

	@Override
	public void enableSteeringWheelControls() {
		System.out.println("Steering wheel controls are enabled.");

	}

	enum liftOffType {
		LIFTOFF_HORIZONTAL, LIFTOFF_VERTICAL
	}

	public int getMaximumFeet() {
		return maximumFeet;
	}

	public void setMaximumFeet(int maximumFeet) {
		this.maximumFeet = maximumFeet;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public boolean isAutoPilotActive() {
		return isAutoPilotActive;
	}

	public void setAutoPilotActive(boolean isAutoPilotActive) {
		this.isAutoPilotActive = isAutoPilotActive;
	}

	@Override
	public String toString() {
		return "Plane [maximumFeet=" + maximumFeet + ", flightCode=" + flightCode + ", isAutoPilotActive="
				+ isAutoPilotActive + ", Brand = " + getBrand() + ", Model = " + getModel() + ", Speed = " + getSpeed()
				+ ", Capacity = " + getCapacity() + ", Number Of Wheels = " + getNumberOfWheels() + ", Aerofoil = "
				+ isHasAerofoil() + ", Auto Pilot = " + isHasAutoPilot() + "]";
	}

}
