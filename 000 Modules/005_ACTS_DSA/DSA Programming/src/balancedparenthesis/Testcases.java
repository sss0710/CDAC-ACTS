package balancedparenthesis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testcases {

	@Test
	void test0() {
		BalanceParenthesis myObj = new BalanceParenthesis();
		boolean result = myObj.IsBalanced("}{}[](");
		assertFalse(result);
	}
	
	@Test
	void test1() {
		BalanceParenthesis myObj = new BalanceParenthesis();
		boolean result = myObj.IsBalanced("{{]{()");
		assertFalse(result);
	}
	
	@Test
	void test2() {
		BalanceParenthesis myObj = new BalanceParenthesis();
		boolean result = myObj.IsBalanced("{{}[])(}");
		assertFalse(result);
	}
	
	@Test
	void test3() {
		BalanceParenthesis myObj = new BalanceParenthesis();
		boolean result = myObj.IsBalanced("{}{]");
		assertFalse(result);
	}
	
	@Test
	void test4() {
		BalanceParenthesis myObj = new BalanceParenthesis();
		boolean result = myObj.IsBalanced("{{]");
		assertFalse(result);
	}
	
	@Test
	void test5() {
		BalanceParenthesis myObj = new BalanceParenthesis();
		boolean result = myObj.IsBalanced("))))))((((((");
		assertFalse(result);
	}
}
