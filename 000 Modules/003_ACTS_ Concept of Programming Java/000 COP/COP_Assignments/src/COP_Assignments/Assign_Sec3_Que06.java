//Write a java program to read age of a person, check if he/she is eligible to cast vote or not?

import java.util.Scanner;
public class Assign_Sec3_Que06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age of person : ");
		int a = sc.nextInt();
		if(a>=18)
			System.out.println("Eligible for voting");
		else
			System.out.println("Not Eligible for voting");
		sc.close();
	}

}
