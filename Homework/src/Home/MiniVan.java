package Home;

public class MiniVan  extends Vehicle{
	int nbCustomers;
	public  MiniVan(String plateId,float weight,int nbCustomer) {
		this.plateId = plateId;
		this.weight = weight;
		this.nbCustomers = nbCustomer;
		
	}
	@Override
	public String toString() {
		return("Minivan" + super.toString());
	}
	@Override
	public int getMaximalSpeed() {
		int maximalspeed = 130;
		int result = 0;
	if(nbCustomers!= 0) {
		result = maximalspeed - 10*nbCustomers;
	}
	return result;
	}
}
