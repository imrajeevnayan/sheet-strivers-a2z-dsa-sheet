# Length of Circular Linked List

- Platform: GeeksforGeeks
- Language: /* class Node { int data; Node next; Node(int data) { this.data = data; this.next = null; } } */ class Solution { public static int getLength(Node head) { // Making pointers to the List Node temp = head; Node curr = head; // Boundary Condition :- if(head == null) return 0; // Iterate a current pointer until the 'curr' next point to head of the linked List the // increment the len value to +1 ..If the their is no linked list then return 0; int len = 1; while(curr.next != temp){ len++; curr = curr.next; } // return the length of the Circular Linked List.. return len; } }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/length-of-circular-linked-list/1
- Synced: 2026-05-30T19:34:03.380Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using /* class Node { int data; Node next; Node(int data) { this.data = data; this.next = null; } } */ class Solution { public static int getLength(Node head) { // Making pointers to the List Node temp = head; Node curr = head; // Boundary Condition :- if(head == null) return 0; // Iterate a current pointer until the 'curr' next point to head of the linked List the // increment the len value to +1 ..If the their is no linked list then return 0; int len = 1; while(curr.next != temp){ len++; curr = curr.next; } // return the length of the Circular Linked List.. return len; } }. Review the synced source file for the implementation details.
