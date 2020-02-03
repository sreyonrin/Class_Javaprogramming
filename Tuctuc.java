
public class Tuctuc extends Vehicle {
	int nbCustomer;
  public Tuctuc(String plateID, float wieght, int nbCustomer) {
		super(plateID, wieght);
		this.nbCustomer = nbCustomer;
	}
@Override
public int getMaximalSpeed() {
	int speed = 130;
	if(nbCustomer != 0) {
		speed = speed - 5 * nbCustomer;
	}
	return speed;
} 
public String toString() {
	return "Tutuc "+ super.toString();
  }
}
