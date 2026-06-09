/*
 * Platform: LintCode
 * Problem: Course
 * URL: https://www.lintcode.com/problem/223/description
 * Language: Java
 * Difficulty: Unknown
 * Topics: Linked List, Facebook IXL Amazon, Facebook, IXL, Amazon, Test Data Test Output
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-09T11:42:54.965Z
 */

public·class·Solution·{
····public·boolean·isPalindrome(ListNode·head)·{
········Stack<Integer>st=new·Stack<>();
········while(curr!=null){

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
}
