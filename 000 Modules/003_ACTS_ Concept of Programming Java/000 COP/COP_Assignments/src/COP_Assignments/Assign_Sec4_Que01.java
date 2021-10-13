//Write a java program to print first 10 natural numbers and their sum?

public class Assign_Sec4_Que01{
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
			System.out.println(i);
		}
		System.out.println("Sum of first 10 natural numbers : "+sum);
	}
}