
/*
Write a java class named as NumUtil with following static methods to - double getPower(double x, int n) long getFactorial(int num); boolean isPrime(int num); boolean isEven(int num); boolean isOdd(int num);
1.1) Write test class named as NumUtilMain to test all these methods.

1.2) Extends question 2.1 to make it menu driven, based on the user choice , read relevant data from user and call static methods.
*/
import java.util.Scanner;

public class Assign_Sec7_Ques01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		int num;
		boolean value;
		do {

			System.out.println("--------------------------");
			System.out.println("1. Check Power");
			System.out.println("2. Check Factorial");
			System.out.println("3. Check Prime");
			System.out.println("4. Check Even");
			System.out.println("5. Check Odd");
			System.out.println("6. Exit");
			System.out.println("--------------------------");
			System.out.print("Enter choice : ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Double x;
				Double pow;
				System.out.print("Enter a number : ");
				x = sc.nextDouble();
				System.out.print("Enter Power : ");
				num = sc.nextInt();
				pow = NumUtil.getPower(x, num);
				System.out.println(x + " raised to " + num + " is " + pow);
				break;
			case 2:
				System.out.print("Enter a number : ");
				num = sc.nextInt();
				long fact = NumUtil.getFactorial(num);
				System.out.println("Factorial of " + num + " is " + fact);
				break;
			case 3:
				System.out.print("Enter a number : ");
				num = sc.nextInt();
				value = NumUtil.isPrime(num);
				if (value)
					System.out.println(num + " is Prime.");
				else
					System.out.println(num + " is not Prime.");
				break;
			case 4:
				System.out.print("Enter a number : ");
				num = sc.nextInt();
				value = NumUtil.isEven(num);
				if (value)
					System.out.println(num + " is Even.");
				else
					System.out.println(num + " is not Even.");
				break;
			case 5:
				System.out.print("Enter a number : ");
				num = sc.nextInt();
				value = NumUtil.isOdd(num);
				if (value)
					System.out.println(num + " is Odd.");
				else
					System.out.println(num + " is not Odd.");
				break;
			}
		} while (choice != 6);
		System.out.println("Good Bye!");
		sc.close();
		System.exit(0);
	}
}

class NumUtil {
	static double getPower(double x, int n) {
		Double pow = 1.0;
		for (int i = 1; i <= n; i++) {
			pow *= x;
		}
		return pow;
	}

	static long getFactorial(int num) {
		long fact;
		if (num == 0) {
			return 1;
		}
		fact = num * getFactorial(num - 1);
		return fact;
	}

	static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		return false;
	}

	static boolean isOdd(int num) {
		if (num % 2 != 0)
			return true;
		return false;
	}
}