# PYTHON SHORTEST OPTIMIZED CODE

- Platform: GeeksforGeeks
- Language: class Solution: def reverseDLL(self, head): while head: head.next, head.prev = head.prev, head.next if not head.prev:return head head=head.prev
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags D-E-ShawAdobeNPCI, Company Tags, D-E-Shaw, Adobe, NPCI, Topic Tags, doubly-linked-list
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
- Synced: 2026-06-06T15:11:22.434Z

## Problem Description

Given the head of a doubly linked list. You have to reverse the doubly linked list and return its head. Note: The driver code will print the returned list in both forward and backward directions. Examples: Input: Output: 5 4 3 3 4 5 Explanation: After reversing the given doubly linked list the new list will be 5 <-> 4 <-> 3. Input: Output: 196 59 122 75 75 122 59 196 Explanation: After reversing the given doubly linked list the new list will be 196 <-> 59 <-> 122 <-> 75. Constraints: 1 ≤ number of nodes ≤ 106 0 ≤ node->data ≤ 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def reverseDLL(self, head): while head: head.next, head.prev = head.prev, head.next if not head.prev:return head head=head.prev. The detected topics are Expected Complexities, Company Tags D-E-ShawAdobeNPCI, Company Tags, D-E-Shaw, Adobe, NPCI, Topic Tags, doubly-linked-list. Review the synced source file for the implementation details.
