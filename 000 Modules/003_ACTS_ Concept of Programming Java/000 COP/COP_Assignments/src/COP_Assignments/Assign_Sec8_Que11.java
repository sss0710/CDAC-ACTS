//Write a program to Sort an array in ascending order? [Notes : Arrays.sort()]

import java.util.Arrays;
public class Assign_Sec8_Que11{
	public static void main(String[] args) {
		int[] arr = {10, 9, 2, 45, 1, 6, 13, 12, 65};
		System.out.println("Unsorted Array : "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array   : "+Arrays.toString(arr));
	}
}