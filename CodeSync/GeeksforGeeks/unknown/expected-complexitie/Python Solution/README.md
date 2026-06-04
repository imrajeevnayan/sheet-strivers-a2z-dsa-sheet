# Python Solution:

- Platform: GeeksforGeeks
- Language: class Solution: def printFloydTriangle(self, N): #code here c = 0 for i in range(1, N+1): for j in range(1, i+1): c+=1 print(c, end=" ") print()
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Mathematical, Algorithms, Related Articles, Program To Print Floyds Triangle
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/floyds-triangle1222/1
- Synced: 2026-06-04T07:16:54.938Z

## Problem Description

Given a number n, print Floyd's triangle with n lines. Floyd’s Triangle is a pattern of consecutive natural numbers arranged in rows, where the i-th row contains i numbers. Examples: Input: n = 4 Output: 1 2 3 4 5 6 7 8 9 10 Explanation: The triangle has 4 rows. Numbers start from 1 and increase sequentially across rows, and each row i contains i elements. Input: n = 5 Output: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 Explanation: The triangle has 4 rows, and each row i contains i numbers. Constraints: 1 <= n <= 100

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def printFloydTriangle(self, N): #code here c = 0 for i in range(1, N+1): for j in range(1, i+1): c+=1 print(c, end=" ") print(). The detected topics are Expected Complexities, Topic Tags, Mathematical, Algorithms, Related Articles, Program To Print Floyds Triangle. Review the synced source file for the implementation details.
