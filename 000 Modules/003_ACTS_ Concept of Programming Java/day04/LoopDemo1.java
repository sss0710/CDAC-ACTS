import java.util.Scanner;

//for, while, do-while
// 5
// 1 2 3 4 5
public class LoopDemo1 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt(); //n=5
		
		for(int i=1; i <= n; i++) {  //i=6 , n=5
			System.out.print(i + " ");
		} 
		
		int j=1;
		for(;j<=n;) {
			System.out.print(j + " ");
			j = j+1;
		}
		
		scan.close();
	}

}
