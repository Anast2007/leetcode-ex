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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        for(int i = 1; i < k; i++){
            temp = temp.next;
        }
        ListNode slow = head;
        ListNode fast = temp;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        int cur = temp.val;
        temp.val = slow.val;
        slow.val = cur;
        return head;
    }
}