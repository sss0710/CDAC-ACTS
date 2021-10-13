import java.util.Scanner;
// Take a number from user, and check if it is even or odd
class EvenOdd{
  public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = scan.nextInt();
	
	if(num%2 == 0){
		System.out.print(num +" is ");
		System.out.println("EVEN");
	}else {
		System.out.print("this "+num +" is ");
		System.out.println("ODD");	
	}
  }
}
