import java.util.Scanner;

//Write a java program to calculate compound interest, get the required inputs using Scanner ?
import java.util.Scanner;
public class Assign_Sec2_Que07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Principle : ");
		int P = sc.nextInt(); 
		System.out.print("Enter Rate of Interest : ");
		int R = sc.nextInt();
		System.out.print("Enter Duration in years : ");
		int N = sc.nextInt();

		Double amt = Math.pow((1 + (R/100.0)),N) * P;
		Double CI = amt - P;
		System.out.println("Compound Interest = "+ CI);
		sc.close();

	}

}
