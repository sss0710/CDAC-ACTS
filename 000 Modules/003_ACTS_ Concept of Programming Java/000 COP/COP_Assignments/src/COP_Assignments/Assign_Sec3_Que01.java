//Write a java program to swap two numbers stored in local variables?
import java.util.*;
public class Assign_Sec3_Que01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter value of b : ");
		int b = sc.nextInt();
		int temp;
		temp=b;
		b=a;
		a=temp;
		System.out.println("Value of a after swapping : "+a);
		System.out.println("Value of b after swapping : "+b);
		sc.close();
	}
	
}
