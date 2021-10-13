//Write a java program to check whether a given number is positive or negative?
import java.util.*;
public class Assign_Sec3_Que04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		if(a > 0)
			System.out.println("Number is positive");
		else
			System.out.println("Number is negative");
		sc.close();
	}

}
