/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     struct Node *next;
 *     struct Node *random;
 * };
 */

struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->val = data;
    return newNode;
}
struct Node* copyRandomList(struct Node* head) {
    if (head == NULL) return NULL;

    // Step 1: Insert copied nodes next to original nodes
    struct Node* curr = head;
    while (curr != NULL) {
        struct Node* temp = curr->next;
        curr->next = createNode(curr->val);
        curr->next->next = temp;
        curr = temp;
    }

    // Step 2: Set the random pointers for the copied nodes
    curr = head;
    while (curr != NULL) {
        if (curr->next != NULL) {
            curr->next->random =
                (curr->random != NULL) ? curr->random->next : NULL;
        }
        curr = curr->next->next;
    }

    // Step 3: Separate the original and copied lists
    struct Node *orig = head;
    struct Node *copy = head->next;
    struct Node *temp = copy;

    while (orig != NULL) {
        orig->next = orig->next->next;
        copy->next = (copy->next != NULL) ? copy->next->next : NULL;
        orig = orig->next;
        copy = copy->next;
    }

    return temp;
}
