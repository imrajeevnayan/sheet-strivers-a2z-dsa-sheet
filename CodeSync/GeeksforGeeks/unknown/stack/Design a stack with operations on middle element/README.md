# Design a stack with operations on middle element

- Platform: GeeksforGeeks
- Language: #include <bits/stdc++.h> using namespace std; // Node Structure class Node { public: int data; Node *next; Node *prev; Node(int data) { this->data = data; next = nullptr; prev = nullptr; } }; // Stack strcutre class myStack { Node *head; Node *mid; int size; public: myStack() { size = 0; head = nullptr; mid = nullptr; } void push(int data) { Node *temp = new Node(data); if (size == 0) { head = temp; mid = temp; size++; return; } head->next = temp; temp->prev = head; // update the pointers head = head->next; if (size % 2 == 1) { mid = mid->next; } size++; } int pop() { int data = -1; if (size != 0) { Node *toPop = head; data = toPop->data; if (size == 1) { head = nullptr; mid = nullptr; } else { head = head->prev; head->next = nullptr; if (size % 2 == 0) { mid = mid->prev; } } delete toPop; size--; } return data; } int findMiddle() { if (size == 0) { return -1; } return mid->data; } void deleteMiddle() { if (size != 0) { Node *toDelete = mid; if (size == 1) { head = nullptr; mid = nullptr; } else if (size == 2) { head = head->prev; mid = mid->prev; head->next = nullptr; } else { mid->next->prev = mid->prev; mid->prev->next = mid->next; if (size % 2 == 0) { mid = mid->prev; } else { mid = mid->next; } } delete toDelete; size--; } } }; int main() { myStack st; st.push(1); st.push(2); cout << st.findMiddle() << " "; st.deleteMiddle(); cout << st.pop(); return 0; }
- Difficulty: Unknown
- Topics: Stack
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/dsa/design-a-stack-with-find-middle-operation/
- Synced: 2026-06-06T11:31:01.414Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <bits/stdc++.h> using namespace std; // Node Structure class Node { public: int data; Node *next; Node *prev; Node(int data) { this->data = data; next = nullptr; prev = nullptr; } }; // Stack strcutre class myStack { Node *head; Node *mid; int size; public: myStack() { size = 0; head = nullptr; mid = nullptr; } void push(int data) { Node *temp = new Node(data); if (size == 0) { head = temp; mid = temp; size++; return; } head->next = temp; temp->prev = head; // update the pointers head = head->next; if (size % 2 == 1) { mid = mid->next; } size++; } int pop() { int data = -1; if (size != 0) { Node *toPop = head; data = toPop->data; if (size == 1) { head = nullptr; mid = nullptr; } else { head = head->prev; head->next = nullptr; if (size % 2 == 0) { mid = mid->prev; } } delete toPop; size--; } return data; } int findMiddle() { if (size == 0) { return -1; } return mid->data; } void deleteMiddle() { if (size != 0) { Node *toDelete = mid; if (size == 1) { head = nullptr; mid = nullptr; } else if (size == 2) { head = head->prev; mid = mid->prev; head->next = nullptr; } else { mid->next->prev = mid->prev; mid->prev->next = mid->next; if (size % 2 == 0) { mid = mid->prev; } else { mid = mid->next; } } delete toDelete; size--; } } }; int main() { myStack st; st.push(1); st.push(2); cout << st.findMiddle() << " "; st.deleteMiddle(); cout << st.pop(); return 0; }. The detected topics are Stack. Review the synced source file for the implementation details.
