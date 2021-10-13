package Assignment_Day02;

public class SinglyLinkedListMain {
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		
		sll.AddAtFront(1);
		sll.AddAtFront(5);
		sll.AddAtFront(3);
		sll.AddAtFront(5);
		sll.AddAtFront(4);
		sll.AddAtFront(3);
		sll.AddAtFront(1);
		sll.AddAtFront(5);
		sll.AddAtFront(3);
		sll.AddAtFront(4);
		sll.AddAtFront(5);
		sll.AddAtFront(3);
		sll.AddAtFront(1);
		sll.AddAtFront(6);
		sll.AddAtFront(5);
		System.out.print("Elements in Singly Linked List : ");
		sll.Print();
		System.out.println();
		System.out.print("Searching Element 5 in Singly Linked List : ");
		if(sll.Search(5))
			System.out.print("Found");
		else
			System.out.print("Not Found");
		System.out.println();
		System.out.print("Searching Element 7 in Singly Linked List : ");
		if(sll.Search(7))
			System.out.print("Found");
		else
			System.out.print("Not Found");
		System.out.println();
		System.out.print("Searching Element 3 in Singly Linked List : ");
		if(sll.Search(3))
			System.out.print("Found");
		else
			System.out.print("Not Found");
		System.out.println();
		System.out.println("Count Frequency of 5 in Singly Linked List : "+sll.CountFrequency(5));
		System.out.println("Count Frequency of 7 in Singly Linked List : "+sll.CountFrequency(7));
		System.out.println("Count Frequency of 3 in Singly Linked List : "+sll.CountFrequency(3));
	}
}
