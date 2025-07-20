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
        ListNode temp = head;
         int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (count == k) {
            // Reverse first k nodes
            ListNode newHead = reverseK(head, k);
            // Recursively process the remaining list
            head.next = reverseKGroup(temp, k);
            return newHead;
        }

        // Less than k nodes — leave them as is
        return head;
    }

    private ListNode reverseK(ListNode head,int k){
        ListNode prev = null;
        ListNode curr = head;
        while (k-- > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;  // New head of the reversed group
    }
}