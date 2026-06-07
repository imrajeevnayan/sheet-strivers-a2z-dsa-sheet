# Practice

- Platform: GeeksforGeeks
- Language: #include <iostream> #include <stack> using namespace std; class Node { public: int data; Node* next; Node(int d) { data = d; next = nullptr; } }; // Function to check if the linked list // is palindrome or not bool isPalindrome(Node* head) { Node* currNode = head; // Declare a stack stack<int> s; // Push all elements of the list to the stack while (currNode != nullptr) { s.push(currNode->data); currNode = currNode->next; } // Iterate in the list again and check by // popping from the stack while (head != nullptr) { // Get the topmost element int c = s.top(); s.pop(); // Check if data is not same as popped element if (head->data != c) { return false; } // Move ahead head = head->next; } return true; } int main() { // Linked list : 1->2->3->2->1 Node* head = new Node(1); head->next = new Node(2); head->next->next = new Node(3); head->next->next->next = new Node(2); head->next->next->next->next = new Node(1); bool result = isPalindrome(head); if (result) cout << "true\n"; else cout << "false\n"; return 0; }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/LL-bonus-problem/problem/merge-k-sorted-linked-lists
- Synced: 2026-06-07T09:37:36.903Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using #include <iostream> #include <stack> using namespace std; class Node { public: int data; Node* next; Node(int d) { data = d; next = nullptr; } }; // Function to check if the linked list // is palindrome or not bool isPalindrome(Node* head) { Node* currNode = head; // Declare a stack stack<int> s; // Push all elements of the list to the stack while (currNode != nullptr) { s.push(currNode->data); currNode = currNode->next; } // Iterate in the list again and check by // popping from the stack while (head != nullptr) { // Get the topmost element int c = s.top(); s.pop(); // Check if data is not same as popped element if (head->data != c) { return false; } // Move ahead head = head->next; } return true; } int main() { // Linked list : 1->2->3->2->1 Node* head = new Node(1); head->next = new Node(2); head->next->next = new Node(3); head->next->next->next = new Node(2); head->next->next->next->next = new Node(1); bool result = isPalindrome(head); if (result) cout << "true\n"; else cout << "false\n"; return 0; }. Review the synced source file for the implementation details.
