
public class Car {
	// state (instance variables)
	String regNo; //Identity
	String model;
	String fuelType;
	String color = null;
	
	int speed = 0;
	
	// Behavior(instance methods)
	void move() {
		System.out.println("Car is started with speed " + speed);
		speed = 50;
		System.out.println("Car is now with speed " + speed);
		
	}
	
	void displayDetails() {
		System.out.println(regNo +" "+ model +" "+ fuelType +" "+ color);
	}
	
}
