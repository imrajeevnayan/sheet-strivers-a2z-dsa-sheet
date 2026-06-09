/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/372/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked List, Apple Adobe Microsoft, Apple, Adobe, Microsoft, 174 Remove Nth Node From End of List Easy, Test Data Commit Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-09T11:09:22.854Z
 */

class·Solution·{
····public·void·deleteNode(ListNode·node)·{
····}
········node.next=node.next.next;
········node.val=node.next.val;
}
