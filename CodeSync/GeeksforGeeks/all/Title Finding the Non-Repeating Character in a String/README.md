# Title: Finding the Non-Repeating Character in a String ????

- Platform: GeeksforGeeks
- Language: class Solution { //Function to find the first non-repeating character in a string. static char nonrepeatingCharacter(String S) { //Your code here Map<Character,Integer> m = new HashMap(); int n = S.length(); for(int i=0;i<n;i++){ char ch = S.charAt(i); m.put(ch,m.getOrDefault(ch,0)+1); } for(int i=0;i<n;i++){ char ch = S.charAt(i); if(m.get(ch)==1){ return ch; } } return '$'; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, D-E-Shaw, MakeMyTrip, Ola Cabs
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1
- Synced: 2026-06-13T16:33:48.812Z

## Problem Description

Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'. Examples: Input: s = "geeksforgeeks" Output: 'f' Explanation: In the given string, 'f' is the first character in the string which does not repeat. Input: s = "racecar" Output: 'e' Explanation: In the given string, 'e' is the only character in the string which does not repeat. Input: s = "aabbccc" Output: '$' Explanation: All the characters in the given string are repeating. Constraints: 1 ≤ s.size() ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { //Function to find the first non-repeating character in a string. static char nonrepeatingCharacter(String S) { //Your code here Map<Character,Integer> m = new HashMap(); int n = S.length(); for(int i=0;i<n;i++){ char ch = S.charAt(i); m.put(ch,m.getOrDefault(ch,0)+1); } for(int i=0;i<n;i++){ char ch = S.charAt(i); if(m.get(ch)==1){ return ch; } } return '$'; } }. The detected topics are Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, D-E-Shaw, MakeMyTrip, Ola Cabs. Review the synced source file for the implementation details.
