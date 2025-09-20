import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
  
  @Test
  void Example1() {
    var solution = new Solution();
    var n1 = new int[]{1, 3};
    var n2 = new int[]{2};

    assertEquals(
      2.0,
      solution.findMedianSortedArrays(n1, n2)
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    var n1 = new int[]{1, 2};
    var n2 = new int[]{3, 4};

    assertEquals(
      2.5,
      solution.findMedianSortedArrays(n1, n2)
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    var n1 = new int[]{1, 2, 3};
    var n2 = new int[]{1, 3, 4};

    assertEquals(
      2.5,
      solution.findMedianSortedArrays(n1, n2)
    );
  }
}