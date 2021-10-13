package twostacksinarray;

import java.util.Scanner;

public class TwoStackArrayDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		TwoStackUsingArray twostack = new TwoStackUsingArray(size);
		int element;
		int choice;
		do {
			System.out.println("1.Push in Stack 1");
			System.out.println("2.Push in Stack 2");
			System.out.println("3.Pop from Stack 1");
			System.out.println("4.Pop from Stack 2");
			System.out.println("5.Exit");
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:

				if(!twostack.Is1Full()) {
					System.out.print("Enter element : ");
					element = sc.nextInt();
					twostack.Push1(element);
				} 
				else{
					System.out.println("----------------");
					System.out.println("Stack 1 is full!");
					System.out.println("----------------");
				}
				break;
				
			case 2:
				
				if (!twostack.Is2Full()) {
					System.out.print("Enter element : ");
					element = sc.nextInt();
					twostack.Push2(element);
				} else {
					System.out.println("----------------");
					System.out.println("Stack 2 is full!");
					System.out.println("----------------");
				}
				break;
				
			case 3:
				
				if (!twostack.Is1Empty()) {
					element=twostack.Pop1();
					System.out.println("Element Popped from Stack 1 : "+element);
				} else {
					System.out.println("----------------");
					System.out.println("Stack 1 is empty!");
					System.out.println("----------------");
				}
				break;
				
			case 4:
				
				if (!twostack.Is2Empty()) {
					element=twostack.Pop2();
					System.out.println("Element Popped from Stack 1 : "+element);
				} else {
					System.out.println("----------------");
					System.out.println("Stack 2 is empty!");
					System.out.println("----------------");
				}
				break;
				
			case 5:
				System.out.println("---------");
				System.out.println("GOOD BYE!");
				System.out.println("---------");
				System.exit(0);
				break;
			}
		} while (choice != 5);

		sc.close();
	}
}
