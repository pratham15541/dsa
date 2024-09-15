/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

 int getLength(struct ListNode* head){
    int length = 0;
    while(head!=NULL){
        length++;
        head = head->next;
    }

    return length;
 }
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    int len1 = getLength(headA);
    int len2 = getLength(headB);

    while(len1>len2){
        len1--;
        headA = headA->next;
    }
    while(len2>len1){
        len2--;
         headB = headB->next;
    }

    while(headA!=headB){
        headA = headA->next;
        headB = headB->next;
    }

    return headA;

}