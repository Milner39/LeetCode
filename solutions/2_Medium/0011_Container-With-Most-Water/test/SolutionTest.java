import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

  @Test
  void Example1() {
    var solution = new Solution();
    assertEquals(
      49,
      solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7})
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    assertEquals(
      1,
      solution.maxArea(new int[]{1,1})
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    assertEquals(
      54,
      solution.maxArea(new int[]{2,9,7,4,6,4,8,6,5,3,6,5,1})
    );
  }
}