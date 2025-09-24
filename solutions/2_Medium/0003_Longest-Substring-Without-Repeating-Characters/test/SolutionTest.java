import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
  
  @Test
  void Example1() {
    var solution = new Solution();
    assertEquals(
      3,
      solution.lengthOfLongestSubstring("abcabcbb")
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    assertEquals(
      1,
      solution.lengthOfLongestSubstring("bbbbb")
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    assertEquals(
      3,
      solution.lengthOfLongestSubstring("pwwkew")
    );
  }
}