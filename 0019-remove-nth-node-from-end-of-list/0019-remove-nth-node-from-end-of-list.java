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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1)
        return null;
        ListNode dummy1 = head;
        ListNode dummy2 = head;
        int c = 0;
        while(dummy1 != null){
            c++;
            dummy1 = dummy1.next;
        }

        if(c == n)
        {
            head=head.next;
            return head;
        }
        for(int i = 1; i<= c; i++){


            if(i == (c-n)){
            dummy2.next = dummy2.next.next;
            }
            else
            {
                dummy2 = dummy2.next;
            }

        }
        return head;


        
    }
}