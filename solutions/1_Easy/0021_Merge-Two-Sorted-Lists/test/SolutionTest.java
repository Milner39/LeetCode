import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

  @Test
  void Example1() {
    var solution = new Solution();
    ListNode l1 =
      new ListNode(1,
      new ListNode(2,
      new ListNode(4
    )));
    ListNode l2 =
      new ListNode(1,
      new ListNode(3,
      new ListNode(4
    )));
    assertArrayEquals(
      new int[]{1, 1, 2, 3, 4, 4},
      solution.mergeTwoLists(l1, l2).toArray()
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    ListNode l1 = null;
    ListNode l2 = null;
    assertEquals(
      null,
      solution.mergeTwoLists(l1, l2)
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    ListNode l1 = null;
    ListNode l2 = new ListNode(0);
    assertArrayEquals(
      new int[]{0},
      solution.mergeTwoLists(l1, l2).toArray()
    );
  }
}