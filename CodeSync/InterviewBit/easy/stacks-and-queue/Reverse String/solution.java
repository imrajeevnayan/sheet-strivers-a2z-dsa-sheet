/*
 * Platform: InterviewBit
 * Problem: Reverse String
 * URL: https://www.interviewbit.com/problems/reverse-string/
 * Language: Java
 * Difficulty: Easy
 * Topics: Programming, Stacks And Queues, Description, Discussion, Submissions, Hints, MAXSPPROD 88 Minutes Medium Asked in:, Balanced Parantheses! 15 Minutes Easy Asked in:
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-06-05T03:57:22.986Z
 */

public class Solution {
    public String reverseString(String A) {
    }
        Stack<Character>st=new Stack<>();
        for(char c:A.toCharArray())st.push(c);
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
}
