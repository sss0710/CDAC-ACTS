/*
Write a program in java to display the multiplication table of a given integer?

Enter the number : 5
5 X 1 = 5
5 X 2 = 10
.
.
5 X 10 = 50
*/
import java.util.Scanner;
public class Assign_Sec4_Que03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}