//Write a java program to read 10 numbers from keyboard and find their sum and average?
import java.util.Scanner;
public class Assign_Sec4_Que02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double avg;
		int num;
		System.out.print("Enter 10 numbers : ");
		for(int i=1;i<=10;i++) {
			num=sc.nextInt();
			sum+=num;
		}
		avg=sum/10.0;
		System.out.println("Sum of entered 10 numbers : "+sum);
		System.out.println("Average of entered 10 numbers : "+avg);
	}
}