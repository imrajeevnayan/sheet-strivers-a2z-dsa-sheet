# Find the Pivot Integer

- Platform: LeetCode
- Language: Prefix Sum
- Difficulty: Easy
- Topics: Math, Prefix Sum
- Runtime: 0 ms
- Memory: N/A
- Problem URL: https://leetcode.com/problems/find-the-pivot-integer/description/?envType=problem-list-v2&envId=prefix-sum
- Synced: 2026-06-10T18:12:45.995Z

## Problem Description

Given a positive integer n, find the pivot integer x such that: The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively. Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input. Example 1: Input: n = 8 Output: 6 Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21. Example 2: Input: n = 1 Output: 1 Explanation: 1 is the pivot integer since: 1 = 1. Example 3: Input: n = 4 Output: -1 Explanation: It can be proved that no such integer exist. Constraints: 1 <= n <= 1000

## Explanation

This solution was accepted on LeetCode using Prefix Sum. The detected topics are Math, Prefix Sum. Review the synced source file for the implementation details.
