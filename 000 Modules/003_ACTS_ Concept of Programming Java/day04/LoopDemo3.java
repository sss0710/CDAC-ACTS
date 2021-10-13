import java.util.Scanner;

// do-while
public class LoopDemo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int i = 1;
		
		do {
			System.out.print(i + " ");
			i = i + 1;
		}while(i <= num);
		
		scan.close();
	}

}
