package COP_Assignments;

//Write a program to check whether a given number is a perfect number or not?
//Note : Defintion of Perfect Number : sum of all divisor of the number is equal to the number itself. 
//eg. Number = 6 is perfect because All positive divisor = 1 2 3, their sum=6

//1+2+3 = 6
import java.util.Scanner;

public class Assign_Sec4_Que11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				sum += i;
		}
		if (sum == num) {
			System.out.println(num + " is a Perfect Number");
		} else {
			System.out.println(num + " is not a Perfect Number");
		}
		sc.close();
	}
}