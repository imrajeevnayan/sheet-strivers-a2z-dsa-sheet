# Intersection of Two Sorted Linked Lists

- Platform: GeeksforGeeks
- Language: class Solution: def findIntersection(self, head1, head2): intersection = linkedList() while head1 and head2: if head1.data == head2.data: intersection.insert(head1.data) head1, head2 = head1.next, head2.next elif head1.data < head2.data: head1 = head1.next else: head2 = head2.next return intersection.head
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoftD-E-ShawZopper, Company Tags, Amazon, Microsoft, D-E-Shaw, Zopper, Topic Tags
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
- Synced: 2026-05-30T19:36:00.396Z

## Problem Description

Given that two linked lists are sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made without changing the original lists. Note: The elements of the linked list are not necessarily distinct. Examples: Input: LinkedList1 = 1->2->3->4->6, LinkedList2 = 2->4->6->8 Output: 2->4->6 Explanation: For the given two linked list, 2, 4 and 6 are the elements in the intersection. Input: LinkedList1 = 10->20->40->50, LinkedList2 = 15->40 Output: 40 Explaination: Constraints: 1 <= size of linked lists <= 104 1 <= node->data<= 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def findIntersection(self, head1, head2): intersection = linkedList() while head1 and head2: if head1.data == head2.data: intersection.insert(head1.data) head1, head2 = head1.next, head2.next elif head1.data < head2.data: head1 = head1.next else: head2 = head2.next return intersection.head. The detected topics are Expected Complexities, Company Tags AmazonMicrosoftD-E-ShawZopper, Company Tags, Amazon, Microsoft, D-E-Shaw, Zopper, Topic Tags. Review the synced source file for the implementation details.
