package twostacksinarray;

public class TwoStackUsingArray implements TwoStackIntf {
	int top1;
	int top2;
	int[] stack;
	int n;

	public TwoStackUsingArray(int n) {
		this.n = n;
		stack = new int [n];
		top1 = -1;
		top2 = n;
	}

	@Override
	public void Push1(int element) {
		++top1;
		stack[top1] = element;
	}

	@Override
	public int Pop1() {
		int element = stack[top1];
		--top1;
		return element;
	}

	@Override
	public boolean Is1Empty() {
		if (top1 == -1)
			return true;
		return false;
	}

	@Override
	public boolean Is1Full() {
		if (top1==n-1 || top2==0 || (top2-top1)==1)
			return true;
		return false;
	}

	@Override
	public void Push2(int element) {
		--top2;
		stack[top2] = element;
	}

	@Override
	public int Pop2() {
		int element = stack[top2];
		++top2;
		return element;
	}

	@Override
	public boolean Is2Empty() {
		if (top2 == n)
			return true;
		return false;
	}

	@Override
	public boolean Is2Full() {
		if (top1==n-1 || top2==0 || (top2-top1)==1)
			return true;
		return false;
	}

}
