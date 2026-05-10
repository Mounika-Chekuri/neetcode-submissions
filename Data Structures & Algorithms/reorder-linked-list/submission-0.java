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
        ListNode prev = head;
        ListNode curr = head;
        while(curr.next!=null&&curr!=null)
        {
            prev=curr;
            curr=curr.next;
             ListNode temp = curr.next;
             ListNode temp_prev = curr;
             if(temp==null) break;
            while(temp!=null&&temp.next!=null)
            {
                temp_prev = temp;
                temp=temp.next;
            }
            temp_prev.next = null;
            prev.next = temp;
            prev=prev.next;
            if(curr!=null)
              prev.next = curr;
        }
        
    }
}
