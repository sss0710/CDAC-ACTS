//Write a Java program to print the ascii value of a given character?

import java.util.Scanner;

public class Assign_Sec3_Que13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char a = sc.next().charAt(0);
		System.out.println("Ascii Value : "+(int)a);
	}

}
