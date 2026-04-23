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
        if(head == null) return null;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int sub = count - n;
        if(sub == 0) return head.next;
        int itr = 1;
        ListNode curr = head;
        while(curr != null && itr <= sub){
            if(itr == sub){
                curr.next = curr.next.next;
                return head;
            }else{
                itr++;
                curr = curr.next;
            }
        }
        return head;
    }
}
