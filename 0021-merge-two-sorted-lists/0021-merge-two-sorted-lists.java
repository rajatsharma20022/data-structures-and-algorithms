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
        //ListNode L1=list1;
        //ListNode L2=list2;
        ListNode Revhead=Rever_list;
        while(list1!=null && list2 != null){
            if(list1.val <= list2.val ) 
            {
                Revhead.next=new ListNode(list1.val);
                 list1= list1.next;
                 Revhead=Revhead.next;
            }
            else 
            {
                Revhead.next=new ListNode(list2.val);
               list2= list2.next;
               Revhead=Revhead.next;
            }
            
         }
         if(list1 == null){
            Revhead.next=list2;
         }
         if(list2 == null){
            Revhead.next=list1;
         }
         return Rever_list.next;
        
    }
}