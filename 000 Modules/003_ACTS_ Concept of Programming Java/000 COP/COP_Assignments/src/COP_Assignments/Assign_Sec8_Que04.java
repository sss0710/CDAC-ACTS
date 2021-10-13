//Write a Java program to copy an array to another by iterating the array?

public class Assign_Sec8_Que04 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int[] arr2 = new int[arr1.length];
		System.out.print("Array 1 : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println();
		System.out.print("Array 2 : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}