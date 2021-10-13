//Write a java program to read a number entered by user. Print -1 if this number is negative, 1 if it is positive, 0 if it is neither positive nor negative?
import java.util.Scanner;
public class Assign_Sec3_Que07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		if(a<0)
			System.out.println("-1");
		else if(a>0)
			System.out.println("1");
		else
			System.out.println("0");
		sc.close();
	}

}

