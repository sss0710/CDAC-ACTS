
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
		if(IsFull()){
			System.out.println("Stack is full. Cannot add more Elements");
		}
		else{
		++top;
		stack[top] = element;
		}
	}

	@Override
	public int Pop() {
		if(IsEmpty()){
			System.out.println("Stack is Empty. Cannot remove more elements");
			return 0; //????????????????
		}
		else{
		int element = stack[top];
		--top;
		return element;
		}
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
