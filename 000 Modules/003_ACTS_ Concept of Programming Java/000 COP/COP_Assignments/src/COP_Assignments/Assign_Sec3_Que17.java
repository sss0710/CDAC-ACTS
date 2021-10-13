//Write a java program to ask user to enter a number between 1 and 7, print week day as per below mappings - (1 - Monday, 2-Tuesday, … 7-Sunday)
import java.util.Scanner;
public class Assign_Sec3_Que17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 : System.out.println("Monday");break;
		case 2 : System.out.println("Tuesday");break;
		case 3 : System.out.println("Wednesday");break;
		case 4 : System.out.println("Thursday");break;
		case 5 : System.out.println("Friday");break;
		case 6 : System.out.println("Saturday");break;
		case 7 : System.out.println("Sunday");break;
		default : System.out.println("Does not refer to any weekday");
		}
		sc.close();
	}

}
