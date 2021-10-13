//Write a program to read 5 numbers from user, print the second highest number?

import java.util.Scanner;
public class Assign_Sec3_Que20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int large;
		int seclarge;
		
		System.out.print("Enter number : ");
		num = sc.nextInt();
		seclarge=num;
		large=num;
		
		for(int i=0;i<4;i++) {
			System.out.print("Enter number : ");
				num = sc.nextInt();
				
				if(num>large) {
					seclarge = large;
					large = num;
				}
				
				else if(num>seclarge){
					seclarge=num;
				}
		}
		
		System.out.println("Second Largest number is : "+seclarge);
			sc.close();
	}

}