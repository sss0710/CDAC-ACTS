//Create a class Circle, it will have only one constructor which accepts radius as an argument. 
//Write two methods in the class - calcuateArea(), calculatePermiter(). 
//Write Assign_Sec7_Ques01 class to Assign_Sec7_Ques01 method calls.
//class Circle{ int rad; Circle(int r){this.rad = r;} double calArea(){} double calPerimeter(){} }

import java.util.Scanner;
public class Assign_Sec5_Que02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of Circle : ");
		int radius = sc.nextInt();
		Circle myObj = new Circle(radius);
		System.out.println("Area of Circle : "+myObj.calArea());
		System.out.println("Perimeter of Circle : "+myObj.calPerimeter());
		sc.close();
	}
}

class Circle {
	int radius;
	
	Circle(int radius) {
		this.radius=radius;
	}
	
	double calArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	double calPerimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter; 
	}
}