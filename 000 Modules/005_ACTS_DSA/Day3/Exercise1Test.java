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
