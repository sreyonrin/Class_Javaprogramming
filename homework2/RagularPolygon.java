package home2;

import java.util.List;

public interface RagularPolygon{
	
	int getNumSides();
	int getSideLength();
	
	static int getTotalSides(List<RagularPolygon> array) {
		int sum = 0;
			for (RagularPolygon ragularPolygon : array) {
				sum += ragularPolygon.getNumSides();
			}
		return sum;
		
	}	

}
