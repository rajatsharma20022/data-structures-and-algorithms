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
    public ListNode mergeKLists(ListNode[] lists) {
        if((lists.length )==0)
        return null;

        List<Integer> list_store =new ArrayList<>();
        for(ListNode head:lists){
            while(head != null){
                list_store.add(head.val);
                head = head.next;
            }
        }
        ListNode master = new ListNode(-1);
        ListNode curr = master;
        list_store.sort(null);
        for(int num: list_store){
            master.next =new ListNode(num);
            master =master.next;
        }
        return curr.next;
        
    }
}