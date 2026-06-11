# Optimal Approach (Reverse → Add → Reverse back)

- Platform: GeeksforGeeks
- Language: class Solution { public Node addOne(Node head) { // code here. Node revHead = reverse(head); Node curr = revHead; while(curr.data==9){ curr.data = 0; if(curr.next==null){ curr.next = new Node(1); return reverse(revHead); } else{ curr = curr.next; } } curr.data = curr.data+1; return reverse(revHead); } private Node reverse(Node head){ Node p = head; Node q = null; Node r = q; while(p!=null){ r = q; q = p; p = p.next; q.next = r; } return q; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Linked List, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
- Synced: 2026-06-11T04:07:28.436Z

## Problem Description

You are given head of a linked list where each node contains a single digit. The digits together represent a number formed by concatenating the node values in order. Add 1 to this number and return the head of the modified linked list. Examples : Input: Head: 4->5->6 Output: 457 Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. Input: Head: 1->2->3 Output: 124 Explanation: 1->2->3 represents 123 and when 1 is added it becomes 124. Input: Head: 0->0->1 Output: 002 Constraints: 1 ≤ len(list) ≤ 10 0 ≤ list[i] ≤ 9

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public Node addOne(Node head) { // code here. Node revHead = reverse(head); Node curr = revHead; while(curr.data==9){ curr.data = 0; if(curr.next==null){ curr.next = new Node(1); return reverse(revHead); } else{ curr = curr.next; } } curr.data = curr.data+1; return reverse(revHead); } private Node reverse(Node head){ Node p = head; Node q = null; Node r = q; while(p!=null){ r = q; q = p; p = p.next; q.next = r; } return q; } }. The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Linked List, Data Structures, Related Articles. Review the synced source file for the implementation details.
