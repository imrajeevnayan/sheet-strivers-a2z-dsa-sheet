# Search element in Vector

- Platform: GeeksforGeeks
- Language: #include <algorithm> #include <vector> using namespace std; bool binarySearch(vector<int>& arr, int k) { return binary_search(arr.begin(), arr.end(), k); }
- Difficulty: Unknown
- Topics: Expected Complexities Topic Tags, Expected Complexities, Topic Tags, STL
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/search-in-vector/1
- Synced: 2026-06-08T11:48:47.032Z

## Problem Description

Given a vector arr[] with non-negative integers arranged in increasing order and an integer k. You need to check whether the element k is present or not in vector by applying binary search on it. Examples: Input: arr[] = [2, 3, 4, 5, 6], k = 6 Output: true Explanation: 6 is present on the 4rth index. Input: arr[] = [2, 3, 4, 6], k = 5 Output: false Explanation: 5 is not present in arr[]. Constraints: 1 ≤ arr.size() ≤ 1000 1 ≤ arr[i] ≤ 1000 1 ≤ k ≤ 1000

## Explanation

This solution was accepted on GeeksforGeeks using #include <algorithm> #include <vector> using namespace std; bool binarySearch(vector<int>& arr, int k) { return binary_search(arr.begin(), arr.end(), k); }. The detected topics are Expected Complexities Topic Tags, Expected Complexities, Topic Tags, STL. Review the synced source file for the implementation details.
