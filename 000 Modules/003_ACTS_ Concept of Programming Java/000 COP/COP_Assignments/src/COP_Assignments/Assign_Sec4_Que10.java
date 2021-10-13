package COP_Assignments;

/*
Write a program to make such a pattern like a pyramid with a number which will repeat the number in the same row as shown below :
   1
  2 2
 3 3 3
4 4 4 4
*/

public class Assign_Sec4_Que10{
	public static void main(String[] args) {
		int lines=4;
		int space=3;

		for(int i=0;i<lines;i++) {
			for(int k=0;k<space;k++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i+1;j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
			space--;
		}
	}
}