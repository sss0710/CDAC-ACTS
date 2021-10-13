//Write a java program to calculate the sum of numbers from 1 to N using recursion?
import java.util.Scanner;
public class Assign_Sec9_Que02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of N : ");
		int num=sc.nextInt();
		System.out.print("Sum of first "+num+" natural numbers : "+sumNaturalNos(num));
		sc.close();
	}
	
	static int sumNaturalNos(int num) {
		if(num==0) {
			return 0;
		}
		return num+sumNaturalNos(num-1);
	}
}
