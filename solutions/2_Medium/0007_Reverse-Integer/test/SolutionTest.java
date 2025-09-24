import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

  @Test
  void Example1() {
    var solution = new Solution();
    assertEquals(
      321,
      solution.reverse(123)
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    assertEquals(
      -321,
      solution.reverse(-123)
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    assertEquals(
      21,
      solution.reverse(120)
    );
  }

  @Test
  void Example4() {
    var solution = new Solution();
    assertEquals(
      0,
      solution.reverse(1534236467)
    );
  }
}