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