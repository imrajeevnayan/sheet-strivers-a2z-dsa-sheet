# First Letter of Every Word

- Platform: GeeksforGeeks
- Language: class Solution { String firstAlphabet(String S) { String res = "" + S.charAt(0); for (int i = 1; i < S.length(); i++) if (S.charAt(i - 1) == ' ') res += S.charAt(i); return res; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Strings, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/print-first-letter-of-every-word-in-the-string3632/1
- Synced: 2026-06-08T12:25:55.744Z

## Problem Description

Given a string s, the task is to create a string with the first letter of every word in the string. The string s contains lower case English alphabets and its words have a single space between them. Examples: Input: s = "geeks for geeks" Output: gfg Explanation: First word starts at index 0, take 'g' After first space, next word starts with 'f' After second space, next word starts with 'g' Input: s = "bad is good" Output: big Constraints: 1 ≤ |s| ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { String firstAlphabet(String S) { String res = "" + S.charAt(0); for (int i = 1; i < S.length(); i++) if (S.charAt(i - 1) == ' ') res += S.charAt(i); return res; } }. The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Strings, Data Structures, Related Articles. Review the synced source file for the implementation details.
