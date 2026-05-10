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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow;
        ListNode secondHalf = middle.next;
        middle.next = null;
        ListNode prev = null;
        ListNode curr = secondHalf;
        while(curr!=null)
        {
             ListNode  temp = curr.next;
             curr.next = prev;
             prev=curr;
             curr = temp;
       }
       ListNode first = head;
       ListNode second = prev;
       while(first!=null&&second!=null)
       {
          ListNode prev1 = first;
          ListNode prev2 = second;
          first = first.next;
          prev1.next = second;
          second = second.next;
          if(first!=null)
            prev2.next = first;

       }
       
    }
}
