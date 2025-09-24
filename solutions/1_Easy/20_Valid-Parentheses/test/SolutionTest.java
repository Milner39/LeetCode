import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

  @Test
  void Example1() {
    var solution = new Solution();
    assertEquals(
      true,
      solution.isValid("()")
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    assertEquals(
      true,
      solution.isValid("()[]{}")
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    assertEquals(
      false,
      solution.isValid("(]")
    );
  }

  @Test
  void Example4() {
    var solution = new Solution();
    assertEquals(
      true,
      solution.isValid("([])")
    );
  }

  @Test
  void Example5() {
    var solution = new Solution();
    assertEquals(
      false,
      solution.isValid("([)]")
    );
  }
}