# ENG

- Platform: LintCode
- Language: 1public class Solution { 2 public int parenthesesScore(String s) { 3 Stack<Integer> st= new Stack<>(); 4 st.push(0); 5 6 for (char c : s.toCharArray()) { 7 if (c == '(') st.push(0); 8 else { 9 int v = st.pop(); 10 int top = st.pop(); 11 12 if (v == 0) st.push(top + 1); 13 else st.push(top + 2 * v); 14 } 15 } 16 17 return st.pop(); 18 } 19}
- Difficulty: Unknown
- Topics: Stack, Test Data Commit Output
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.lintcode.com/problem/268/
- Synced: 2026-06-08T18:46:43.068Z

## Problem Description

Description Given a balanced parentheses string S, compute the score of the string based on the following rule: () has score 1 AB has score A + B, where A and B are balanced parentheses strings. (A) has score 2 * A, where A is a balanced parentheses string. LintCode - Online Judge Solution Candidate Written Test Screening, Team Competency Assessment, Programming Teaching Exercises, Online Exam Grading WeChat for information S is a balanced parentheses string, containing only ( and ). 2 <= S.length <= 50 Example Example 1: Input: "()" Output: 1 Example 2: Input: "(())" Output: 2 Example 3: Input: "()()" Output: 2 Example 4: Input: "(()(()))" Output: 6 Tags Recommend Courses ACM金牌逐行带刷班 最适合懒人的刷题课--躺平看算法大神在线coding，讲解思路+现场debug，手撕面试高频题

## Explanation

This solution was accepted on LintCode using 1public class Solution { 2 public int parenthesesScore(String s) { 3 Stack<Integer> st= new Stack<>(); 4 st.push(0); 5 6 for (char c : s.toCharArray()) { 7 if (c == '(') st.push(0); 8 else { 9 int v = st.pop(); 10 int top = st.pop(); 11 12 if (v == 0) st.push(top + 1); 13 else st.push(top + 2 * v); 14 } 15 } 16 17 return st.pop(); 18 } 19}. The detected topics are Stack, Test Data Commit Output. Review the synced source file for the implementation details.
