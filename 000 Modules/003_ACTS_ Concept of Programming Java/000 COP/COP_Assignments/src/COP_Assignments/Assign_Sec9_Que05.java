
/*Write a recursive program to print Fibonacci Series for given number of terms?
Input number of terms for the Series (< 20) : 10
The Series are :
1  1  2  3  5  8  13  21  34  55 
*/
import java.util.Scanner;

public class Assign_Sec9_Que05 {
	static int n1=1;
	static int n2=1;
	static int n3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of terms for the Series (< 20) : ");
		int num = sc.nextInt();
		System.out.print("The Series are : "+n1+" "+n2+" ");
		fibonacci(num - 2);
		sc.close();
	}

	public static void fibonacci(int num) {

		if (num > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " ");
			fibonacci(num - 1);
		}
	}
}
