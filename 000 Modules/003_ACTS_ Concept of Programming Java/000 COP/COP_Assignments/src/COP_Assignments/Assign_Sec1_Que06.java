//Write a java program to take three numbers from command line and print the average ?
public class Assign_Sec1_Que06 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println("Average = "+ (a+b+c)/3);
	}

}
