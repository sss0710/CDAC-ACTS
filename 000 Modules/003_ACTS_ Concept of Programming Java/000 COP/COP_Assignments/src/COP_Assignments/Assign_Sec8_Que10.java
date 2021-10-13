//Write a program to add two matrix of numbers?

public class Assign_Sec8_Que10{
	public static void main(String[] args) {
		int arr1[][] = {{1, 2},{3, 4}};
		int arr2[][] = {{4, 3},{2, 1}};
		int add[][] = new int[arr1.length][2];
		
		System.out.println("2x2 Matrix 1 : ");
		
		for(int i=0;i<arr1.length;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(arr1[i][j]+" ");	
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("2x2 Matrix 2 : ");
		
		for(int i=0;i<arr2.length;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<arr1.length;i++) {
			for (int j=0;j<2;j++) {
				add[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		System.out.println("2x2 Matrix Sum : ");
		
		for(int i=0;i<add.length;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
	}
} 