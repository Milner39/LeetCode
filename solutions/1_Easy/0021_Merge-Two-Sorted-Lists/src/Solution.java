class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // Return fast if either empty
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    // Make sure `head` contains the smallest val
    ListNode head, A, B;
    if (list1.val <= list2.val) {
      head = list1;
      B = list2;
    } else {
      head = list2;
      B = list1;
    }
    A = head;

    // Traverse linked list
    while (A.next != null) {
      // If the next node is larger than `B`, swap them
      if (A.next.val > B.val) {
        var tmp = A.next;
        A.next = B;
        B = tmp;
      }

      // Next node
      A = A.next;
    }

    // If we have reached the end of `A`
    // Attach `B` to the end of `A`
    A.next = B;
    return head;
  }


  /*  Illustration

    1 -> 2 -> 4    1 -> 3 -> 4
    ^              ^          

    1 -> 2 -> 4    1 -> 3 -> 4
         ^         ^          

    1 -> 1 -> 3 -> 4    2 -> 4
              ^         ^     

    1 -> 1 -> 2 -> 4    3 -> 4
                   ^    ^     

    1 -> 1 -> 2 -> 3 -> 4    4
                        ^    ^

    1 -> 1 -> 2 -> 3 -> 4 -> 4

  */
}