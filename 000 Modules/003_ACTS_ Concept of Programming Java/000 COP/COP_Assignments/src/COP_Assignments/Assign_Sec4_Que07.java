package COP_Assignments;

/*
Write a program to make such a pattern like right angle triangle with a number which will repeat a number in a row, as shown below :
1
22
333
4444
*/

public class Assign_Sec4_Que07{
	public static void main(String[] args) {
		int lines=4;
		for(int i=0;i<lines;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}