package stackusingqueue;

import java.util.*;

public class StackDriver {
	
	static int length=0;

	static int pop(QueueIntf queue1, QueueIntf queue2) {
		int element;
		int var;
		while(length!=1) {
			element=queue1.DeleteQ();
			queue2.AddQ(element);
			length--;
		}
		element=queue1.DeleteQ();
		length--;
		while(!queue2.IsEmpty()) {
			var=queue2.DeleteQ();
			queue1.AddQ(var);
			length++;
		}
		return element;
	}

	static void push(int element, QueueIntf queue1) {
		if (!queue1.IsFull()) {
			queue1.AddQ(element);
			length++;
		}
		else {

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Stack size : ");
		int size = sc.nextInt();
		CircularQueueUsingArray queue1 = new CircularQueueUsingArray(size+1);
		CircularQueueUsingArray queue2 = new CircularQueueUsingArray(size+1);
		int element;
		int choice;
		do {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Exit");
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(queue1.IsFull()) {
					System.out.println("--------------");
					System.out.println("Stack is full.");
					System.out.println("--------------");
				}
				else {
				System.out.print("Enter Element : ");
				element = sc.nextInt();
				push(element, queue1);
				}
				break;
			case 2:
				if(queue1.IsEmpty()) {
					System.out.println("--------------");
					System.out.println("Stack is Empty");
					System.out.println("--------------");
				}
				else
				System.out.println("Element Popped : "+pop(queue1, queue2));
				break;
			case 3:
				System.out.println("---------");
				System.out.println("GOOD BYE!");
				System.out.println("---------");
				System.exit(0);
			}
		} while (true);
	}
}
