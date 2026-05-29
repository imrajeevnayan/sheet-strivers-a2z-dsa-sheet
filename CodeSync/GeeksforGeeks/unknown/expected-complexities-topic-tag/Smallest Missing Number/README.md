# Smallest Missing Number

- Platform: GeeksforGeeks
- Language: class Solution { public int findFirstMissing(int[] arr) { // code here for(int i = 0; i < arr.length; i++) { if(i != arr[i]) { return i; } } return arr.length; } }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Binary Search
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/smallest-missing-number/1
- Synced: 2026-05-29T19:14:54.002Z

## Problem Description

Given a sorted array arr[], of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the smallest number that is missing from the array. Examples: Input: n = 5, m = 10, arr[] = [0, 1, 2, 6, 9] Output: 3 Explanation: Smallest missing number is 3. Input: n = 5, m = 7, arr[] = [2, 3, 4, 5, 6] Output: 0 Explanation: Smallest missing number is 0. Constraints: 1 ≤ n ≤ 105 1 ≤ m ≤ 109

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public int findFirstMissing(int[] arr) { // code here for(int i = 0; i < arr.length; i++) { if(i != arr[i]) { return i; } } return arr.length; } }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Binary Search. Review the synced source file for the implementation details.
