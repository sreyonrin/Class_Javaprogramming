package Home;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniVan miniVan1 = new MiniVan("XXXXXX", 145f, 10);
		System.out.println(miniVan1 + " speed is " + miniVan1.getMaximalSpeed());
		
		TucTuc tuctuc = new TucTuc("YYYYYYY", 45f, 3);
		tuctuc.toString();
		System.out.println(tuctuc + " speed is " + tuctuc.getMaximalSpeed());
		
		BatMobile batman = new BatMobile("ZZZZZZZ", 75f, true);
		System.out.println(batman + " speed is " + batman.getMaximalSpeed());
		
		VehicleConvoy convoy = new VehicleConvoy();
		convoy.addVehicle(batman);
		convoy.addVehicle(tuctuc);
		convoy.addVehicle(miniVan1);
		System.out.println("Convoy speed is " + convoy.getMaximalSpeed());
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           