package home2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<RagularPolygon> number = new ArrayList<RagularPolygon>();
		
		number.add(new EquilateralTriangle(3));
		number.add(new Square(4));
		System.out.println("The sum of the number of sides of polygon "+RagularPolygon.getTotalSides(number));
	}

}
