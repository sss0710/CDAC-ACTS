//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers received from command line?
// double x = Double.parseDouble(args[0]);

public class Assign_Sec1_Que10 {

	public static void main(String[] args) {
		Double a = Double.parseDouble(args[0]);
		Double b = Double.parseDouble(args[1]);
		System.out.println("Addition = "+ (a+b));
		System.out.println("Subtraction = "+ (a-b));
		System.out.println("Multiplication = "+ (a*b));
		System.out.println("Division = "+ (a/b));
		System.out.println("Remainder = "+ (a%b));
	}

}
