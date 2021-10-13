//Write a program to find the Factorial of a number using recursion?
import java.util.Scanner;
public class Assign_Sec9_Que07{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		System.out.println("Factorial of number "+num+" : "+factorial(num));
		sc.close();
	}

	static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		return num*factorial(num-1);
	}
}