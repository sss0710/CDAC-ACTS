//Write a program to take “name” from user using Scanner and greet as shown below-
//Enter your name : Shakir
//Hello Shakir , Welcome to Java World.
import java.util.Scanner;
public class Assign_Sec2_Que01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.next();
		System.out.print("Hello " + name + ", Welcome to Java World");
		sc.close();
	}

}
