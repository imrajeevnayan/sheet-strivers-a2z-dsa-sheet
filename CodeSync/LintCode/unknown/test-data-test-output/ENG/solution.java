/*
 * Platform: LintCode
 * Problem: ENG
 * URL: https://www.lintcode.com/problem/36/
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked List, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-09T06:47:17.048Z
 */

public·class·Solution·{
····public·static·Node·reverseBetween(Node·head,·int·left,·int·right)·{
········if·(head·==·null·||·left·==·right)·return·head;
········Node·dummy·=·new·Node(0);
········dummy.next·=·head;
········
········Node·prev·=·dummy;
········for·(int·i·=·1;·i·<·left;·i++)·{
············prev·=·prev.next;
········}
········Node·curr·=·prev.next;
········for·(int·i·=·0;·i·<·right·-·left;·i++)·{
············Node·next·=·curr.next;······
············curr.next·=·next.next;······
············next.next·=·prev.next;······//·Point·'next'·to·the·start·of·reversed·part
············prev.next·=·next;···········//·Attach·'next'·to·'prev'
········}

········return·dummy.next;
····}
}
