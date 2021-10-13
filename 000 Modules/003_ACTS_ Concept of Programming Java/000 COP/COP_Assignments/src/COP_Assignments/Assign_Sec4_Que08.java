package COP_Assignments;

/*
Write a program to make such a pattern like right angle triangle with number increased by 1 as shown below :
1
2 3
4 5 6
7 8 9 10
*/

public class Assign_Sec4_Que08{
	public static void main(String[] args) {
		int lines=4;
		int num=0;
		for(int i=0;i<lines;i++) {
			for(int j=0;j<i+1;j++) {
				num+=1;
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}