import java.util.Scanner; 
class Simple7 {	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your name");
		String ss = scan.next();
		System.out.println(ss);
		int x = scan.nextInt();
		System.out.println(x);
		
		System.out.println("Name is "+ss +",Age is " +x);
    }
}

// int x = 10; int y = 20;
// System.out.println("x="+ x + "y="+ y);

