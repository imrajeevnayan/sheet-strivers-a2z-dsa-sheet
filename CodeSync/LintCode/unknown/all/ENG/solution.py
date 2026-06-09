# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/228/
# Language: Python
# Difficulty: Unknown
# Topics: Same Direction Two Pointers, Linked List, Two Pointers, 174 Remove Nth Node From End of List Easy, Test Data Commit Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-09T11:48:38.628Z

public·class·Solution·{
····public·ListNode·middleNode(ListNode·head)·{
········ListNode·slow=head,fast=head;
········while(fast!=null·&&·fast.next!=null){
············fast=fast.next.next;
········}
············slow=slow.next;
········if·(head·==·null)return·null;
········return·slow;
····}
}
