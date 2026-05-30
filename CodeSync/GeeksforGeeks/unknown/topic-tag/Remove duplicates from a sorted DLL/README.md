# Remove duplicates from a sorted DLL

- Platform: GeeksforGeeks
- Language: class Solution: def removeDuplicates(self, headRef): # code here temp = headRef while temp is not None and temp.next is not None: newDistinct = temp.next # find next distinct node while newDistinct and newDistinct.data == temp.data: newDistinct = newDistinct.next # connnect temp with next Distinct temp.next = newDistinct if newDistinct is not None: newDistinct.prev = temp temp = temp.next return headRef
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Linked List, Related Articles, Remove Duplicates Sorted Doubly Linked List
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/remove-duplicates-from-a-sorted-doubly-linked-list/1
- Synced: 2026-05-30T19:39:09.554Z

## Problem Description

Given a doubly linked list of n nodes sorted by values, remove duplicate nodes present in the linked list. Examples: Input: head: 1<->1<->1<->2<->3<->4 Output: 1<->2<->3<->4 Explanation: Only the first occurance of node with value 1 is retained along with other distinct values. Input: head: 1<->2<->2<->3<->3<->4<->4 Output: 1<->2<->3<->4 Explanation: Only the first occurance of nodes with values 2, 3 and 4 are retained, rest repeating nodes are deleted. Constraint: 1 ≤ n ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def removeDuplicates(self, headRef): # code here temp = headRef while temp is not None and temp.next is not None: newDistinct = temp.next # find next distinct node while newDistinct and newDistinct.data == temp.data: newDistinct = newDistinct.next # connnect temp with next Distinct temp.next = newDistinct if newDistinct is not None: newDistinct.prev = temp temp = temp.next return headRef. The detected topics are Expected Complexities, Topic Tags, Linked List, Related Articles, Remove Duplicates Sorted Doubly Linked List. Review the synced source file for the implementation details.
