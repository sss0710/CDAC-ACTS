//Write a program to find the sum of digits of a number using recursion?
import java.util.Scanner;
public class Assign_Sec9_Que06{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		System.out.println("Sum of Digits of number "+num+" : "+sumOfDigits(num));
		sc.close();
	}

	static int sumOfDigits(int num) {
		if(num==0) {
			return 0;
		}
		return (num%10)+sumOfDigits(num/10);
	}
}