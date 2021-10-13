
//Write a program to calculate average of numbers stored in an array?

public class Assign_Sec8_Que01 {
	public static void main(String[] args) {
		int[] arr = { 5, 10, 15, 20, 25, 30 };
		int sum = 0;
		System.out.print("Numbers stored in array are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		double avg = ((double) sum / arr.length);
		System.out.println();
		System.out.println("Average = " + avg);
	}
}