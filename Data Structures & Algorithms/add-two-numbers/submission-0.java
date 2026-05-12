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
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode res = null;
        ListNode newhead = null;
        int rem = 0;
        while(temp1!=null&&temp2!=null)
        {
             int a = temp1.val;
             int b = temp2.val;
             int sum = a+b+rem;
             if(sum>9)
             {
                rem = sum/10;
                sum = sum%10;
                
             }
             else if(rem>0) rem=0;
             ListNode newNode = new ListNode(sum);
             if(newhead==null)
             {
                res = newNode;
                newhead = res;
             }
             else 
             {
                res.next = newNode;
                res = newNode;
             }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1!=null)
        {
            int sum = temp1.val+rem;
            if(sum>9)
             {
                rem = sum/10;
                sum = sum%10;
                
             }
             else if(rem>0) rem=0;
             ListNode newNode = new ListNode(sum);
             if(res==null)
             {
                res = newNode;
                newhead = res;
             }
             else 
             {
                res.next = newNode;
                res = newNode;
             }

            temp1 = temp1.next;

        }
         while(temp2!=null)
        {
            int sum = temp2.val+rem;
            if(sum>9)
             {
                rem = sum/10;
                sum = sum%10;
                
             }
             else if(rem>0) rem=0;
             ListNode newNode = new ListNode(sum);
             if(res==null)
             {
                res = newNode;
                newhead = res;
             }
             else 
             {
                res.next = newNode;
                res = newNode;
             }

            temp2 = temp2.next;

        }
        if(rem>0)
          res.next = new ListNode(rem);
        return newhead;
    }
}
