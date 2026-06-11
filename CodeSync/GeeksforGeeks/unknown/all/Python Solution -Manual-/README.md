# Python Solution (Manual)

- Platform: GeeksforGeeks
- Language: class Solution: def isPalinArray(self,arr): for num in arr: original = num rev = 0 while num > 0: rear = num % 10 rev = (rev*10) + rear num = num//10 if rev != original: return False return True
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1
- Synced: 2026-06-11T04:01:33.870Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution: def isPalinArray(self,arr): for num in arr: original = num rev = 0 while num > 0: rear = num % 10 rev = (rev*10) + rear num = num//10 if rev != original: return False return True. Review the synced source file for the implementation details.
