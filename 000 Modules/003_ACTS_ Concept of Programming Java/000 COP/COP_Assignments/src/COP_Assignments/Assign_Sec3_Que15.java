//Write a java program to check if a given number is divisble by 3 and 5 ?
import java.util.Scanner;
public class Assign_Sec3_Que15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if(num%3==0 && num%5==0)
			System.out.println(num+" is divisible by 3 and 5");
		else
			System.out.println(num+" is not divisible by 3 and 5");
		sc.close();
 	}

}
