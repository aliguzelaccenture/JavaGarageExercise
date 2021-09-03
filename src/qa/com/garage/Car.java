package qa.com.garage;

public class Car extends Vehicle {
	
	// Car-specific Variables
	private int doors;
	private int wheels;
	
	// Calculate Bill
	public float calculateRepairs() {
		float repairCost = (doors * wheels) + 40;
		if (this.isNonRunner() ) {
			repairCost *= 10;
		}
		
		if (this.getMake() == "BMW" || this.getMake() == "Mercedes-Benz" || this.getMake() == "Audi") {
			repairCost *= 2;
		}
		
		return repairCost;
	}

	// Constructor
	public Car(int id, String make, int year, boolean nonRunner, int doors, int wheels) {
		super(id, make, year, nonRunner);
		this.doors = doors;
		this.wheels = wheels;
	}
	
	
	// Getters & Setters
	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
