/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/36/
 * Language: Java
 * Difficulty: Easy
 * Topics: Linked List, Test Data Commit Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-09T06:49:30.196Z
 */

········ListNode·prev·=·dummy;
········for·(int·i·=·1;·i·<·m;·i++)·{
············prev·=·prev.next;
········}
········ListNode·curr·=·prev.next;
········for·(int·i·=·0;·i·<·n·-·m;·i++)·{
············ListNode·next·=·curr.next;·····
·············curr.next·=·next.next;

········dummy.next·=·head;

········ListNode·dummy·=·new·ListNode(0);
public·class·Solution·{
····public·ListNode·reverseBetween(ListNode·head,·int·m,·int·n)·{
········if·(head·==·null·||·m·==·n)·return·head;
