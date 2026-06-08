# Length of Circular Linked List

- Platform: GeeksforGeeks
- Language: /* class Node { int data; Node next; Node(int data) { this.data = data; this.next = null; } } */ class Solution { public static int getLength(Node head) { // Making pointers to the List Node temp = head; Node curr = head; // Boundary Condition :- if(head == null) return 0; // Iterate a current pointer until the 'curr' next point to head of the linked List the // increment the len value to +1 ..If the their is no linked list then return 0; int len = 1; while(curr.next != temp){ len++; curr = curr.next; } // return the length of the Circular Linked List.. return len; } }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Linked List, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/length-of-circular-linked-list/1
- Synced: 2026-06-08T11:54:07.667Z

## Problem Description

Given a circular linked list of size n, find the length of the list (total number of nodes). Note: The tail of the circular linked list is connected to head. Examples: Input: Output: 5 Input: Output: 6 Constraints: 1 ≤ nodes ≤ 103

## Explanation

This solution was accepted on GeeksforGeeks using /* class Node { int data; Node next; Node(int data) { this.data = data; this.next = null; } } */ class Solution { public static int getLength(Node head) { // Making pointers to the List Node temp = head; Node curr = head; // Boundary Condition :- if(head == null) return 0; // Iterate a current pointer until the 'curr' next point to head of the linked List the // increment the len value to +1 ..If the their is no linked list then return 0; int len = 1; while(curr.next != temp){ len++; curr = curr.next; } // return the length of the Circular Linked List.. return len; } }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Linked List, Data Structures. Review the synced source file for the implementation details.
