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
        ArrayList<Integer > list = new ArrayList<>();
        for(ListNode head : lists){
            while(head != null){
                list.add(head.val);
                head = head.next;
            }
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for(int num : list){
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        return dummy.next;
    }
}