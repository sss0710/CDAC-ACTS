//Write a Java program that takes a year from user and print whether that year is a leap year or not.
//Hint : a leap year is divisible by 4 and (not div by 100 or if div by both 100 &400)
import java.util.Scanner;
public class Assign_Sec3_Que14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year=sc.nextInt();
		if(((year%4)==0 && (year%100)!=0) || ((year%100)==0 && (year%400)==0)) {
			System.out.println(year+" is a Leap year");
		}
		else
			System.out.println(year+" is not a Leap year");
		sc.close();
	}

}
