package COP_Assignments;

import java.util.Scanner;

//Write a program to display the first n terms of Fibonacci series.
//Fibonacci series 0 1 2 3 5 8 13 ..... 
//Test Data : Input number of terms to display : 10 
//Expected Output : Here is the Fibonacci series upto to 10 terms : 0 1 1 2 3 5 8 13 21 34

public class Assign_Sec4_Que14{
	public static void main(String[] args) {
		
		//Declaring variables
		int num1=0;
		int num2=1;
		int num3;
		
		//Taking Input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		//Fibonacci logic
		System.out.println("Here is the Fibonacci series upto to "+num+" terms :");
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		
		for(int i=0;i<num-2;i++) {
		num3=num1+num2;
		num1=num2;
		num2=num3;
		System.out.print(num3+" ");
		}
		sc.close();
	}
}