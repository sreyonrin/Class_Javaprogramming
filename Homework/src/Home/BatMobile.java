package Home;

public class BatMobile extends Vehicle{
	boolean isBatmanHere;
	public  BatMobile(String plateId,float weight,boolean isBatmanHere) {
		this.plateId = plateId;
		this.weight = weight;
		this.isBatmanHere = isBatmanHere;
	}
	@Override
	public String toString() {
		return("BatMobile" + super.toString());
	}
	@Override
	public int getMaximalSpeed() {
		int result;
		if(isBatmanHere) {
			result = 500;
		}else {
			result = 110;
		}
		return result;
		
	}
}


                                                                                                                                                                                                                                                                                                                                                   