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
