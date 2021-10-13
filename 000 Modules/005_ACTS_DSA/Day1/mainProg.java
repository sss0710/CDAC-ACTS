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
