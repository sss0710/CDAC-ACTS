//Write a program to find out highest and second highest number in an array?

public class Assign_Sec8_Que03 {
	public static void main(String[] args) {
		int num;
		int[] arr = {10, 20, 30, 40, 50, 60, 120, 112 , 95, 100};
		num = arr[0];
		int seclarge = num;
		int large = num;
		System.out.print("Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=1;i<arr.length;i++) {
				num = arr[i];
				
				if(num>large) {
					seclarge = large;
					large = num;
				}
				
				else if(num>seclarge){
					seclarge=num;
				}
		}
		System.out.println();
		System.out.println("Highest Number : "+large);
		System.out.println("Second Highest Number : "+seclarge);
	}
}
		