import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

  @Test
  void Example1() {
    var solution = new Solution();
    assertEquals(
      "MMMDCCXLIX",
      solution.intToRoman(3749)
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    assertEquals(
      "LVIII",
      solution.intToRoman(58)
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    assertEquals(
      "MCMXCIV",
      solution.intToRoman(1994)
    );
  }
}