//Write a Java program to test if an array contains a specific value?
import java.util.Scanner;
public class Assign_Sec8_Que06{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("Enter value to search in array : ");
		int value = sc.nextInt();
		boolean found=false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==value) {
				System.out.println("Value is found in array");
				found=true;
			}
		}
		if(found==false) {
			System.out.println("Value not found in array");
		}
		sc.close();
	}
}