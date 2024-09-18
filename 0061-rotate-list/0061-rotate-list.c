/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
        if (head == NULL || head->next == NULL || k == 0) {
        return head;  
    }
    struct ListNode* tail = head;
    int length = 1;
    while (tail->next != NULL) {
        tail = tail->next;
        length++;
    }
      k = k % length;
       if (k == 0) {
        return head;  // No rotation needed if k is a multiple of the list length
    }
struct ListNode* newTail = head;
    for (int i = 0; i < length - k - 1; i++) {
        newTail = newTail->next;
    }
      struct ListNode* newHead = newTail->next;

        tail->next = head;  // Connect tail to head
    newTail->next = NULL;  // Break the link to make newTail the last node

    return newHead;  // Return the new head of the rotated list
}