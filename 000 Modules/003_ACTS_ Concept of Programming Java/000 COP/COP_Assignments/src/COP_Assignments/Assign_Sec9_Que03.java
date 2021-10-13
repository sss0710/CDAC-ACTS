//Write a program to calculate the product of two integers using recursion? (Multiplication & Division operators are not allowed)

import java.util.Scanner;
public class Assign_Sec9_Que03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Value : ");
		int num1=sc.nextInt();
		System.out.print("Enter 2nd Value : ");
		int num2=sc.nextInt();
		System.out.print("Product of "+num1+" and "+num2+" : "+productTwoNos(num1,num2));
		sc.close();
	}
	
	static int productTwoNos(int num1, int num2) {
		if(num1==0) {
			return 0;
		}
		return num2+productTwoNos(num1-1,num2);
	}
}