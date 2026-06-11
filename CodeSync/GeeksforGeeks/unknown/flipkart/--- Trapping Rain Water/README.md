# 🌧️ Trapping Rain Water

- Platform: GeeksforGeeks
- Language: class Solution { public int maxWater(int arr[]) { // code here int length = arr.length; int[] leftMax = new int[length]; int[] rightMax = new int[length]; leftMax[0] = arr[0]; for ( int i = 1 ; i < length ; i++ ) { leftMax[i] = Math.max(leftMax[i-1], arr[i]); } rightMax[length-1] = arr[length-1]; // the last is already the highest for that ith index for ( int i = length-2 ; i >= 0 ; i-- ) { rightMax[i] = Math.max(rightMax[i+1], arr[i]); // is my last index greater or the second last from the arr!? } int trappedWater = 0; for ( int i = 0 ; i < length ; i++ ) { trappedWater += Math.min(leftMax[i],rightMax[i]) - arr[i]; } return trappedWater; } }
- Difficulty: Unknown
- Topics: Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, Google, Goldman Sachs, Adobe
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
- Synced: 2026-06-11T04:04:35.338Z

## Problem Description

Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. Examples: Input: arr[] = [3, 0, 1, 0, 4, 0, 2] Output: 10 Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units. Input: arr[] = [3, 0, 2, 0, 4] Output: 7 Explanation: Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units. Input: arr[] = [1, 2, 3, 4] Output: 0 Explanation: We cannot trap water as there is no height bound on both sides. Input: arr[] = [2, 1, 5, 3, 1, 0, 4] Output: 9 Explanation: Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units. Constraints: 1 < arr.size() < 105 0 < arr[i] < 103

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int maxWater(int arr[]) { // code here int length = arr.length; int[] leftMax = new int[length]; int[] rightMax = new int[length]; leftMax[0] = arr[0]; for ( int i = 1 ; i < length ; i++ ) { leftMax[i] = Math.max(leftMax[i-1], arr[i]); } rightMax[length-1] = arr[length-1]; // the last is already the highest for that ith index for ( int i = length-2 ; i >= 0 ; i-- ) { rightMax[i] = Math.max(rightMax[i+1], arr[i]); // is my last index greater or the second last from the arr!? } int trappedWater = 0; for ( int i = 0 ; i < length ; i++ ) { trappedWater += Math.min(leftMax[i],rightMax[i]) - arr[i]; } return trappedWater; } }. The detected topics are Expected Complexities, Company Tags, Flipkart, Amazon, Microsoft, Google, Goldman Sachs, Adobe. Review the synced source file for the implementation details.
