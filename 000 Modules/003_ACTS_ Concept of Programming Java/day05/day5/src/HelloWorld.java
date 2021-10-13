import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String firstName = scan.next();
		//String lastName = scan.next();
		//System.out.println("Hello " + firstName + " "+lastName);
		int age = scan.nextInt();
		int areaCode = scan.nextInt();
		scan.nextLine();  
		String name = scan.nextLine();
		System.out.println("Hello " + name );
		System.out.println("Your age is " + age);
		System.out.println("Your area code " + areaCode);
		scan.close();
	}

}
