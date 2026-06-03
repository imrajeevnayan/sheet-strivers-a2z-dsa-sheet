# For Python3 Platform

- Platform: GeeksforGeeks
- Language: class Solution: def isSumPalindrome(self, n): count = 0 while(str(n) != str(n)[::-1]): n += int(str(n)[::-1]) count += 1 if(count > 5): return -1 break return n
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Zoho, Company Tags, Zoho, Topic Tags, Mathematical, palindrome, Algorithms
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/sum-palindrome3857/1
- Synced: 2026-06-03T16:40:17.514Z

## Problem Description

Given a number, reverse it and add it to itself unless it becomes a palindrome or return -1 if the number of iterations becomes more than 5. Return that palindrome number if it becomes a palindrome else, it returns -1. Examples: Input: n = 23 Output: 55 Explanation: reverse(23) = 32, then 32+23 = 55 which is a palindrome. Input: n = 73 Output: 121 Explanation: reverse(73) = 37, then 37+73 = 110 which is not a palindrome, again reverse(110)= 011, then 110+11 = 121 which is a palindrome. Constraints: 1 <= n <= 104

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def isSumPalindrome(self, n): count = 0 while(str(n) != str(n)[::-1]): n += int(str(n)[::-1]) count += 1 if(count > 5): return -1 break return n. The detected topics are Expected Complexities, Company Tags Zoho, Company Tags, Zoho, Topic Tags, Mathematical, palindrome, Algorithms. Review the synced source file for the implementation details.
