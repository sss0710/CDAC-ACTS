public class SinglyLinkedList implements LinkedListIntf {
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
		// Make space for new element, say newNode
		Node newNode = new Node();

		// Store element in newNode's data
		newNode.data = element;

		// Set newNode's next to empty
		newNode.next = null;

		// if list is empty then
		if (head == null) {
			// Set head and tail to newNode
			head = newNode;
			tail = newNode;
			
			// Stop
			return;
		}

		// Set newNode's next to head
		newNode.next = head;

		// Set head to newNode
		head = newNode;

		// Stop.
	}

	@Override
	public void Print() {
		// Set current to first node of list.
		Node current = head;

		// while (current is not empty) do
		while (current != null) {
			// Process current node.
			System.out.println(current.data);

			// Move current to current node's next.
			current = current.next;
		}
	}
}
