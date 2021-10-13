//Write a java program to accept two integers and check whether they are equal or not?
//Enter two integers : 15 15
//first and second number are equal.
import java.util.Scanner;
public class Assign_Sec3_Que03 {

	public static void main(String[] args) {
		System.out.print("Enter two integers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == b)
			System.out.println("first and second number are equal");
		else
			System.out.println("first and second number are not equal");
		sc.close();
	}

}
