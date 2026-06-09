/*
 * Platform: LintCode
 * Problem: Course
 * URL: https://www.lintcode.com/problem/223/description
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked List, Facebook IXL Amazon, Facebook, IXL, Amazon, Test Data Commit Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-09T11:43:08.369Z
 */

public·class·Solution·{
····public·boolean·isPalindrome(ListNode·head)·{
········Stack<Integer>st=new·Stack<>();
········while(curr!=null){
·······return·true;
········ListNode·curr=head;
············st.push(curr.val);
········}
············curr=curr.next;
········curr=head;
········while(!st.isEmpty()){
···········if(curr.val!=st.pop())·return·false;
········}
····}
···········curr=curr.next;
