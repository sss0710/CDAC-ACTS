package QueueUsingStack;

import java.util.*;

public class QueueDriver {
	
		static void enqueue(int element, StackIntf stack1) {
			if(!stack1.IsFull()) {
			stack1.Push(element);
			}
		}
	
		static int dequeue(StackIntf stack1, StackIntf stack2) {
			int element;
			if(!stack2.IsEmpty()) {
			element=stack2.Pop();
			return element;
			}
			else {
				while(!stack1.IsEmpty()) {
					element = stack1.Pop();
					stack2.Push(element);
				}
				element=stack2.Pop();
				return element;
			} 
				
			
		}
	
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size : ");
        int size = sc.nextInt();
        StackUsingArray stack1 = new StackUsingArray(size);
        StackUsingArray stack2 = new StackUsingArray(size);
        int element;
		int choice;
		do {
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Exit");
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(stack1.IsFull()) {
					System.out.println("--------------");
					System.out.println("Queue is full.");
					System.out.println("--------------");
				}
				else {
				System.out.print("Enter Element to Enqueue : ");
				element = sc.nextInt();
				enqueue(element, stack1);
				}
				break;
			case 2:
				if(stack1.IsEmpty() && stack2.IsEmpty()) {
					System.out.println("--------------");
					System.out.println("Queue is Empty");
					System.out.println("--------------");
				}
				else
				System.out.println("Element Dequeued : "+dequeue(stack1, stack2));
				break;
			case 3:
				System.out.println("---------");
				System.out.println("GOOD BYE!");
				System.out.println("---------");
				System.exit(0);
			}
		} while (choice!=3);
		
		sc.close();
 
    }
}
