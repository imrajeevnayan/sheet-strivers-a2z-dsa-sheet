# ENG

- Platform: LintCode
- Language: 1class Solution { 2 public void deleteNode(ListNode node) { 3 if(node==null || node.next==null) return; 4 node.val=node.next.val; 5 node.next=node.next.next; 6 } 7}
- Difficulty: Easy
- Topics: Linked List, Apple Adobe Microsoft, Apple, Adobe, Microsoft, 174 Remove Nth Node From End of List Easy, Test Data Commit Output
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.lintcode.com/problem/372/
- Synced: 2026-06-09T11:10:50.563Z

## Problem Description

Description Given a singly linked list head and given a node waiting to be deleted (not the head or the tail of the singly linked list). You can't access the first node head, delete node in O(1) time complexity. LintCode - Online Judge Solution Candidate Written Test Screening, Team Competency Assessment, Programming Teaching Exercises, Online Exam Grading WeChat for information The link table may be null Example Example 1: Input: 1->2->3->4->null 3 Output: 1->2->4->null Explanation: Delete the node withe the value of 3 after calling the function, the final linked list becomes 1->2->4->null Example 2: Input: 1->3->5->null 3 Output: 1->5->null Explanation: Delete the node withe the value of 3 after calling the function, the final linked list becomes 1->5->null Tags Company Apple Adobe Microsoft Related Problems 174 Remove Nth Node From End of List Easy Recommend Courses 春招算法高频题冲刺班 精准押题，抱佛脚突击算法面试，最近6个月新题/难题/高频题全覆盖！

## Explanation

This solution was accepted on LintCode using 1class Solution { 2 public void deleteNode(ListNode node) { 3 if(node==null || node.next==null) return; 4 node.val=node.next.val; 5 node.next=node.next.next; 6 } 7}. The detected topics are Linked List, Apple Adobe Microsoft, Apple, Adobe, Microsoft, 174 Remove Nth Node From End of List Easy, Test Data Commit Output. Review the synced source file for the implementation details.
