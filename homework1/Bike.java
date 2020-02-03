package Homework;

public class Bike extends Thing{
	
	private int age;
	private boolean isFrontBreakWorking;
	private boolean isBckBreakWorking;

	public Bike(String name, int age, boolean isFrontBreakWorking, boolean isBckBreakWorking) {
		super(name);
		this.age = age;
		this.isFrontBreakWorking = isFrontBreakWorking;
		this.isBckBreakWorking = isBckBreakWorking;
	}
	
	public boolean isValid() {
		if( age < 2 && (isFrontBreakWorking || isBckBreakWorking)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		String result = "";
		if(isValid()) {
			result = super.toString() + " Valid";
		}else {
			result = super.toString()+ " Not Valid";
		}
		return result;
	}
	
}
