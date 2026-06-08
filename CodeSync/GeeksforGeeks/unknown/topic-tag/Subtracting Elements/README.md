# Subtracting Elements

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Topic Tags, Greedy
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/make-array-zero-by-subtracting-equal-amounts/1
- Synced: 2026-06-08T12:00:39.157Z

## Problem Description

You are given a non-negative integer array nums. In one operation, you must: Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums. Subtract x from every positive element in nums. Return the minimum number of operations to make every element in nums equal to 0. Example 1: Input: n = 5 nums = [1,5,0,3,5] Output: 3 Explanation: In the first operation, choose x = 1. Now, nums = [0,4,0,2,4]. In the second operation, choose x = 2. Now, nums = [0,2,0,0,2]. In the third operation, choose x = 2. Now, nums = [0,0,0,0,0]. Example 2: Input: n = 1 nums = [0] Output: 0 Explanation: Each element in nums is already 0 so no operations are needed. Your Task: You don't need to read input or print anything. Your task is to complete the function minimumOperations() which takes an integer n and array nums[ ] as parameters and returns the minimum number of operation. Constraint: 1 <= n <= 100 0 <= nums[i] <= 100 Expected Time Complexity: O(n) Expected Space Complexity: O(n)

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Topic Tags, Greedy. Review the synced source file for the implementation details.
