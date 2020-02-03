
public class Main {

	public static void main(String[] args) {
		Minivan miniVan1 = new Minivan("XXXXXX", 45.0f, 10);
		System.out.println(miniVan1 + " speed is " + miniVan1.getMaximalSpeed());
		
		Tuctuc tuctuc = new Tuctuc("YYYYYYY", 45.0f, 3);
		System.out.println(tuctuc + " speed is " + tuctuc.getMaximalSpeed());
		
		Batmobile batman = new Batmobile("ZZZZZZZ", 45.0f, true);
		System.out.println(batman + " speed is " + batman.getMaximalSpeed());
		
		
		VehicleConvoy convoy = new VehicleConvoy();
		convoy.addVehicle(batman);
		convoy.addVehicle(tuctuc);
		convoy.addVehicle(miniVan1);
		System.out.println("Convoy speed is " + convoy.getMaximalSpeed());
	}
	

}
