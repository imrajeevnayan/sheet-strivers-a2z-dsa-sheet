/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/36/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked List, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-09T06:45:25.113Z
 */

class·Solution·{
····public·ListNode·reverseBetween(ListNode·head,·int·m,·int·n)·{
········if·(head·==·null·||·m·==·n)·return·head;
········ListNode·dummy·=·new·ListNode(0);
········dummy.next·=·head;
········
········ListNode·prev·=·dummy;
········for·(int·i·=·1;·i·<·m;·i++)·{
············prev·=·prev.next;
········}
········
········ListNode·curr·=·prev.next;
········ListNode·next·=·null;
········for·(int·i·=·0;·i·<·n·-·m;·i++)·{
············next·=·curr.next;·····
············curr.next·=·next.next;·
············next.next·=·prev.next;··
············prev.next·=·next;···
········}
········return·dummy.next;
····}
}
