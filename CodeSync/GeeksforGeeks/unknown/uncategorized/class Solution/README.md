# class Solution:

- Platform: GeeksforGeeks
- Language: class Solution { static boolean isPrime(int n) { if (n == 1) return false; if (n == 2 || n == 3) return true; if (n % 2 == 0 || n % 3 == 0) return false; for (int i=5; i<=Math.sqrt(n); i += 6) { if (n % i == 0 || n % (i + 2) == 0) return false; } return true; } }
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/prime-number2314/1
- Synced: 2026-06-03T16:23:37.901Z

## Problem Description

Problem description was not available on the page at sync time.

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { static boolean isPrime(int n) { if (n == 1) return false; if (n == 2 || n == 3) return true; if (n % 2 == 0 || n % 3 == 0) return false; for (int i=5; i<=Math.sqrt(n); i += 6) { if (n % i == 0 || n % (i + 2) == 0) return false; } return true; } }. Review the synced source file for the implementation details.
