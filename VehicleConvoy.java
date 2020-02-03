import java.util.ArrayList;
import java.util.List;

public class VehicleConvoy {
    List<Vehicle> Vehicles = new ArrayList<Vehicle>();
    public void addVehicle(Vehicle vehicle) {
    	Vehicles.add(vehicle);
    }

	public int getMaximalSpeed() {
		int minSpeed = Vehicles.get(0).getMaximalSpeed();
		for(int i = 0; i < Vehicles.size(); i++ ) {
			if(Vehicles.get(i).getMaximalSpeed() < minSpeed) {
				minSpeed = Vehicles.get(i).getMaximalSpeed();
			}
		}
		return minSpeed;
	}
    
  
}

