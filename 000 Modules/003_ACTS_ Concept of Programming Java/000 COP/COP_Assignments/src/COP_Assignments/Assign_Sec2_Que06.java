//Write a Java program to print the area and perimeter of a circle. Take required input using Scanner?
//Hint : Area = Math.PI * radius * radius 
//Perimeter = 2* Math.PI* radius
import java.util.Scanner;
public class Assign_Sec2_Que06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of Circle in cm. : ");
		int rad = sc.nextInt();
		Double area = Math.PI * rad * rad;
		Double peri = 2* Math.PI *rad;
		System.out.println("Area of Circle : "+ area + " sq cm.");
		System.out.println("Perimeter of Circle : "+ peri + " cm.");
		sc.close();
	}

}
