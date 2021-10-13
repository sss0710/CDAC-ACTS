//Write a java program to print first 10 natural number using recursion?

public class Assign_Sec9_Que01{
	public static void main(String[] args) {
		
		System.out.println("Sum of first 10 natural numbers : "+sumNaturalNos(10));
	}
	
	static int sumNaturalNos(int num) {
		if(num==0) {
			return 0;
		}
		return num+sumNaturalNos(num-1);
	}
}




