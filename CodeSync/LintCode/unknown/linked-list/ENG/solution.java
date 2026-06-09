/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/36/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked List, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-09T06:49:01.662Z
 */

········ListNode·dummy·=·new·ListNode(0);
········dummy.next·=·head;

········ListNode·prev·=·dummy;
········for·(int·i·=·1;·i·<·m;·i++)·{
············prev·=·prev.next;
········}
········ListNode·curr·=·prev.next;
········for·(int·i·=·0;·i·<·n·-·m;·i++)·{
············ListNode·next·=·curr.next;······//·The·node·to·be·moved
············
············//·Step·A:·Remove·'next'·from·its·current·position
············curr.next·=·next.next;
············
············//·Step·B:·Insert·'next'·at·the·beginning·of·the·reversed·section·(after·'prev')
