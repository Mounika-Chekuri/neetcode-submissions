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
        ListNode dummy = new ListNode(0); // Sentinel node eliminates null checks
        ListNode tail = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = extractDigit(l1);
            int digit2 = extractDigit(l2);

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            l1 = advance(l1);
            l2 = advance(l2);
        }

        return dummy.next;
    }

    
    private int extractDigit(ListNode node) {
        return node != null ? node.val : 0;
    }

    
    private ListNode advance(ListNode node) {
        return node != null ? node.next : null;
    }
}