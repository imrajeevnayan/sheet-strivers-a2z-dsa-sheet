# Count Digits in a Number

- Platform: GeeksforGeeks
- Language: // Logic: The number of digits in base 10 is floor(log10(n)) + 1 class Solution { public static int countDigits(int n) { if(n==0) return 1; return (int) Math.log10(Math.abs(n))+1; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Recursion, Algorithms, Related Articles, Program Count Digits Integer 3 Different Methods
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/count-total-digits-in-a-number/1
- Synced: 2026-05-30T19:28:21.513Z

## Problem Description

Given a number n, return the count of digits in this number. Examples : Input: n = 1567 Output: 4 Explanation: There are 4 digits in 1567, which are 1, 5, 6 and 7. Input: n = 99999 Output: 5 Explanation: Number of digit in 99999 is 5 Constraints: 1 ≤ n ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using // Logic: The number of digits in base 10 is floor(log10(n)) + 1 class Solution { public static int countDigits(int n) { if(n==0) return 1; return (int) Math.log10(Math.abs(n))+1; } }. The detected topics are Expected Complexities, Topic Tags, Recursion, Algorithms, Related Articles, Program Count Digits Integer 3 Different Methods. Review the synced source file for the implementation details.
