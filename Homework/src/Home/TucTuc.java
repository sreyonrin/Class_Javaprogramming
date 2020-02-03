package Home;

public class TucTuc  extends Vehicle{
	int nbCustomers;
	public  TucTuc(String plateId,float weight,int nbCustomer) {
		this.plateId = plateId;
		this.weight = weight;
		this.nbCustomers = nbCustomer;
	}
	@Override
	public String toString() {
		return("TucTuc" + super.toString());
	}
	@Override
	public int getMaximalSpeed() {
		int maximalspeed = 130;
		int result = 0;
	if(nbCustomers!= 0) {
		result = maximalspeed - 5*nbCustomers;
	}
	return result;
		
	}
}


