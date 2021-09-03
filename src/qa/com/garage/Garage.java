package qa.com.garage;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> garage = new ArrayList<>();
	
	public void addToGarage(Vehicle vehicle) {
		garage.add(vehicle);
		System.out.println(vehicle.getMake() + " added to garage.");
	}
	
	public void fixVehicle(Vehicle vehicle) {
		System.out.println(vehicle.getMake() + " repaired. Total Cost: " + vehicle.calculateRepairs());
	}
	
	public void listAllVehicles() {
		for (Vehicle vehicle : garage) {
			System.out.println(vehicle.getMake() + " is in the garage.");
		}
	}
	
	public void removeAllVehicles() {
		garage.clear();
		System.out.println("All vehicles removed.");
	}
	
	public void removeVehiclebyId(int id) {
		Vehicle temp = null;
		for (Vehicle item : garage) {
			if (item.getId() == id) {
				temp = item;
				break;
			}

		}
		if (temp != null)
			
			garage.remove(temp);
			System.out.println(temp.getMake() + " has been removed.");
	}
}
