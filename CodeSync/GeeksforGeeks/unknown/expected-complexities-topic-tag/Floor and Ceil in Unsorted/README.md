# Floor and Ceil in Unsorted

- Platform: GeeksforGeeks
- Language: class Solution { public: vector<int> getFloorAndCeil(int x, vector<int> &arr) { int flr = -1; int ciel = -1; for(int i = 0; i < arr.size(); i++) { if(arr[i] <= x) { if(flr == -1 || arr[i] > flr) { flr = arr[i]; } } if(arr[i] >= x) { if(ciel == -1 || arr[i] < ciel) { ciel = arr[i]; } } } return {flr, ciel}; } };
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Arrays, Data Structures
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1
- Synced: 2026-05-30T16:46:02.367Z

## Problem Description

Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[]. Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[]. Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[]. Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present. Examples: Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6] Output: 6, 8 Explanation: Floor of 7 is 6 and ceil of 7 is 8. Input: x = 10 , arr[] = [5, 6, 8, 8, 6, 5, 5, 6] Output: 8, -1 Explanation: Floor of 10 is 8 but ceil of 10 is not possible. Constraints : 1 ≤ arr.size ≤ 105 1 ≤ arr[i], x ≤ 106

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { public: vector<int> getFloorAndCeil(int x, vector<int> &arr) { int flr = -1; int ciel = -1; for(int i = 0; i < arr.size(); i++) { if(arr[i] <= x) { if(flr == -1 || arr[i] > flr) { flr = arr[i]; } } if(arr[i] >= x) { if(ciel == -1 || arr[i] < ciel) { ciel = arr[i]; } } } return {flr, ciel}; } };. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, Arrays, Data Structures. Review the synced source file for the implementation details.
