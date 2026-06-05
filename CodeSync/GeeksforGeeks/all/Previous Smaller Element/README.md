# Previous Smaller Element

- Platform: GeeksforGeeks
- Language: Java (21)
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Stack, Arrays, Data Structures, Related Articles
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/previous-smaller-element/1
- Synced: 2026-06-05T05:12:31.837Z

## Problem Description

You are given an integer array arr[ ]. For every element in the array, your task is to determine its Previous Smaller Element (PSE). The Previous Smaller Element (PSE) of an element x is the first element that appears to the left of x in the array and is strictly smaller than x. Note: If no such element exists, assign -1 as the PSE for that position. Examples: Input: arr[] = [1, 6, 2] Output: [-1, 1, 1] Explanation: For 1, there is no element on the left, so answer is -1. For 6, previous smaller element is 1. For 2, previous smaller element is 1. Input: arr[] = [1, 5, 0, 3, 4, 5] Output: [-1, 1, -1, 0, 3, 4] Explanation: For 1, no element on the left, so answer is -1. For 5, previous smaller element is 1. For 0, no element on the left smaller than 0, so answer is -1. For 3, previous smaller element is 0. For 4, previous smaller element is 3. For 5, previous smaller element is 4. Constraints: 1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 105

## Explanation

This solution was accepted on GeeksforGeeks using Java (21). The detected topics are Expected Complexities, Topic Tags, Stack, Arrays, Data Structures, Related Articles. Review the synced source file for the implementation details.
