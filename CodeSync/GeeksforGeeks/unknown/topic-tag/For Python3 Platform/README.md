# For Python3 Platform

- Platform: GeeksforGeeks
- Language: """ class Node: def __init__(self, data): self.data = data self.next = None """ class Solution: def count(self, head, key): cnt = 0 while(head is not None): if(key == head.data): cnt += 1 head = head.next return cnt
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1
- Synced: 2026-05-30T19:37:53.192Z

## Problem Description

Given a singly linked list and a key, count the number of occurrences of the given key in the linked list. Examples: Input: head: 1->2->1->2->1->3->1, key = 1 Output: 4 Explanation: 1 appears 4 times. Input: head: 1->2->1->2->1, key = 3 Output: 0 Explanation: 3 appears 0 times. Constraints: 1 ≤ number of nodes, key ≤ 105 1 ≤ data of node ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using """ class Node: def __init__(self, data): self.data = data self.next = None """ class Solution: def count(self, head, key): cnt = 0 while(head is not None): if(key == head.data): cnt += 1 head = head.next return cnt. The detected topics are Expected Complexities, Topic Tags, Linked List, Data Structures, Related Articles. Review the synced source file for the implementation details.
