import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
  
  @Test
  void Example1() {
    var solution = new Solution();
    ListNode l1 = 
      new ListNode(2,
      new ListNode(4,
      new ListNode(3
    )));
    ListNode l2 = 
      new ListNode(5,
      new ListNode(6,
      new ListNode(4
    )));
    assertArrayEquals(
      new int[]{7, 0, 8},
      solution.addTwoNumbers(l1, l2).toArray()
    );
  }

  @Test
  void Example2() {
    var solution = new Solution();
    ListNode l1 = 
      new ListNode(0
    );
    ListNode l2 = 
      new ListNode(0
    );
    assertArrayEquals(
      new int[]{0},
      solution.addTwoNumbers(l1, l2).toArray()
    );
  }

  @Test
  void Example3() {
    var solution = new Solution();
    ListNode l1 = 
      new ListNode(9,
      new ListNode(9,
      new ListNode(9,
      new ListNode(9,
      new ListNode(9,
      new ListNode(9,
      new ListNode(9
    )))))));
    ListNode l2 = 
      new ListNode(9,
      new ListNode(9,
      new ListNode(9,
      new ListNode(9
    ))));
    assertArrayEquals(
      new int[]{8, 9, 9, 9, 0, 0, 0, 1},
      solution.addTwoNumbers(l1, l2).toArray()
    );
  }
}