//Write a program to get the largest element of an array using recursion?

import java.util.Arrays;

public class Assign_Sec9_Que08{
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,100,60,70,120,80,90,110};
		int n=arr.length;
		System.out.println(Arrays.toString(arr));
		System.out.println("Largest Element of Array : "+largestElement(arr,n));
	
	}
	
	static int largestElement(int[] arr, int n) {
		if(n==1) {
			return arr[0];
		}
		return Math.max(arr[n-1],largestElement(arr,n-1));
	}
}
