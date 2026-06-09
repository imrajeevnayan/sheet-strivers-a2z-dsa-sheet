/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/36/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked List, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-09T06:48:49.547Z
 */

········ListNode·dummy·=·new·ListNode(0);

········if·(head·==·null·||·m·==·n)·return·head;
····public·ListNode·reverseBetween(ListNode·head,·int·m,·int·n)·{
public·class·Solution·{
········dummy.next·=·head;

········//·1.·Move·'prev'·to·the·node·immediately·before·position·'m'
········ListNode·prev·=·dummy;
········for·(int·i·=·1;·i·<·m;·i++)·{
············prev·=·prev.next;
········}

········//·'curr'·is·the·first·node·of·the·section·to·be·reversed
········ListNode·curr·=·prev.next;
