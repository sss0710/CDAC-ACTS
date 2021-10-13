package balancedparenthesis;

public class StackUsingArray implements StackIntf {
	int top;
	char[] stack;
	int n;

	public StackUsingArray(int n) {
		this.n = n;
		stack = new char [n];
		top = -1;
	}

	@Override
	public void Push(char element) {
		++top;
		stack[top] = element;
	}

	@Override
	public char Pop() {
		char element = stack[top];
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
