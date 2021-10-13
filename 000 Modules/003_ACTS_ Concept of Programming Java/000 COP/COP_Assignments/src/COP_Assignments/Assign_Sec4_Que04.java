package COP_Assignments;

//Write a program to calculate the factorial of the given number?
import java.util.Scanner;
public class Assign_Sec4_Que04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>0;i--) {
			fact=fact*i;//5*4=20 //20*3=60 //60*2=120 //120*1=120
		}
		System.out.println("Factorial of "+num+" is "+fact);
		sc.close();
	}
}