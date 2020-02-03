package Home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehicleConvoy {
	List<Vehicle> listvehicle = new ArrayList<>();
	
	 public void addVehicle(Vehicle vehicle){
		// System.out.println(vehicle);
		 listvehicle.add(vehicle);
		// System.out.println(listvehicle);
		
	}
	int getMaximalSpeed(){
		List speeds = new ArrayList<>();
		for(Vehicle speed : listvehicle ) {
			speeds.add(speed.getMaximalSpeed());
			//System.out.println(speeds);
		}
		int lowest = 0;
		for(int i = 0; i < speeds.size(); i++) {
			lowest = (int) Collections.min(speeds);
		}
		return lowest;
		 
	 }
}
