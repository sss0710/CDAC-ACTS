

import java.util.Scanner;

public class LoopDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int i = 1; // initialization
		while(i <= num) {
			System.out.print(i +" ");
			i = i +1; 
		}
		
		scan.close();
	}

}
