/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/36/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked List, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-09T06:48:55.485Z
 */

········ListNode·dummy·=·new·ListNode(0);

········if·(head·==·null·||·m·==·n)·return·head;
····public·ListNode·reverseBetween(ListNode·head,·int·m,·int·n)·{
public·class·Solution·{
········dummy.next·=·head;

········ListNode·prev·=·dummy;
········for·(int·i·=·1;·i·<·m;·i++)·{
············prev·=·prev.next;
········}
········ListNode·curr·=·prev.next;

········//·2.·Perform·(n·-·m)·iterations·to·move·nodes·to·the·front·of·the·reversed·section
········for·(int·i·=·0;·i·<·n·-·m;·i++)·{
