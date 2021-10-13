//Write a program to calculate the monthly in hand salary of an employee : take input for basic salary, HRA is 40% of basic salary, PF amount to be deducted is 12% of basic, Medical allowance is Rs 1200 per month, Traveling allowance is Rs 800 per month, Professional tax to be deducted is Rs 300.
import java.util.Scanner;
public class Assign_Sec2_Que04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Basic Salary in Rs. : ");
		int b_sal = sc.nextInt();
		int hra = (40 * b_sal)/100;
		int pf = (12 * b_sal)/100;
		int med_all = 1200;
		int trav_all = 800;
		int prof_tax = 300;
		
		int in_hand = b_sal + hra - pf + med_all + trav_all - prof_tax;
		
		System.out.println("In hand Salary of Employee : " + in_hand + " Rs.");
		sc.close();
	}

}
