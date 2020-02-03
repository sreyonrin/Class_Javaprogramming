
public class Minivan extends Vehicle {
   
	int nbCustomer;
	public Minivan(String plateID, float wieght, int nbCustomer) {
		super(plateID, wieght);
		this.nbCustomer = nbCustomer;
	}
@Override
public int getMaximalSpeed() {
	int speed = 130;
	  if(nbCustomer !=0) {
		  speed = speed - 10 * nbCustomer;
	  }
	return speed;
}	  
public String toString() {
	return "MiniVan "+ super.toString();
  }
}
