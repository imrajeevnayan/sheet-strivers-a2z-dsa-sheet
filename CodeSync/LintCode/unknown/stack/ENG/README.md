# ENG

- Platform: LintCode
- Language: 1public class Solution { 2 public String removeDuplicateLetters(String s) { 3 int[] freq = new int[26]; 4 HashSet<Character> map = new HashSet<>(); 5 Stack<Character> st = new Stack<>(); 6 for (char c : s.toCharArray()) freq[c - 'a']++; 7 for (char c : s.toCharArray()) { 8 freq[c - 'a']--; 9 if (map.contains(c)) continue; 10 while (!st.isEmpty() && st.peek() > c && freq[st.peek() - 'a'] > 0) { 11 map.remove(st.pop()); 12 } 13 st.push(c); 14 map.add(c); 15 } 16 StringBuilder sb = new StringBuilder(); 17 for (char c : st) sb.append(c); 18 return sb.toString(); 19 20 } 21}
- Difficulty: Unknown
- Topics: PRE, please contact us via "Problem Correction", Stack, Google, Test Data Commit Output
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.lintcode.com/problem/834/
- Synced: 2026-06-04T10:01:27.106Z

## Problem Description

This topic is a pre-release topic. If you encounter any problems, please contact us via "Problem Correction", and we will upgrade your account to VIP as a thank you. Description Given a string s which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results. LintCode - Online Judge Solution Candidate Written Test Screening, Team Competency Assessment, Programming Teaching Exercises, Online Exam Grading WeChat for information Example Example1 Input: s = "bcabc" Output: "abc" Example2 Input: s = "cbacdcbc" Output: "acdb" Tags Company Google Recommend Courses 系统设计 System Design 2024版 数据库、API、GFS、视频流等16大系统设计详解，实战练习拿下面试/晋升“拦路虎”

## Explanation

This solution was accepted on LintCode using 1public class Solution { 2 public String removeDuplicateLetters(String s) { 3 int[] freq = new int[26]; 4 HashSet<Character> map = new HashSet<>(); 5 Stack<Character> st = new Stack<>(); 6 for (char c : s.toCharArray()) freq[c - 'a']++; 7 for (char c : s.toCharArray()) { 8 freq[c - 'a']--; 9 if (map.contains(c)) continue; 10 while (!st.isEmpty() && st.peek() > c && freq[st.peek() - 'a'] > 0) { 11 map.remove(st.pop()); 12 } 13 st.push(c); 14 map.add(c); 15 } 16 StringBuilder sb = new StringBuilder(); 17 for (char c : st) sb.append(c); 18 return sb.toString(); 19 20 } 21}. The detected topics are PRE, please contact us via "Problem Correction", Stack, Google, Test Data Commit Output. Review the synced source file for the implementation details.
