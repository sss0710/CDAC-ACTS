import java.util.Scanner;
// 1
// 1 2
// 1 2 3
public class LoopDemo5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++) { // scope of i is this block
			
			for(int j=1;j<=i;j++) { // scope of j is this block
				System.out.print(j +" "); 
			}
			
			System.out.println();
		}
		
		scan.close();

	}

}

