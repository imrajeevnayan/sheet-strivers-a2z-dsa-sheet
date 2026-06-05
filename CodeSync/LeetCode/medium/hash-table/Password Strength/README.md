# Password Strength

- Platform: LeetCode
- Language: Weekly Contest 503
- Difficulty: Medium
- Topics: Hash Table, String
- Runtime: N/A
- Memory: N/A
- Problem URL: https://leetcode.com/problems/password-strength/
- Synced: 2026-06-05T17:41:42.683Z

## Problem Description

You are given a string password. The strength of the password is calculated based on the following rules: 1 point for each distinct lowercase letter ('a' to 'z'). 2 points for each distinct uppercase letter ('A' to 'Z'). 3 points for each distinct digit ('0' to '9'). 5 points for each distinct special character from the set "!@#$". Each character contributes at most once, even if it appears multiple times. Return an integer denoting the strength of the password. Example 1: Input: password = "aA1!" Output: 11 Explanation: The distinct characters are 'a', 'A', '1' and '!'. Thus, the strength = 1 + 2 + 3 + 5 = 11. Example 2: Input: password = "bbB11#" Output: 11 Explanation: The distinct characters are 'b', 'B', '1' and '#'. Thus, the strength = 1 + 2 + 3 + 5 = 11.​​​​​​​ Constraints: 1 <= password.length <= 105 password consists of lowercase and uppercase English letters, digits, and special characters from "!@#$".

## Explanation

This solution was accepted on LeetCode using Weekly Contest 503. The detected topics are Hash Table, String. Review the synced source file for the implementation details.
