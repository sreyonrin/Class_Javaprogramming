package Homework;

public class ItTeacher extends Thing{

	private int yearsOfExperience;
	
	
	public ItTeacher(String name, int yearsOfExperience) {
		super(name);
		this.yearsOfExperience = yearsOfExperience;
		
	}

	@Override
	public boolean isValid() {
		if(yearsOfExperience > 2) {
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
