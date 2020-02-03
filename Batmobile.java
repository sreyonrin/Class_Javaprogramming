
public class Batmobile extends Vehicle {
	boolean isBatmanHere = false;
	  public Batmobile(String plateID, float wieght, boolean isBatmanHere) {
		super(plateID, wieght);
		this.isBatmanHere = isBatmanHere;
	}
	@Override
	public int getMaximalSpeed() {
		int speed;
		  if(isBatmanHere) {
			  speed = 110;
		  }else {
			  speed = 500;
		  }
			return  speed;  
	}
	public String toString() {
		return "Batmobile "+ super.toString();
	  }
}
