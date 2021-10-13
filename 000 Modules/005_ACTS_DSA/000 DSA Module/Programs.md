#   REVERSE ARRAY USING STACK
```
import java.util.Arrays;

public class mainProg {
	public static void Reverse(int[] elements, /*StackIntf OR*/ StackUsingArray stack) {
		for (int i = 0; i < elements.length; ++i) {
			stack.Push(elements[i]);
		}
		for (int i = 0; !stack.IsEmpty(); ++i) {
			elements[i] = stack.Pop();
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		System.out.println("Original array: " + Arrays.toString(arr));
		StackUsingArray stackObj = new StackUsingArray(10);
		Reverse(arr, stackObj);
		System.out.println("Reverse array: " + Arrays.toString(arr));
	}
}
```
```
public interface StackIntf {
	public void Push(int element);
	public int Pop();
	public boolean IsEmpty();
	public boolean IsFull();
}
```
```

public class StackUsingArray implements StackIntf {
	int top;
	int[] stack;
	int n;

	public StackUsingArray(int n) {
		this.n = n;
		stack = new int [n];
		top = -1;
	}

	@Override
	public void Push(int element) {
		// TODO: What is stack is full?
		if (IsFull()){		//solution
		System.out.println("Stack is Full. Cannot Push More Elements");
		}
		else {
		++top;
		stack[top] = element;
		}
	}

	@Override
	public int Pop() {
		// TODO: What is stack is empty?
		// No need for is empty condition here. Because if stack is empty, pop will never get called.
		int element = stack[top];
		--top;
		return element;

	}

	@Override
	public boolean IsEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	@Override
	public boolean IsFull() {
		if (top == n - 1)
			return true;
		return false;
	}

}
```
#	Parenthesis Balancing
```
public class Exercise1 {
	public boolean isBalanced(String expr) {
		StackUsingArray stack = new StackUsingArray(expr.length());

		// While expr is not over, get a char from it.
		for (int i = 0; i < expr.length(); ++i) {
			char ch = expr.charAt(i);

			// if char is '(' then
			if (ch == '(') {
				// push char on stack
				stack.Push(ch);
			} else { // char is ')'
				// if stack is empty then
				if (stack.IsEmpty()) {
					// Report failure
					// Stop
					return false;
				}

				// Pop a value from stack
				char value = (char) stack.Pop();

				// if char is ')' and value is NOT '(' then
				if ((ch == ')') && (value != '(')) {
					// Report failure
					// Stop
					return false;
				}
			}
		}

		// if stack is not empty then
		if (!stack.IsEmpty()) {
			// Report failure
			// Stop
			return false;
		}

		// Report success
		// Stop
		return true;
	}
}
```
#	Test Cases Creation Using JUnit
```
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise1Test {
	@Test
	void test1() {
		Exercise1 obj = new Exercise1();
		boolean result = obj.isBalanced("(");
		assertFalse(result);
	}
	@Test
	void test2() {
		Exercise1 obj = new Exercise1();
		boolean result = obj.isBalanced(")");
		assertFalse(result);
	}
	@Test
	void test3() {
		Exercise1 obj = new Exercise1();
		boolean result = obj.isBalanced(")(");
		assertFalse(result);
	}
	@Test
	void test4() {
		Exercise1 obj = new Exercise1();
		boolean result = obj.isBalanced("()");
		assertTrue(result);
	}
	@Test
	void test5() {
		Exercise1 obj = new Exercise1();
		boolean result = obj.isBalanced("((()))");
		assertTrue(result);
	}
	@Test
	void test6() {
		Exercise1 obj = new Exercise1();
		boolean result = obj.isBalanced("(()())");
		assertTrue(result);
	}
	@Test
	void test7() {
		Exercise1 obj = new Exercise1();
		boolean result = obj.isBalanced("(()");
		assertFalse(result);
	}
	@Test
	void test8() {
		Exercise1 obj = new Exercise1();
		boolean result = obj.isBalanced("())");
		assertFalse(result);
	}
}
```
#	Singly Linked List
```

public class SinglyLinkedListMain {
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();

		sll.AddAtFront(1);
		sll.AddAtFront(2);
		sll.AddAtFront(3);
		sll.Print();
	}

}
```

```
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
```

```
public interface LinkedListIntf {
	public void AddAtFront(int element);
	public void Print();

	public boolean Search(int element);
	public int CountFrequency(int element);
}
```