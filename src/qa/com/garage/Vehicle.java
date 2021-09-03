package qa.com.garage;

public class Vehicle {
	
	// Variables
	private int id;
	private String make;
	private int year;
	private boolean nonRunner;
	
	// Calculate Bill method to be overridden
	public float calculateRepairs() {
		return 0;
	}
	
	// Constructor 
	public Vehicle(int id, String make, int year, boolean nonRunner) {
		super();
		this.id = id;
		this.make = make;
		this.year = year;
		this.nonRunner = nonRunner;
		
	}
	
	// Getters & Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isNonRunner() {
		return nonRunner;
	}
	public void setNonRunner(boolean nonRunner) {
		this.nonRunner = nonRunner;
	}

}
