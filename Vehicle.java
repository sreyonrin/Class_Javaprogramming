
public abstract class Vehicle {

	 String plateID;
	  float wieght;
	  public Vehicle(String plateID, float wieght){
		  this.plateID = plateID;
		  this.wieght = wieght;
	  }
	  public String toString() {
		   String store = ( "[plate id="+ plateID + " , " + "wieght=" + wieght + "]");
		return store;
	  }
	 public abstract int getMaximalSpeed();
}
