//Write a java program to calculate simple interest, get the required inputs from Scanner ? Hint : SI = (principal * rate * years)/100
import java.util.Scanner;
public class Assign_Sec2_Que03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Principle : ");
		int P = sc.nextInt(); 
		System.out.print("Enter Rate of Interest : ");
		int R = sc.nextInt();
		System.out.print("Enter Duration in years : ");
		int N = sc.nextInt();
		
		Double SI = (P * R * N)/100.0;
		System.out.println("Simple Interest = "+ SI);
		sc.close();
	}

}
