//Write a java program to calculate simple interest, get the required inputs from command line ? Hint : SimpleInterest = (principal * rate * years)/100.0
public class Assign_Sec1_Que07 {

	public static void main(String[] args) {

		int P = Integer.parseInt(args[0]); 
		int R = Integer.parseInt(args[1]);
		int N = Integer.parseInt(args[2]);
		
		Double SI = (P * R * N)/100.0;
		System.out.println("Simple Interest = "+ SI);
		
	}

}
