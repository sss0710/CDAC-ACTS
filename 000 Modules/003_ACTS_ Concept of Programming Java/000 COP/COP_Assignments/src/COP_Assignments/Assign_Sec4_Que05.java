package COP_Assignments;

//Write a program to display the pattern like right angle triangle using an asterisk as shown below:

/*

*
**
***
****

 */

public class Assign_Sec4_Que05{
	public static void main(String[] args) {
		int lines=4;
		for(int i=0;i<lines;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}