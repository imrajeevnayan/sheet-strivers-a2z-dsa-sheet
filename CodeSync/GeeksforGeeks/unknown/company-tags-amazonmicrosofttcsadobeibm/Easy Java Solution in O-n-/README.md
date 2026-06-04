# Easy Java Solution in O(n) :

- Platform: GeeksforGeeks
- Language: class Solution { public: int minParentheses(string& s) { int open = 0; int need = 0; for(int i = 0;i<s.size();i++){ if(s[i] == '(')open++; if(s[i] == ')')open--; if(open<0){ need++; open = 0; } } return need+open; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags AmazonMicrosoftTCSAdobeIBM, Company Tags, Amazon, Microsoft, TCS, Adobe, IBM
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/min-add-to-make-parentheses-valid/1
- Synced: 2026-06-04T17:20:05.828Z

## Problem Description

You are given a string s consisting only of the characters '(' and ')'. Your task is to determine the minimum number of parentheses (either '(' or ')') that must be inserted at any positions to make the string s a valid parentheses string. A parentheses string is considered valid if: Every opening parenthesis '(' has a corresponding closing parenthesis ')'. Every closing parenthesis ')' has a corresponding opening parenthesis '('. Parentheses are properly nested. Examples: Input: s = "(()(" Output: 2 Explanation: There are two unmatched '(' at the end, so we need to add two ')' to make the string valid. Input: s = ")))" Output: 3 Explanation: Three '(' need to be added at the start to make the string valid. Input: s = ")()()" Output: 1 Explanation: The very first ')' is unmatched, so we need to add one '(' at the beginning. Constraints: 1 ≤ s.size() ≤ 105 s[i] ∈ { '(' , ')' }

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: int minParentheses(string& s) { int open = 0; int need = 0; for(int i = 0;i<s.size();i++){ if(s[i] == '(')open++; if(s[i] == ')')open--; if(open<0){ need++; open = 0; } } return need+open; } };. The detected topics are Expected Complexities, Company Tags AmazonMicrosoftTCSAdobeIBM, Company Tags, Amazon, Microsoft, TCS, Adobe, IBM. Review the synced source file for the implementation details.
