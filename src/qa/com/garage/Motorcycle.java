package qa.com.garage;

public class Motorcycle extends Vehicle {

	// Motorcycle-specific Variables
	private String colour;
	private int bhp;
		
		
	// Calculate Bill
	public float calculateRepairs() {
		float repairCost = bhp * 2;
		if (this.isNonRunner() ) {
			repairCost *= 10;
		}
		
		if (this.colour == "Red" || this.getMake() == "White" || this.getMake() == "Green") {
			repairCost *= 2;
		}
		
		return repairCost;
	}
	
	// Constructor
	public Motorcycle(int id, String make, int year, boolean nonRunner, String colour, int bhp) {
		super(id, make, year, nonRunner);
		this.colour = colour;
		this.bhp = bhp;
	}
	
	// Getters & Setters
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getBhp() {
		return bhp;
	}

	public void setBhp(int bhp) {
		this.bhp = bhp;
	}

}
