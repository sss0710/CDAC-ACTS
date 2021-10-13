import java.util.Scanner;  // 1
class Simple6 {
	
	public static void main(String args[]){
		// here scan is an object of type Scanner
		Scanner scan = new Scanner(System.in); //2
		
		System.out.println("Enter number 1");
		int x = scan.nextInt();
		System.out.println("Enter number 2");
		int y = scan.nextInt();
		
		double avg = (x + y)/2.0;
		System.out.println(avg);
    }
}

// Hello h;
// Hello h = new Hello();
// Hello h1 = new Hello();
// Hello a ,b ,c;
// a = new Hello(); b = new Hello();

// int a, b;
// a = 10; b = 20;
