//Write a program to find the largest of three numbers?

import java.util.Scanner;
public class Assign_Sec3_Que09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		System.out.print("Enter third number : ");
		int c = sc.nextInt();
		if(a>b) {
			if(a>c)
				System.out.println(a + " is larger than "+ b +" & "+c);
			else
				System.out.println(c + " is larger than "+ a +" & "+b);
		}
		else {
			if(b>c)
				System.out.println(b + " is larger than "+ a +" & "+c);
			else
				System.out.println(c + " is larger than "+ a +" & "+b);
		}
		sc.close();
	}

}