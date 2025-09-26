import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

  @Test
  void Example1() {
    var solution = new Solution();
    assertEquals(
      42,
      solution.myAtoi("42")
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    assertEquals(
      -42,
      solution.myAtoi("   -042")
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    assertEquals(
      1337,
      solution.myAtoi("1337c0d3")
    );
  }

  @Test
  void Example4() {
    var solution = new Solution();
    assertEquals(
      0,
      solution.myAtoi("0-1")
    );
  }

  @Test
  void Example5() {
    var solution = new Solution();
    assertEquals(
      0,
      solution.myAtoi("words and 987")
    );
  }
}