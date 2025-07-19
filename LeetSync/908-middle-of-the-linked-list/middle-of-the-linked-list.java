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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int cnt=0;
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
    int n = cnt/2;
        int i=n;
        temp = head;
        while(i>0){
            temp = temp.next;
            i--;
        }
       return temp;
    }
}