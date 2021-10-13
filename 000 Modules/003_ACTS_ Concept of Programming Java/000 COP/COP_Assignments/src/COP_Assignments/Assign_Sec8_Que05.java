/*Write a program to concatenate two arrays (merge two array to new one)? 
a[] = {1,2,3} 
b[] = {4,5} 
c[] = {1,2,3,4,5}
*/

public class Assign_Sec8_Que05 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {4, 5};
		int[] c = new int[a.length + b.length];

		System.out.print("Array a : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();

		System.out.print("Array b : ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		
		System.out.println();

		System.out.print("Array c : ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

	}
}