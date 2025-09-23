import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

  @Test
  void Example1() {
    var solution = new Solution();
    assertEquals(
      3,
      solution.romanToInt("III")
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    assertEquals(
      58,
      solution.isPalindrome("LVIII")
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    assertEquals(
      1994,
      solution.isPalindrome("MCMXCIV")
    );
  }
}