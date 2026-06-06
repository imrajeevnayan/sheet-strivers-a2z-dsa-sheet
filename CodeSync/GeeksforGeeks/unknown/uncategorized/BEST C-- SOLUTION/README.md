# BEST C++ SOLUTION

- Platform: GeeksforGeeks
- Language: class Node { public: int data; Node* next; Node(int new_data) { data = new_data; next = nullptr; } }; class myQueue { Node *front; Node *rear; int count; public: myQueue() { front = nullptr; rear = nullptr; count=0; } bool isEmpty() { if(front == nullptr) { return true; } return false; } void enqueue(int x) { Node * newNode = new Node(x); if(isEmpty()) { front = newNode; rear = newNode; } else { rear->next = newNode; rear = newNode; } count++; } void dequeue() { if(isEmpty()) { return; } Node *temp = front; front = front->next; delete temp; count--; if(front==nullptr) { rear = nullptr; } } int getFront() { if(isEmpty()) { return -1; } return front->data; } int size() { return count; } };
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/implement-queue-using-linked-list/1
- Synced: 2026-06-06T11:49:23.933Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Node { public: int data; Node* next; Node(int new_data) { data = new_data; next = nullptr; } }; class myQueue { Node *front; Node *rear; int count; public: myQueue() { front = nullptr; rear = nullptr; count=0; } bool isEmpty() { if(front == nullptr) { return true; } return false; } void enqueue(int x) { Node * newNode = new Node(x); if(isEmpty()) { front = newNode; rear = newNode; } else { rear->next = newNode; rear = newNode; } count++; } void dequeue() { if(isEmpty()) { return; } Node *temp = front; front = front->next; delete temp; count--; if(front==nullptr) { rear = nullptr; } } int getFront() { if(isEmpty()) { return -1; } return front->data; } int size() { return count; } };. Review the synced source file for the implementation details.
