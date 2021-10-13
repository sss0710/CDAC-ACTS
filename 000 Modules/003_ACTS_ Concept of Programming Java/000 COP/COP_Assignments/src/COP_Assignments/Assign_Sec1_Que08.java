//Write a java program to convert temperature from celsius to fahrenheit, get input from command line ? Hint : F = (9*C/5) + 32
public class Assign_Sec1_Que08 {

	public static void main(String[] args) {
		
		Double C = Double.parseDouble(args[0]);
		Double F = (9*C/5) + 32;
		
		System.out.println("Temperature in Farenheit " + F);

	}

}
