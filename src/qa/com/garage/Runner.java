package qa.com.garage;

public class Runner {

	public static void main(String[] args) {
		// Create Garage
		Garage garage = new Garage();
		
		// Create Vehicles (Car, Motorcycle, Van)
		Car bmw = new Car(1, "BMW", 2003, false, 4, 4);
		Car vw = new Car(2, "VW", 2010, true, 3, 4);
		
		Motorcycle kawasaki = new Motorcycle(3 ,"Kawasaki", 2014, false, "Red", 330);
		Motorcycle yamaha = new Motorcycle(4, "Yamaha", 2019, false, "Black", 600);
		
		Van ford = new Van(5, "Ford", 2009, true, 1500, true);
		Van volvo = new Van(6, "Volvo", 2015, false, 2000, false);
		
		
		
		// Testing Garage Methods
		
		// Adding vehicles to garage
		garage.addToGarage(volvo);
		garage.addToGarage(ford);
		garage.addToGarage(vw);
		garage.addToGarage(bmw);
		garage.addToGarage(yamaha);
		garage.addToGarage(kawasaki);
		
		// Listing all vehicles
		garage.listAllVehicles();
		
		// Calculating repairs for each vehicle
		garage.fixVehicle(volvo);
		garage.fixVehicle(ford);
		garage.fixVehicle(vw);
		garage.fixVehicle(bmw);
		garage.fixVehicle(yamaha);
		garage.fixVehicle(kawasaki);
		
		// Check ID's of vehicles to remove
		System.out.println(volvo.getId());
		System.out.println(yamaha.getId());
		
		// Remove vehicle by ID
		garage.removeVehiclebyId(6);
		garage.removeVehiclebyId(4);
	}

}
