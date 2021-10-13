/*
 * Write a java program to ask user to enter Assign_Sec7_Ques01 marks of three subjects such as Phy, Chem, Math. 
 * Max marks for each subject is 100. Now calculate average of marks. 
 * Display following message based on average marks calculated -
 * 
 * avg <  30 : You are failed. 
 * avg >= 30 but < 60 : You passed with Second division 
 * avg >= 60 but < 80 : You passed with First division 
 * avg >= 80 : You passed with First class distinction
 * 
 * */
import java.util.Scanner;
public class Assign_Sec3_Que16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks of Physics : ");
		int phy = sc.nextInt();
		System.out.print("Enter marks of Chemistry : ");
		int chem = sc.nextInt();
		System.out.print("Enter marks of Mathematics : ");
		int math = sc.nextInt();
		Double avg = (phy+math+chem)/3.0;
		if (avg < 30 && avg >= 0)
			System.out.println("You are failed");
		else if (avg >= 30 && avg < 60)
			System.out.println("You passed with Second division");	
		else if (avg >= 60 && avg < 80) 
			System.out.println("You passed with First division");
		else if (avg >= 80 && avg <= 100)
			System.out.println("You passed with First class distinction");
		else
			System.out.println("Invalid inputs");
		sc.close();
	}

}
