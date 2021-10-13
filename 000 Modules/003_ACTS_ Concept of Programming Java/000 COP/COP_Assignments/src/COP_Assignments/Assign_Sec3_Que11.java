//Write a java program to read roll no, name and marks of three subjects and calculate the total, percentage and division.
/*Test Data : 
 * 
 * Input the Roll Number of the student :784 
 * Input the Name of the Student :James 
 * Input the marks of Physics, Chemistry and Computer Application : 70 80 90
 * 
 * Expected Output : 
 * 
 * Roll No : 784 
 * Name of Student : James 
 * Marks in Physics : 70 
 * Marks in Chemistry : 80 
 * Marks in Computer Application : 90 
 * Total Marks = 240 
 * Percentage = 80.00 
 * Division = First
*/
import java.util.Scanner;
public class Assign_Sec3_Que11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the Roll Number of the student : ");
		int roll_no = sc.nextInt();
		System.out.print("Input the Name of the student : ");
		String name = sc.next();
		System.out.print("Input the marks of Physics, Chemistry and Computer Application : ");
		int phy_marks = sc.nextInt();
		int chem_marks = sc.nextInt();
		int ca_marks = sc.nextInt();
		int total_marks = phy_marks + chem_marks + ca_marks;
		Double perc = (total_marks/300.0)*100;
		System.out.println("Roll No : "+roll_no);
		System.out.println("Name of Student : "+name);
		System.out.println("Marks in Physics : "+phy_marks);
		System.out.println("Marks in Chemistry : "+chem_marks);
		System.out.println("Marks in Computer Application : "+ca_marks);
		System.out.println("Total Marks = "+total_marks);
		System.out.println("Percentage = "+perc);
		if(perc>=75)
			System.out.println("Division = First");
		else if(perc<75 && perc>=60)
			System.out.println("Division = Second");
		else if(perc<60 && perc>=40)
			System.out.println("Division = Third");
		else
			System.out.println("Fail");
		sc.close();
	}

}
