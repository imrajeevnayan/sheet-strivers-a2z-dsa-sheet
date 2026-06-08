# Java Solution | 200% Accuracy

- Platform: GeeksforGeeks
- Language: class Solution { public static int findMean(int[] arr) { int n = arr.length; int sum = 0; for(int num : arr) { sum += num; } int mean = sum/n; return mean; } };
- Difficulty: Unknown
- Topics: Expected Complexities, Topic Tags, Mathematical, Algorithms, Related Articles, Program Average Array Iterative Recursive, Program For Mean And Median Of An Unsorted Array
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/mean0021/1
- Synced: 2026-06-08T12:28:04.307Z

## Problem Description

Given an unsorted array arr[], the task is to find the mean of the array. Note: Return the floor value of the mean. Examples: Input: arr[] = [1, 3, 4, 2, 6, 5, 8, 7] Output: 4 Explanation: Sum of the elements is 1 + 3 + 4 + 2 + 6 + 5 + 8 + 7 = 36, Mean = 36/8 = 4.5. Floor(4.5) = 4. Input: arr[] = [4, 4, 4, 4, 4] Output: 4 Explanation: Sum of the elements is 4 + 4 + 4 + 4 + 4 = 20, Mean = 20/5 = 4 Constraints: 1 <= arr.size() <= 106 1 <= arr[i] <= 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public static int findMean(int[] arr) { int n = arr.length; int sum = 0; for(int num : arr) { sum += num; } int mean = sum/n; return mean; } };. The detected topics are Expected Complexities, Topic Tags, Mathematical, Algorithms, Related Articles, Program Average Array Iterative Recursive, Program For Mean And Median Of An Unsorted Array. Review the synced source file for the implementation details.
