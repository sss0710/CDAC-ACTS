//Write a program to find the largest of two numbers?

import java.util.Scanner;
public class Assign_Sec3_Que08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		if(a<b)
			System.out.println(b + " is larger than "+ a);
		else
			System.out.println(a + " is larger than "+ b);
		sc.close();
	}

}

