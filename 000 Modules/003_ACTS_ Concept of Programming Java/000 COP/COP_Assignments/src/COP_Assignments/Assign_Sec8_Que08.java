//Write a Java program to find the duplicate values of an array of integer values?

public class Assign_Sec8_Que08 {
	public static void main(String[] args) {
		int[] arr = { 11, 21, 11, 21, 11, 22, 22, 0, 0 };
		int copy = 0;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			found = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] != -1) {
					copy = 1;
					found = true;
					arr[j] = -1;
				}
			}
			if (found == true) {
				System.out.println("Duplicate value is found for " + arr[i]);
			}
		}
		if (copy == 0) {
			System.out.println("No Dulpicates found");
		}
	}
}