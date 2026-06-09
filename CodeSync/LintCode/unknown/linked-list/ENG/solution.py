# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/35/
# Language: Python
# Difficulty: Unknown
# Topics: Linked List, ByteDance, Test Data Test Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-09T06:45:07.598Z

public·class·Solution·{
····public·ListNode·reverse(ListNode·head)·{
·····ListNode·prev=null;
·····ListNode·curr=head;
·····while(curr!=null){
·········ListNode·temp=curr.next;
·········curr.next=prev;
·········prev=curr;
·········curr=temp;
·····}
·····return·prev;
····}
}
