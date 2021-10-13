import java.util.Arrays;

//Write a Java program to find the common elements between two arrays of integers?

public class Assign_Sec8_Que09 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 5, 15, 16, 18, 30, 45, 23};
		int[] arr2 = {3, 12, 13, 15, 18, 23};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.print("Common Elements : ");
		
		if(arr1.length<arr2.length) {
		for(int i=0;i<arr1.length;i++)
			for(int j=0;j<arr2.length;j++) 
				if(arr1[i]==arr2[j])
					System.out.print(arr1[i]+" ");
		}
		else {
			for(int i=0;i<arr2.length;i++)
				for(int j=0;j<arr1.length;j++)
					if(arr2[i]==arr1[j]) 
						System.out.print(arr2[i]+" ");
		}
	}
}