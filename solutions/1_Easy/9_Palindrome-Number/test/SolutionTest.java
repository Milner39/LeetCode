import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
	
	@Test
	void Example1() {
		var solution = new Solution();
		assertEquals(
			true,
			solution.isPalindrome(121)
		);
	}

	@Test
	void Example2() {
		var solution = new Solution();
		assertEquals(
			false,
			solution.isPalindrome(-121)
		);
	}

	@Test
	void Example3() {
		var solution = new Solution();
		assertEquals(
			false,
			solution.isPalindrome(10)
		);
	}
}