/*
 * Platform: InterviewBit
 * Problem: Balanced Parantheses!
 * URL: https://www.interviewbit.com/problems/balanced-parantheses/
 * Language: C
 * Difficulty: Easy
 * Topics: Programming, Stacks And Queues, Description, Discussion, Submissions, Hints, MAXSPPROD 88 Minutes Medium Asked in:, Hotel Service 51 Minutes Medium Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-05T04:03:12.102Z
 */

public class Solution {
            else if (c == ')') {
    public int solve(String A) {
        Stack<Character> st = new Stack<>();
                // If we find a closing bracket but stack is empty, it's invalid
        for (char c : A.toCharArray()) {
            if (c == '(') st.push(c);
                if (st.isEmpty()) {
                    return 0;
                }
                st.pop(); // Match found, remove the opening bracket
            }
        }
        
        // If stack is empty, all brackets were matched
        return st.isEmpty() ? 1 : 0;
    }
}
