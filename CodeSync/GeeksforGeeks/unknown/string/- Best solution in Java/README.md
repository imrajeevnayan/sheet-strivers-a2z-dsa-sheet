# # Best solution in Java.

- Platform: GeeksforGeeks
- Language: // User function Template for Java class Solution { String isGoodString(String s) { // code here char[] c = s.toCharArray(); for ( int i = 0 ; i < c.length-1 ; i++ ) { int check = Math.abs(c[i] - c[i+1]); if ( check == 1 || check == 25 ) { continue; } else { return "NO"; } } return "YES"; } }
- Difficulty: Unknown
- Topics: Topic Tags, Strings, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/good-string5712/1
- Synced: 2026-06-04T17:02:32.429Z

## Problem Description

Given a string s of length N, you have to tell whether it is good or not. A good string is one where the distance between every two adjacent character is exactly 1. Here distance is defined by minimum distance between two character when alphabets from 'a' to 'z' are put in cyclic manner. For example distance between 'a' to 'c' is 2 and distance between 'a' to 'y' is also 2. The task is to return "YES" or "NO" (without quotes) depending on whether the given string is Good or not. Note: Unit length string will be always good. Example 1: Input: s = "aaa" Output: NO Explanation: distance between 'a' and 'a' is not 1. Example 2: Input: s = "cbc" Output: YES Explanation: distance between 'b' and 'c' is 1. Your Task: You don't need to read input or print anything. Your task is to complete the function isGoodString() which accepts a string as input parameter and returns "YES" or "NO" (without quotes) accordingly. Expected Time Complexity: O(N) Expected Auxiliary Space: O(1) Constraints: String contains only lower case english alphabets. 1 <= N <= 105

## Explanation

This solution was accepted on GeeksforGeeks using // User function Template for Java class Solution { String isGoodString(String s) { // code here char[] c = s.toCharArray(); for ( int i = 0 ; i < c.length-1 ; i++ ) { int check = Math.abs(c[i] - c[i+1]); if ( check == 1 || check == 25 ) { continue; } else { return "NO"; } } return "YES"; } }. The detected topics are Topic Tags, Strings, Data Structures. Review the synced source file for the implementation details.
