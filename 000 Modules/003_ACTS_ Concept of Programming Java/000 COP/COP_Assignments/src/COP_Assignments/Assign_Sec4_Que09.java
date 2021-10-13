package COP_Assignments;

/*
Write a program to make such a pattern like a pyramid with an asterisk, as show below :
   * 
  * * 
 * * * 
* * * *
*/

public class Assign_Sec4_Que09{
	public static void main(String[] args) {
		int lines=4;
		int space=3;

		for(int i=0;i<lines;i++) {
			for(int k=0;k<space;k++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
	}
}