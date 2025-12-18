package objectclassexamples;

import java.awt.Color;

public class Car {
	int wheel;
	float price;
	String colour;		// instance variable 
	
	void start() {
		System.out.println("Car Started");
	}
	void stop() {
		System.out.println("Car Stop");
	}
	
	
	void displayCarDetails(String cname) {
		String msg="Car Details :";
		System.out.println(msg+cname);
		System.out.println("Wheel "+wheel);	//0
		System.out.println("Price "+price);	//0.0
		System.out.println("Colour "+colour);	// null
	}
	
	Car() {
		System.out.println("object created...");
		wheel = 4;
		price = 800000;
		colour = "dont' known";		// whenever memory created we can do some initialization 
	}
}
