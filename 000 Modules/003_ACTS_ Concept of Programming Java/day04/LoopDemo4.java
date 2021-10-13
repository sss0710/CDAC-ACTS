import java.util.Scanner;
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4

// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4
public class LoopDemo4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=num;j++) {
				//System.out.print(j +" ");
				//System.out.print("@ ");
				System.out.print(i +" "); 
			}
			
			System.out.println();
		}
		
		scan.close();

	}

}

