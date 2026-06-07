/*
 * Platform: LintCode
 * Problem: Course
 * URL: https://www.lintcode.com/problem/380/description
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked List, Bloomberg Airbnb Amazon Microsoft, Bloomberg, Airbnb, Amazon, Microsoft, Test Data Test Output, Dynamic Programming
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-07T17:46:44.159Z
 */

public·class·Solution·{
····public·ListNode·getIntersectionNode(ListNode·headA,·ListNode·headB)·{
·······if(headA==null·||·headB==null)return·null;
·······ListNode·a=headA;
·······ListNode·b=headB;
·······while(a·!=b){
···········a=(a==null)?·headB:a.next;
···········b=(b==null)?headA:b.next;
·······}
·······return·b;
····}
}
