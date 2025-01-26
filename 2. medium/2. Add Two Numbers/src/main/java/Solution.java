/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Define a reference to the first ListNode in the chain so it can be returned
		ListNode startNode = new ListNode(0);

		// Define a reference to the current ListNode
		ListNode currentNode = startNode;

		// Init `carry` to false since no additions have been made yet
		boolean carry = false;

		// While the end of both ListNode chains has not been reached, or carry is true
		while((l1 != null || l2 != null) || carry) {
			// Get the total value for this digit
			int sum = 
				(l1 != null ? l1.val : 0) + 
				(l2 != null ? l2.val : 0) + 
				(carry ? 1 : 0);
			
			// Reset `carry`
			carry = false;
			
			// Use sum to get `val` and `carry`
			int val = sum % 10; // Remainder of dividing by 10
			carry = sum >= 10;

			// Init a new node with the calculated value
			currentNode.next = new ListNode(val);

			// Go to the next digit in the ListNode chains
			currentNode = currentNode.next;
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
		}

		return startNode.next;
	}
}