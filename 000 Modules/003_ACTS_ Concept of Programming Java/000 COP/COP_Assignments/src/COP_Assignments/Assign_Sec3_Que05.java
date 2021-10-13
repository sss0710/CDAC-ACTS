//Write a java program to check whether a given number is even or odd?

import java.util.*;
public class Assign_Sec3_Que05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		if(a%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
		sc.close();
	}

}
