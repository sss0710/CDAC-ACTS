//Write a program to find the smallest of five numbers?

import java.util.Scanner;
public class Assign_Sec3_Que10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		System.out.print("Enter third number : ");
		int c = sc.nextInt();
		System.out.print("Enter third number : ");
		int d = sc.nextInt();
		System.out.print("Enter third number : ");
		int e = sc.nextInt();
		
		if(a<b && a<c && a<d && a<e)
			System.out.println(a+" is smallest of all 5 numbers");
		else if (b<a && b<c && b<d && b<e) 
			System.out.println(b+" is smallest of all 5 numbers");
		else if(c<b && c<a && c<d && c<e )
			System.out.println(c+" is smallest of all 5 numbers");
		else if(d<b && d<c && d<a && d<e ) 
			System.out.println(d+" is smallest of all 5 numbers");
		else
			System.out.println(e+" is smallest of all 5 numbers");
		sc.close();
	}

}
