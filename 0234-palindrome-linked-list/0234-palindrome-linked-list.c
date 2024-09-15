/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* prev = NULL;
    struct ListNode* curr = head;
    struct ListNode* next = NULL;

    while (curr != NULL) {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

bool isPalindrome(struct ListNode* head) {
    struct ListNode *slow = head, *fast = head, *rev = NULL;
    while (fast && fast->next) {
        slow = slow->next;
        fast = fast->next->next;
    }

    rev = reverseList(slow);

    while (rev && head->val == rev->val) {
        head = head->next;
        rev = rev->next;
    }

    return !rev;
}