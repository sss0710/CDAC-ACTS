//Write a program to calculate the power of any number using recursion?

import java.util.Scanner;
public class Assign_Sec9_Que04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number  : ");
		int num=sc.nextInt();
		System.out.print("Enter exponent : ");
		int exp=sc.nextInt();
		System.out.print(num+" raised to "+exp+" is : "+power(exp,num));
		sc.close();
	}
	
	static int power(int exp, int num) {
		if(exp==0) {
			return 1;
		}
		return num*power(exp-1,num);
	}
}