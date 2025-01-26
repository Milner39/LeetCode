import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
	
	@Test
	void Example1() {
		var solution = new Solution();
		assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
	}

	@Test
	void Example2() {
		var solution = new Solution();
		assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3, 2, 4}, 6));
	}

	@Test
	void Example3() {
		var solution = new Solution();
		assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{3, 3}, 6));
	}
}