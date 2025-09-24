import org.junit.jupiter.api.Test;

public class SolutionTest {

  @Test
  void Example1() {
    var solution = new Solution();

    int[] nums = new int[]{1,1,2};
    int[] expectedNums = new int[]{1,2};
    int k = solution.removeDuplicates(nums);

    assert k == expectedNums.length;
    for (int i = 0; i < k; i++) {
      assert nums[i] == expectedNums[i];
    }
  }

  @Test
  void Example2() {
    var solution = new Solution();

    int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
    int[] expectedNums = new int[]{0,1,2,3,4};
    int k = solution.removeDuplicates(nums);

    assert k == expectedNums.length;
    for (int i = 0; i < k; i++) {
      assert nums[i] == expectedNums[i];
    }
  }

  @Test
  void Example3() {
    var solution = new Solution();

    int[] nums = new int[]{0,0,1,1,3,3,4};
    int[] expectedNums = new int[]{0,1,3,4};
    int k = solution.removeDuplicates(nums);

    assert k == expectedNums.length;
    for (int i = 0; i < k; i++) {
      assert nums[i] == expectedNums[i];
    }
  }
}