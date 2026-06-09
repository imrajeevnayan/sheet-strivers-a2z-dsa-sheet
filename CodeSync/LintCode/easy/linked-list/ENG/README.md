# ENG

- Platform: LintCode
- Language: 1public class Solution { 2 public ListNode reverseBetween(ListNode head, int m, int n) { 3 if (head == null || m == n) return head; 4 5 ListNode dummy = new ListNode(0); 6 dummy.next = head; 7 8 ListNode prev = dummy; 9 for (int i = 1; i < m; i++) { 10 prev = prev.next; 11 } 12 ListNode curr = prev.next; 13 for (int i = 0; i < n - m; i++) { 14 ListNode next = curr.next; 15 curr.next = next.next; 16 next.next = prev.next; 17 prev.next = next; 18 } 19 return dummy.next; 20 } 21}
- Difficulty: Easy
- Topics: Linked List, Test Data Commit Output
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.lintcode.com/problem/36/
- Synced: 2026-06-09T06:49:33.948Z

## Problem Description

Description Reverse a linked list from position m to n. LintCode - Online Judge Solution Candidate Written Test Screening, Team Competency Assessment, Programming Teaching Exercises, Online Exam Grading WeChat for information m and n satisfy the following condition: 1 ≤ 𝑚 ≤ 𝑛 ≤ 𝑙 𝑒 𝑛 𝑔 𝑡 ℎ 𝑜 𝑓 𝑙 𝑖 𝑠 𝑡 1≤m≤n≤lengthoflist. Example Example 1: Input: linked list = 1->2->3->4->5->NULL m = 2 n = 4 Output: 1->4->3->2->5->NULL Explanation: Reverse the [2,4] position of the linked list. Example 2: Input: linked list = 1->2->3->4->null m = 2 n = 3 Output: 1->3->2->4->NULL Explanation: Reverse the [2,3] position of the linked list. Challenge Reverse it in-place and in one-pass Tags Related Problems 35 Reverse Linked List Easy 53 Reverse Words in a String Easy 450 Reverse Nodes in k-Group Hard Recommend Courses ACM金牌逐行带刷班 最适合懒人的刷题课--躺平看算法大神在线coding，讲解思路+现场debug，手撕面试高频题

## Explanation

This solution was accepted on LintCode using 1public class Solution { 2 public ListNode reverseBetween(ListNode head, int m, int n) { 3 if (head == null || m == n) return head; 4 5 ListNode dummy = new ListNode(0); 6 dummy.next = head; 7 8 ListNode prev = dummy; 9 for (int i = 1; i < m; i++) { 10 prev = prev.next; 11 } 12 ListNode curr = prev.next; 13 for (int i = 0; i < n - m; i++) { 14 ListNode next = curr.next; 15 curr.next = next.next; 16 next.next = prev.next; 17 prev.next = next; 18 } 19 return dummy.next; 20 } 21}. The detected topics are Linked List, Test Data Commit Output. Review the synced source file for the implementation details.
