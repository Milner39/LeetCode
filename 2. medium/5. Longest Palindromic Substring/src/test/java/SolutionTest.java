import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
	
	@Test
	void Example1() {
		var solution = new Solution();
		assertEquals("bab", solution.longestPalindrome("babad"));
	}

	@Test
	void Example2() {
		var solution = new Solution();
		assertEquals("bb", solution.longestPalindrome("cbbd"));
	}

	@Test
	void Example3() {
		var solution = new Solution();
		assertEquals("nn", solution.longestPalindrome("finn"));
	}

	@Test
	void Example4() {
		var solution = new Solution();
		assertEquals("a", solution.longestPalindrome("ac"));
	}
}