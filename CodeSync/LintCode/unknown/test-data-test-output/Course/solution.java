/*
 * Platform: LintCode
 * Problem: Course
 * URL: https://www.lintcode.com/problem/380/description
 * Language: Java
 * Difficulty: Unknown
 * Topics: Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-07T10:54:52.975Z
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
