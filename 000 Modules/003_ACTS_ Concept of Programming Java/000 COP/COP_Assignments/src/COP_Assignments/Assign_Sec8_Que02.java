//Write a program to reverse an array of elements?

public class Assign_Sec8_Que02 {
	public static void main(String[] args) {
		int[] arr = { 5, 10, 15, 20, 25, 30 };
		System.out.print("Numbers stored in array are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int temp;
		int size=arr.length;
		for (int i = 0; i < size; i++) {
			temp=arr[i];
			arr[i]=arr[size-1];
			arr[size-1]=temp;
			size-=1;
		}
		System.out.println();
		System.out.print("Reversed array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}