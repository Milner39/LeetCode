import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

  @Test
  void Example1() {
    var solution = new Solution();
    var strs = new String[]{
      "flower", "flow", "flight"
    };

    assertEquals(
      "fl",
      solution.longestCommonPrefix(strs)
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    var strs = new String[]{
      "dog", "racecar", "car"
    };
    
    assertEquals(
      "",
      solution.longestCommonPrefix(strs)
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    var strs = new String[]{
      "snowed", "snow", "snowing"
    };
    
    assertEquals(
      "snow",
      solution.longestCommonPrefix(strs)
    );
  }
}