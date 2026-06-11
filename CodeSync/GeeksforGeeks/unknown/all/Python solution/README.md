# Python solution:

- Platform: GeeksforGeeks
- Language: def findIndex(self, s): closed_count = s.count(")") open_count = 0 for i, c in enumerate(s): if open_count == closed_count: return i if c == "(": open_count += 1 else: closed_count -= 1 return len(s)
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Arrays, Strings, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/find-equal-point-in-string-of-brackets2542/1
- Synced: 2026-06-11T04:14:21.742Z

## Problem Description

Given a string s of opening and closing brackets '(' and ')' only, find an equal point in the string. An equal point is a position k (0-based) such that the number of opening brackets before position k is equal to the number of closing brackets from position k to the end of the string. If multiple such points exist, return the first valid position. The string can be split at any position from 0 to n, where n is the length of the string. If we split at 0, it means there is an empty string on left. If we split at n, it means there is an empty string on right. Examples: Input: s = "(())))(" Output: 4 Explanation: Input : s = "))" Output: 2 Explanation: After index 2, the string splits into "))" and an empty string. The number of opening brackets in the first part is 0 and the number of closing brackets in the second part is also 0. Constraints: 1 ≤ s.size() ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using def findIndex(self, s): closed_count = s.count(")") open_count = 0 for i, c in enumerate(s): if open_count == closed_count: return i if c == "(": open_count += 1 else: closed_count -= 1 return len(s). The detected topics are Expected Complexities, Company Tags Amazon, Company Tags, Amazon, Topic Tags, Arrays, Strings, Data Structures. Review the synced source file for the implementation details.
