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
    public ListNode reverseKGroup(ListNode head, int k) {
        // 1. Check if k nodes exists
        ListNode temp = head;
        int count = 0;
        while(count < k){
            if(temp == null) return head;
            temp = temp.next;
            count++;
        }

        // 2. Reverse call for remaining part
        ListNode prev = reverseKGroup(temp, k);

        // 3. Reverse current group
        temp = head;
        count = 0;
        while(count < k){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            count++;
        }
        return prev;
    }
}
