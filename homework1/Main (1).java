package Homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	List<Thing> allThings = new ArrayList<>();
	Bike bike = new Bike("Cute bike",1,true,false);
	Bike bike1 = new Bike("Not Cute bike",3,false,true);
	allThings.add(bike);
	allThings.add(bike1);
	System.out.println("Is new bike: " +bike);
	System.out.println("Is old bike: " +bike1);
	
	RiceCooker ricecooker = new RiceCooker("Valid Soup", 4,400);
	RiceCooker ricecooker1 = new RiceCooker("Not Valid Soup", 6,600);
	allThings.add(ricecooker);
	allThings.add(ricecooker1);
	System.out.println("RiceCooker has not experience: " + ricecooker);
	System.out.println("RiceCooker has experience: " + ricecooker1);
	
	ItTeacher itTeacher = new ItTeacher("Chhannak",3);
	ItTeacher itTeacher1 = new ItTeacher("Chhannak",1);
	allThings.add(itTeacher);
	allThings.add(itTeacher1);
	System.out.println("Teacher has not experience: " + itTeacher);
	System.out.println("Teacher has experience: " + itTeacher1);
	}
}
