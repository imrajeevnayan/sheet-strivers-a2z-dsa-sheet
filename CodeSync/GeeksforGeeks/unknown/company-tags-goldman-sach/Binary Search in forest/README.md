# Binary Search in forest

- Platform: GeeksforGeeks
- Language: class Solution { static int find_height(int tree[], int n, int k) { int high = Arrays.stream(tree).max().getAsInt(); int low = 0; while(low <= high) { int mid = (low + high) / 2; if(findRemaining(mid, tree) == k) { return mid; } else if(findRemaining(mid, tree) > k) { low = mid + 1; } else { high = mid - 1; } } return -1; } static int findRemaining(int cut, int[] arr) { int sum = 0; for(int i=0; i<arr.length; i++) { sum += (arr[i] - cut) < 0 ? 0 : (arr[i] - cut); } return sum; } }
- Difficulty: Unknown
- Topics: Company Tags Goldman Sachs, Company Tags, Goldman Sachs, Topic Tags, Arrays, Binary Search, Data Structures, Algorithms
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.geeksforgeeks.org/problems/binary-search-in-forest--141631/1
- Synced: 2026-05-29T19:05:39.119Z

## Problem Description

There are n trees in a forest. The heights of the trees is stored in array tree[], where tree[i] denotes the height of the ith tree in the forest. If the ith tree is cut at a height H, then the wood collected is tree[i] - H, provided tree[i] > H. If the total woods that needs to be collected is exactly equal to k, find the height H at which every tree should be cut (all trees have to be cut at the same height). If it is not possible then return -1 else return H. Example 1: Input: n = 5, k = 4 tree[] = {2, 3, 6, 2, 4} Output: 3 Explanation: Wood collected by cutting trees at height 3 = 0 + 0 + (6-3) + 0 + (4-3) = 4 hence 3 is to be subtracted from all numbers. Since 2 is lesser than 3, nothing gets subtracted from it. Example 2: Input: n = 6, k = 8 tree[] = {1, 7, 6, 3, 4, 7} Output: 4 Explanation: Wood collected by cutting trees at height 4 = 0+(7-4)+(6-4)+0+0+(7-4) = 8 Your Task: Your task is to complete the function find_height(). This function takes the array tree[ ], and the integers n and k as input parameters and returns the height at which trees have to be cut. If no positive integer value of height is possible, return -1. Expected Time Complexity: O(n log h) Expected Auxiliary Space: O(1) Constraints: 1 <= n <= 104 1 <= tree[i] <= 103 1 <= k <= 107

## Explanation

This solution was accepted on GeeksforGeeks using class Solution { static int find_height(int tree[], int n, int k) { int high = Arrays.stream(tree).max().getAsInt(); int low = 0; while(low <= high) { int mid = (low + high) / 2; if(findRemaining(mid, tree) == k) { return mid; } else if(findRemaining(mid, tree) > k) { low = mid + 1; } else { high = mid - 1; } } return -1; } static int findRemaining(int cut, int[] arr) { int sum = 0; for(int i=0; i<arr.length; i++) { sum += (arr[i] - cut) < 0 ? 0 : (arr[i] - cut); } return sum; } }. The detected topics are Company Tags Goldman Sachs, Company Tags, Goldman Sachs, Topic Tags, Arrays, Binary Search, Data Structures, Algorithms. Review the synced source file for the implementation details.
