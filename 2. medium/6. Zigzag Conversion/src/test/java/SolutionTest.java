import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
	
	@Test
	void Example1() {
		var solution = new Solution();
		assertEquals("PAYPALISHIRING", solution.convert("PAYPALISHIRING", 1));
	}

	@Test
	void Example2() {
		var solution = new Solution();
		assertEquals("PYAIHRNAPLSIIG", solution.convert("PAYPALISHIRING", 2));
	}

	@Test
	void Example3() {
		var solution = new Solution();
		assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
	}

	@Test
	void Example4() {
		var solution = new Solution();
		assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
	}
}