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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Rever_list=new ListNode(Integer.MIN_VALUE);
        ListNode L1=list1;
        ListNode L2=list2;
        ListNode Revhead=Rever_list;
        while(L1!=null && L2 != null){
            if(L1.val <= L2.val ) 
            {
                Revhead.next=new ListNode(L1.val);
                 L1= L1.next;
                 Revhead=Revhead.next;
            }
            else 
            {
                Revhead.next=new ListNode(L2.val);
               L2= L2.next;
               Revhead=Revhead.next;
            }
            
         }
         if(L1 == null){
            Revhead.next=L2;
         }
         if(L2 == null){
            Revhead.next=L1;
         }
         return Rever_list.next;
        
    }
}