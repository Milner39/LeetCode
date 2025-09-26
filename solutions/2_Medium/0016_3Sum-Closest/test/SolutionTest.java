import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

  @Test
  void Example1() {
    var solution = new Solution();
    assertEquals(
      2,
      solution.threeSumClosest(new int[]{-1,2,1,-4}, 1)
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    assertEquals(
      0,
      solution.threeSumClosest(new int[]{0,0,0}, 1)
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    assertEquals(
      2,
      solution.threeSumClosest(new int[]{1,1,1,0}, -100)
    );
  }
}