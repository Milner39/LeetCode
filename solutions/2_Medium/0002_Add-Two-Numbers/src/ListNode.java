import java.util.ArrayList;

public class ListNode {
  int val;
  ListNode next;

  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }


  public int[] toArray() {
    ArrayList<Integer> list = new ArrayList<>();
    ListNode current = this;
    while (current != null) {
      list.add(current.val);
      current = current.next;
    }

    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}
