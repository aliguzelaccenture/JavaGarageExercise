package qa.com.garage;

public class Van extends Vehicle {
	
	// Van-Specific Variables
	private int maxCapacity;
	private boolean airCon;
	
	// Calculate Bill
		public float calculateRepairs() {
			float repairCost = maxCapacity * 10;
			if (this.airCon == true) {
				repairCost += 50;
			}
			if (this.isNonRunner() ) {
				repairCost *= 20;
			}
			
			return repairCost - this.getYear();
		}

	// Constructor
	public Van(int id, String make, int year, boolean nonRunner, int maxCapacity, boolean airCon) {
		super(id, make, year, nonRunner);
		this.maxCapacity = maxCapacity;
		this.airCon = airCon;
		
	}
	
	// Getters & Setters
	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public boolean isAirCon() {
		return airCon;
	}

	public void setAirCon(boolean airCon) {
		this.airCon = airCon;
	}

}
