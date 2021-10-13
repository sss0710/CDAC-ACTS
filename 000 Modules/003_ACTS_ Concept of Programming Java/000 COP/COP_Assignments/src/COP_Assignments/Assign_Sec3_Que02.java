import java.util.Scanner;

//Write a java program to swap two numbers stored in local variables without using additional variable?
public class Assign_Sec3_Que02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter value of b : ");
		int b = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a after swapping : "+a);
		System.out.println("Value of b after swapping : "+b);
		sc.close();
	}

}
