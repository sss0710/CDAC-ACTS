package COP_Assignments;

import java.util.Scanner;

/*
Write a program to check whether a given number is an armstrong number or not?
Note : When the sum of the cube of the individual digits of a number is equal to that number, the number is called Armstrong number.
For Example 153 is an Armstrong number because 153 = 1^3 +5^3 + 3^3
*/

public class Assign_Sec4_Que12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int rem = 0;
		
		while(temp!=0) {
			rem=temp%10;
			sum+=(rem*rem*rem);
			temp=temp/10;
		}
		
		if (sum == num) {
			System.out.println(num + " is a Armstrong Number");
		} else {
			System.out.println(num + " is not a Armstrong Number");
		}
		sc.close();
	}
}

