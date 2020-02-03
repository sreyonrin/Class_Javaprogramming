package Home;

public abstract class Vehicle {
	String plateId;
	float weight;
	public  String toString() {
		return" [plate Id = "+ plateId +"," + " weight= "+ weight +"] " + "speed is ";
	}
	public abstract int getMaximalSpeed();
	
}