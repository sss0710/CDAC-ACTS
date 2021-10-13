//Write a java program to take 5 numbers using Scanner and print the average ?
/*
Enter 5 numbers : 1 2 3 4 5
Average = 3
Enter 5 numbers : 2 3 5 7 9
Average = 5.2
*/
import java.util.Scanner;
public class Assign_Sec2_Que02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		System.out.print("Enter 5 numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		System.out.println("Average = "+(a+b+c+d+e)/5.0);
		sc.close();
	}

}
