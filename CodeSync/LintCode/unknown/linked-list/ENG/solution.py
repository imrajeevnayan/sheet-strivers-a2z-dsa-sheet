# Platform: LintCode
# Problem: ENG
# URL: https://www.lintcode.com/problem/380/
# Language: Python
# Difficulty: Unknown
# Topics: Linked List, Bloomberg Airbnb Amazon Microsoft, Bloomberg, Airbnb, Amazon, Microsoft, Test Data Test Output
# Runtime: N/A
# Memory: N/A
# Synced: 2026-06-07T10:47:23.956Z

public·class·Solution·{
····public·ListNode·getIntersectionNode(ListNode·headA,·ListNode·headB)·{
·······if(headA==null·||·headB==null)return·null;
·······ListNode·a=headA;
·······ListNode·b=headB;
·······while(a·!=b){
···········a=(a==null)headB:a.next;
·······}
····}
···········b=(b==null)headA
}
