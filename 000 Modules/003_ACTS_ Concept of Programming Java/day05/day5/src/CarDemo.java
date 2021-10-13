// java CarDemo
// 1. Class is loaded 
// 2. main method called
// 3. Depended classes like String, System, Car etc will also be loaded in memory
// 4. 
public class CarDemo {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model ="Suzuki Baleno";
		c1.regNo = "MH12PH1234";
		c1.color="Blue";
		c1.fuelType = "Petrol";
		
		c1.displayDetails();
		c1.move();
		
		System.out.println("--------------");
		
		Car c2 = new Car();
		c2.regNo = "MH14AB34353";
		c2.color="Black";
		
		c2.displayDetails();
		c2.move();
		
		
		Car c3 = null, c4 = null, c5 = null;
		
		c3 = new Car(); c3.regNo ="MH1234";
		c4 = new Car(); c4.regNo ="MH6754";
		c5 = new Car(); c5.regNo ="MH7899";
		
		c3.displayDetails();
		
		System.out.println("Color of c1 = " + c1.color);
		
	}

}
