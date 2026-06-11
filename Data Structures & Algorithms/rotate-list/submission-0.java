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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        // 1. finding length and last node
        ListNode tail = head;
        int count = 1;
        while(tail.next != null){
            tail = tail.next;
            count++;
        }

        // Makr it circular
        tail.next = head;

        // Normalize k
        k %= count;

        // Find new tail position
        int mid = count - k;
        ListNode temp = head;
        while(mid > 1){
            temp = temp.next;
            mid--;
        }

        // Break the cycle
        ListNode ans = temp.next;
        temp.next = null;
        return ans;
        
    }
}