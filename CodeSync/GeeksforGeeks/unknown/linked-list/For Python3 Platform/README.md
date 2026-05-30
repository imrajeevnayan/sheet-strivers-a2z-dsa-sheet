# For Python3 Platform

- Platform: GeeksforGeeks
- Language: ''' class Node: def __init__(self, data): self.data = data self.next = None ''' class Solution: def deleteHead(self, head): temp = head head = head.next temp.next = None return head
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, Data Structures, Related Articles, Remove First Node Of The Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/delete-head-of-linked-list/1
- Synced: 2026-05-30T19:40:45.816Z

## Problem Description

Given a Linked List, delete the head of the Linked List and return the new head of the modified Linked List. Note: Set the original head to NULL. Examples: Input: Output: 2 -> 3 -> 1 -> 7 Explanation: After deleting head from the given linked list, we'll be left with just 2 -> 3 -> 1 -> 7. Input: Output: 5 -> 7 -> 8 -> 99 -> 100 Explanation: After deleting head from the given linked list, we'll be left with just 5 -> 7 -> 8 -> 99 -> 100. Constraints: 1 ≤ number of nodes ≤ 105 1 ≤ node->data ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using ''' class Node: def __init__(self, data): self.data = data self.next = None ''' class Solution: def deleteHead(self, head): temp = head head = head.next temp.next = None return head. The detected topics are Expected Complexities, Topic Tags, Linked List, Data Structures, Related Articles, Remove First Node Of The Linked List. Review the synced source file for the implementation details.
