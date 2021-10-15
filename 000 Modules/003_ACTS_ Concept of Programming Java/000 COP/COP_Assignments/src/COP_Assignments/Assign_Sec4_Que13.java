package COP_Assignments;

import java.util.Scanner;

//Write a program to determine whether a given number is prime or not?

public class Assign_Sec4_Que13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int flag=0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a Prime Number");
				flag=1;
				break;
			}
		}
		if(flag!=1)
			System.out.println(num + " is a Prime Number");
		
		sc.close();
	}
}