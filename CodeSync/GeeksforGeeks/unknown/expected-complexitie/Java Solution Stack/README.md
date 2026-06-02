# Java Solution | Stack

- Platform: GeeksforGeeks
- Language: class Solution { public static String removePair(String s) { // code here String ans = ""; Stack<Character> st = new Stack<>(); for(int i=0;i<s.length();i++){ char ch = s.charAt(i); if(!st.isEmpty() && st.peek()==ch) st.pop(); else st.push(ch); } if(st.isEmpty()) return "-1"; while(!st.isEmpty()) ans = st.pop() + ans; return ans; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Stack, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/geeks-and-the-string--170645/1
- Synced: 2026-06-02T12:14:25.440Z

## Problem Description

Given a string s, repeatedly remove all adjacent duplicate character pairs until no such pairs remain. Return the resulting string, or "-1" if the string becomes empty. Examples : Input: s = "aaabbaaccd" Output: "ad" Explanation: Remove adjacent pair "aa" from "aaabbaaccd" => "abbaaccd" Remove adjacent pair "bb" from "abbaaccd" => "aaaccd" Remove adjacent pair "aa" from "aaaccd" => "accd" Remove adjacent pair "cc" from "accd" => "ad" Therefore, the final resulting string is "ad". Input: s = "aaaa" Output: "-1" Explanation: Remove adjacent pair "aa" from "aaaa" => "aa" Remove adjacent pair "aa" from "aa" => "" Since the resulting string becomes empty, return "-1". Constraints: 1 ≤ |s| ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static String removePair(String s) { // code here String ans = ""; Stack<Character> st = new Stack<>(); for(int i=0;i<s.length();i++){ char ch = s.charAt(i); if(!st.isEmpty() && st.peek()==ch) st.pop(); else st.push(ch); } if(st.isEmpty()) return "-1"; while(!st.isEmpty()) ans = st.pop() + ans; return ans; } }. The detected topics are Expected Complexities, Topic Tags, Stack, Data Structures, Related Articles. Review the synced source file for the implementation details.
