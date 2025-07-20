public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        // Step 1: Detect if cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {  // Cycle detected
                // Step 2: Find the cycle start
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry; // Start of cycle
            }
        }

        return null; // No cycle
    }
}
