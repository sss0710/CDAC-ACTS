package COP_Assignments;

/*
Write a program to display the pattern like right angle triangle with a number as shown below :
1
12
123
1234
*/

public class Assign_Sec4_Que06{
	public static void main(String[] args) {
		int lines=4;
		for(int i=0;i<lines;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}