package Assignment_Day02;

public class SinglyLinkedList implements LinkedListIntf{
	class Node {
		public int data;
		public Node next;
	}

	Node head;
	Node tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void AddAtFront(int element) {
				Node newNode = new Node();
				newNode.data = element;
				newNode.next = null;
				if (head == null) {
					head = newNode;
					tail = newNode;
					return;
				}
				newNode.next = head;
				head = newNode;
		
	}

	@Override
	public void Print() {

				Node current = head;
				while (current != null) {
					System.out.print(current.data+" ");
					current = current.next;
				}
		
	}

	@Override
	public boolean Search(int element) {
		Node current = head;

		while (current != null) {
			if(current.data==element) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public int CountFrequency(int element) {
		int count=0;
		Node current = head;
		while (current != null) {
			if(current.data==element) {
				count++;
			}
			current = current.next;
		}
		return count;
	}
}
