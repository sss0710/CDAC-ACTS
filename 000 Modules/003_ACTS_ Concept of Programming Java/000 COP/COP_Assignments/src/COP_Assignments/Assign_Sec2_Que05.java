//Write a Java program to print the area and perimeter of a rectangle. Take required input using Scanner?

//Hint : Area = length * breadth 
//Perimeter = 2 * ( length + breadth)
import java.util.Scanner;
public class Assign_Sec2_Que05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Rectangle in cm: ");
		int len = sc.nextInt();
		System.out.print("Enter Breadth of Rectangle in cm: ");
		int bth = sc.nextInt();
		int area = len * bth;
		int peri = 2 * (len + bth);
		System.out.println("Area of Rectangle : "+ area + " sq cm.");
		System.out.println("Perimeter of Rectangle : "+ peri + " cm.");
		sc.close();
	}

}
