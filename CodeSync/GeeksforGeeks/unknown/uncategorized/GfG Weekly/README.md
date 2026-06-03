# GfG Weekly

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://practice.geeksforgeeks.org/contest/gfg-weekly-208-rated-contest/problems
- Synced: 2026-06-03T06:58:34.104Z

## Problem Description

Given three integers a, b, and c, find the minimum non-negative integer x such that: ((a | x) & (b | x)) = c, where as | denotes the Bitwise OR and & denotes the Bitwise AND. Note : If no such x exists, return -1. Examples Input : a = 14, b = 5, c = 6 Output : 2 Explaination : The value of x = 2, the expression ((a|x) & (b|x)) = c is satisfied. Input : a = 2, b = 3, c = 9 Output : -1 Explaination: no value of x such that ((a|x) & (b|x)) = c is satisfied . Constrains: 1 ≤ a ≤ 108 1 ≤ b ≤ 108 1 ≤ c ≤ 108

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). Review the synced source file for the implementation details.
